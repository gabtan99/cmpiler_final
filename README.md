# cmpiler-parser

HOW TO COMPILE ANTLR GRAMMAR

```
java -jar lib/antlr-4.9-complete.jar -package parser -o parser grammar/C.g4
```

HOW TO COMPILE ANTLR GENERATED FILES

```
javac -cp "lib/*.jar" parser/*.java
```

HOW TO COMPILE MAIN

```
javac -cp ".;lib/antlr-4.9-complete.jar" Main.java
```

HOW TO RUN MAIN

```
java -cp ".;lib/antlr-4.9-complete.jar" Main
```
