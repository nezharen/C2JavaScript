// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 15:44:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "','", "';'", "'char'", "'int'", "'short'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
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
			if ( (LA1_0==9) ) {
				alt1=1;
			}
			else if ( (LA1_0==10) ) {
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
					match(input,9,FOLLOW_9_in_variableDefineNext61); 
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
					match(input,10,FOLLOW_10_in_variableDefineNext76); 

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



	// $ANTLR start "type"
	// src/C2JavaScript.g:35:1: type returns [String code] : ( 'char' | 'short' | 'int' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:39:2: ( 'char' | 'short' | 'int' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 11:
				{
				alt2=1;
				}
				break;
			case 13:
				{
				alt2=2;
				}
				break;
			case 12:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:39:4: 'char'
					{
					match(input,11,FOLLOW_11_in_type100); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:39:13: 'short'
					{
					match(input,13,FOLLOW_13_in_type104); 
					}
					break;
				case 3 :
					// src/C2JavaScript.g:39:23: 'int'
					{
					match(input,12,FOLLOW_12_in_type108); 

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
	public static final BitSet FOLLOW_ID_in_variableDefine36 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_variableDefineNext61 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_variableDefineNext63 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_variableDefineNext76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_type100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_type104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_type108 = new BitSet(new long[]{0x0000000000000002L});
}
