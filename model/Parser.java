package model;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.PSCLexer;
import parser.PSCParser;
import parser.PSCBaseListener;

public class Parser {

    private CharStream input;

    public Parser() {
        
    }

    public Parser(CharStream input) {
        this.input = input;
    }
    
    public void setInput() {
        this.input = input;
    }

    public void parse() {
        Lexer lexer = new PSCLexer(this.input);

        MyErrorListener errorListener = new MyErrorListener();
        // lexer.removeErrorListeners();
        // lexer.addErrorListener( errorListener );
        
        TokenStream tokenStream = new CommonTokenStream(lexer);
        PSCParser parser = new PSCParser(tokenStream);
        // parser.removeErrorListeners();
        // parser.addErrorListener( errorListener );

        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        PSCBaseListener listener = new PSCBaseListener();
        walker.walk(listener, tree);
      
   }
}
