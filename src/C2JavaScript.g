grammar C2JavaScript;

@members{
	ArrayList<String> variableName = new ArrayList();
	ArrayList<String> variableError = new ArrayList();
	int tabNum = 0;
}

program
	:	programBlock
		{
			if (variableError.isEmpty())
				System.out.println($programBlock.code);
			else
				for (String i : variableError)
					System.out.println("Cannot find variable: " + i);
		}
	;

programBlock returns [String code]
@init{
	code = null;
}
	:	functionDefine a=programBlock
		{
			$code = $functionDefine.code + $a.code;
		}
	|
		{
			$code = "";
		}
	;

functionDefine returns [String code]
@init{
	tabNum++;
	variableName.clear();
	code = null;
}
	:	type ID '(' functionArgument ')' '{' functionStatement '}'
		{
			$code = "function " + $ID.text + "(" + $functionArgument.code + ")\n" + "{\n" + $functionStatement.code + "}\n\n";
			tabNum--;
		}
	;

functionArgument returns [String code]
@init{
	code = null;
}
	:	type ID functionArgumentNext
		{
			variableName.add($ID.text);
			$code = $ID.text + $functionArgumentNext.code;
		}
	|
		{
			$code = "";
		}
	;

functionArgumentNext returns [String code]
@init{
	code = null;
}
	:	',' type ID a=functionArgumentNext
		{
			variableName.add($ID.text);
			$code = ", " + $ID.text + $a.code;
		}
	|
		{
			$code = "";
		}
	;

functionCall returns [String code]
@init{
	code = null;
}
	:	ID '(' functionCallArgument ')'
		{
			$code = $ID.text + "(" + $functionCallArgument.code + ")";
		}
	;

functionCallArgument returns [String code]
@init{
	code = null;
}
	:	expr functionCallArgumentNext
		{
			$code = $expr.code + $functionCallArgumentNext.code;
		}
	|
		{
			$code = "";
		}
	;

functionCallArgumentNext returns [String code]
@init{
	code = null;
}
	:	',' expr a=functionCallArgumentNext
		{
			$code = ", " + $expr.code + $a.code;
		}
	|
		{
			$code = "";
		}
	;

