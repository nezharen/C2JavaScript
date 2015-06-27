// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 14:29:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", 
		"'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "';'", 
		"'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", 
		"'>>='", "'^'", "'^='", "'char'", "'int'", "'short'", "'|'", "'|='", "'||'", 
		"'~'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int COMMENT=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int LINE_COMMENT=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public C2JavaScriptParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public C2JavaScriptParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return C2JavaScriptParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/C2JavaScript.g"; }



	// $ANTLR start "program"
	// src/C2JavaScript.g:3:1: program : expression ;
	public final void program() throws RecognitionException {
		String expression1 =null;

		try {
			// src/C2JavaScript.g:4:2: ( expression )
			// src/C2JavaScript.g:4:4: expression
			{
			pushFollow(FOLLOW_expression_in_program11);
			expression1=expression();
			state._fsp--;


						System.out.println(expression1);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "variableDefine"
	// src/C2JavaScript.g:10:1: variableDefine returns [String code] : type ID variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String type2 =null;
		String variableDefineNext4 =null;


			code = null;

		try {
			// src/C2JavaScript.g:14:2: ( type ID variableDefineNext )
			// src/C2JavaScript.g:14:4: type ID variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine34);
			type2=type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_variableDefine36); 
			pushFollow(FOLLOW_variableDefineNext_in_variableDefine38);
			variableDefineNext4=variableDefineNext();
			state._fsp--;


						code = type2 + " " + (ID3!=null?ID3.getText():null) + variableDefineNext4;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "variableDefine"



	// $ANTLR start "variableDefineNext"
	// src/C2JavaScript.g:20:1: variableDefineNext returns [String code] : ( ',' ID a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		Token ID5=null;
		String a =null;


			code = null;

		try {
			// src/C2JavaScript.g:24:2: ( ',' ID a= variableDefineNext | ';' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==21) ) {
				alt1=1;
			}
			else if ( (LA1_0==27) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:24:4: ',' ID a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext61); 
					ID5=(Token)match(input,ID,FOLLOW_ID_in_variableDefineNext63); 
					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext67);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + (ID5!=null?ID5.getText():null) + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:28:4: ';'
					{
					match(input,27,FOLLOW_27_in_variableDefineNext76); 

								code = ";";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "variableDefineNext"



	// $ANTLR start "expression"
	// src/C2JavaScript.g:34:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr6 =null;


			code = null;

		try {
			// src/C2JavaScript.g:38:2: ( expr ';' )
			// src/C2JavaScript.g:38:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression99);
			expr6=expr();
			state._fsp--;

			match(input,27,FOLLOW_27_in_expression101); 

						code = expr6 + ";";
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "expression"



	// $ANTLR start "expr"
	// src/C2JavaScript.g:44:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID7=null;
		Token INT9=null;
		String a =null;
		String b =null;
		String exprNext8 =null;
		String exprNext10 =null;
		String exprNext11 =null;
		String leftUnaryOperator12 =null;
		String exprNext13 =null;


			code = null;

		try {
			// src/C2JavaScript.g:48:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case INT:
				{
				alt2=2;
				}
				break;
			case 14:
				{
				alt2=3;
				}
				break;
			case 9:
			case 19:
			case 23:
			case 46:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:48:4: ID exprNext
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_expr124); 
					pushFollow(FOLLOW_exprNext_in_expr126);
					exprNext8=exprNext();
					state._fsp--;


								code = (ID7!=null?ID7.getText():null) + exprNext8;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:52:4: INT exprNext
					{
					INT9=(Token)match(input,INT,FOLLOW_INT_in_expr135); 
					pushFollow(FOLLOW_exprNext_in_expr137);
					exprNext10=exprNext();
					state._fsp--;


								code = (INT9!=null?INT9.getText():null) + exprNext10;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:56:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr146); 
					pushFollow(FOLLOW_expr_in_expr150);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr152); 
					pushFollow(FOLLOW_exprNext_in_expr154);
					exprNext11=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext11;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:60:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr163);
					leftUnaryOperator12=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr167);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr169);
					exprNext13=exprNext();
					state._fsp--;


								code = leftUnaryOperator12 + b + exprNext13;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "expr"



	// $ANTLR start "exprNext"
	// src/C2JavaScript.g:66:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator14 =null;
		String expr15 =null;
		String rightUnaryOperator16 =null;


			code = null;

		try {
			// src/C2JavaScript.g:70:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt3=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt3=1;
				}
				break;
			case 22:
				{
				alt3=1;
				}
				break;
			case 16:
				{
				alt3=1;
				}
				break;
			case 25:
				{
				alt3=1;
				}
				break;
			case 34:
				{
				alt3=1;
				}
				break;
			case 35:
				{
				alt3=1;
				}
				break;
			case 28:
				{
				alt3=1;
				}
				break;
			case 31:
				{
				alt3=1;
				}
				break;
			case 33:
				{
				alt3=1;
				}
				break;
			case 10:
				{
				alt3=1;
				}
				break;
			case 11:
				{
				alt3=1;
				}
				break;
			case 45:
				{
				alt3=1;
				}
				break;
			case 12:
				{
				alt3=1;
				}
				break;
			case 43:
				{
				alt3=1;
				}
				break;
			case 38:
				{
				alt3=1;
				}
				break;
			case 29:
				{
				alt3=1;
				}
				break;
			case 36:
				{
				alt3=1;
				}
				break;
			case 32:
				{
				alt3=1;
				}
				break;
			case 20:
				{
				alt3=1;
				}
				break;
			case 24:
				{
				alt3=1;
				}
				break;
			case 17:
				{
				alt3=1;
				}
				break;
			case 26:
				{
				alt3=1;
				}
				break;
			case 13:
				{
				alt3=1;
				}
				break;
			case 44:
				{
				alt3=1;
				}
				break;
			case 39:
				{
				alt3=1;
				}
				break;
			case 30:
				{
				alt3=1;
				}
				break;
			case 37:
				{
				alt3=1;
				}
				break;
			case 19:
				{
				alt3=2;
				}
				break;
			case 23:
				{
				alt3=2;
				}
				break;
			case 15:
			case 27:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:70:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext192);
					binaryOperator14=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext194);
					expr15=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext198);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator14 + " " + expr15 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:74:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext207);
					rightUnaryOperator16=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator16;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:79:3: 
					{

								code = "";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "exprNext"



	// $ANTLR start "leftUnaryOperator"
	// src/C2JavaScript.g:84:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:88:2: ( '!' | '~' | '++' | '--' )
			int alt4=4;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt4=1;
				}
				break;
			case 46:
				{
				alt4=2;
				}
				break;
			case 19:
				{
				alt4=3;
				}
				break;
			case 23:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:88:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator237); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:92:4: '~'
					{
					match(input,46,FOLLOW_46_in_leftUnaryOperator246); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:96:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator255); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:100:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator264); 

								code = "--";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "leftUnaryOperator"



	// $ANTLR start "rightUnaryOperator"
	// src/C2JavaScript.g:106:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:110:2: ( '++' | '--' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==19) ) {
				alt5=1;
			}
			else if ( (LA5_0==23) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:110:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator287); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:114:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator296); 

								code = "--";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "rightUnaryOperator"



	// $ANTLR start "binaryOperator"
	// src/C2JavaScript.g:120:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:124:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt6=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt6=1;
				}
				break;
			case 22:
				{
				alt6=2;
				}
				break;
			case 16:
				{
				alt6=3;
				}
				break;
			case 25:
				{
				alt6=4;
				}
				break;
			case 34:
				{
				alt6=5;
				}
				break;
			case 35:
				{
				alt6=6;
				}
				break;
			case 28:
				{
				alt6=7;
				}
				break;
			case 31:
				{
				alt6=8;
				}
				break;
			case 33:
				{
				alt6=9;
				}
				break;
			case 10:
				{
				alt6=10;
				}
				break;
			case 11:
				{
				alt6=11;
				}
				break;
			case 45:
				{
				alt6=12;
				}
				break;
			case 12:
				{
				alt6=13;
				}
				break;
			case 43:
				{
				alt6=14;
				}
				break;
			case 38:
				{
				alt6=15;
				}
				break;
			case 29:
				{
				alt6=16;
				}
				break;
			case 36:
				{
				alt6=17;
				}
				break;
			case 32:
				{
				alt6=18;
				}
				break;
			case 20:
				{
				alt6=19;
				}
				break;
			case 24:
				{
				alt6=20;
				}
				break;
			case 17:
				{
				alt6=21;
				}
				break;
			case 26:
				{
				alt6=22;
				}
				break;
			case 13:
				{
				alt6=23;
				}
				break;
			case 44:
				{
				alt6=24;
				}
				break;
			case 39:
				{
				alt6=25;
				}
				break;
			case 30:
				{
				alt6=26;
				}
				break;
			case 37:
				{
				alt6=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:124:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator319); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:128:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator328); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:132:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator337); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:136:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator346); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:140:4: '>'
					{
					match(input,34,FOLLOW_34_in_binaryOperator355); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:144:4: '>='
					{
					match(input,35,FOLLOW_35_in_binaryOperator364); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:148:4: '<'
					{
					match(input,28,FOLLOW_28_in_binaryOperator373); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:152:4: '<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator382); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:156:4: '=='
					{
					match(input,33,FOLLOW_33_in_binaryOperator391); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:160:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator400); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:164:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator409); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:168:4: '||'
					{
					match(input,45,FOLLOW_45_in_binaryOperator418); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:172:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator427); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:176:4: '|'
					{
					match(input,43,FOLLOW_43_in_binaryOperator436); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:180:4: '^'
					{
					match(input,38,FOLLOW_38_in_binaryOperator445); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:184:4: '<<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator454); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:188:4: '>>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator463); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:192:4: '='
					{
					match(input,32,FOLLOW_32_in_binaryOperator472); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:196:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator481); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:200:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator490); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:204:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator499); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:208:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator508); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:212:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator517); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:216:4: '|='
					{
					match(input,44,FOLLOW_44_in_binaryOperator526); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:220:4: '^='
					{
					match(input,39,FOLLOW_39_in_binaryOperator535); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:224:4: '<<='
					{
					match(input,30,FOLLOW_30_in_binaryOperator544); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:228:4: '>>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator553); 

								code = ">>=";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "binaryOperator"



	// $ANTLR start "type"
	// src/C2JavaScript.g:234:1: type returns [String code] : ( 'char' | 'short' | 'int' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:238:2: ( 'char' | 'short' | 'int' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case 40:
				{
				alt7=1;
				}
				break;
			case 42:
				{
				alt7=2;
				}
				break;
			case 41:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:238:4: 'char'
					{
					match(input,40,FOLLOW_40_in_type576); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:238:13: 'short'
					{
					match(input,42,FOLLOW_42_in_type580); 
					}
					break;
				case 3 :
					// src/C2JavaScript.g:238:23: 'int'
					{
					match(input,41,FOLLOW_41_in_type584); 

								code = "var";
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_expression_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine34 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_variableDefine36 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext61 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_variableDefineNext63 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_variableDefineNext76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression99 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_expression101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr124 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr135 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr146 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_expr150 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr152 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr163 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_expr167 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext192 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_exprNext194 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_leftUnaryOperator246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_binaryOperator418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_binaryOperator436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_binaryOperator526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_type576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type584 = new BitSet(new long[]{0x0000000000000002L});
}
