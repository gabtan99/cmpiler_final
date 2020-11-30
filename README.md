# cmpiler-parser

How to compile ANTLR grammar file

```
java -jar lib/antlr-4.9-complete.jar -package parser -o parser grammar/PSC.g4
```

How to compile all files

```
javac -cp ".;lib/antlr-4.9-complete.jar" *.java
```

How to run main file

```
java -cp ".;lib/antlr-4.9-complete.jar" Main
```
