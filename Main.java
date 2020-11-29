import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import parser.CLexer;
import parser.CParser;


class Main {
   public static void main(String[] args) {
      System.out.println("Antlr4 Example");
      try {
         /*
          * make Lexer
          */
         Lexer lexer = new CLexer(CharStreams.fromFileName("./resources/example1.c"));
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
     
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
