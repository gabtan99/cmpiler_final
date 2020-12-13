grammar PSC;

/*keywords*/
ConstantKey : 'constant';
Int : 'int';
Float : 'float';
String : 'String';
Bool : 'bool';

Main: 'main';
Do : 'do';
Else : 'else';
For : 'for';
If : 'if';
Then: 'then';
Return : 'return';
Void : 'void';
While : 'while';
Func : 'func';
Create : 'create';
Print : 'print';
Scan: 'scan';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';

Plus : '+';
Minus : '-';
Star : '*';
Div : '/';

AndAnd : '&&';
OrOr : '||';
Not : '!';

Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';

Equal : '==';
NotEqual : '!=';

Dot : '.';
Ellipsis : '...';

Up : 'up';
Down : 'down';
To : 'to';

/* main program */

program
    : functionDeclarationList? mainProgram EOF
    | functionDeclarationList?  EOF {notifyErrorListeners("Missing main() function required to run programs.");}
    | functionDeclarationList? mainProgram functionDeclarationList?  EOF {notifyErrorListeners("Function declarations should be made before the main() function.");}
    ;

mainProgram
    :  mainProgramLeftParen RightParen compoundStmt
    |  mainProgramLeftParen {notifyErrorListeners("Expecting ')' after '('.");} compoundStmt
    ;

mainProgramLeftParen
    : Main LeftParen
    | Main {notifyErrorListeners("Expected '(' after main.");}
    ;

declarationList
    : declaration
    | declarationList declaration 
    ;

declaration
    : variableDeclaration 
    | arrayVariableDeclaration 
    ;

functionDeclarationList
    : functionDeclaration
    | functionDeclarationList functionDeclaration
    ;

/* ------- */
variableDeclaration
    : ConstantKey? typeSpecifier variableDeclarationItems Semi
    | {notifyErrorListeners("Missing semicolon ';'.");} ConstantKey? typeSpecifier variableDeclarationItems 
    ;

scopedVariableDeclaration
    : variableDeclaration 
    | arrayVariableDeclaration 
    ;

variableDeclarationItems
    : variableDeclarationList
    | variableDeclarationList {notifyErrorListeners("Multiple declarations should be separated by commas ','.");} variableDeclarationList+ 
    ;

variableDeclarationList
    : variableDeclarationInitialize
    | variableDeclarationList Comma variableDeclarationInitialize
    ;

variableDeclarationInitialize
    : variableDeclarationIdentifier
    | variableDeclarationIdentifier Assign simpleExpression
    ;

variableDeclarationIdentifier
    : IDENTIFIER
    ;

typeSpecifier
    : Int
    | Bool
    | String
    | Float
    ;

/* ------- */

arrayTypeSpecifier
    : typeSpecifier LeftBracket RightBracket
    ;

arrayVariableDeclaration
    : ConstantKey? arrayTypeSpecifier arrayVariableDeclarationItems Semi
    | {notifyErrorListeners("Missing semicolon ';'.");} ConstantKey? arrayTypeSpecifier arrayVariableDeclarationItems 
    ;

arrayVariableDeclarationItems
    : arrayVariableDeclarationList
    | arrayVariableDeclarationList arrayVariableDeclarationList+ {notifyErrorListeners("Multiple declarations should be separated by commas ','.");}
    ;

arrayVariableDeclarationList
    : arrayVariableDeclarationList Comma arrayVariableDeclarationInitialize
    | arrayVariableDeclarationInitialize
    ;

arrayVariableDeclarationInitialize
    : arrayVariableDeclarationIdentifier
    | arrayVariableDeclarationIdentifier Assign createArrayExpression 
    ;

arrayVariableDeclarationIdentifier
    : IDENTIFIER
    ;

/* ------- */

typeSpecifierSelector
    : typeSpecifier
    | arrayTypeSpecifier
    ;

functionDeclaration
    : Func (typeSpecifier | arrayTypeSpecifier | Void) IDENTIFIER LeftParen params RightParen compoundStmt
    | Func (typeSpecifier | arrayTypeSpecifier | Void) {notifyErrorListeners("Missing function name.");} LeftParen params RightParen compoundStmt 
    | Func (typeSpecifier | arrayTypeSpecifier | Void) {notifyErrorListeners("Function cannot have multiple return types.");} (typeSpecifier | arrayTypeSpecifier | Void)+ IDENTIFIER* LeftParen params RightParen compoundStmt 
    | Func {notifyErrorListeners("Missing function return type.");} IDENTIFIER LeftParen params RightParen compoundStmt 
    ;

