// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 14:26:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS"
	};
	public static final int EOF=-1;
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
	// src/C2JavaScript.g:3:1: program : ID ;
	public final void program() throws RecognitionException {
		Token ID1=null;

		try {
			// src/C2JavaScript.g:4:2: ( ID )
			// src/C2JavaScript.g:4:4: ID
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_program11); 

						System.out.println((ID1!=null?ID1.getText():null));
					
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

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_program11 = new BitSet(new long[]{0x0000000000000002L});
}
