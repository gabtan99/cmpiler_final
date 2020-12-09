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
    ;

scopedVariableDeclaration
    : variableDeclaration 
    | arrayVariableDeclaration 
    ;

variableDeclarationList
    : variableDeclarationList Comma variableDeclarationInitialize
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
    ;

params
    : paramList
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
    | Semi
    ;

compoundStmt
    : LeftBrace (localDeclarations | statementList)* RightBrace
    ;

localDeclarations
    : scopedVariableDeclaration
    | localDeclarations scopedVariableDeclaration
    ;
    
scanStmt
    : Scan LeftParen StringLiteral Comma IDENTIFIER RightParen
    ;

printStmt
    : Print LeftParen printParams RightParen
    ;

printParams
    : printParamsList
    ;

printParamsList
    : printParamsList Plus printParamsSelector
    | printParamsSelector
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
    ;

/* expressions */
expression
    : mutable Assign expression
    | simpleExpression
    | createArrayExpression
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
    | STRINGCONSTANT
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
    :   DoubleQuotation SCharSequence? DoubleQuotation
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
    : StringLiteral
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