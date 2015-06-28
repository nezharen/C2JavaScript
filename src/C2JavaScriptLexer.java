// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-28 11:01:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ID=6;
	public static final int LINE_COMMENT=7;
	public static final int NUM=8;
	public static final int WS=9;

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

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:2:7: ( '!' )
			// src/C2JavaScript.g:2:9: '!'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:7:7: ( '(' )
			// src/C2JavaScript.g:7:9: '('
			{
			match('('); 
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
			// src/C2JavaScript.g:8:7: ( ')' )
			// src/C2JavaScript.g:8:9: ')'
			{
			match(')'); 
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
			// src/C2JavaScript.g:9:7: ( '*' )
			// src/C2JavaScript.g:9:9: '*'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:10:7: ( '*=' )
			// src/C2JavaScript.g:10:9: '*='
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:11:7: ( '+' )
			// src/C2JavaScript.g:11:9: '+'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:12:7: ( '++' )
			// src/C2JavaScript.g:12:9: '++'
			{
			match("++"); 

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
			// src/C2JavaScript.g:13:7: ( '+=' )
			// src/C2JavaScript.g:13:9: '+='
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:14:7: ( ',' )
			// src/C2JavaScript.g:14:9: ','
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:15:7: ( '-' )
			// src/C2JavaScript.g:15:9: '-'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:16:7: ( '--' )
			// src/C2JavaScript.g:16:9: '--'
			{
			match("--"); 

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
			// src/C2JavaScript.g:17:7: ( '-=' )
			// src/C2JavaScript.g:17:9: '-='
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:18:7: ( '/' )
			// src/C2JavaScript.g:18:9: '/'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:19:7: ( '/=' )
			// src/C2JavaScript.g:19:9: '/='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:20:7: ( ':' )
			// src/C2JavaScript.g:20:9: ':'
			{
			match(':'); 
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
			// src/C2JavaScript.g:21:7: ( ';' )
			// src/C2JavaScript.g:21:9: ';'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:22:7: ( '<' )
			// src/C2JavaScript.g:22:9: '<'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:23:7: ( '<<' )
			// src/C2JavaScript.g:23:9: '<<'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:24:7: ( '<<=' )
			// src/C2JavaScript.g:24:9: '<<='
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:25:7: ( '<=' )
			// src/C2JavaScript.g:25:9: '<='
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:26:7: ( '=' )
			// src/C2JavaScript.g:26:9: '='
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:27:7: ( '==' )
			// src/C2JavaScript.g:27:9: '=='
			{
			match("=="); 

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
			// src/C2JavaScript.g:28:7: ( '>' )
			// src/C2JavaScript.g:28:9: '>'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:29:7: ( '>=' )
			// src/C2JavaScript.g:29:9: '>='
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:30:7: ( '>>' )
			// src/C2JavaScript.g:30:9: '>>'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:31:7: ( '>>=' )
			// src/C2JavaScript.g:31:9: '>>='
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:32:7: ( '[' )
			// src/C2JavaScript.g:32:9: '['
			{
			match('['); 
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
			// src/C2JavaScript.g:33:7: ( ']' )
			// src/C2JavaScript.g:33:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:34:7: ( '^' )
			// src/C2JavaScript.g:34:9: '^'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:35:7: ( '^=' )
			// src/C2JavaScript.g:35:9: '^='
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:36:7: ( 'break;' )
			// src/C2JavaScript.g:36:9: 'break;'
			{
			match("break;"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:37:7: ( 'case' )
			// src/C2JavaScript.g:37:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:38:7: ( 'char' )
			// src/C2JavaScript.g:38:9: 'char'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:39:7: ( 'continue;' )
			// src/C2JavaScript.g:39:9: 'continue;'
			{
			match("continue;"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:40:7: ( 'default:' )
			// src/C2JavaScript.g:40:9: 'default:'
			{
			match("default:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:41:7: ( 'double' )
			// src/C2JavaScript.g:41:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:42:7: ( 'else' )
			// src/C2JavaScript.g:42:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:43:7: ( 'float' )
			// src/C2JavaScript.g:43:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:44:7: ( 'for' )
			// src/C2JavaScript.g:44:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:45:7: ( 'if' )
			// src/C2JavaScript.g:45:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:46:7: ( 'int' )
			// src/C2JavaScript.g:46:9: 'int'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:47:7: ( 'long' )
			// src/C2JavaScript.g:47:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:48:7: ( 'return' )
			// src/C2JavaScript.g:48:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:49:7: ( 'short' )
			// src/C2JavaScript.g:49:9: 'short'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:50:7: ( 'switch' )
			// src/C2JavaScript.g:50:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:51:7: ( 'void' )
			// src/C2JavaScript.g:51:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:52:7: ( 'while' )
			// src/C2JavaScript.g:52:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:53:7: ( '{' )
			// src/C2JavaScript.g:53:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:54:7: ( '|' )
			// src/C2JavaScript.g:54:9: '|'
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
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:55:7: ( '|=' )
			// src/C2JavaScript.g:55:9: '|='
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:56:7: ( '||' )
			// src/C2JavaScript.g:56:9: '||'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:57:7: ( '}' )
			// src/C2JavaScript.g:57:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:58:7: ( '~' )
			// src/C2JavaScript.g:58:9: '~'
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
	// $ANTLR end "T__66"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:615:2: ( '\\'' ~ ( '\\'' ) '\\'' )
			// src/C2JavaScript.g:615:4: '\\'' ~ ( '\\'' ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:619:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
			// src/C2JavaScript.g:619:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/C2JavaScript.g:619:31: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
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

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:623:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// src/C2JavaScript.g:623:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// src/C2JavaScript.g:623:4: ( '0' .. '9' )+
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

			// src/C2JavaScript.g:623:16: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:623:17: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// src/C2JavaScript.g:623:21: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/C2JavaScript.g:627:2: ( '/*' (~ ( '*/' ) )* '*/' )
			// src/C2JavaScript.g:627:4: '/*' (~ ( '*/' ) )* '*/'
			{
			match("/*"); 

			// src/C2JavaScript.g:627:9: (~ ( '*/' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						int LA5_3 = input.LA(3);
						if ( ((LA5_3 >= '\u0000' && LA5_3 <= '\uFFFF')) ) {
							alt5=1;
						}

					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:627:10: ~ ( '*/' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\uFFFF') ) {
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
					break loop5;
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
			// src/C2JavaScript.g:634:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// src/C2JavaScript.g:634:4: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// src/C2JavaScript.g:634:9: (~ ( '\\r' | '\\n' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
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
					break loop6;
				}
			}

			// src/C2JavaScript.g:634:27: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:634:27: '\\r'
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
			// src/C2JavaScript.g:641:2: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// src/C2JavaScript.g:641:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// src/C2JavaScript.g:641:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
		// src/C2JavaScript.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | CHAR | ID | NUM | COMMENT | LINE_COMMENT | WS )
		int alt9=63;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// src/C2JavaScript.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// src/C2JavaScript.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// src/C2JavaScript.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// src/C2JavaScript.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// src/C2JavaScript.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// src/C2JavaScript.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// src/C2JavaScript.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// src/C2JavaScript.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// src/C2JavaScript.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// src/C2JavaScript.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// src/C2JavaScript.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// src/C2JavaScript.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// src/C2JavaScript.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// src/C2JavaScript.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// src/C2JavaScript.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// src/C2JavaScript.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// src/C2JavaScript.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// src/C2JavaScript.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// src/C2JavaScript.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// src/C2JavaScript.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// src/C2JavaScript.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// src/C2JavaScript.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// src/C2JavaScript.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// src/C2JavaScript.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// src/C2JavaScript.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// src/C2JavaScript.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// src/C2JavaScript.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// src/C2JavaScript.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// src/C2JavaScript.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// src/C2JavaScript.g:1:184: T__39
				{
				mT__39(); 

				}
				break;
			case 31 :
				// src/C2JavaScript.g:1:190: T__40
				{
				mT__40(); 

				}
				break;
			case 32 :
				// src/C2JavaScript.g:1:196: T__41
				{
				mT__41(); 

				}
				break;
			case 33 :
				// src/C2JavaScript.g:1:202: T__42
				{
				mT__42(); 

				}
				break;
			case 34 :
				// src/C2JavaScript.g:1:208: T__43
				{
				mT__43(); 

				}
				break;
			case 35 :
				// src/C2JavaScript.g:1:214: T__44
				{
				mT__44(); 

				}
				break;
			case 36 :
				// src/C2JavaScript.g:1:220: T__45
				{
				mT__45(); 

				}
				break;
			case 37 :
				// src/C2JavaScript.g:1:226: T__46
				{
				mT__46(); 

				}
				break;
			case 38 :
				// src/C2JavaScript.g:1:232: T__47
				{
				mT__47(); 

				}
				break;
			case 39 :
				// src/C2JavaScript.g:1:238: T__48
				{
				mT__48(); 

				}
				break;
			case 40 :
				// src/C2JavaScript.g:1:244: T__49
				{
				mT__49(); 

				}
				break;
			case 41 :
				// src/C2JavaScript.g:1:250: T__50
				{
				mT__50(); 

				}
				break;
			case 42 :
				// src/C2JavaScript.g:1:256: T__51
				{
				mT__51(); 

				}
				break;
			case 43 :
				// src/C2JavaScript.g:1:262: T__52
				{
				mT__52(); 

				}
				break;
			case 44 :
				// src/C2JavaScript.g:1:268: T__53
				{
				mT__53(); 

				}
				break;
			case 45 :
				// src/C2JavaScript.g:1:274: T__54
				{
				mT__54(); 

				}
				break;
			case 46 :
				// src/C2JavaScript.g:1:280: T__55
				{
				mT__55(); 

				}
				break;
			case 47 :
				// src/C2JavaScript.g:1:286: T__56
				{
				mT__56(); 

				}
				break;
			case 48 :
				// src/C2JavaScript.g:1:292: T__57
				{
				mT__57(); 

				}
				break;
			case 49 :
				// src/C2JavaScript.g:1:298: T__58
				{
				mT__58(); 

				}
				break;
			case 50 :
				// src/C2JavaScript.g:1:304: T__59
				{
				mT__59(); 

				}
				break;
			case 51 :
				// src/C2JavaScript.g:1:310: T__60
				{
				mT__60(); 

				}
				break;
			case 52 :
				// src/C2JavaScript.g:1:316: T__61
				{
				mT__61(); 

				}
				break;
			case 53 :
				// src/C2JavaScript.g:1:322: T__62
				{
				mT__62(); 

				}
				break;
			case 54 :
				// src/C2JavaScript.g:1:328: T__63
				{
				mT__63(); 

				}
				break;
			case 55 :
				// src/C2JavaScript.g:1:334: T__64
				{
				mT__64(); 

				}
				break;
			case 56 :
				// src/C2JavaScript.g:1:340: T__65
				{
				mT__65(); 

				}
				break;
			case 57 :
				// src/C2JavaScript.g:1:346: T__66
				{
				mT__66(); 

				}
				break;
			case 58 :
				// src/C2JavaScript.g:1:352: CHAR
				{
				mCHAR(); 

				}
				break;
			case 59 :
				// src/C2JavaScript.g:1:357: ID
				{
				mID(); 

				}
				break;
			case 60 :
				// src/C2JavaScript.g:1:360: NUM
				{
				mNUM(); 

				}
				break;
			case 61 :
				// src/C2JavaScript.g:1:364: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 62 :
				// src/C2JavaScript.g:1:372: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 63 :
				// src/C2JavaScript.g:1:385: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\1\46\1\51\2\uffff\1\53\1\56\1\uffff\1\61\1\65\2\uffff\1\70\1"+
		"\72\1\75\2\uffff\1\77\13\42\1\uffff\1\123\27\uffff\1\125\5\uffff\1\127"+
		"\3\uffff\11\42\1\141\7\42\7\uffff\10\42\1\161\1\uffff\1\162\7\42\1\172"+
		"\1\173\3\42\1\177\1\42\2\uffff\1\u0081\3\42\1\u0085\2\42\2\uffff\3\42"+
		"\1\uffff\1\u008b\1\uffff\1\42\1\u008d\1\42\1\uffff\1\u008f\1\uffff\2\42"+
		"\1\u0092\1\uffff\1\u0093\1\uffff\1\u0094\1\uffff\2\42\3\uffff\1\42\2\uffff";
	static final String DFA9_eofS =
		"\u0098\uffff";
	static final String DFA9_minS =
		"\1\11\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\52\2\uffff\1\74\2\75"+
		"\2\uffff\1\75\1\162\1\141\1\145\2\154\1\146\1\157\1\145\1\150\1\157\1"+
		"\150\1\uffff\1\75\27\uffff\1\75\5\uffff\1\75\3\uffff\1\145\1\163\1\141"+
		"\1\156\1\146\1\165\1\163\1\157\1\162\1\60\1\164\1\156\1\164\1\157\3\151"+
		"\7\uffff\1\141\1\145\1\162\1\164\1\141\1\142\1\145\1\141\1\60\1\uffff"+
		"\1\60\1\147\1\165\1\162\1\164\1\144\1\154\1\153\2\60\1\151\1\165\1\154"+
		"\1\60\1\164\2\uffff\1\60\1\162\1\164\1\143\1\60\1\145\1\73\2\uffff\1\156"+
		"\1\154\1\145\1\uffff\1\60\1\uffff\1\156\1\60\1\150\1\uffff\1\60\1\uffff"+
		"\1\165\1\164\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\145\1\72\3\uffff"+
		"\1\73\2\uffff";
	static final String DFA9_maxS =
		"\1\176\2\75\2\uffff\2\75\1\uffff\2\75\2\uffff\2\75\1\76\2\uffff\1\75\1"+
		"\162\2\157\1\154\1\157\1\156\1\157\1\145\1\167\1\157\1\150\1\uffff\1\174"+
		"\27\uffff\1\75\5\uffff\1\75\3\uffff\1\145\1\163\1\141\1\156\1\146\1\165"+
		"\1\163\1\157\1\162\1\172\1\164\1\156\1\164\1\157\3\151\7\uffff\1\141\1"+
		"\145\1\162\1\164\1\141\1\142\1\145\1\141\1\172\1\uffff\1\172\1\147\1\165"+
		"\1\162\1\164\1\144\1\154\1\153\2\172\1\151\1\165\1\154\1\172\1\164\2\uffff"+
		"\1\172\1\162\1\164\1\143\1\172\1\145\1\73\2\uffff\1\156\1\154\1\145\1"+
		"\uffff\1\172\1\uffff\1\156\1\172\1\150\1\uffff\1\172\1\uffff\1\165\1\164"+
		"\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\145\1\72\3\uffff\1\73\2\uffff";
	static final String DFA9_acceptS =
		"\3\uffff\1\6\1\7\2\uffff\1\15\2\uffff\1\23\1\24\3\uffff\1\37\1\40\14\uffff"+
		"\1\64\1\uffff\1\70\1\71\1\72\1\73\1\74\1\77\1\2\1\1\1\3\1\5\1\4\1\11\1"+
		"\10\1\13\1\14\1\12\1\17\1\20\1\16\1\22\1\75\1\76\1\21\1\uffff\1\30\1\25"+
		"\1\32\1\31\1\34\1\uffff\1\33\1\42\1\41\21\uffff\1\66\1\67\1\65\1\27\1"+
		"\26\1\36\1\35\11\uffff\1\54\17\uffff\1\53\1\55\7\uffff\1\44\1\45\3\uffff"+
		"\1\51\1\uffff\1\56\3\uffff\1\62\1\uffff\1\43\3\uffff\1\52\1\uffff\1\60"+
		"\1\uffff\1\63\2\uffff\1\50\1\57\1\61\1\uffff\1\47\1\46";
	static final String DFA9_specialS =
		"\u0098\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\1\4\uffff\1\2\1\41\1\3\1\4\1\5\1\6"+
			"\1\7\1\10\1\uffff\1\11\12\43\1\12\1\13\1\14\1\15\1\16\2\uffff\32\42\1"+
			"\17\1\uffff\1\20\1\21\1\42\1\uffff\1\42\1\22\1\23\1\24\1\25\1\26\2\42"+
			"\1\27\2\42\1\30\5\42\1\31\1\32\2\42\1\33\1\34\3\42\1\35\1\36\1\37\1\40",
			"\1\45",
			"\1\47\26\uffff\1\50",
			"",
			"",
			"\1\52",
			"\1\54\21\uffff\1\55",
			"",
			"\1\57\17\uffff\1\60",
			"\1\63\4\uffff\1\64\15\uffff\1\62",
			"",
			"",
			"\1\66\1\67",
			"\1\71",
			"\1\73\1\74",
			"",
			"",
			"\1\76",
			"\1\100",
			"\1\101\6\uffff\1\102\6\uffff\1\103",
			"\1\104\11\uffff\1\105",
			"\1\106",
			"\1\107\2\uffff\1\110",
			"\1\111\7\uffff\1\112",
			"\1\113",
			"\1\114",
			"\1\115\16\uffff\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121\76\uffff\1\122",
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
			"",
			"",
			"",
			"",
			"\1\124",
			"",
			"",
			"",
			"",
			"",
			"\1\126",
			"",
			"",
			"",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0080",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u008c",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008e",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u0090",
			"\1\u0091",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\u0095",
			"\1\u0096",
			"",
			"",
			"",
			"\1\u0097",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | CHAR | ID | NUM | COMMENT | LINE_COMMENT | WS );";
		}
	}

}
