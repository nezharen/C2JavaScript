grammar C2JavaScript;

program
	:	variableDefine
		{
			System.out.println($variableDefine.code);
		}
	;

variableDefine returns [String code]
@int{
	code = null;
}
	:	type ID ';'
		{
			$code = $type.code + " " + $ID.text + ";";
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

