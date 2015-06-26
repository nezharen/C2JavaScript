// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 15:11:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "';'", "'char'", "'int'", "'short'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
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
	// src/C2JavaScript.g:10:1: variableDefine returns [String code] : type ID ';' ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String type2 =null;

		try {
			// src/C2JavaScript.g:14:2: ( type ID ';' )
			// src/C2JavaScript.g:14:4: type ID ';'
			{
			pushFollow(FOLLOW_type_in_variableDefine34);
			type2=type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_variableDefine36); 
			match(input,9,FOLLOW_9_in_variableDefine38); 

						code = type2 + " " + (ID3!=null?ID3.getText():null) + ";";
					
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



	// $ANTLR start "type"
	// src/C2JavaScript.g:20:1: type returns [String code] : ( 'char' | 'short' | 'int' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:24:2: ( 'char' | 'short' | 'int' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt1=1;
				}
				break;
			case 12:
				{
				alt1=2;
				}
				break;
			case 11:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:24:4: 'char'
					{
					match(input,10,FOLLOW_10_in_type61); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:24:13: 'short'
					{
					match(input,12,FOLLOW_12_in_type65); 
					}
					break;
				case 3 :
					// src/C2JavaScript.g:24:23: 'int'
					{
					match(input,11,FOLLOW_11_in_type69); 

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
	public static final BitSet FOLLOW_ID_in_variableDefine36 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_variableDefine38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_type61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_type65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_type69 = new BitSet(new long[]{0x0000000000000002L});
}
