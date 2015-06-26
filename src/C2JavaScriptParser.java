// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 16:29:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'*'", "'*='", "'+'", "'+='", 
		"','", "'-'", "'-='", "'/'", "'/='", "';'", "'<'", "'<<'", "'<<='", "'<='", 
		"'='", "'>'", "'>='", "'>>'", "'>>='", "'^'", "'^='", "'char'", "'int'", 
		"'short'", "'|'", "'|='", "'||'", "'~'"
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
			if ( (LA1_0==18) ) {
				alt1=1;
			}
			else if ( (LA1_0==23) ) {
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
					match(input,18,FOLLOW_18_in_variableDefineNext61); 
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
					match(input,23,FOLLOW_23_in_variableDefineNext76); 

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



	// $ANTLR start "unaryOperator"
	// src/C2JavaScript.g:34:1: unaryOperator returns [String code] : ( '!' | '~' );
	public final String unaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:38:2: ( '!' | '~' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==9) ) {
				alt2=1;
			}
			else if ( (LA2_0==41) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:38:4: '!'
					{
					match(input,9,FOLLOW_9_in_unaryOperator99); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:42:4: '~'
					{
					match(input,41,FOLLOW_41_in_unaryOperator108); 

								code = "~";
							
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
	// $ANTLR end "unaryOperator"



	// $ANTLR start "binaryOperator"
	// src/C2JavaScript.g:48:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:52:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt3=26;
			switch ( input.LA(1) ) {
			case 16:
				{
				alt3=1;
				}
				break;
			case 19:
				{
				alt3=2;
				}
				break;
			case 14:
				{
				alt3=3;
				}
				break;
			case 21:
				{
				alt3=4;
				}
				break;
			case 29:
				{
				alt3=5;
				}
				break;
			case 30:
				{
				alt3=6;
				}
				break;
			case 24:
				{
				alt3=7;
				}
				break;
			case 27:
				{
				alt3=8;
				}
				break;
			case 10:
				{
				alt3=9;
				}
				break;
			case 11:
				{
				alt3=10;
				}
				break;
			case 40:
				{
				alt3=11;
				}
				break;
			case 12:
				{
				alt3=12;
				}
				break;
			case 38:
				{
				alt3=13;
				}
				break;
			case 33:
				{
				alt3=14;
				}
				break;
			case 25:
				{
				alt3=15;
				}
				break;
			case 31:
				{
				alt3=16;
				}
				break;
			case 28:
				{
				alt3=17;
				}
				break;
			case 17:
				{
				alt3=18;
				}
				break;
			case 20:
				{
				alt3=19;
				}
				break;
			case 15:
				{
				alt3=20;
				}
				break;
			case 22:
				{
				alt3=21;
				}
				break;
			case 13:
				{
				alt3=22;
				}
				break;
			case 39:
				{
				alt3=23;
				}
				break;
			case 34:
				{
				alt3=24;
				}
				break;
			case 26:
				{
				alt3=25;
				}
				break;
			case 32:
				{
				alt3=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:52:4: '+'
					{
					match(input,16,FOLLOW_16_in_binaryOperator131); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:56:4: '-'
					{
					match(input,19,FOLLOW_19_in_binaryOperator140); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:60:4: '*'
					{
					match(input,14,FOLLOW_14_in_binaryOperator149); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:64:4: '/'
					{
					match(input,21,FOLLOW_21_in_binaryOperator158); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:68:4: '>'
					{
					match(input,29,FOLLOW_29_in_binaryOperator167); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:72:4: '>='
					{
					match(input,30,FOLLOW_30_in_binaryOperator176); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:76:4: '<'
					{
					match(input,24,FOLLOW_24_in_binaryOperator185); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:80:4: '<='
					{
					match(input,27,FOLLOW_27_in_binaryOperator194); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:84:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator203); 

								code = "!=";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:88:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator212); 

								code = "&&";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:92:4: '||'
					{
					match(input,40,FOLLOW_40_in_binaryOperator221); 

								code = "||";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:96:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator230); 

								code = "&";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:100:4: '|'
					{
					match(input,38,FOLLOW_38_in_binaryOperator239); 

								code = "|";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:104:4: '^'
					{
					match(input,33,FOLLOW_33_in_binaryOperator248); 

								code = "^";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:108:4: '<<'
					{
					match(input,25,FOLLOW_25_in_binaryOperator257); 

								code = "<<";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:112:4: '>>'
					{
					match(input,31,FOLLOW_31_in_binaryOperator266); 

								code = ">>";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:116:4: '='
					{
					match(input,28,FOLLOW_28_in_binaryOperator275); 

								code = "=";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:120:4: '+='
					{
					match(input,17,FOLLOW_17_in_binaryOperator284); 

								code = "+=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:124:4: '-='
					{
					match(input,20,FOLLOW_20_in_binaryOperator293); 

								code = "-=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:128:4: '*='
					{
					match(input,15,FOLLOW_15_in_binaryOperator302); 

								code = "*=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:132:4: '/='
					{
					match(input,22,FOLLOW_22_in_binaryOperator311); 

								code = "/=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:136:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator320); 

								code = "&=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:140:4: '|='
					{
					match(input,39,FOLLOW_39_in_binaryOperator329); 

								code = "|=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:144:4: '^='
					{
					match(input,34,FOLLOW_34_in_binaryOperator338); 

								code = "^=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:148:4: '<<='
					{
					match(input,26,FOLLOW_26_in_binaryOperator347); 

								code = "<<=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:152:4: '>>='
					{
					match(input,32,FOLLOW_32_in_binaryOperator356); 

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
	// src/C2JavaScript.g:158:1: type returns [String code] : ( 'char' | 'short' | 'int' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:162:2: ( 'char' | 'short' | 'int' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt4=1;
				}
				break;
			case 37:
				{
				alt4=2;
				}
				break;
			case 36:
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
					// src/C2JavaScript.g:162:4: 'char'
					{
					match(input,35,FOLLOW_35_in_type379); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:162:13: 'short'
					{
					match(input,37,FOLLOW_37_in_type383); 
					}
					break;
				case 3 :
					// src/C2JavaScript.g:162:23: 'int'
					{
					match(input,36,FOLLOW_36_in_type387); 

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
	public static final BitSet FOLLOW_ID_in_variableDefine36 = new BitSet(new long[]{0x0000000000840000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_variableDefineNext61 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_variableDefineNext63 = new BitSet(new long[]{0x0000000000840000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_variableDefineNext76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_unaryOperator99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryOperator108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_binaryOperator140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_binaryOperator149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_binaryOperator158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_binaryOperator194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_binaryOperator221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_binaryOperator302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_type379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_type383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_type387 = new BitSet(new long[]{0x0000000000000002L});
}
