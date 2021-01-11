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
NotEqual : '!=';
Not : '!';

Colon : ':';
Semi : ';';
Comma : ',';

Equal : '==';

Assign : '=';

Dot : '.';
Ellipsis : '...';

Up : 'up';
Down : 'down';
To : 'to';

/* main program */

program
    : functionDeclarationList? mainProgram EOF
    ;

mainProgram
    :  mainProgramLeftParen RightParen compoundStmt
    ;

mainProgramLeftParen
    : Main LeftParen
    ;

functionDeclarationList
    : functionDeclaration
    | functionDeclarationList functionDeclaration
    ;

/* ------- */
variableDeclaration 
    : ConstantKey? typeSpecifier variableDeclarationInitialize Semi 
    ;

scopedVariableDeclaration
    : variableDeclaration 
    | arrayVariableDeclaration 
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
    : ConstantKey? arrayTypeSpecifier arrayVariableDeclarationInitialize Semi
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
    : (assignmentStandaloneExpression|call) Semi
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
    ;

printStmt
    : Print LeftParen printParams RightParen Semi
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
    :  If LeftParen simpleExpression RightParen Then compoundStmt elseSelector?
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
    : While IDENTIFIER iterationToStatement relExpression compoundStmt
    ;

forStatement
    : For loopDeclaration iterationToStatement simpleExpression compoundStmt
    ;

iterationToStatement
    : Upto
    | Downto
    ;

loopDeclaration
    : Int IDENTIFIER simpleAssignExpression
    | IDENTIFIER simpleAssignExpression
    | IDENTIFIER
    ;

simpleAssignExpression
    : Assign simpleExpression
    ;

returnStmt
    : Return returnStmtContainer Semi
    ;

returnStmtContainer
    : simpleExpression
    ;

/* expressions */

assignmentStandaloneExpression
    : mutable Assign (simpleExpression | createArrayExpression)
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
    | IDENTIFIER  mutableLeftBracket RightBracket
    ;

mutableLeftBracket
    : LeftBracket simpleExpression
    ;

immutable
    : call
    | constant
    | LeftParen simpleExpression RightParen
    ;

call
    : IDENTIFIER callLeftParen RightParen
    ;

callLeftParen
    : LeftParen arguments
    ;

arguments
    : argumentList
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