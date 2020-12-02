# cmpiler-parser

How to compile ANTLR grammar file

```
java -jar lib/antlr-4.9-complete.jar -package parser -o parser grammar/PSC.g4
```

How to compile all files (parser/\*.java for grammar files)

```
javac --module-path lib\javafx-sdk-11.0.2\lib --add-modules javafx.controls -cp ".;lib/richtextfx-fat-0.10.5.jar;lib/antlr-4.9-complete.jar"  *.java
```

How to run frontend

```
java --module-path lib\javafx-sdk-11.0.2\lib --add-modules javafx.controls -cp ".;lib/richtextfx-fat-0.10.5.jar;lib/antlr-4.9-complete.jar" App
```
