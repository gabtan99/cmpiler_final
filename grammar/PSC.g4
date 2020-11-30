grammar PSC;

r:
    (expr|declr)+ EOF
    // | (RESERVED_WORD|BOOLEAN|ID|STRING|NUMBER|OP_ADD_EQ|OP_SUB_EQ|OP_MULT_EQ|OP_DIV_EQ|OP_ADD|OP_SUB|OP_MULT|OP_DIV|OP_EQ
    // | OP_ASSIGN|OP_GREATER_EQ_THAN|OP_GREATER_THAN| OP_LESS_EQ_THAN|OP_LESS_THAN|GROUP_SYMB_CLOSE|GROUP_SYMB_OPEN
    // | SEPARATOR|BRACE_OPEN|BRACE_CLOSE|REF|BRACKET_OPEN|BRACKET_CLOSE)+ EOF
    ;

declr
    : ID OP_ASSIGN expr
    ;

expr
    : expr OP_MULT expr
    | expr OP_DIV expr
    | expr OP_ADD expr
    | expr OP_SUB expr
    | expr OP_GREATER_EQ_THAN expr
    | expr OP_LESS_EQ_THAN expr
    | expr OP_GREATER_THAN expr
    | expr OP_LESS_THAN expr
    | expr OP_EQ expr
    | GROUP_SYMB_OPEN expr GROUP_SYMB_CLOSE
    | NUMBER
    | STRING
    | BOOLEAN
    | ID
    | GROUP_SYMB_OPEN (expr (','expr)+)* GROUP_SYMB_CLOSE
    ;

/*tokens*/

RESERVED_WORD
    : 'if' | 'else' | 'elif' | 'for' | 'def' | 'while' | 'in' | 'import' | 'from' | 'render' | 'return'
    | 'Page' | 'Head' | 'Body' | 'Header' | 'Button' | 'Anchor' | 'Div' | 'Span' | 'List' | 'Input' | 'Paragraph' 
    | 'Image' | 'Nav' | 'Form' | 'Table'
    ;

BOOLEAN
    : 'True' | 'False'
    ;

ID
    : [a-z][a-zA-Z0-9_]*
    ;

STRING
    : '"' (.)*? '"'
    | '\'' (.)*? '\''
    ;

NUMBER
    : [-]?[0-9]+([.][0-9]+)?
    ;

OP_ADD_EQ
    : '+='
    ;

OP_SUB_EQ
    : '-='
    ;

OP_MULT_EQ
    : '*='
    ;

OP_DIV_EQ
    : '/='
    ;

OP_ADD
    : '+'
    ;

OP_SUB
    : '-'
    ;

OP_MULT
    : '*'
    ;

OP_DIV
    : '/'
    ;

OP_ASSIGN
    : '='
    ;

OP_EQ
    : '=='
    ;

OP_GREATER_THAN
    : '>'
    ;

OP_LESS_THAN
    : '<'
    ;

OP_GREATER_EQ_THAN
    : '>='
    ;

OP_LESS_EQ_THAN
    : '<='
    ;

GROUP_SYMB_OPEN
    : '('
    ;

GROUP_SYMB_CLOSE
    : ')'
    ;

BRACKET_OPEN
    : '['
    ;

BRACKET_CLOSE
    : ']'
    ;

BRACE_OPEN
    : '{'
    ;

BRACE_CLOSE
    : '}'
    ;

REF
    : '.'
    ;

SEPARATOR
    : ','
    ;

COMMENT
    : '--' ~[\r\n]* -> skip
    ;

WS 
    : [ \t\r\n]+ -> skip 
    ; // skip spaces, tabs, newlines, \r (Windows)