package model;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class MyErrorListener extends BaseErrorListener {
  @Override
  public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                           String msg, RecognitionException e ) {
    // method arguments should be used for more detailed report
    System.out.println("LMAO MALI KA AT LINE " + line + ":" + charPositionInLine);
    // throw new RuntimeException("syntax error occurred");
  }
}