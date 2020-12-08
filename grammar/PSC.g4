grammar PSC;

/*keywords*/
ConstantKey : 'constant';
Int : 'int';
Float : 'float';
String : 'String';
Bool : 'bool';

Do : 'do';
Else : 'else';
For : 'for';
If : 'if';
Then: 'then';
Return : 'return';
Void : 'void';
While : 'while';

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
Upto: Up To;
Downto: Down To;
True: 'T';
False: 'F';

DoubleQuotation: '"';

/* main program */

program
    : declarationList
    ;

declarationList
    : declaration
    | declarationList declaration 
    ;

declaration
    : variableDeclaration
    | functionDeclaration
    ;

/* ------- */
variableDeclaration
    : typeSpecifier variableDeclarationList
    ;

scopedVariableDeclaration
    : typeSpecifier variableDeclarationList
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
    | IDENTIFIER LeftBracket INTEGERCONSTANT RightBracket
    ;

typeSpecifier
    : Int
    | Bool
    | String
    | Float
    ;

/* ------- */
functionDeclaration
    : typeSpecifier IDENTIFIER LeftParen params RightParen statement
    | Void IDENTIFIER LeftParen params RightParen statement
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
    : typeSpecifier paramDeclarationIdentifier
    ;

paramDeclarationIdentifier
    : IDENTIFIER
    | IDENTIFIER LeftBracket RightBracket
    ;

/* statements */
statement
    : expressionStmt
    | compoundStmt
    | selectionStmt
    | iterationStmt
    | returnStmt
    ;

expressionStmt
    : expression Semi
    | Semi
    ;

compoundStmt
    : LeftBrace localDeclarations statementList RightBrace
    ;

localDeclarations
    : localDeclarations scopedVariableDeclaration
    | /*epsilon */
    ;

selectionStmt
    : If LeftParen expression RightParen Then statement (Else statement)?
    ;

statementList
    : statementList statement
    | /*epsilon */
    ;

iterationStmt
    : whileStatement
    | forStatement
    ;

whileStatement
    : While IDENTIFIER Upto loopExpression compoundStmt
    | While IDENTIFIER Downto loopExpression compoundStmt
    ;

forStatement
    : For loopDeclaration Upto loopExpression compoundStmt
    | For loopDeclaration Downto loopExpression compoundStmt
    ;

loopDeclaration
    : Int IDENTIFIER Assign simpleExpression
    | IDENTIFIER Assign simpleExpression
    | IDENTIFIER
    ;

loopExpression
    : 
    ;

returnStmt
    : Return Semi
    | Return expression
    ;

/* expressions */
expression
    : mutable Assign expression
    | simpleExpression
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
    : INTEGERCONSTANT
    | BOOLCONSTANT
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
    : True
    | False
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