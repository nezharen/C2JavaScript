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
	:	type ID variableDefineNext
		{
			$code = $type.code + " " + $ID.text + $variableDefineNext.code;
		}
	;

variableDefineNext returns [String code]
@init{
	code = null;
}
	:	',' ID a=variableDefineNext
		{
			$code = ", " + $ID.text + $a.code;
		}
	|	';'
		{
			$code = ";";
		}
	;

unaryOperator returns [String code]
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

