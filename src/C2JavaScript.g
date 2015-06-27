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
			$code = $type.code + " " + $ID.text + $functionArgumentNext.code;
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
			$code = ", " + $type.code + " " + $ID.text + $a.code;
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
	|	'{' d=statement '}'
		{
			$code = "{\n" + $d.code + "}\n";
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
	:	'void'
		{
			$code = "var";
		}
	|	'char'
		{
			$code = "var";
		}
	|	'short'
		{
			$code = "var";
		}
	|	'int'
		{
			$code = "var";
		}
	|	'long'
		{
			$code = "var";
		}
	|	'float'
		{
			$code = "var";
		}
	|	'double'
		{
			$code = "var";
		}
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

