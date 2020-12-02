package model;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.TreeViewer;

import parser.PSCLexer;
import parser.PSCParser;
import parser.PSCBaseListener;

public class Parser {

    private CharStream input;
    private List<String> errorList;


    public Parser() {
        errorList = new ArrayList<>();
    }

    public Parser(CharStream input) {
        errorList = new ArrayList<>();
        this.input = input;
    }

    
    public void setInput(CharStream input) {
        this.input = input;
    }

    public List<String> getErrorList () {
        return this.errorList;
    }

    public void parse() {
        errorList.clear();
        Lexer lexer = new PSCLexer(this.input);

        MyErrorListener errorListener = new MyErrorListener(errorList);
        lexer.removeErrorListeners();
        lexer.addErrorListener( errorListener );
        
        TokenStream tokenStream = new CommonTokenStream(lexer);
        PSCParser parser = new PSCParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener( errorListener );

        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        PSCBaseListener listener = new PSCBaseListener();
        walker.walk(listener, tree);
   }

   public void showTree() {
       Lexer lexer = new PSCLexer(this.input);
       TokenStream tokenStream = new CommonTokenStream(lexer);
       PSCParser parser = new PSCParser(tokenStream);
       ParseTree tree = parser.r();

       // Tree inspector
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.open();
   }


}