params
    : paramList
    | paramList {notifyErrorListeners("Multiple declarations should be separated by commas ','.");} paramList+
    | /*epsilon */
    ;

paramList
    : paramList Comma paramTypeList
    | paramTypeList
    ;

paramTypeList
    : typeSpecifierSelector paramDeclarationIdentifier
    ;

paramDeclarationIdentifier
    : IDENTIFIER
    ;

/* statements */
statement
    : expressionStmt
    | compoundStmt
    | scanStmt
    | printStmt
    | selectionStmt
    | iterationStmt
    | returnStmt
    ;
   
statementList
    : statement
    | statementList statement
    ;

expressionStmt
    : (assignmentStandaloneExpression|call) Semi
    | {notifyErrorListeners("Missing semicolon ';'.");} (assignmentStandaloneExpression|call) 
    | Semi {notifyErrorListeners("Extraneous semicolon ';' found.");}
    ;

compoundStmt
    : LeftBrace (localDeclarations | statementList)* RightBrace
    | LeftBrace (localDeclarations | statementList)* {notifyErrorListeners("Missing closing bracket.");}
    | LeftBrace (localDeclarations | statementList)* RightBrace RightBrace+ {notifyErrorListeners("Extra bracket found.");}
    ;

localDeclarations
    : scopedVariableDeclaration
    | localDeclarations scopedVariableDeclaration
    ;
    
scanStmt
    : Scan LeftParen StringLiteral Comma IDENTIFIER RightParen Semi
    | {notifyErrorListeners("Missing semicolon ';'.");} Scan LeftParen StringLiteral Comma IDENTIFIER RightParen 
    ;

printStmt
    : Print LeftParen printParams RightParen Semi
    | {notifyErrorListeners("Missing semicolon ';'.");} Print LeftParen printParams RightParen 
    ;

printParams
    : printParamsList
    | {notifyErrorListeners("Multiple print parameters should be concatenated by plus symbols '+'. Unless you meant this to be a string literal, then missing double quotes");} printParamsList printParamsList+ 
    ;

