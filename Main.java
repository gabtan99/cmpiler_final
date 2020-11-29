import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
// import org.antlr.v4.runtime.CommonTokenStream;
// import org.antlr.v4.runtime.Lexer;
// import org.antlr.v4.runtime.TokenStream;
// import org.antlr.v4.runtime.Token;
// import org.antlr.v4.runtime.ParseTree;
// import org.antlr.v4.runtime.ParseTreeWalker;

import parser.CLexer;
import parser.CParser;
import parser.CBaseListener;


class Main {
   public static void main(String[] args) {

      try {
         /*
          * make Lexer
          */
         Lexer lexer = new CLexer(CharStreams.fromFileName("./resources/example1.c"));


         MyErrorListener errorListener = new MyErrorListener();

         lexer.removeErrorListeners();
         lexer.addErrorListener( errorListener );
         System.out.println(lexer.getAllTokens());

         /*
          * get a TokenStream on the Lexer
          */
         TokenStream tokenStream = new CommonTokenStream(lexer);


         /*
          * make a Parser on the token stream
          */
         CParser parser = new CParser(tokenStream);
         /*
          * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
          */

         parser.removeErrorListeners();
         parser.addErrorListener( errorListener );

         ParseTree tree = parser.primaryExpression();
         ParseTreeWalker walker = new ParseTreeWalker();
         CBaseListener listener = new CBaseListener();
         walker.walk(listener,tree);

         System.out.println("HELLO DARKNESS MY OLD FRIEND");
         System.out.println(parser.getNumberOfSyntaxErrors());
      
     
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