functionStatement returns [String code]
@init{
	code = null;
}
	:	variableDefine a=functionStatement
		{
			$code = $variableDefine.code + $a.code;
		}
	|	expression a=functionStatement
		{
			$code = $expression.code + $a.code;
		}
	|	ifStatement a=functionStatement
		{
			$code = $ifStatement.code + $a.code;
		}
	|	switchStatement a=functionStatement
		{
			$code = $switchStatement.code + $a.code;
		}
	|	forStatement a=functionStatement
		{
			$code = $forStatement.code + $a.code;
		}
	|	whileStatement a=functionStatement
		{
			$code = $whileStatement.code + $a.code;
		}
	|	returnStatement a=functionStatement
		{
			$code = $returnStatement.code + $a.code;
		}
	|	'{' a=functionStatement '}'
		{
			$code = "";
			for (int i = 0; i + 1 < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "{\n" + $a.code;
			for (int i = 0; i + 1 < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "}\n";
		}
	|	'break;'
		{
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "break;\n";
		}
	|	'continue;'
		{
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "continue;\n";
		}
	|
		{
			$code = "";
		}
	;

ifStatement returns [String code]
@init{
	code = null;
	tabNum++;
}
	:	'if' '(' expr ')' functionStatement ifStatementNext
		{
			tabNum--;
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "if (" + $expr.code + ")\n" + $functionStatement.code + $ifStatementNext.code;
		}
	;

ifStatementNext returns [String code]
@init{
	code = null;
}
	:	'else' functionStatement
		{
			tabNum--;
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "else\n" + $functionStatement.code;
			tabNum++;
		}
	|
		{
			$code = "";
		}
	;

switchStatement returns [String code]
@init{
	code = null;
	tabNum++;
}
	:	'switch' '(' expr ')' '{' caseStatement '}'
		{
			tabNum--;
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "switch (" + $expr.code + ")\n";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "{\n" + $caseStatement.code;
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "}\n";
		}
	;

caseStatement returns [String code]
@init{
	code = null;
}
	:	'case' expr ':' functionStatement a=caseStatement
		{
			$code = "";
			for (int i = 0; i + 1 < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "case " + $expr.code + ":\n" + $functionStatement.code + $a.code;
		}
	|	'default:' functionStatement a=caseStatement
		{
			$code = "";
			for (int i = 0; i + 1 < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "default:\n" + $functionStatement.code + $a.code;
		}
	|
		{
			$code = "";
		}
	;

forStatement returns [String code]
@init{
	code = null;
	tabNum++;
}
	:	'for' '(' a=expr ';' b=expr ';' c=expr ')' functionStatement
		{
			tabNum--;
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "for (" + $a.code + "; " + $b.code + "; " + $c.code + ")\n" + $functionStatement.code;
		}
	;

whileStatement returns [String code]
@init{
	code = null;
	tabNum++;
}
	:	'while' '(' expr ')' functionStatement
		{
			tabNum--;
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "while (" + $expr.code + ")\n"  + $functionStatement.code;
		}
	;

returnStatement returns [String code]
@init{
	code = null;
}
	:	'return' expr ';'
		{
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + "return " + $expr.code + ";\n";
		}
	;

variableDefine returns [String code]
@init{
	code = null;
}
	:	type singleVariableDefine variableDefineNext
		{
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + $type.code + " " + $singleVariableDefine.code + $variableDefineNext.code;
		}
	;

singleVariableDefine returns [String code]
@init{
	code = null;
}
	:	ID initialValue
		{
			variableName.add($ID.text);
			$code = $ID.text + $initialValue.code;
		}
	|	ID '[' NUM ']'
		{
			variableName.add($ID.text);
			$code = $ID.text + " = new Array(" + $NUM.text + ")";
		}
	;

initialValue returns [String code]
@init{
	code = null;
}
	:	'=' expr
		{
			$code = " = " + $expr.code;
		}
	|
		{
			$code = "";
		}
	;

variableDefineNext returns [String code]
@init{
	code = null;
}
	:	',' singleVariableDefine a=variableDefineNext
		{
			$code = ", " + $singleVariableDefine.code + $a.code;
		}
	|	';'
		{
			$code = ";\n";
		}
	;

arrayCall returns [String code]
@init{
	code = null;
}
	:	ID '[' expr ']'
		{
			if (variableName.indexOf($ID.text) == -1)
				variableError.add($ID.text);
			$code = $ID.text + "[" + $expr.code + "]";
		}
	;


expression returns [String code]
@init{
	code = null;
}
	:	expr ';'
		{
			$code = "";
			for (int i = 0; i < tabNum; i++)
				$code = $code + "\t";
			$code = $code + $expr.code + ";\n";
		}
	;

expr returns [String code]
@init{
	code = null;
}
	:	ID exprNext
		{
			if (variableName.indexOf($ID.text) == -1)
				variableError.add($ID.text);
			$code = $ID.text + $exprNext.code;
		}
	|	NUM exprNext
		{
			$code = $NUM.text + $exprNext.code;
		}
	|	CHAR exprNext
		{
			$code = $CHAR.text + $exprNext.code;
		}
	|	'(' a=expr ')' exprNext
		{
			$code = "(" + $a.code + ")" + $exprNext.code;
		}
	|	leftUnaryOperator a=expr exprNext
		{
			$code = $leftUnaryOperator.code + $a.code + $exprNext.code;
		}
	|	functionCall exprNext
		{
			$code = $functionCall.code + $exprNext.code;
		}
	|	arrayCall exprNext
		{
			$code = $arrayCall.code + $exprNext.code;
		}
	;

exprNext returns [String code]
@init{
	code = null;
}
	:	binaryOperator expr a=exprNext
		{
			$code = " " + $binaryOperator.code + " " + $expr.code + $a.code;
		}
	|	rightUnaryOperator
		{
			$code = $rightUnaryOperator.code;
		}
	|
		{
			$code = "";
		}
	;

leftUnaryOperator returns [String code]
@init{
	code = null;
}
	:	'!'
		{
			$code = "!";
		}
	|	'~'
		{
			$code = "~";
		}
	|	'++'
		{
			$code = "++";
		}
	|	'--'
		{
			$code = "--";
		}
	|	'-'
		{
			$code = "-";
		}
	;

rightUnaryOperator returns [String code]
@init{
	code = null;
}
	:	'++'
		{
			$code = "++";
		}
	|	'--'
		{
			$code = "--";
		}
	;

binaryOperator returns [String code]
@init{
	code = null;
}
	:	'+'
		{
			$code = "+";
		}
	|	'-'
		{
			$code = "-";
		}
	|	'*'
		{
			$code = "*";
		}
	|	'/'
		{
			$code = "/";
		}
	|	'>'
		{
			$code = ">";
		}
	|	'>='
		{
			$code = ">=";
		}
	|	'<'
		{
			$code = "<";
		}
	|	'<='
		{
			$code = "<=";
		}
	|	'=='
		{
			$code = "==";
		}
	|	'!='
		{
			$code = "!=";
		}
	|	'&&'
		{
			$code = "&&";
		}
	|	'||'
		{
			$code = "||";
		}
	|	'&'
		{
			$code = "&";
		}
	|	'|'
		{
			$code = "|";
		}
	|	'^'
		{
			$code = "^";
		}
	|	'<<'
		{
			$code = "<<";
		}
	|	'>>'
		{
			$code = ">>";
		}
	|	'='
		{
			$code = "=";
		}
	|	'+='
		{
			$code = "+=";
		}
	|	'-='
		{
			$code = "-=";
		}
	|	'*='
		{
			$code = "*=";
		}
	|	'/='
		{
			$code = "/=";
		}
	|	'&='
		{
			$code = "&=";
		}
	|	'|='
		{
			$code = "|=";
		}
	|	'^='
		{
			$code = "^=";
		}
	|	'<<='
		{
			$code = "<<=";
		}
	|	'>>='
		{
			$code = ">>=";
		}
	;

type returns [String code]
@init{
	code = null;
}
	:	'void' typeNext
		{
			$code = "var";
		}
	|	'char' typeNext
		{
			$code = "var";
		}
	|	'short' typeNext
		{
			$code = "var";
		}
	|	'int' typeNext
		{
			$code = "var";
		}
	|	'long' typeNext
		{
			$code = "var";
		}
	|	'float' typeNext
		{
			$code = "var";
		}
	|	'double' typeNext
		{
			$code = "var";
		}
	;

typeNext
	:	'*'
	|
	;

CHAR
	:	'\'' ~('\'') '\''
	;

ID
	:	('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_')*
	;

NUM
	:	('0'..'9')+ ('.' ('0'..'9')+)?
	;

COMMENT
	:	'/*' (~('*/'))* '*/'
		{
			skip();
		}
	;

LINE_COMMENT
	:	'//' (~('\r' | '\n'))* '\r'? '\n'
		{
			skip();
		} 
	;

WS
	:	(' ' | '\t' | '\r' | '\n')+
		{
			$channel=HIDDEN;
		}
	;

