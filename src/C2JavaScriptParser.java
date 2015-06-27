// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 21:40:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ID", "LINE_COMMENT", 
		"NUM", "WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", 
		"'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", 
		"':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'>>'", "'>>='", "'['", "']'", "'^'", "'^='", "'break;'", "'case'", "'char'", 
		"'continue;'", "'default:'", "'double'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'long'", "'return'", "'short'", "'switch'", "'void'", 
		"'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
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
	// src/C2JavaScript.g:3:1: program : programBlock ;
	public final void program() throws RecognitionException {
		String programBlock1 =null;

		try {
			// src/C2JavaScript.g:4:2: ( programBlock )
			// src/C2JavaScript.g:4:4: programBlock
			{
			pushFollow(FOLLOW_programBlock_in_program11);
			programBlock1=programBlock();
			state._fsp--;


						System.out.println(programBlock1);
					
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



	// $ANTLR start "programBlock"
	// src/C2JavaScript.g:10:1: programBlock returns [String code] : ( functionDefine a= programBlock |);
	public final String programBlock() throws RecognitionException {
		String code = null;


		String a =null;
		String functionDefine2 =null;


			code = null;

		try {
			// src/C2JavaScript.g:14:2: ( functionDefine a= programBlock |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==46||LA1_0==49||LA1_0==51||(LA1_0 >= 54 && LA1_0 <= 55)||LA1_0==57||LA1_0==59) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:14:4: functionDefine a= programBlock
					{
					pushFollow(FOLLOW_functionDefine_in_programBlock34);
					functionDefine2=functionDefine();
					state._fsp--;

					pushFollow(FOLLOW_programBlock_in_programBlock38);
					a=programBlock();
					state._fsp--;


								code = functionDefine2 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:19:3: 
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
	// $ANTLR end "programBlock"



	// $ANTLR start "functionDefine"
	// src/C2JavaScript.g:24:1: functionDefine returns [String code] : type ID '(' functionArgument ')' '{' functionStatement '}' ;
	public final String functionDefine() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String functionArgument4 =null;
		String functionStatement5 =null;


			code = null;

		try {
			// src/C2JavaScript.g:28:2: ( type ID '(' functionArgument ')' '{' functionStatement '}' )
			// src/C2JavaScript.g:28:4: type ID '(' functionArgument ')' '{' functionStatement '}'
			{
			pushFollow(FOLLOW_type_in_functionDefine68);
			type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_functionDefine70); 
			match(input,15,FOLLOW_15_in_functionDefine72); 
			pushFollow(FOLLOW_functionArgument_in_functionDefine74);
			functionArgument4=functionArgument();
			state._fsp--;

			match(input,16,FOLLOW_16_in_functionDefine76); 
			match(input,61,FOLLOW_61_in_functionDefine78); 
			pushFollow(FOLLOW_functionStatement_in_functionDefine80);
			functionStatement5=functionStatement();
			state._fsp--;

			match(input,65,FOLLOW_65_in_functionDefine82); 

						code = "function " + (ID3!=null?ID3.getText():null) + "(" + functionArgument4 + ")\n" + "{\n" + functionStatement5 + "}\n";
					
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
	// $ANTLR end "functionDefine"



	// $ANTLR start "functionArgument"
	// src/C2JavaScript.g:34:1: functionArgument returns [String code] : ( type ID functionArgumentNext |);
	public final String functionArgument() throws RecognitionException {
		String code = null;


		Token ID6=null;
		String functionArgumentNext7 =null;


			code = null;

		try {
			// src/C2JavaScript.g:38:2: ( type ID functionArgumentNext |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==46||LA2_0==49||LA2_0==51||(LA2_0 >= 54 && LA2_0 <= 55)||LA2_0==57||LA2_0==59) ) {
				alt2=1;
			}
			else if ( (LA2_0==16) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:38:4: type ID functionArgumentNext
					{
					pushFollow(FOLLOW_type_in_functionArgument105);
					type();
					state._fsp--;

					ID6=(Token)match(input,ID,FOLLOW_ID_in_functionArgument107); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgument109);
					functionArgumentNext7=functionArgumentNext();
					state._fsp--;


								code = (ID6!=null?ID6.getText():null) + functionArgumentNext7;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:43:3: 
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
	// $ANTLR end "functionArgument"



	// $ANTLR start "functionArgumentNext"
	// src/C2JavaScript.g:48:1: functionArgumentNext returns [String code] : ( ',' type ID a= functionArgumentNext |);
	public final String functionArgumentNext() throws RecognitionException {
		String code = null;


		Token ID8=null;
		String a =null;


			code = null;

		try {
			// src/C2JavaScript.g:52:2: ( ',' type ID a= functionArgumentNext |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==22) ) {
				alt3=1;
			}
			else if ( (LA3_0==16) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:52:4: ',' type ID a= functionArgumentNext
					{
					match(input,22,FOLLOW_22_in_functionArgumentNext139); 
					pushFollow(FOLLOW_type_in_functionArgumentNext141);
					type();
					state._fsp--;

					ID8=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentNext143); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgumentNext147);
					a=functionArgumentNext();
					state._fsp--;


								code = ", " + (ID8!=null?ID8.getText():null) + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:57:3: 
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
	// $ANTLR end "functionArgumentNext"



	// $ANTLR start "functionCall"
	// src/C2JavaScript.g:62:1: functionCall returns [String code] : ID '(' functionCallArgument ')' ;
	public final String functionCall() throws RecognitionException {
		String code = null;


		Token ID9=null;
		String functionCallArgument10 =null;


			code = null;

		try {
			// src/C2JavaScript.g:66:2: ( ID '(' functionCallArgument ')' )
			// src/C2JavaScript.g:66:4: ID '(' functionCallArgument ')'
			{
			ID9=(Token)match(input,ID,FOLLOW_ID_in_functionCall177); 
			match(input,15,FOLLOW_15_in_functionCall179); 
			pushFollow(FOLLOW_functionCallArgument_in_functionCall181);
			functionCallArgument10=functionCallArgument();
			state._fsp--;

			match(input,16,FOLLOW_16_in_functionCall183); 

						code = (ID9!=null?ID9.getText():null) + "(" + functionCallArgument10 + ")";
					
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
	// $ANTLR end "functionCall"



	// $ANTLR start "functionCallArgument"
	// src/C2JavaScript.g:72:1: functionCallArgument returns [String code] : ( expr functionCallArgumentNext |);
	public final String functionCallArgument() throws RecognitionException {
		String code = null;


		String expr11 =null;
		String functionCallArgumentNext12 =null;


			code = null;

		try {
			// src/C2JavaScript.g:76:2: ( expr functionCallArgumentNext |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CHAR||LA4_0==ID||LA4_0==NUM||LA4_0==10||LA4_0==15||LA4_0==20||(LA4_0 >= 23 && LA4_0 <= 24)||LA4_0==66) ) {
				alt4=1;
			}
			else if ( (LA4_0==16) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:76:4: expr functionCallArgumentNext
					{
					pushFollow(FOLLOW_expr_in_functionCallArgument206);
					expr11=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgument208);
					functionCallArgumentNext12=functionCallArgumentNext();
					state._fsp--;


								code = expr11 + functionCallArgumentNext12;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:81:3: 
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
	// $ANTLR end "functionCallArgument"



	// $ANTLR start "functionCallArgumentNext"
	// src/C2JavaScript.g:86:1: functionCallArgumentNext returns [String code] : ( ',' expr a= functionCallArgumentNext |);
	public final String functionCallArgumentNext() throws RecognitionException {
		String code = null;


		String a =null;
		String expr13 =null;


			code = null;

		try {
			// src/C2JavaScript.g:90:2: ( ',' expr a= functionCallArgumentNext |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==22) ) {
				alt5=1;
			}
			else if ( (LA5_0==16) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:90:4: ',' expr a= functionCallArgumentNext
					{
					match(input,22,FOLLOW_22_in_functionCallArgumentNext238); 
					pushFollow(FOLLOW_expr_in_functionCallArgumentNext240);
					expr13=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext244);
					a=functionCallArgumentNext();
					state._fsp--;


								code = ", " + expr13 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:95:3: 
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
	// $ANTLR end "functionCallArgumentNext"



	// $ANTLR start "functionStatement"
	// src/C2JavaScript.g:100:1: functionStatement returns [String code] : ( variableDefine a= functionStatement | expression b= functionStatement | ifStatement c= functionStatement | switchStatement d= functionStatement | forStatement e= functionStatement | whileStatement f= functionStatement | returnStatement g= functionStatement | '{' h= functionStatement '}' | 'break;' | 'continue;' |);
	public final String functionStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String d =null;
		String e =null;
		String f =null;
		String g =null;
		String h =null;
		String variableDefine14 =null;
		String expression15 =null;
		String ifStatement16 =null;
		String switchStatement17 =null;
		String forStatement18 =null;
		String whileStatement19 =null;
		String returnStatement20 =null;


			code = null;

		try {
			// src/C2JavaScript.g:104:2: ( variableDefine a= functionStatement | expression b= functionStatement | ifStatement c= functionStatement | switchStatement d= functionStatement | forStatement e= functionStatement | whileStatement f= functionStatement | returnStatement g= functionStatement | '{' h= functionStatement '}' | 'break;' | 'continue;' |)
			int alt6=11;
			switch ( input.LA(1) ) {
			case 59:
				{
				alt6=1;
				}
				break;
			case 46:
				{
				alt6=1;
				}
				break;
			case 57:
				{
				alt6=1;
				}
				break;
			case 54:
				{
				alt6=1;
				}
				break;
			case 55:
				{
				alt6=1;
				}
				break;
			case 51:
				{
				alt6=1;
				}
				break;
			case 49:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case NUM:
				{
				alt6=2;
				}
				break;
			case CHAR:
				{
				alt6=2;
				}
				break;
			case 15:
				{
				alt6=2;
				}
				break;
			case 10:
				{
				alt6=2;
				}
				break;
			case 66:
				{
				alt6=2;
				}
				break;
			case 20:
				{
				alt6=2;
				}
				break;
			case 24:
				{
				alt6=2;
				}
				break;
			case 23:
				{
				alt6=2;
				}
				break;
			case 53:
				{
				alt6=3;
				}
				break;
			case 58:
				{
				alt6=4;
				}
				break;
			case 52:
				{
				alt6=5;
				}
				break;
			case 60:
				{
				alt6=6;
				}
				break;
			case 56:
				{
				alt6=7;
				}
				break;
			case 61:
				{
				alt6=8;
				}
				break;
			case 44:
				{
				alt6=9;
				}
				break;
			case 47:
				{
				alt6=10;
				}
				break;
			case 45:
			case 48:
			case 50:
			case 65:
				{
				alt6=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:104:4: variableDefine a= functionStatement
					{
					pushFollow(FOLLOW_variableDefine_in_functionStatement274);
					variableDefine14=variableDefine();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement278);
					a=functionStatement();
					state._fsp--;


								code = variableDefine14 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:108:4: expression b= functionStatement
					{
					pushFollow(FOLLOW_expression_in_functionStatement287);
					expression15=expression();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement291);
					b=functionStatement();
					state._fsp--;


								code = expression15 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:112:4: ifStatement c= functionStatement
					{
					pushFollow(FOLLOW_ifStatement_in_functionStatement300);
					ifStatement16=ifStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement304);
					c=functionStatement();
					state._fsp--;


								code = ifStatement16 + c;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:116:4: switchStatement d= functionStatement
					{
					pushFollow(FOLLOW_switchStatement_in_functionStatement313);
					switchStatement17=switchStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement317);
					d=functionStatement();
					state._fsp--;


								code = switchStatement17 + d;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:120:4: forStatement e= functionStatement
					{
					pushFollow(FOLLOW_forStatement_in_functionStatement326);
					forStatement18=forStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement330);
					e=functionStatement();
					state._fsp--;


								code = forStatement18 + e;
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:124:4: whileStatement f= functionStatement
					{
					pushFollow(FOLLOW_whileStatement_in_functionStatement339);
					whileStatement19=whileStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement343);
					f=functionStatement();
					state._fsp--;


								code = whileStatement19 + f;
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:128:4: returnStatement g= functionStatement
					{
					pushFollow(FOLLOW_returnStatement_in_functionStatement352);
					returnStatement20=returnStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement356);
					g=functionStatement();
					state._fsp--;


								code = returnStatement20 + g;
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:132:4: '{' h= functionStatement '}'
					{
					match(input,61,FOLLOW_61_in_functionStatement365); 
					pushFollow(FOLLOW_functionStatement_in_functionStatement369);
					h=functionStatement();
					state._fsp--;

					match(input,65,FOLLOW_65_in_functionStatement371); 

								code = "{\n" + h + "}\n";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:136:4: 'break;'
					{
					match(input,44,FOLLOW_44_in_functionStatement380); 

								code = "break;\n";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:140:4: 'continue;'
					{
					match(input,47,FOLLOW_47_in_functionStatement389); 

								code = "continue;\n";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:145:3: 
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
	// $ANTLR end "functionStatement"



	// $ANTLR start "ifStatement"
	// src/C2JavaScript.g:150:1: ifStatement returns [String code] : 'if' '(' expr ')' functionStatement ifStatementNext ;
	public final String ifStatement() throws RecognitionException {
		String code = null;


		String expr21 =null;
		String functionStatement22 =null;
		String ifStatementNext23 =null;


			code = null;

		try {
			// src/C2JavaScript.g:154:2: ( 'if' '(' expr ')' functionStatement ifStatementNext )
			// src/C2JavaScript.g:154:4: 'if' '(' expr ')' functionStatement ifStatementNext
			{
			match(input,53,FOLLOW_53_in_ifStatement419); 
			match(input,15,FOLLOW_15_in_ifStatement421); 
			pushFollow(FOLLOW_expr_in_ifStatement423);
			expr21=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_ifStatement425); 
			pushFollow(FOLLOW_functionStatement_in_ifStatement427);
			functionStatement22=functionStatement();
			state._fsp--;

			pushFollow(FOLLOW_ifStatementNext_in_ifStatement429);
			ifStatementNext23=ifStatementNext();
			state._fsp--;


						code = "if (" + expr21 + ")\n" + functionStatement22 + ifStatementNext23;
					
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
	// $ANTLR end "ifStatement"



	// $ANTLR start "ifStatementNext"
	// src/C2JavaScript.g:160:1: ifStatementNext returns [String code] : ( 'else' functionStatement |);
	public final String ifStatementNext() throws RecognitionException {
		String code = null;


		String functionStatement24 =null;


			code = null;

		try {
			// src/C2JavaScript.g:164:2: ( 'else' functionStatement |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==50) ) {
				alt7=1;
			}
			else if ( (LA7_0==CHAR||LA7_0==ID||LA7_0==NUM||LA7_0==10||LA7_0==15||LA7_0==20||(LA7_0 >= 23 && LA7_0 <= 24)||(LA7_0 >= 44 && LA7_0 <= 49)||(LA7_0 >= 51 && LA7_0 <= 61)||(LA7_0 >= 65 && LA7_0 <= 66)) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:164:4: 'else' functionStatement
					{
					match(input,50,FOLLOW_50_in_ifStatementNext452); 
					pushFollow(FOLLOW_functionStatement_in_ifStatementNext454);
					functionStatement24=functionStatement();
					state._fsp--;


								code = "else\n" + functionStatement24;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:169:3: 
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
	// $ANTLR end "ifStatementNext"



	// $ANTLR start "switchStatement"
	// src/C2JavaScript.g:174:1: switchStatement returns [String code] : 'switch' '(' expr ')' '{' caseStatement '}' ;
	public final String switchStatement() throws RecognitionException {
		String code = null;


		String expr25 =null;
		String caseStatement26 =null;


			code = null;

		try {
			// src/C2JavaScript.g:178:2: ( 'switch' '(' expr ')' '{' caseStatement '}' )
			// src/C2JavaScript.g:178:4: 'switch' '(' expr ')' '{' caseStatement '}'
			{
			match(input,58,FOLLOW_58_in_switchStatement484); 
			match(input,15,FOLLOW_15_in_switchStatement486); 
			pushFollow(FOLLOW_expr_in_switchStatement488);
			expr25=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_switchStatement490); 
			match(input,61,FOLLOW_61_in_switchStatement492); 
			pushFollow(FOLLOW_caseStatement_in_switchStatement494);
			caseStatement26=caseStatement();
			state._fsp--;

			match(input,65,FOLLOW_65_in_switchStatement496); 

						code = "switch (" + expr25 + ")\n{\n" + caseStatement26 + "}\n";
					
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
	// $ANTLR end "switchStatement"



	// $ANTLR start "caseStatement"
	// src/C2JavaScript.g:184:1: caseStatement returns [String code] : ( 'case' expr ':' functionStatement a= caseStatement | 'default:' functionStatement b= caseStatement |);
	public final String caseStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String expr27 =null;
		String functionStatement28 =null;
		String functionStatement29 =null;


			code = null;

		try {
			// src/C2JavaScript.g:188:2: ( 'case' expr ':' functionStatement a= caseStatement | 'default:' functionStatement b= caseStatement |)
			int alt8=3;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt8=1;
				}
				break;
			case 48:
				{
				alt8=2;
				}
				break;
			case 65:
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
					// src/C2JavaScript.g:188:4: 'case' expr ':' functionStatement a= caseStatement
					{
					match(input,45,FOLLOW_45_in_caseStatement519); 
					pushFollow(FOLLOW_expr_in_caseStatement521);
					expr27=expr();
					state._fsp--;

					match(input,28,FOLLOW_28_in_caseStatement523); 
					pushFollow(FOLLOW_functionStatement_in_caseStatement525);
					functionStatement28=functionStatement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement529);
					a=caseStatement();
					state._fsp--;


								code = "case " + expr27 + ":\n" + functionStatement28 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:192:4: 'default:' functionStatement b= caseStatement
					{
					match(input,48,FOLLOW_48_in_caseStatement538); 
					pushFollow(FOLLOW_functionStatement_in_caseStatement540);
					functionStatement29=functionStatement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement544);
					b=caseStatement();
					state._fsp--;


								code = "default:\n" + functionStatement29 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:197:3: 
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
	// $ANTLR end "caseStatement"



	// $ANTLR start "forStatement"
	// src/C2JavaScript.g:202:1: forStatement returns [String code] : 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement ;
	public final String forStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String functionStatement30 =null;


			code = null;

		try {
			// src/C2JavaScript.g:206:2: ( 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement )
			// src/C2JavaScript.g:206:4: 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement
			{
			match(input,52,FOLLOW_52_in_forStatement574); 
			match(input,15,FOLLOW_15_in_forStatement576); 
			pushFollow(FOLLOW_expr_in_forStatement580);
			a=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_forStatement582); 
			pushFollow(FOLLOW_expr_in_forStatement586);
			b=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_forStatement588); 
			pushFollow(FOLLOW_expr_in_forStatement592);
			c=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_forStatement594); 
			pushFollow(FOLLOW_functionStatement_in_forStatement596);
			functionStatement30=functionStatement();
			state._fsp--;


						code = "for (" + a + "; " + b + "; " + c + ")\n" + functionStatement30;
					
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
	// $ANTLR end "forStatement"



	// $ANTLR start "whileStatement"
	// src/C2JavaScript.g:212:1: whileStatement returns [String code] : 'while' '(' expr ')' functionStatement ;
	public final String whileStatement() throws RecognitionException {
		String code = null;


		String expr31 =null;
		String functionStatement32 =null;


			code = null;

		try {
			// src/C2JavaScript.g:216:2: ( 'while' '(' expr ')' functionStatement )
			// src/C2JavaScript.g:216:4: 'while' '(' expr ')' functionStatement
			{
			match(input,60,FOLLOW_60_in_whileStatement619); 
			match(input,15,FOLLOW_15_in_whileStatement621); 
			pushFollow(FOLLOW_expr_in_whileStatement623);
			expr31=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_whileStatement625); 
			pushFollow(FOLLOW_functionStatement_in_whileStatement627);
			functionStatement32=functionStatement();
			state._fsp--;


						code = "while (" + expr31 + ")\n"  + functionStatement32;
					
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
	// $ANTLR end "whileStatement"



	// $ANTLR start "returnStatement"
	// src/C2JavaScript.g:222:1: returnStatement returns [String code] : 'return' expression ;
	public final String returnStatement() throws RecognitionException {
		String code = null;


		String expression33 =null;


			code = null;

		try {
			// src/C2JavaScript.g:226:2: ( 'return' expression )
			// src/C2JavaScript.g:226:4: 'return' expression
			{
			match(input,56,FOLLOW_56_in_returnStatement650); 
			pushFollow(FOLLOW_expression_in_returnStatement652);
			expression33=expression();
			state._fsp--;


						code = "return " + expression33;
					
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
	// $ANTLR end "returnStatement"



	// $ANTLR start "variableDefine"
	// src/C2JavaScript.g:232:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type34 =null;
		String singleVariableDefine35 =null;
		String variableDefineNext36 =null;


			code = null;

		try {
			// src/C2JavaScript.g:236:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:236:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine675);
			type34=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine677);
			singleVariableDefine35=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine679);
			variableDefineNext36=variableDefineNext();
			state._fsp--;


						code = type34 + " " + singleVariableDefine35 + variableDefineNext36;
					
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
	// src/C2JavaScript.g:242:1: singleVariableDefine returns [String code] : ( ID initialValue | ID '[' NUM ']' );
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID37=null;
		Token ID39=null;
		Token NUM40=null;
		String initialValue38 =null;


			code = null;

		try {
			// src/C2JavaScript.g:246:2: ( ID initialValue | ID '[' NUM ']' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==40) ) {
					alt9=2;
				}
				else if ( (LA9_1==22||LA9_1==29||LA9_1==34) ) {
					alt9=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/C2JavaScript.g:246:4: ID initialValue
					{
					ID37=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine702); 
					pushFollow(FOLLOW_initialValue_in_singleVariableDefine704);
					initialValue38=initialValue();
					state._fsp--;


								code = (ID37!=null?ID37.getText():null) + initialValue38;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:250:4: ID '[' NUM ']'
					{
					ID39=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine713); 
					match(input,40,FOLLOW_40_in_singleVariableDefine715); 
					NUM40=(Token)match(input,NUM,FOLLOW_NUM_in_singleVariableDefine717); 
					match(input,41,FOLLOW_41_in_singleVariableDefine719); 

								code = (ID39!=null?ID39.getText():null) + " = new Array(" + (NUM40!=null?NUM40.getText():null) + ")";
							
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
	// $ANTLR end "singleVariableDefine"



	// $ANTLR start "initialValue"
	// src/C2JavaScript.g:256:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr41 =null;


			code = null;

		try {
			// src/C2JavaScript.g:260:2: ( '=' expr |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==34) ) {
				alt10=1;
			}
			else if ( (LA10_0==22||LA10_0==29) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/C2JavaScript.g:260:4: '=' expr
					{
					match(input,34,FOLLOW_34_in_initialValue742); 
					pushFollow(FOLLOW_expr_in_initialValue744);
					expr41=expr();
					state._fsp--;


								code = " = " + expr41;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:265:3: 
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
	// src/C2JavaScript.g:270:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine42 =null;


			code = null;

		try {
			// src/C2JavaScript.g:274:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==22) ) {
				alt11=1;
			}
			else if ( (LA11_0==29) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src/C2JavaScript.g:274:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,22,FOLLOW_22_in_variableDefineNext774); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext776);
					singleVariableDefine42=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext780);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine42 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:278:4: ';'
					{
					match(input,29,FOLLOW_29_in_variableDefineNext789); 

								code = ";\n";
							
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



	// $ANTLR start "arrayCall"
	// src/C2JavaScript.g:284:1: arrayCall returns [String code] : ID '[' expr ']' ;
	public final String arrayCall() throws RecognitionException {
		String code = null;


		Token ID43=null;
		String expr44 =null;


			code = null;

		try {
			// src/C2JavaScript.g:288:2: ( ID '[' expr ']' )
			// src/C2JavaScript.g:288:4: ID '[' expr ']'
			{
			ID43=(Token)match(input,ID,FOLLOW_ID_in_arrayCall812); 
			match(input,40,FOLLOW_40_in_arrayCall814); 
			pushFollow(FOLLOW_expr_in_arrayCall816);
			expr44=expr();
			state._fsp--;

			match(input,41,FOLLOW_41_in_arrayCall818); 

						code = (ID43!=null?ID43.getText():null) + "[" + expr44 + "]";
					
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
	// $ANTLR end "arrayCall"



	// $ANTLR start "expression"
	// src/C2JavaScript.g:295:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr45 =null;


			code = null;

		try {
			// src/C2JavaScript.g:299:2: ( expr ';' )
			// src/C2JavaScript.g:299:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression842);
			expr45=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_expression844); 

						code = expr45 + ";\n";
					
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
	// src/C2JavaScript.g:305:1: expr returns [String code] : ( ID exprNext | NUM exprNext | CHAR exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext | arrayCall exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID46=null;
		Token NUM48=null;
		Token CHAR50=null;
		String a =null;
		String b =null;
		String exprNext47 =null;
		String exprNext49 =null;
		String exprNext51 =null;
		String exprNext52 =null;
		String leftUnaryOperator53 =null;
		String exprNext54 =null;
		String functionCall55 =null;
		String exprNext56 =null;
		String arrayCall57 =null;
		String exprNext58 =null;


			code = null;

		try {
			// src/C2JavaScript.g:309:2: ( ID exprNext | NUM exprNext | CHAR exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext | arrayCall exprNext )
			int alt12=7;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case 15:
					{
					alt12=6;
					}
					break;
				case 40:
					{
					alt12=7;
					}
					break;
				case 11:
				case 12:
				case 13:
				case 14:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 41:
				case 42:
				case 43:
				case 62:
				case 63:
				case 64:
					{
					alt12=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NUM:
				{
				alt12=2;
				}
				break;
			case CHAR:
				{
				alt12=3;
				}
				break;
			case 15:
				{
				alt12=4;
				}
				break;
			case 10:
			case 20:
			case 23:
			case 24:
			case 66:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// src/C2JavaScript.g:309:4: ID exprNext
					{
					ID46=(Token)match(input,ID,FOLLOW_ID_in_expr867); 
					pushFollow(FOLLOW_exprNext_in_expr869);
					exprNext47=exprNext();
					state._fsp--;


								code = (ID46!=null?ID46.getText():null) + exprNext47;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:313:4: NUM exprNext
					{
					NUM48=(Token)match(input,NUM,FOLLOW_NUM_in_expr878); 
					pushFollow(FOLLOW_exprNext_in_expr880);
					exprNext49=exprNext();
					state._fsp--;


								code = (NUM48!=null?NUM48.getText():null) + exprNext49;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:317:4: CHAR exprNext
					{
					CHAR50=(Token)match(input,CHAR,FOLLOW_CHAR_in_expr889); 
					pushFollow(FOLLOW_exprNext_in_expr891);
					exprNext51=exprNext();
					state._fsp--;


								code = (CHAR50!=null?CHAR50.getText():null) + exprNext51;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:321:4: '(' a= expr ')' exprNext
					{
					match(input,15,FOLLOW_15_in_expr900); 
					pushFollow(FOLLOW_expr_in_expr904);
					a=expr();
					state._fsp--;

					match(input,16,FOLLOW_16_in_expr906); 
					pushFollow(FOLLOW_exprNext_in_expr908);
					exprNext52=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext52;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:325:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr917);
					leftUnaryOperator53=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr921);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr923);
					exprNext54=exprNext();
					state._fsp--;


								code = leftUnaryOperator53 + b + exprNext54;
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:329:4: functionCall exprNext
					{
					pushFollow(FOLLOW_functionCall_in_expr932);
					functionCall55=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr934);
					exprNext56=exprNext();
					state._fsp--;


								code = functionCall55 + exprNext56;
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:333:4: arrayCall exprNext
					{
					pushFollow(FOLLOW_arrayCall_in_expr943);
					arrayCall57=arrayCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr945);
					exprNext58=exprNext();
					state._fsp--;


								code = arrayCall57 + exprNext58;
							
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
	// src/C2JavaScript.g:339:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator59 =null;
		String expr60 =null;
		String rightUnaryOperator61 =null;


			code = null;

		try {
			// src/C2JavaScript.g:343:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt13=3;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt13=1;
				}
				break;
			case 23:
				{
				alt13=1;
				}
				break;
			case 17:
				{
				alt13=1;
				}
				break;
			case 26:
				{
				alt13=1;
				}
				break;
			case 36:
				{
				alt13=1;
				}
				break;
			case 37:
				{
				alt13=1;
				}
				break;
			case 30:
				{
				alt13=1;
				}
				break;
			case 33:
				{
				alt13=1;
				}
				break;
			case 35:
				{
				alt13=1;
				}
				break;
			case 11:
				{
				alt13=1;
				}
				break;
			case 12:
				{
				alt13=1;
				}
				break;
			case 64:
				{
				alt13=1;
				}
				break;
			case 13:
				{
				alt13=1;
				}
				break;
			case 62:
				{
				alt13=1;
				}
				break;
			case 42:
				{
				alt13=1;
				}
				break;
			case 31:
				{
				alt13=1;
				}
				break;
			case 38:
				{
				alt13=1;
				}
				break;
			case 34:
				{
				alt13=1;
				}
				break;
			case 21:
				{
				alt13=1;
				}
				break;
			case 25:
				{
				alt13=1;
				}
				break;
			case 18:
				{
				alt13=1;
				}
				break;
			case 27:
				{
				alt13=1;
				}
				break;
			case 14:
				{
				alt13=1;
				}
				break;
			case 63:
				{
				alt13=1;
				}
				break;
			case 43:
				{
				alt13=1;
				}
				break;
			case 32:
				{
				alt13=1;
				}
				break;
			case 39:
				{
				alt13=1;
				}
				break;
			case 20:
				{
				alt13=2;
				}
				break;
			case 24:
				{
				alt13=2;
				}
				break;
			case 16:
			case 22:
			case 28:
			case 29:
			case 41:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src/C2JavaScript.g:343:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext968);
					binaryOperator59=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext970);
					expr60=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext974);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator59 + " " + expr60 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:347:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext983);
					rightUnaryOperator61=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator61;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:352:3: 
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
	// src/C2JavaScript.g:357:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' | '-' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:361:2: ( '!' | '~' | '++' | '--' | '-' )
			int alt14=5;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt14=1;
				}
				break;
			case 66:
				{
				alt14=2;
				}
				break;
			case 20:
				{
				alt14=3;
				}
				break;
			case 24:
				{
				alt14=4;
				}
				break;
			case 23:
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// src/C2JavaScript.g:361:4: '!'
					{
					match(input,10,FOLLOW_10_in_leftUnaryOperator1013); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:365:4: '~'
					{
					match(input,66,FOLLOW_66_in_leftUnaryOperator1022); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:369:4: '++'
					{
					match(input,20,FOLLOW_20_in_leftUnaryOperator1031); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:373:4: '--'
					{
					match(input,24,FOLLOW_24_in_leftUnaryOperator1040); 

								code = "--";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:377:4: '-'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator1049); 

								code = "-";
							
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
	// src/C2JavaScript.g:383:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:387:2: ( '++' | '--' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==20) ) {
				alt15=1;
			}
			else if ( (LA15_0==24) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// src/C2JavaScript.g:387:4: '++'
					{
					match(input,20,FOLLOW_20_in_rightUnaryOperator1072); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:391:4: '--'
					{
					match(input,24,FOLLOW_24_in_rightUnaryOperator1081); 

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
	// src/C2JavaScript.g:397:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:401:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt16=27;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt16=1;
				}
				break;
			case 23:
				{
				alt16=2;
				}
				break;
			case 17:
				{
				alt16=3;
				}
				break;
			case 26:
				{
				alt16=4;
				}
				break;
			case 36:
				{
				alt16=5;
				}
				break;
			case 37:
				{
				alt16=6;
				}
				break;
			case 30:
				{
				alt16=7;
				}
				break;
			case 33:
				{
				alt16=8;
				}
				break;
			case 35:
				{
				alt16=9;
				}
				break;
			case 11:
				{
				alt16=10;
				}
				break;
			case 12:
				{
				alt16=11;
				}
				break;
			case 64:
				{
				alt16=12;
				}
				break;
			case 13:
				{
				alt16=13;
				}
				break;
			case 62:
				{
				alt16=14;
				}
				break;
			case 42:
				{
				alt16=15;
				}
				break;
			case 31:
				{
				alt16=16;
				}
				break;
			case 38:
				{
				alt16=17;
				}
				break;
			case 34:
				{
				alt16=18;
				}
				break;
			case 21:
				{
				alt16=19;
				}
				break;
			case 25:
				{
				alt16=20;
				}
				break;
			case 18:
				{
				alt16=21;
				}
				break;
			case 27:
				{
				alt16=22;
				}
				break;
			case 14:
				{
				alt16=23;
				}
				break;
			case 63:
				{
				alt16=24;
				}
				break;
			case 43:
				{
				alt16=25;
				}
				break;
			case 32:
				{
				alt16=26;
				}
				break;
			case 39:
				{
				alt16=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// src/C2JavaScript.g:401:4: '+'
					{
					match(input,19,FOLLOW_19_in_binaryOperator1104); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:405:4: '-'
					{
					match(input,23,FOLLOW_23_in_binaryOperator1113); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:409:4: '*'
					{
					match(input,17,FOLLOW_17_in_binaryOperator1122); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:413:4: '/'
					{
					match(input,26,FOLLOW_26_in_binaryOperator1131); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:417:4: '>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator1140); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:421:4: '>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator1149); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:425:4: '<'
					{
					match(input,30,FOLLOW_30_in_binaryOperator1158); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:429:4: '<='
					{
					match(input,33,FOLLOW_33_in_binaryOperator1167); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:433:4: '=='
					{
					match(input,35,FOLLOW_35_in_binaryOperator1176); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:437:4: '!='
					{
					match(input,11,FOLLOW_11_in_binaryOperator1185); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:441:4: '&&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator1194); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:445:4: '||'
					{
					match(input,64,FOLLOW_64_in_binaryOperator1203); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:449:4: '&'
					{
					match(input,13,FOLLOW_13_in_binaryOperator1212); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:453:4: '|'
					{
					match(input,62,FOLLOW_62_in_binaryOperator1221); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:457:4: '^'
					{
					match(input,42,FOLLOW_42_in_binaryOperator1230); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:461:4: '<<'
					{
					match(input,31,FOLLOW_31_in_binaryOperator1239); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:465:4: '>>'
					{
					match(input,38,FOLLOW_38_in_binaryOperator1248); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:469:4: '='
					{
					match(input,34,FOLLOW_34_in_binaryOperator1257); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:473:4: '+='
					{
					match(input,21,FOLLOW_21_in_binaryOperator1266); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:477:4: '-='
					{
					match(input,25,FOLLOW_25_in_binaryOperator1275); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:481:4: '*='
					{
					match(input,18,FOLLOW_18_in_binaryOperator1284); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:485:4: '/='
					{
					match(input,27,FOLLOW_27_in_binaryOperator1293); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:489:4: '&='
					{
					match(input,14,FOLLOW_14_in_binaryOperator1302); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:493:4: '|='
					{
					match(input,63,FOLLOW_63_in_binaryOperator1311); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:497:4: '^='
					{
					match(input,43,FOLLOW_43_in_binaryOperator1320); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:501:4: '<<='
					{
					match(input,32,FOLLOW_32_in_binaryOperator1329); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:505:4: '>>='
					{
					match(input,39,FOLLOW_39_in_binaryOperator1338); 

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
	// src/C2JavaScript.g:511:1: type returns [String code] : ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:515:2: ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext )
			int alt17=7;
			switch ( input.LA(1) ) {
			case 59:
				{
				alt17=1;
				}
				break;
			case 46:
				{
				alt17=2;
				}
				break;
			case 57:
				{
				alt17=3;
				}
				break;
			case 54:
				{
				alt17=4;
				}
				break;
			case 55:
				{
				alt17=5;
				}
				break;
			case 51:
				{
				alt17=6;
				}
				break;
			case 49:
				{
				alt17=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// src/C2JavaScript.g:515:4: 'void' typeNext
					{
					match(input,59,FOLLOW_59_in_type1361); 
					pushFollow(FOLLOW_typeNext_in_type1363);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:519:4: 'char' typeNext
					{
					match(input,46,FOLLOW_46_in_type1372); 
					pushFollow(FOLLOW_typeNext_in_type1374);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:523:4: 'short' typeNext
					{
					match(input,57,FOLLOW_57_in_type1383); 
					pushFollow(FOLLOW_typeNext_in_type1385);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:527:4: 'int' typeNext
					{
					match(input,54,FOLLOW_54_in_type1394); 
					pushFollow(FOLLOW_typeNext_in_type1396);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:531:4: 'long' typeNext
					{
					match(input,55,FOLLOW_55_in_type1405); 
					pushFollow(FOLLOW_typeNext_in_type1407);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:535:4: 'float' typeNext
					{
					match(input,51,FOLLOW_51_in_type1416); 
					pushFollow(FOLLOW_typeNext_in_type1418);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:539:4: 'double' typeNext
					{
					match(input,49,FOLLOW_49_in_type1427); 
					pushFollow(FOLLOW_typeNext_in_type1429);
					typeNext();
					state._fsp--;


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



	// $ANTLR start "typeNext"
	// src/C2JavaScript.g:545:1: typeNext : ( '*' |);
	public final void typeNext() throws RecognitionException {
		try {
			// src/C2JavaScript.g:546:2: ( '*' |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==17) ) {
				alt18=1;
			}
			else if ( (LA18_0==ID) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// src/C2JavaScript.g:546:4: '*'
					{
					match(input,17,FOLLOW_17_in_typeNext1444); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:548:2: 
					{
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
	}
	// $ANTLR end "typeNext"

	// Delegated rules



	public static final BitSet FOLLOW_programBlock_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefine_in_programBlock34 = new BitSet(new long[]{0x0ACA400000000000L});
	public static final BitSet FOLLOW_programBlock_in_programBlock38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionDefine68 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionDefine70 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDefine72 = new BitSet(new long[]{0x0ACA400000010000L});
	public static final BitSet FOLLOW_functionArgument_in_functionDefine74 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_functionDefine76 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_functionDefine78 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000006L});
	public static final BitSet FOLLOW_functionStatement_in_functionDefine80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_functionDefine82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionArgument105 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionArgument107 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgument109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_functionArgumentNext139 = new BitSet(new long[]{0x0ACA400000000000L});
	public static final BitSet FOLLOW_type_in_functionArgumentNext141 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionArgumentNext143 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgumentNext147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall177 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionCall179 = new BitSet(new long[]{0x0000000001918550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionCallArgument_in_functionCall181 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_functionCall183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_functionCallArgument206 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgument208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_functionCallArgumentNext238 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_functionCallArgumentNext240 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefine_in_functionStatement274 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_functionStatement287 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_functionStatement300 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchStatement_in_functionStatement313 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_functionStatement326 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_functionStatement339 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_functionStatement352 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_functionStatement365 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000006L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_functionStatement371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_functionStatement380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_functionStatement389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ifStatement419 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ifStatement421 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_ifStatement423 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ifStatement425 = new BitSet(new long[]{0x3FFED00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_ifStatement427 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_ifStatementNext_in_ifStatement429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ifStatementNext452 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_ifStatementNext454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_switchStatement484 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_switchStatement486 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_switchStatement488 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_switchStatement490 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_switchStatement492 = new BitSet(new long[]{0x0001200000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_switchStatement494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_switchStatement496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_caseStatement519 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_caseStatement521 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_caseStatement523 = new BitSet(new long[]{0x3FFBF00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_caseStatement525 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_caseStatement538 = new BitSet(new long[]{0x3FFBF00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_caseStatement540 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_forStatement574 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_forStatement576 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement580 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forStatement582 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement586 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forStatement588 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement592 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_forStatement594 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_forStatement596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_whileStatement619 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_whileStatement621 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStatement623 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_whileStatement625 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_whileStatement627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_returnStatement650 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_returnStatement652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine675 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine677 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine702 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine713 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_singleVariableDefine715 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUM_in_singleVariableDefine717 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_singleVariableDefine719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_initialValue742 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_initialValue744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_variableDefineNext774 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext776 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_variableDefineNext789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arrayCall812 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_arrayCall814 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_arrayCall816 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_arrayCall818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression842 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expression844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr867 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expr878 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_expr889 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr900 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr904 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expr906 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr917 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr921 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr932 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCall_in_expr943 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext968 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_exprNext970 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_exprNext974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_leftUnaryOperator1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_leftUnaryOperator1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_leftUnaryOperator1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_leftUnaryOperator1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rightUnaryOperator1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rightUnaryOperator1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_binaryOperator1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_binaryOperator1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_binaryOperator1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_binaryOperator1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_binaryOperator1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_binaryOperator1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_binaryOperator1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_binaryOperator1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_binaryOperator1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_binaryOperator1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_type1361 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type1372 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_type1383 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_type1394 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_type1405 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_type1416 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_type1427 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_typeNext1444 = new BitSet(new long[]{0x0000000000000002L});
}
