// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-26 16:29:46

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
			// src/C2JavaScript.g:2:6: ( '!' )
			// src/C2JavaScript.g:2:8: '!'
			{
			match('!'); 
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
			// src/C2JavaScript.g:3:7: ( '!=' )
			// src/C2JavaScript.g:3:9: '!='
			{
			match("!="); 

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
			// src/C2JavaScript.g:4:7: ( '&&' )
			// src/C2JavaScript.g:4:9: '&&'
			{
			match("&&"); 

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
			// src/C2JavaScript.g:5:7: ( '&' )
			// src/C2JavaScript.g:5:9: '&'
			{
			match('&'); 
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
			// src/C2JavaScript.g:6:7: ( '&=' )
			// src/C2JavaScript.g:6:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:7:7: ( '*' )
			// src/C2JavaScript.g:7:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:8:7: ( '*=' )
			// src/C2JavaScript.g:8:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:9:7: ( '+' )
			// src/C2JavaScript.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:10:7: ( '+=' )
			// src/C2JavaScript.g:10:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:11:7: ( ',' )
			// src/C2JavaScript.g:11:9: ','
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:12:7: ( '-' )
			// src/C2JavaScript.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:13:7: ( '-=' )
			// src/C2JavaScript.g:13:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:14:7: ( '/' )
			// src/C2JavaScript.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:15:7: ( '/=' )
			// src/C2JavaScript.g:15:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:16:7: ( ';' )
			// src/C2JavaScript.g:16:9: ';'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:17:7: ( '<' )
			// src/C2JavaScript.g:17:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:18:7: ( '<<' )
			// src/C2JavaScript.g:18:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:19:7: ( '<<=' )
			// src/C2JavaScript.g:19:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:20:7: ( '<=' )
			// src/C2JavaScript.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:21:7: ( '=' )
			// src/C2JavaScript.g:21:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:22:7: ( '>' )
			// src/C2JavaScript.g:22:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:23:7: ( '>=' )
			// src/C2JavaScript.g:23:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:24:7: ( '>>' )
			// src/C2JavaScript.g:24:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:25:7: ( '>>=' )
			// src/C2JavaScript.g:25:9: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:26:7: ( '^' )
			// src/C2JavaScript.g:26:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:27:7: ( '^=' )
			// src/C2JavaScript.g:27:9: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:28:7: ( 'char' )
			// src/C2JavaScript.g:28:9: 'char'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:29:7: ( 'int' )
			// src/C2JavaScript.g:29:9: 'int'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:30:7: ( 'short' )
			// src/C2JavaScript.g:30:9: 'short'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:31:7: ( '|' )
			// src/C2JavaScript.g:31:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:32:7: ( '|=' )
			// src/C2JavaScript.g:32:9: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:33:7: ( '||' )
			// src/C2JavaScript.g:33:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:34:7: ( '~' )
			// src/C2JavaScript.g:34:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:169:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
			// src/C2JavaScript.g:169:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/C2JavaScript.g:169:31: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
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
			// src/C2JavaScript.g:173:2: ( ( '0' .. '9' )+ )
			// src/C2JavaScript.g:173:4: ( '0' .. '9' )+
			{
			// src/C2JavaScript.g:173:4: ( '0' .. '9' )+
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
			// src/C2JavaScript.g:177:2: ( '/*' ( . )* '*/' )
			// src/C2JavaScript.g:177:4: '/*' ( . )* '*/'
			{
			match("/*"); 

			// src/C2JavaScript.g:177:9: ( . )*
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
					// src/C2JavaScript.g:177:9: .
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
			// src/C2JavaScript.g:184:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// src/C2JavaScript.g:184:4: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// src/C2JavaScript.g:184:9: (~ ( '\\r' | '\\n' ) )*
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

			// src/C2JavaScript.g:184:27: ( '\\r' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\r') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:184:27: '\\r'
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
			// src/C2JavaScript.g:191:2: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// src/C2JavaScript.g:191:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// src/C2JavaScript.g:191:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
		// src/C2JavaScript.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | ID | INT | COMMENT | LINE_COMMENT | WS )
		int alt7=38;
		alt7 = dfa7.predict(input);
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
				// src/C2JavaScript.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// src/C2JavaScript.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// src/C2JavaScript.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// src/C2JavaScript.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// src/C2JavaScript.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// src/C2JavaScript.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// src/C2JavaScript.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// src/C2JavaScript.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// src/C2JavaScript.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// src/C2JavaScript.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// src/C2JavaScript.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// src/C2JavaScript.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// src/C2JavaScript.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// src/C2JavaScript.g:1:117: T__27
				{
				mT__27(); 

				}
				break;
			case 20 :
				// src/C2JavaScript.g:1:123: T__28
				{
				mT__28(); 

				}
				break;
			case 21 :
				// src/C2JavaScript.g:1:129: T__29
				{
				mT__29(); 

				}
				break;
			case 22 :
				// src/C2JavaScript.g:1:135: T__30
				{
				mT__30(); 

				}
				break;
			case 23 :
				// src/C2JavaScript.g:1:141: T__31
				{
				mT__31(); 

				}
				break;
			case 24 :
				// src/C2JavaScript.g:1:147: T__32
				{
				mT__32(); 

				}
				break;
			case 25 :
				// src/C2JavaScript.g:1:153: T__33
				{
				mT__33(); 

				}
				break;
			case 26 :
				// src/C2JavaScript.g:1:159: T__34
				{
				mT__34(); 

				}
				break;
			case 27 :
				// src/C2JavaScript.g:1:165: T__35
				{
				mT__35(); 

				}
				break;
			case 28 :
				// src/C2JavaScript.g:1:171: T__36
				{
				mT__36(); 

				}
				break;
			case 29 :
				// src/C2JavaScript.g:1:177: T__37
				{
				mT__37(); 

				}
				break;
			case 30 :
				// src/C2JavaScript.g:1:183: T__38
				{
				mT__38(); 

				}
				break;
			case 31 :
				// src/C2JavaScript.g:1:189: T__39
				{
				mT__39(); 

				}
				break;
			case 32 :
				// src/C2JavaScript.g:1:195: T__40
				{
				mT__40(); 

				}
				break;
			case 33 :
				// src/C2JavaScript.g:1:201: T__41
				{
				mT__41(); 

				}
				break;
			case 34 :
				// src/C2JavaScript.g:1:207: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// src/C2JavaScript.g:1:210: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// src/C2JavaScript.g:1:214: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 37 :
				// src/C2JavaScript.g:1:222: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 38 :
				// src/C2JavaScript.g:1:235: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\26\1\31\1\33\1\35\1\uffff\1\37\1\43\1\uffff\1\46\1\uffff\1"+
		"\51\1\53\3\22\1\61\23\uffff\1\63\3\uffff\1\65\3\uffff\3\22\7\uffff\1\22"+
		"\1\72\1\22\1\74\1\uffff\1\22\1\uffff\1\76\1\uffff";
	static final String DFA7_eofS =
		"\77\uffff";
	static final String DFA7_minS =
		"\1\11\1\75\1\46\2\75\1\uffff\1\75\1\52\1\uffff\1\74\1\uffff\2\75\1\150"+
		"\1\156\1\150\1\75\23\uffff\1\75\3\uffff\1\75\3\uffff\1\141\1\164\1\157"+
		"\7\uffff\1\162\1\60\1\162\1\60\1\uffff\1\164\1\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\176\4\75\1\uffff\2\75\1\uffff\1\75\1\uffff\1\76\1\75\1\150\1\156\1"+
		"\150\1\174\23\uffff\1\75\3\uffff\1\75\3\uffff\1\141\1\164\1\157\7\uffff"+
		"\1\162\1\172\1\162\1\172\1\uffff\1\164\1\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\5\uffff\1\12\2\uffff\1\17\1\uffff\1\24\6\uffff\1\41\1\42\1\43\1\46\1"+
		"\2\1\1\1\3\1\5\1\4\1\7\1\6\1\11\1\10\1\14\1\13\1\16\1\44\1\45\1\15\1\uffff"+
		"\1\23\1\20\1\26\1\uffff\1\25\1\32\1\31\3\uffff\1\37\1\40\1\36\1\22\1\21"+
		"\1\30\1\27\4\uffff\1\34\1\uffff\1\33\1\uffff\1\35";
	static final String DFA7_specialS =
		"\77\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\24\2\uffff\1\24\22\uffff\1\24\1\1\4\uffff\1\2\3\uffff\1\3\1\4\1\5"+
			"\1\6\1\uffff\1\7\12\23\1\uffff\1\10\1\11\1\12\1\13\2\uffff\32\22\3\uffff"+
			"\1\14\1\22\1\uffff\2\22\1\15\5\22\1\16\11\22\1\17\7\22\1\uffff\1\20\1"+
			"\uffff\1\21",
			"\1\25",
			"\1\27\26\uffff\1\30",
			"\1\32",
			"\1\34",
			"",
			"\1\36",
			"\1\41\4\uffff\1\42\15\uffff\1\40",
			"",
			"\1\44\1\45",
			"",
			"\1\47\1\50",
			"\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57\76\uffff\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"",
			"",
			"",
			"\1\64",
			"",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\73",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\1\75",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | ID | INT | COMMENT | LINE_COMMENT | WS );";
		}
	}

}
