@echo off

if [%1]==[] goto make
if %1==run goto run
goto eof

:make
java -cp lib/antlrworks-1.5.2-complete.jar org.antlr.Tool -fo src src\C2JavaScript.g
javac -cp lib/antlrworks-1.5.2-complete.jar -d bin src\*.java
goto eof

:run
java -cp "lib/antlrworks-1.5.2-complete.jar;bin" Main input.c > output.js
copy output.js testpage\output.js

:eof