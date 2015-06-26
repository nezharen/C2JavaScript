// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 15:44:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public C2JavaScriptLexer() {} 
	public C2JavaScriptLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public C2JavaScriptLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/C2JavaScript.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:2:6: ( ',' )
			// src/C2JavaScript.g:2:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:3:7: ( ';' )
			// src/C2JavaScript.g:3:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:4:7: ( 'char' )
			// src/C2JavaScript.g:4:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:5:7: ( 'int' )
			// src/C2JavaScript.g:5:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:6:7: ( 'short' )
			// src/C2JavaScript.g:6:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:46:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
			// src/C2JavaScript.g:46:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/C2JavaScript.g:46:31: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:50:2: ( ( '0' .. '9' )+ )
			// src/C2JavaScript.g:50:4: ( '0' .. '9' )+
			{
			// src/C2JavaScript.g:50:4: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:54:2: ( '/*' ( . )* '*/' )
			// src/C2JavaScript.g:54:4: '/*' ( . )* '*/'
			{
			match("/*"); 

			// src/C2JavaScript.g:54:9: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='*') ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1=='/') ) {
						alt3=2;
					}
					else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
						alt3=1;
					}

				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:54:9: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match("*/"); 


						skip();
					
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:61:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// src/C2JavaScript.g:61:4: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// src/C2JavaScript.g:61:9: (~ ( '\\r' | '\\n' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			// src/C2JavaScript.g:61:27: ( '\\r' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\r') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:61:27: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 

						skip();
					
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:68:2: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// src/C2JavaScript.g:68:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// src/C2JavaScript.g:68:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}


						_channel=HIDDEN;
					
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// src/C2JavaScript.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | ID | INT | COMMENT | LINE_COMMENT | WS )
		int alt7=10;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt7=1;
			}
			break;
		case ';':
			{
			alt7=2;
			}
			break;
		case 'c':
			{
			int LA7_3 = input.LA(2);
			if ( (LA7_3=='h') ) {
				int LA7_10 = input.LA(3);
				if ( (LA7_10=='a') ) {
					int LA7_15 = input.LA(4);
					if ( (LA7_15=='r') ) {
						int LA7_18 = input.LA(5);
						if ( ((LA7_18 >= '0' && LA7_18 <= '9')||(LA7_18 >= 'A' && LA7_18 <= 'Z')||LA7_18=='_'||(LA7_18 >= 'a' && LA7_18 <= 'z')) ) {
							alt7=6;
						}

						else {
							alt7=3;
						}

					}

					else {
						alt7=6;
					}

				}

				else {
					alt7=6;
				}

			}

			else {
				alt7=6;
			}

			}
			break;
		case 'i':
			{
			int LA7_4 = input.LA(2);
			if ( (LA7_4=='n') ) {
				int LA7_11 = input.LA(3);
				if ( (LA7_11=='t') ) {
					int LA7_16 = input.LA(4);
					if ( ((LA7_16 >= '0' && LA7_16 <= '9')||(LA7_16 >= 'A' && LA7_16 <= 'Z')||LA7_16=='_'||(LA7_16 >= 'a' && LA7_16 <= 'z')) ) {
						alt7=6;
					}

					else {
						alt7=4;
					}

				}

				else {
					alt7=6;
				}

			}

			else {
				alt7=6;
			}

			}
			break;
		case 's':
			{
			int LA7_5 = input.LA(2);
			if ( (LA7_5=='h') ) {
				int LA7_12 = input.LA(3);
				if ( (LA7_12=='o') ) {
					int LA7_17 = input.LA(4);
					if ( (LA7_17=='r') ) {
						int LA7_20 = input.LA(5);
						if ( (LA7_20=='t') ) {
							int LA7_22 = input.LA(6);
							if ( ((LA7_22 >= '0' && LA7_22 <= '9')||(LA7_22 >= 'A' && LA7_22 <= 'Z')||LA7_22=='_'||(LA7_22 >= 'a' && LA7_22 <= 'z')) ) {
								alt7=6;
							}

							else {
								alt7=5;
							}

						}

						else {
							alt7=6;
						}

					}

					else {
						alt7=6;
					}

				}

				else {
					alt7=6;
				}

			}

			else {
				alt7=6;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt7=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt7=7;
			}
			break;
		case '/':
			{
			int LA7_8 = input.LA(2);
			if ( (LA7_8=='*') ) {
				alt7=8;
			}
			else if ( (LA7_8=='/') ) {
				alt7=9;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 7, 8, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt7=10;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// src/C2JavaScript.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// src/C2JavaScript.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// src/C2JavaScript.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// src/C2JavaScript.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// src/C2JavaScript.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// src/C2JavaScript.g:1:39: ID
				{
				mID(); 

				}
				break;
			case 7 :
				// src/C2JavaScript.g:1:42: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// src/C2JavaScript.g:1:46: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// src/C2JavaScript.g:1:54: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 10 :
				// src/C2JavaScript.g:1:67: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
