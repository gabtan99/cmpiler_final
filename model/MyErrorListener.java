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
    if (msg.contains("Missing semicolon")){
      line -= 1;
    }
    String log = "line " + line + ":" + charPositionInLine + " " + msg;
    errorList.add(log);
    System.out.println(log);
    // throw new RuntimeException("syntax error occurred");
  }
}