grammar C2JavaScript;

program
	:	functionDefine
		{
			System.out.println($functionDefine.code);
		}
	;

functionDefine returns [String code]
@init{
	code = null;
}
	:	type ID '(' functionArgument ')' '{' statement '}'
		{
			$code = "function " + $ID.text + "(" + $functionArgument.code + ")\n" + "{\n" + $statement.code + "}\n";
		}
	;

functionArgument returns [String code]
@init{
	code = null;
}
	:	type ID functionArgumentNext
		{
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

statement returns [String code]
@init{
	code = null;
}
	:	variableDefine a=statement
		{
			$code = $variableDefine.code + $a.code;
		}
	|	expression b=statement
		{
			$code = $expression.code + $b.code;
		}
	|	ifStatement c=statement
		{
			$code = $ifStatement.code + $c.code;
		}
	|	switchStatement d=statement
		{
			$code = $switchStatement.code + $d.code;
		}
	|	forStatement e=statement
		{
			$code = $forStatement.code + $e.code;
		}
	|	whileStatement f=statement
		{
			$code = $whileStatement.code + $f.code;
		}
	|	returnStatement g=statement
		{
			$code = $returnStatement.code + $g.code;
		}
	|	'{' h=statement '}'
		{
			$code = "{\n" + $h.code + "}\n";
		}
	|	'break;'
		{
			$code = "break;\n";
		}
	|	'continue;'
		{
			$code = "continue;\n";
		}
	|
		{
			$code = "";
		}
	;

ifStatement returns [String code]
@init{
	code = null;
}
	:	'if' '(' expr ')' statement ifStatementNext
		{
			$code = "if (" + $expr.code + ")\n" + $statement.code + $ifStatementNext.code;
		}
	;

ifStatementNext returns [String code]
@init{
	code = null;
}
	:	'else' statement
		{
			$code = "else\n" + $statement.code;
		}
	|
		{
			$code = "";
		}
	;

switchStatement returns [String code]
@init{
	code = null;
}
	:	'switch' '(' expr ')' '{' caseStatement '}'
		{
			$code = "switch (" + $expr.code + ")\n{\n" + $caseStatement.code + "}\n";
		}
	;

caseStatement returns [String code]
@init{
	code = null;
}
	:	'case' expr ':' statement a=caseStatement
		{
			$code = "case " + $expr.code + ":\n" + $statement.code + $a.code;
		}
	|	'default:' statement b=caseStatement
		{
			$code = "default:\n" + $statement.code + $b.code;
		}
	|
		{
			$code = "";
		}
	;

forStatement returns [String code]
@init{
	code = null;
}
	:	'for' '(' a=expr ';' b=expr ';' c=expr ')' statement
		{
			$code = "for (" + $a.code + "; " + $b.code + "; " + $c.code + ")\n" + $statement.code;
		}
	;

whileStatement returns [String code]
@init{
	code = null;
}
	:	'while' '(' expr ')' statement
		{
			$code = "while (" + $expr.code + ")\n"  + $statement.code;
		}
	;

returnStatement returns [String code]
@init{
	code = null;
}
	:	'return' expression
		{
			$code = "return " + $expression.code;
		}
	;

variableDefine returns [String code]
@init{
	code = null;
}
	:	type singleVariableDefine variableDefineNext
		{
			$code = $type.code + " " + $singleVariableDefine.code + $variableDefineNext.code;
		}
	;

singleVariableDefine returns [String code]
@init{
	code = null;
}
	:	ID initialValue
		{
			$code = $ID.text + $initialValue.code;
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

expression returns [String code]
@init{
	code = null;
}
	:	expr ';'
		{
			$code = $expr.code + ";\n";
		}
	;

expr returns [String code]
@init{
	code = null;
}
	:	ID exprNext
		{
			$code = $ID.text + $exprNext.code;
		}
	|	INT exprNext
		{
			$code = $INT.text + $exprNext.code;
		}
	|	'(' a=expr ')' exprNext
		{
			$code = "(" + $a.code + ")" + $exprNext.code;
		}
	|	leftUnaryOperator b=expr exprNext
		{
			$code = $leftUnaryOperator.code + $b.code + $exprNext.code;
		}
	|	functionCall exprNext
		{
			$code = $functionCall.code + $exprNext.code;
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

ID
	:	('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_')*
	;

INT
	:	('0'..'9')+
	;

COMMENT
	:	'/*' .* '*/'
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