printParamsList
    : printParamsList Plus printParamsSelector
    | printParamsSelector
    | printParamsList Plus {notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");}
    | {notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");} Plus printParamsList 
    ;
    
printParamsSelector
    : StringLiteral
    | simpleExpression
    ;

selectionStmt
    :  selectionCondition Then compoundStmt elseSelector?
    |  selectionCondition {notifyErrorListeners("Missing 'then' keyword.");} compoundStmt elseSelector?
    ;

selectionCondition
    : If selectionLeftParen RightParen
    | If selectionLeftParen RightParen RightParen+ {notifyErrorListeners("Redundant closing parenthesis')'.");}
    | If selectionLeftParen {notifyErrorListeners("Expecting a closing parenthesis ')'.");}
    ;

selectionLeftParen
    : LeftParen simpleExpression
    | simpleExpression {notifyErrorListeners("Expected '(' after main.");}
    ;

elseSelector
    : Else Then compoundStmt
    | Else selectionStmt
    | Else {notifyErrorListeners("Missing 'then' keyword after 'else'.");} compoundStmt
    ;

iterationStmt
    : whileStatement
    | forStatement
    ;

whileStatement
    : While IDENTIFIER iterationToStatement relExpression compoundStmt
    ;

forStatement
    : For loopDeclaration iterationToStatement simpleExpression compoundStmt
    ;

iterationToStatement
    : Upto
    | Downto
    | option=(Up | Down) {notifyErrorListeners("Expecting to after '" + $option.text + "' keyword.");}
    | {notifyErrorListeners("Expecting to 'up' or 'down' keyword.");} To 
    ;

loopDeclaration
    : Int IDENTIFIER simpleAssignExpression
    | Int IDENTIFIER {notifyErrorListeners("Expecting assignment expression.");}
    | IDENTIFIER simpleAssignExpression
    | IDENTIFIER
    ;

simpleAssignExpression
    : Assign simpleExpression
    ;

returnStmt
    : Return simpleExpression Semi
    | Return {notifyErrorListeners("Expecting an expression or identifier in return statement.");} (typeSpecifier | arrayTypeSpecifier)* Semi
    | Return (simpleExpression | typeSpecifier | arrayTypeSpecifier)* {notifyErrorListeners("Missing semicolon ';' after return statement.");}
    ;

/* expressions */

assignmentStandaloneExpression
    : mutable Assign (simpleExpression | createArrayExpression)
    ;

createArrayExpression
    : Create arrayInitExpression
    ;

arrayInitExpression
    : typeSpecifier arrayInitLeftBracket RightBracket
    | typeSpecifier arrayInitLeftBracket RightBracket RightBracket+ {notifyErrorListeners("Redundant closing bracket ']'.");}
    | typeSpecifier arrayInitLeftBracket {notifyErrorListeners("Expecting a closing bracket ']'.");}
    ;

arrayInitLeftBracket
    : LeftBracket relExpression
    | LeftBracket {notifyErrorListeners("Expecting an expression for declaring array sizes.");}
    ;

simpleExpression
    : andExpression
    | simpleExpression OrOr andExpression
    ;

andExpression
    : unaryRelExpression
    | andExpression AndAnd unaryRelExpression
    ;

unaryRelExpression
    : Not unaryRelExpression 
    | relExpression
    ;

relExpression
    : sumExpression 
    | sumExpression relOperator  sumExpression
    ;

relOperator
    : LessEqual
    | Less
    | Greater
    | GreaterEqual
    | Equal
    | NotEqual
    ;

sumExpression
    : sumExpression sumOperator mulExpression
    | mulExpression
    ;

sumOperator
    : Plus
    | Minus
    ;

mulExpression
    : mulExpression mulOperator unaryExpression
    | unaryExpression
    ;

mulOperator
    : Star
    | Div
    ;

unaryExpression
    : unaryOperator unaryExpression
    | factor
    ;

unaryOperator
    : Minus
    ;

factor
    : immutable
    | mutable
    ;

mutable
    : IDENTIFIER
    | IDENTIFIER  mutableLeftBracket RightBracket
    | IDENTIFIER  mutableLeftBracket RightBracket RightBracket+ {notifyErrorListeners("Redundant closing bracket ']'.");}
    | IDENTIFIER  mutableLeftBracket {notifyErrorListeners("Expecting a closing bracket ']'.");}
    ;

mutableLeftBracket
    : LeftBracket simpleExpression
    ;

immutable
    : call
    | constant
    | immutableLeftParen RightParen
    | immutableLeftParen RightParen RightParen+ {notifyErrorListeners("Redundant closing parenthesis')'.");}
    | immutableLeftParen {notifyErrorListeners("Expecting a closing parenthesis ')'.");}
    ;

immutableLeftParen
    : LeftParen simpleExpression
    ;

call
    : IDENTIFIER callLeftParen RightParen
    | IDENTIFIER callLeftParen RightParen (callLeftParen RightParen)+ {notifyErrorListeners("Redundant parenthesis.");}
    ;

callLeftParen
    : LeftParen arguments
    | {notifyErrorListeners("Expecting an opening parenthesis '(' after function identifier.");} arguments
    ;

arguments
    : argumentList
    | argumentList {notifyErrorListeners("Multiple function arguments, if there are more than 1, should be separated by commas ','.");} argumentList+
    | /*epsilon */
    ;

argumentList
    : simpleExpression
    | argumentList Comma simpleExpression
    ;

constant
    : BOOLCONSTANT
    | INTEGERCONSTANT
    | StringLiteral
    | FLOATCONSTANT
    ;

/* primitives */
fragment
NonDigit
    : [a-zA-Z_]
    ;

fragment
DoubleQuotation
    : '"'
    ;

fragment
Digit
    : [0-9]
    ;
    
fragment
DigitSequence
    : Digit+
    ;
    
fragment
FloatSuffix
    : 'f'
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant FloatSuffix
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
Space
    : [ ]
    ;

Upto
    : Up Space+ To
    ;

Downto
    : Down Space+ To
    ;

StringLiteral
    :   DoubleQuotation SCharSequence* DoubleQuotation
    ;

/*tokens*/
INTEGERCONSTANT
    : DigitSequence
    ;

FLOATCONSTANT
    : DecimalFloatingConstant
    ;

BOOLCONSTANT
    : 'T'
    | 'F'
    ;

STRINGCONSTANT
    : DoubleQuotation SCharSequence? DoubleQuotation
    ;


IDENTIFIER
    :  NonDigit (NonDigit|Digit)*
    ; 

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

WS 
    : [ \t\r\n]+ -> skip 
    ; // skip spaces, tabs, newlines, \r (Windows)