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

DoubleQuotation: '"';

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
    : typeSpecifier variableDeclarationList Semi
    | ConstantKey typeSpecifier variableDeclarationList Semi
    | typeSpecifier variableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
    | ConstantKey typeSpecifier variableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
    ;

scopedVariableDeclaration
    : variableDeclaration 
    | arrayVariableDeclaration 
    ;

variableDeclarationList
    : variableDeclarationList Comma variableDeclarationInitialize
    | variableDeclarationList variableDeclarationInitialize {notifyErrorListeners("Multiple declarations should be separated by commas ','.");}
    | variableDeclarationInitialize
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
    : arrayTypeSpecifier arrayVariableDeclarationList Semi
    | ConstantKey arrayTypeSpecifier arrayVariableDeclarationList Semi
    | arrayTypeSpecifier arrayVariableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
    | ConstantKey arrayTypeSpecifier arrayVariableDeclarationList {notifyErrorListeners("Missing semicolon ';'.");}
    ;

arrayVariableDeclarationList
    : arrayVariableDeclarationList Comma arrayVariableDeclarationInitialize
    | arrayVariableDeclarationInitialize
    | arrayVariableDeclarationList arrayVariableDeclarationInitialize {notifyErrorListeners("Multiple declarations should be separated by commas ','.");}
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
    | Func (typeSpecifier | arrayTypeSpecifier | Void)  LeftParen params RightParen compoundStmt {notifyErrorListeners("Missing function name.");}
    | Func (typeSpecifier | arrayTypeSpecifier | Void) (typeSpecifier | arrayTypeSpecifier | Void)+ IDENTIFIER*  LeftParen params RightParen compoundStmt {notifyErrorListeners("Function cannot have multiple return types.");}
    | Func IDENTIFIER LeftParen params RightParen compoundStmt {notifyErrorListeners("Missing function return type.");}
    ;

params
    : paramList
    | /*epsilon */
    ;

paramList
    : paramTypeList
    | paramList Comma paramTypeList
    | paramList paramTypeList {notifyErrorListeners("Multiple declarations should be separated by commas ','.");}
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
    ;

printParamsList
    : printParamsList Plus printParamsSelector
    | printParamsSelector
    | printParamsList Plus {notifyErrorListeners("Extraneous '+' found / Expecting another print parameter.");}
    ;
    
printParamsSelector
    : StringLiteral
    | simpleExpression
    ;

selectionStmt
    : If LeftParen expression RightParen Then compoundStmt elseSelector?
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
    | Return (typeSpecifier | arrayTypeSpecifier)*  Semi {notifyErrorListeners("Expecting an expression or identifier in return statement.");}
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