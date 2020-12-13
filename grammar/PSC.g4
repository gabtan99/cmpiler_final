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
    : Main LeftParen RightParen LeftBrace (declarationList | statementList) * RightBrace 
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
    : typeSpecifier  variableDeclarationItems Semi
    | ConstantKey typeSpecifier variableDeclarationItems Semi
    | typeSpecifier variableDeclarationItems {notifyErrorListeners("Missing semicolon ';'.");}
    | ConstantKey typeSpecifier variableDeclarationItems {notifyErrorListeners("Missing semicolon ';'.");}
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
    : arrayTypeSpecifier arrayVariableDeclarationItems Semi
    | ConstantKey arrayTypeSpecifier arrayVariableDeclarationItems Semi
    | arrayTypeSpecifier arrayVariableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
    | ConstantKey arrayTypeSpecifier arrayVariableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
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
    : expression Semi
    | expression {notifyErrorListeners("Missing semicolon ';'.");}
    | Semi {notifyErrorListeners("Extraneous semicolon ';' found.");}
    ;

compoundStmt
    : LeftBrace (localDeclarations | statementList)* RightBrace
    ;

localDeclarations
    : scopedVariableDeclaration
    | localDeclarations scopedVariableDeclaration
    ;
    
scanStmt
    : Scan LeftParen StringLiteral Comma IDENTIFIER RightParen Semi
    | Scan LeftParen StringLiteral Comma IDENTIFIER RightParen {notifyErrorListeners("Missing semicolon ';'.");}
    ;

printStmt
    : Print LeftParen printParams RightParen Semi
    | Print LeftParen printParams RightParen {notifyErrorListeners("Missing semicolon ';'.");}
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
    : If LeftParen simpleExpression RightParen Then compoundStmt elseSelector?
    ;

elseSelector
    : Else Then compoundStmt
    | Else selectionStmt
    ;

iterationStmt
    : whileStatement
    | forStatement
    ;

whileStatement
    : While IDENTIFIER Up To relExpression compoundStmt
    | While IDENTIFIER Down To relExpression compoundStmt
    ;

forStatement
    : For loopDeclaration Up To simpleExpression compoundStmt
    | For loopDeclaration Down To simpleExpression compoundStmt
    ;

loopDeclaration
    : Int IDENTIFIER Assign simpleExpression
    | IDENTIFIER Assign simpleExpression
    | IDENTIFIER
    ;

returnStmt
    : Return expression Semi
    | Return {notifyErrorListeners("Expecting an expression or identifier in return statement.");} (typeSpecifier | arrayTypeSpecifier)* Semi
    | Return (expression | typeSpecifier | arrayTypeSpecifier)* {notifyErrorListeners("Missing semicolon ';' after return statement.");}
    ;

/* expressions */
expression
    : assignmentExpression
    | simpleExpression
    | createArrayExpression
    ;

assignmentExpression
    : mutable Assign expression
    ;

createArrayExpression
    : Create arrayInitExpression
    ;

arrayInitExpression
    : typeSpecifier LeftBracket relExpression RightBracket
    | typeSpecifier LeftBracket  RightBracket {notifyErrorListeners("Expecting an expression for declaring array sizes.");}
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
    : sumExpression relOperator sumExpression
    | sumExpression
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
    | IDENTIFIER LeftBracket expression RightBracket
    ;

immutable
    : LeftParen expression RightParen
    | call
    | constant
    ;

call
    : IDENTIFIER LeftParen arguments RightParen
    ;

arguments
    : argumentList
    | argumentList {notifyErrorListeners("Multiple function arguments, if there are more than 1, should be separated by commas ','.");} argumentList+
    | /*epsilon */
    ;

argumentList
    : expression
    | argumentList Comma expression
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