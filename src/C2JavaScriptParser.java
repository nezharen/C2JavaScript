// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 14:44:45

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
	// src/C2JavaScript.g:3:1: program : variableDefine ;
	public final void program() throws RecognitionException {
		String variableDefine1 =null;

		try {
			// src/C2JavaScript.g:4:2: ( variableDefine )
			// src/C2JavaScript.g:4:4: variableDefine
			{
			pushFollow(FOLLOW_variableDefine_in_program11);
			variableDefine1=variableDefine();
			state._fsp--;


						System.out.println(variableDefine1);
					
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
	// src/C2JavaScript.g:10:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type2 =null;
		String singleVariableDefine3 =null;
		String variableDefineNext4 =null;


			code = null;

		try {
			// src/C2JavaScript.g:14:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:14:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine34);
			type2=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine36);
			singleVariableDefine3=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine38);
			variableDefineNext4=variableDefineNext();
			state._fsp--;


						code = type2 + " " + singleVariableDefine3 + variableDefineNext4;
					
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



	// $ANTLR start "singleVariableDefine"
	// src/C2JavaScript.g:20:1: singleVariableDefine returns [String code] : ID initialValue ;
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID5=null;
		String initialValue6 =null;


			code = null;

		try {
			// src/C2JavaScript.g:24:2: ( ID initialValue )
			// src/C2JavaScript.g:24:4: ID initialValue
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine61); 
			pushFollow(FOLLOW_initialValue_in_singleVariableDefine63);
			initialValue6=initialValue();
			state._fsp--;


						code = (ID5!=null?ID5.getText():null) + initialValue6;
					
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
	// $ANTLR end "singleVariableDefine"



	// $ANTLR start "initialValue"
	// src/C2JavaScript.g:30:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr7 =null;


			code = null;

		try {
			// src/C2JavaScript.g:34:2: ( '=' expr |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==32) ) {
				alt1=1;
			}
			else if ( (LA1_0==21||LA1_0==27) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:34:4: '=' expr
					{
					match(input,32,FOLLOW_32_in_initialValue86); 
					pushFollow(FOLLOW_expr_in_initialValue88);
					expr7=expr();
					state._fsp--;


								code = " = " + expr7;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:39:3: 
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
	// $ANTLR end "initialValue"



	// $ANTLR start "variableDefineNext"
	// src/C2JavaScript.g:44:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine8 =null;


			code = null;

		try {
			// src/C2JavaScript.g:48:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==21) ) {
				alt2=1;
			}
			else if ( (LA2_0==27) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:48:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext118); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext120);
					singleVariableDefine8=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext124);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine8 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:52:4: ';'
					{
					match(input,27,FOLLOW_27_in_variableDefineNext133); 

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
	// src/C2JavaScript.g:58:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr9 =null;


			code = null;

		try {
			// src/C2JavaScript.g:62:2: ( expr ';' )
			// src/C2JavaScript.g:62:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression156);
			expr9=expr();
			state._fsp--;

			match(input,27,FOLLOW_27_in_expression158); 

						code = expr9 + ";";
					
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
	// src/C2JavaScript.g:68:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID10=null;
		Token INT12=null;
		String a =null;
		String b =null;
		String exprNext11 =null;
		String exprNext13 =null;
		String exprNext14 =null;
		String leftUnaryOperator15 =null;
		String exprNext16 =null;


			code = null;

		try {
			// src/C2JavaScript.g:72:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext )
			int alt3=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case INT:
				{
				alt3=2;
				}
				break;
			case 14:
				{
				alt3=3;
				}
				break;
			case 9:
			case 19:
			case 23:
			case 46:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:72:4: ID exprNext
					{
					ID10=(Token)match(input,ID,FOLLOW_ID_in_expr181); 
					pushFollow(FOLLOW_exprNext_in_expr183);
					exprNext11=exprNext();
					state._fsp--;


								code = (ID10!=null?ID10.getText():null) + exprNext11;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:76:4: INT exprNext
					{
					INT12=(Token)match(input,INT,FOLLOW_INT_in_expr192); 
					pushFollow(FOLLOW_exprNext_in_expr194);
					exprNext13=exprNext();
					state._fsp--;


								code = (INT12!=null?INT12.getText():null) + exprNext13;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:80:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr203); 
					pushFollow(FOLLOW_expr_in_expr207);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr209); 
					pushFollow(FOLLOW_exprNext_in_expr211);
					exprNext14=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext14;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:84:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr220);
					leftUnaryOperator15=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr224);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr226);
					exprNext16=exprNext();
					state._fsp--;


								code = leftUnaryOperator15 + b + exprNext16;
							
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
	// src/C2JavaScript.g:90:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator17 =null;
		String expr18 =null;
		String rightUnaryOperator19 =null;


			code = null;

		try {
			// src/C2JavaScript.g:94:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt4=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt4=1;
				}
				break;
			case 22:
				{
				alt4=1;
				}
				break;
			case 16:
				{
				alt4=1;
				}
				break;
			case 25:
				{
				alt4=1;
				}
				break;
			case 34:
				{
				alt4=1;
				}
				break;
			case 35:
				{
				alt4=1;
				}
				break;
			case 28:
				{
				alt4=1;
				}
				break;
			case 31:
				{
				alt4=1;
				}
				break;
			case 33:
				{
				alt4=1;
				}
				break;
			case 10:
				{
				alt4=1;
				}
				break;
			case 11:
				{
				alt4=1;
				}
				break;
			case 45:
				{
				alt4=1;
				}
				break;
			case 12:
				{
				alt4=1;
				}
				break;
			case 43:
				{
				alt4=1;
				}
				break;
			case 38:
				{
				alt4=1;
				}
				break;
			case 29:
				{
				alt4=1;
				}
				break;
			case 36:
				{
				alt4=1;
				}
				break;
			case 32:
				{
				alt4=1;
				}
				break;
			case 20:
				{
				alt4=1;
				}
				break;
			case 24:
				{
				alt4=1;
				}
				break;
			case 17:
				{
				alt4=1;
				}
				break;
			case 26:
				{
				alt4=1;
				}
				break;
			case 13:
				{
				alt4=1;
				}
				break;
			case 44:
				{
				alt4=1;
				}
				break;
			case 39:
				{
				alt4=1;
				}
				break;
			case 30:
				{
				alt4=1;
				}
				break;
			case 37:
				{
				alt4=1;
				}
				break;
			case 19:
				{
				alt4=2;
				}
				break;
			case 23:
				{
				alt4=2;
				}
				break;
			case 15:
			case 21:
			case 27:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:94:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext249);
					binaryOperator17=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext251);
					expr18=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext255);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator17 + " " + expr18 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:98:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext264);
					rightUnaryOperator19=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator19;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:103:3: 
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
	// src/C2JavaScript.g:108:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:112:2: ( '!' | '~' | '++' | '--' )
			int alt5=4;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt5=1;
				}
				break;
			case 46:
				{
				alt5=2;
				}
				break;
			case 19:
				{
				alt5=3;
				}
				break;
			case 23:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:112:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator294); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:116:4: '~'
					{
					match(input,46,FOLLOW_46_in_leftUnaryOperator303); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:120:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator312); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:124:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator321); 

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
	// src/C2JavaScript.g:130:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:134:2: ( '++' | '--' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==19) ) {
				alt6=1;
			}
			else if ( (LA6_0==23) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:134:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator344); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:138:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator353); 

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
	// src/C2JavaScript.g:144:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:148:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt7=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt7=1;
				}
				break;
			case 22:
				{
				alt7=2;
				}
				break;
			case 16:
				{
				alt7=3;
				}
				break;
			case 25:
				{
				alt7=4;
				}
				break;
			case 34:
				{
				alt7=5;
				}
				break;
			case 35:
				{
				alt7=6;
				}
				break;
			case 28:
				{
				alt7=7;
				}
				break;
			case 31:
				{
				alt7=8;
				}
				break;
			case 33:
				{
				alt7=9;
				}
				break;
			case 10:
				{
				alt7=10;
				}
				break;
			case 11:
				{
				alt7=11;
				}
				break;
			case 45:
				{
				alt7=12;
				}
				break;
			case 12:
				{
				alt7=13;
				}
				break;
			case 43:
				{
				alt7=14;
				}
				break;
			case 38:
				{
				alt7=15;
				}
				break;
			case 29:
				{
				alt7=16;
				}
				break;
			case 36:
				{
				alt7=17;
				}
				break;
			case 32:
				{
				alt7=18;
				}
				break;
			case 20:
				{
				alt7=19;
				}
				break;
			case 24:
				{
				alt7=20;
				}
				break;
			case 17:
				{
				alt7=21;
				}
				break;
			case 26:
				{
				alt7=22;
				}
				break;
			case 13:
				{
				alt7=23;
				}
				break;
			case 44:
				{
				alt7=24;
				}
				break;
			case 39:
				{
				alt7=25;
				}
				break;
			case 30:
				{
				alt7=26;
				}
				break;
			case 37:
				{
				alt7=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:148:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator376); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:152:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator385); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:156:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator394); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:160:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator403); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:164:4: '>'
					{
					match(input,34,FOLLOW_34_in_binaryOperator412); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:168:4: '>='
					{
					match(input,35,FOLLOW_35_in_binaryOperator421); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:172:4: '<'
					{
					match(input,28,FOLLOW_28_in_binaryOperator430); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:176:4: '<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator439); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:180:4: '=='
					{
					match(input,33,FOLLOW_33_in_binaryOperator448); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:184:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator457); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:188:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator466); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:192:4: '||'
					{
					match(input,45,FOLLOW_45_in_binaryOperator475); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:196:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator484); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:200:4: '|'
					{
					match(input,43,FOLLOW_43_in_binaryOperator493); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:204:4: '^'
					{
					match(input,38,FOLLOW_38_in_binaryOperator502); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:208:4: '<<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator511); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:212:4: '>>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator520); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:216:4: '='
					{
					match(input,32,FOLLOW_32_in_binaryOperator529); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:220:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator538); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:224:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator547); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:228:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator556); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:232:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator565); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:236:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator574); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:240:4: '|='
					{
					match(input,44,FOLLOW_44_in_binaryOperator583); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:244:4: '^='
					{
					match(input,39,FOLLOW_39_in_binaryOperator592); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:248:4: '<<='
					{
					match(input,30,FOLLOW_30_in_binaryOperator601); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:252:4: '>>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator610); 

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
	// src/C2JavaScript.g:258:1: type returns [String code] : ( 'char' | 'short' | 'int' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:262:2: ( 'char' | 'short' | 'int' )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 40:
				{
				alt8=1;
				}
				break;
			case 42:
				{
				alt8=2;
				}
				break;
			case 41:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// src/C2JavaScript.g:262:4: 'char'
					{
					match(input,40,FOLLOW_40_in_type633); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:262:13: 'short'
					{
					match(input,42,FOLLOW_42_in_type637); 
					}
					break;
				case 3 :
					// src/C2JavaScript.g:262:23: 'int'
					{
					match(input,41,FOLLOW_41_in_type641); 

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



	public static final BitSet FOLLOW_variableDefine_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine34 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine36 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine61 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_initialValue86 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_initialValue88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext118 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext120 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_variableDefineNext133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression156 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_expression158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr181 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr192 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr203 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_expr207 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr209 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr220 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext249 = new BitSet(new long[]{0x0000400000884260L});
	public static final BitSet FOLLOW_expr_in_exprNext251 = new BitSet(new long[]{0x000038FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_leftUnaryOperator303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_binaryOperator475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_binaryOperator493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_binaryOperator583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_type633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type641 = new BitSet(new long[]{0x0000000000000002L});
}
