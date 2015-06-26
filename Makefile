compile:
	java -cp lib/antlrworks-1.5.2-complete.jar org.antlr.Tool -fo src src/C2JavaScript.g
	javac -cp lib/antlrworks-1.5.2-complete.jar -d bin src/*.java
run:
	java -cp "lib/antlrworks-1.5.2-complete.jar:bin" Main input.c > test.js
