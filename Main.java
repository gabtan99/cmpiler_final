import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.PSCLexer;
import parser.PSCParser;
import parser.PSCBaseListener;


class Main {
   public static void main(String[] args) {

      try {
         Lexer lexer = new PSCLexer(CharStreams.fromFileName("./resources/example1.c"));

         MyErrorListener errorListener = new MyErrorListener();
         lexer.removeErrorListeners();
         lexer.addErrorListener( errorListener );

         System.out.println(lexer.getAllTokens());
         System.out.println("LEXER TAPOS");

         
         TokenStream tokenStream = new CommonTokenStream(lexer);
         PSCParser parser = new PSCParser(tokenStream);
         parser.reset();

         // parser.removeErrorListeners();
         // parser.addErrorListener( errorListener );
         ParseTree tree = parser.primaryExpression();
         // ParseTreeWalker walker = new ParseTreeWalker();
         // PSCBaseListener listener = new PSCBaseListener();
         // walker.walk(listener, tree);

         System.out.println("PARSER TAPOS");

     
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
