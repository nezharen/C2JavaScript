grammar C2JavaScript;

program
	:	variableDefine
		{
			System.out.println($variableDefine.code);
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
			$code = ";";
		}
	;

expression returns [String code]
@init{
	code = null;
}
	:	expr ';'
		{
			$code = $expr.code + ";";
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
	:	'char' | 'short' | 'int'
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

