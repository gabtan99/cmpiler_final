package model;

import java.util.*;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Parser;

public class PSCErrorListener extends BaseErrorListener {

  private List<String> errorList;

  public PSCErrorListener(List<String> errorList) {
    this.errorList = errorList;
  }

  @Override
  public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                           String msg, RecognitionException e ) {

    PSCErrorGenerator generator = new PSCErrorGenerator();
    
    List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); 
    Collections.reverse(stack);

    errorList.add(generator.generateMsg(line, charPositionInLine, msg));
    System.out.println(generator.generateMsg(line, charPositionInLine, msg));
  }
}