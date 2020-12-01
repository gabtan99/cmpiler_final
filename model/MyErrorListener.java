package model;

import java.util.*;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class MyErrorListener extends BaseErrorListener {

  private List<String> errorList;

  public MyErrorListener(List<String> errorList) {
    this.errorList = errorList;
  }


  @Override
  public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                           String msg, RecognitionException e ) {
    // method arguments should be used for more detailed report
    errorList.add("LMAO MALI KA AT LINE " + line + ":" + charPositionInLine);
    System.out.println("LMAO MALI KA AT LINE " + line + ":" + charPositionInLine);
    // throw new RuntimeException("syntax error occurred");
  }
}