// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 20:25:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", 
		"'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", 
		"';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", 
		"'>>='", "'^'", "'^='", "'break;'", "'case'", "'char'", "'continue;'", 
		"'default:'", "'double'", "'else'", "'float'", "'for'", "'if'", "'int'", 
		"'long'", "'return'", "'short'", "'switch'", "'void'", "'while'", "'{'", 
		"'|'", "'|='", "'||'", "'}'", "'~'"
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
	// src/C2JavaScript.g:3:1: program : functionDefine ;
	public final void program() throws RecognitionException {
		String functionDefine1 =null;

		try {
			// src/C2JavaScript.g:4:2: ( functionDefine )
			// src/C2JavaScript.g:4:4: functionDefine
			{
			pushFollow(FOLLOW_functionDefine_in_program11);
			functionDefine1=functionDefine();
			state._fsp--;


						System.out.println(functionDefine1);
					
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



	// $ANTLR start "functionDefine"
	// src/C2JavaScript.g:10:1: functionDefine returns [String code] : type ID '(' functionArgument ')' '{' statement '}' ;
	public final String functionDefine() throws RecognitionException {
		String code = null;


		Token ID2=null;
		String functionArgument3 =null;
		String statement4 =null;


			code = null;

		try {
			// src/C2JavaScript.g:14:2: ( type ID '(' functionArgument ')' '{' statement '}' )
			// src/C2JavaScript.g:14:4: type ID '(' functionArgument ')' '{' statement '}'
			{
			pushFollow(FOLLOW_type_in_functionDefine34);
			type();
			state._fsp--;

			ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDefine36); 
			match(input,14,FOLLOW_14_in_functionDefine38); 
			pushFollow(FOLLOW_functionArgument_in_functionDefine40);
			functionArgument3=functionArgument();
			state._fsp--;

			match(input,15,FOLLOW_15_in_functionDefine42); 
			match(input,58,FOLLOW_58_in_functionDefine44); 
			pushFollow(FOLLOW_statement_in_functionDefine46);
			statement4=statement();
			state._fsp--;

			match(input,62,FOLLOW_62_in_functionDefine48); 

						code = "function " + (ID2!=null?ID2.getText():null) + "(" + functionArgument3 + ")\n" + "{\n" + statement4 + "}\n";
					
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
	// src/C2JavaScript.g:20:1: functionArgument returns [String code] : ( type ID functionArgumentNext |);
	public final String functionArgument() throws RecognitionException {
		String code = null;


		Token ID5=null;
		String functionArgumentNext6 =null;


			code = null;

		try {
			// src/C2JavaScript.g:24:2: ( type ID functionArgumentNext |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==43||LA1_0==46||LA1_0==48||(LA1_0 >= 51 && LA1_0 <= 52)||LA1_0==54||LA1_0==56) ) {
				alt1=1;
			}
			else if ( (LA1_0==15) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/C2JavaScript.g:24:4: type ID functionArgumentNext
					{
					pushFollow(FOLLOW_type_in_functionArgument71);
					type();
					state._fsp--;

					ID5=(Token)match(input,ID,FOLLOW_ID_in_functionArgument73); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgument75);
					functionArgumentNext6=functionArgumentNext();
					state._fsp--;


								code = (ID5!=null?ID5.getText():null) + functionArgumentNext6;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:29:3: 
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
	// src/C2JavaScript.g:34:1: functionArgumentNext returns [String code] : ( ',' type ID a= functionArgumentNext |);
	public final String functionArgumentNext() throws RecognitionException {
		String code = null;


		Token ID7=null;
		String a =null;


			code = null;

		try {
			// src/C2JavaScript.g:38:2: ( ',' type ID a= functionArgumentNext |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==21) ) {
				alt2=1;
			}
			else if ( (LA2_0==15) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/C2JavaScript.g:38:4: ',' type ID a= functionArgumentNext
					{
					match(input,21,FOLLOW_21_in_functionArgumentNext105); 
					pushFollow(FOLLOW_type_in_functionArgumentNext107);
					type();
					state._fsp--;

					ID7=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentNext109); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgumentNext113);
					a=functionArgumentNext();
					state._fsp--;


								code = ", " + (ID7!=null?ID7.getText():null) + a;
							
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
	// $ANTLR end "functionArgumentNext"



	// $ANTLR start "functionCall"
	// src/C2JavaScript.g:48:1: functionCall returns [String code] : ID '(' functionCallArgument ')' ;
	public final String functionCall() throws RecognitionException {
		String code = null;


		Token ID8=null;
		String functionCallArgument9 =null;


			code = null;

		try {
			// src/C2JavaScript.g:52:2: ( ID '(' functionCallArgument ')' )
			// src/C2JavaScript.g:52:4: ID '(' functionCallArgument ')'
			{
			ID8=(Token)match(input,ID,FOLLOW_ID_in_functionCall143); 
			match(input,14,FOLLOW_14_in_functionCall145); 
			pushFollow(FOLLOW_functionCallArgument_in_functionCall147);
			functionCallArgument9=functionCallArgument();
			state._fsp--;

			match(input,15,FOLLOW_15_in_functionCall149); 

						code = (ID8!=null?ID8.getText():null) + "(" + functionCallArgument9 + ")";
					
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
	// src/C2JavaScript.g:58:1: functionCallArgument returns [String code] : ( expr functionCallArgumentNext |);
	public final String functionCallArgument() throws RecognitionException {
		String code = null;


		String expr10 =null;
		String functionCallArgumentNext11 =null;


			code = null;

		try {
			// src/C2JavaScript.g:62:2: ( expr functionCallArgumentNext |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= ID && LA3_0 <= INT)||LA3_0==9||LA3_0==14||LA3_0==19||(LA3_0 >= 22 && LA3_0 <= 23)||LA3_0==63) ) {
				alt3=1;
			}
			else if ( (LA3_0==15) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:62:4: expr functionCallArgumentNext
					{
					pushFollow(FOLLOW_expr_in_functionCallArgument172);
					expr10=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgument174);
					functionCallArgumentNext11=functionCallArgumentNext();
					state._fsp--;


								code = expr10 + functionCallArgumentNext11;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:67:3: 
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
	// src/C2JavaScript.g:72:1: functionCallArgumentNext returns [String code] : ( ',' expr a= functionCallArgumentNext |);
	public final String functionCallArgumentNext() throws RecognitionException {
		String code = null;


		String a =null;
		String expr12 =null;


			code = null;

		try {
			// src/C2JavaScript.g:76:2: ( ',' expr a= functionCallArgumentNext |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==21) ) {
				alt4=1;
			}
			else if ( (LA4_0==15) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:76:4: ',' expr a= functionCallArgumentNext
					{
					match(input,21,FOLLOW_21_in_functionCallArgumentNext204); 
					pushFollow(FOLLOW_expr_in_functionCallArgumentNext206);
					expr12=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210);
					a=functionCallArgumentNext();
					state._fsp--;


								code = ", " + expr12 + a;
							
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
	// $ANTLR end "functionCallArgumentNext"



	// $ANTLR start "statement"
	// src/C2JavaScript.g:86:1: statement returns [String code] : ( variableDefine a= statement | expression b= statement | ifStatement c= statement | switchStatement d= statement | forStatement e= statement | whileStatement f= statement | returnStatement g= statement | '{' h= statement '}' | 'break;' | 'continue;' |);
	public final String statement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String d =null;
		String e =null;
		String f =null;
		String g =null;
		String h =null;
		String variableDefine13 =null;
		String expression14 =null;
		String ifStatement15 =null;
		String switchStatement16 =null;
		String forStatement17 =null;
		String whileStatement18 =null;
		String returnStatement19 =null;


			code = null;

		try {
			// src/C2JavaScript.g:90:2: ( variableDefine a= statement | expression b= statement | ifStatement c= statement | switchStatement d= statement | forStatement e= statement | whileStatement f= statement | returnStatement g= statement | '{' h= statement '}' | 'break;' | 'continue;' |)
			int alt5=11;
			switch ( input.LA(1) ) {
			case 56:
				{
				alt5=1;
				}
				break;
			case 43:
				{
				alt5=1;
				}
				break;
			case 54:
				{
				alt5=1;
				}
				break;
			case 51:
				{
				alt5=1;
				}
				break;
			case 52:
				{
				alt5=1;
				}
				break;
			case 48:
				{
				alt5=1;
				}
				break;
			case 46:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case INT:
				{
				alt5=2;
				}
				break;
			case 14:
				{
				alt5=2;
				}
				break;
			case 9:
				{
				alt5=2;
				}
				break;
			case 63:
				{
				alt5=2;
				}
				break;
			case 19:
				{
				alt5=2;
				}
				break;
			case 23:
				{
				alt5=2;
				}
				break;
			case 22:
				{
				alt5=2;
				}
				break;
			case 50:
				{
				alt5=3;
				}
				break;
			case 55:
				{
				alt5=4;
				}
				break;
			case 49:
				{
				alt5=5;
				}
				break;
			case 57:
				{
				alt5=6;
				}
				break;
			case 53:
				{
				alt5=7;
				}
				break;
			case 58:
				{
				alt5=8;
				}
				break;
			case 41:
				{
				alt5=9;
				}
				break;
			case 44:
				{
				alt5=10;
				}
				break;
			case 42:
			case 45:
			case 47:
			case 62:
				{
				alt5=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:90:4: variableDefine a= statement
					{
					pushFollow(FOLLOW_variableDefine_in_statement240);
					variableDefine13=variableDefine();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement244);
					a=statement();
					state._fsp--;


								code = variableDefine13 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:94:4: expression b= statement
					{
					pushFollow(FOLLOW_expression_in_statement253);
					expression14=expression();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement257);
					b=statement();
					state._fsp--;


								code = expression14 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:98:4: ifStatement c= statement
					{
					pushFollow(FOLLOW_ifStatement_in_statement266);
					ifStatement15=ifStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement270);
					c=statement();
					state._fsp--;


								code = ifStatement15 + c;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:102:4: switchStatement d= statement
					{
					pushFollow(FOLLOW_switchStatement_in_statement279);
					switchStatement16=switchStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement283);
					d=statement();
					state._fsp--;


								code = switchStatement16 + d;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:106:4: forStatement e= statement
					{
					pushFollow(FOLLOW_forStatement_in_statement292);
					forStatement17=forStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement296);
					e=statement();
					state._fsp--;


								code = forStatement17 + e;
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:110:4: whileStatement f= statement
					{
					pushFollow(FOLLOW_whileStatement_in_statement305);
					whileStatement18=whileStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement309);
					f=statement();
					state._fsp--;


								code = whileStatement18 + f;
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:114:4: returnStatement g= statement
					{
					pushFollow(FOLLOW_returnStatement_in_statement318);
					returnStatement19=returnStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement322);
					g=statement();
					state._fsp--;


								code = returnStatement19 + g;
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:118:4: '{' h= statement '}'
					{
					match(input,58,FOLLOW_58_in_statement331); 
					pushFollow(FOLLOW_statement_in_statement335);
					h=statement();
					state._fsp--;

					match(input,62,FOLLOW_62_in_statement337); 

								code = "{\n" + h + "}\n";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:122:4: 'break;'
					{
					match(input,41,FOLLOW_41_in_statement346); 

								code = "break;\n";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:126:4: 'continue;'
					{
					match(input,44,FOLLOW_44_in_statement355); 

								code = "continue;\n";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:131:3: 
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
	// $ANTLR end "statement"



	// $ANTLR start "ifStatement"
	// src/C2JavaScript.g:136:1: ifStatement returns [String code] : 'if' '(' expr ')' statement ifStatementNext ;
	public final String ifStatement() throws RecognitionException {
		String code = null;


		String expr20 =null;
		String statement21 =null;
		String ifStatementNext22 =null;


			code = null;

		try {
			// src/C2JavaScript.g:140:2: ( 'if' '(' expr ')' statement ifStatementNext )
			// src/C2JavaScript.g:140:4: 'if' '(' expr ')' statement ifStatementNext
			{
			match(input,50,FOLLOW_50_in_ifStatement385); 
			match(input,14,FOLLOW_14_in_ifStatement387); 
			pushFollow(FOLLOW_expr_in_ifStatement389);
			expr20=expr();
			state._fsp--;

			match(input,15,FOLLOW_15_in_ifStatement391); 
			pushFollow(FOLLOW_statement_in_ifStatement393);
			statement21=statement();
			state._fsp--;

			pushFollow(FOLLOW_ifStatementNext_in_ifStatement395);
			ifStatementNext22=ifStatementNext();
			state._fsp--;


						code = "if (" + expr20 + ")\n" + statement21 + ifStatementNext22;
					
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
	// src/C2JavaScript.g:146:1: ifStatementNext returns [String code] : ( 'else' statement |);
	public final String ifStatementNext() throws RecognitionException {
		String code = null;


		String statement23 =null;


			code = null;

		try {
			// src/C2JavaScript.g:150:2: ( 'else' statement |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==47) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= ID && LA6_0 <= INT)||LA6_0==9||LA6_0==14||LA6_0==19||(LA6_0 >= 22 && LA6_0 <= 23)||(LA6_0 >= 41 && LA6_0 <= 46)||(LA6_0 >= 48 && LA6_0 <= 58)||(LA6_0 >= 62 && LA6_0 <= 63)) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:150:4: 'else' statement
					{
					match(input,47,FOLLOW_47_in_ifStatementNext418); 
					pushFollow(FOLLOW_statement_in_ifStatementNext420);
					statement23=statement();
					state._fsp--;


								code = "else\n" + statement23;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:155:3: 
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
	// src/C2JavaScript.g:160:1: switchStatement returns [String code] : 'switch' '(' expr ')' '{' caseStatement '}' ;
	public final String switchStatement() throws RecognitionException {
		String code = null;


		String expr24 =null;
		String caseStatement25 =null;


			code = null;

		try {
			// src/C2JavaScript.g:164:2: ( 'switch' '(' expr ')' '{' caseStatement '}' )
			// src/C2JavaScript.g:164:4: 'switch' '(' expr ')' '{' caseStatement '}'
			{
			match(input,55,FOLLOW_55_in_switchStatement450); 
			match(input,14,FOLLOW_14_in_switchStatement452); 
			pushFollow(FOLLOW_expr_in_switchStatement454);
			expr24=expr();
			state._fsp--;

			match(input,15,FOLLOW_15_in_switchStatement456); 
			match(input,58,FOLLOW_58_in_switchStatement458); 
			pushFollow(FOLLOW_caseStatement_in_switchStatement460);
			caseStatement25=caseStatement();
			state._fsp--;

			match(input,62,FOLLOW_62_in_switchStatement462); 

						code = "switch (" + expr24 + ")\n{\n" + caseStatement25 + "}\n";
					
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
	// src/C2JavaScript.g:170:1: caseStatement returns [String code] : ( 'case' expr ':' statement a= caseStatement | 'default:' statement b= caseStatement |);
	public final String caseStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String expr26 =null;
		String statement27 =null;
		String statement28 =null;


			code = null;

		try {
			// src/C2JavaScript.g:174:2: ( 'case' expr ':' statement a= caseStatement | 'default:' statement b= caseStatement |)
			int alt7=3;
			switch ( input.LA(1) ) {
			case 42:
				{
				alt7=1;
				}
				break;
			case 45:
				{
				alt7=2;
				}
				break;
			case 62:
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
					// src/C2JavaScript.g:174:4: 'case' expr ':' statement a= caseStatement
					{
					match(input,42,FOLLOW_42_in_caseStatement485); 
					pushFollow(FOLLOW_expr_in_caseStatement487);
					expr26=expr();
					state._fsp--;

					match(input,27,FOLLOW_27_in_caseStatement489); 
					pushFollow(FOLLOW_statement_in_caseStatement491);
					statement27=statement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement495);
					a=caseStatement();
					state._fsp--;


								code = "case " + expr26 + ":\n" + statement27 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:178:4: 'default:' statement b= caseStatement
					{
					match(input,45,FOLLOW_45_in_caseStatement504); 
					pushFollow(FOLLOW_statement_in_caseStatement506);
					statement28=statement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement510);
					b=caseStatement();
					state._fsp--;


								code = "default:\n" + statement28 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:183:3: 
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
	// src/C2JavaScript.g:188:1: forStatement returns [String code] : 'for' '(' a= expr ';' b= expr ';' c= expr ')' statement ;
	public final String forStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String statement29 =null;


			code = null;

		try {
			// src/C2JavaScript.g:192:2: ( 'for' '(' a= expr ';' b= expr ';' c= expr ')' statement )
			// src/C2JavaScript.g:192:4: 'for' '(' a= expr ';' b= expr ';' c= expr ')' statement
			{
			match(input,49,FOLLOW_49_in_forStatement540); 
			match(input,14,FOLLOW_14_in_forStatement542); 
			pushFollow(FOLLOW_expr_in_forStatement546);
			a=expr();
			state._fsp--;

			match(input,28,FOLLOW_28_in_forStatement548); 
			pushFollow(FOLLOW_expr_in_forStatement552);
			b=expr();
			state._fsp--;

			match(input,28,FOLLOW_28_in_forStatement554); 
			pushFollow(FOLLOW_expr_in_forStatement558);
			c=expr();
			state._fsp--;

			match(input,15,FOLLOW_15_in_forStatement560); 
			pushFollow(FOLLOW_statement_in_forStatement562);
			statement29=statement();
			state._fsp--;


						code = "for (" + a + "; " + b + "; " + c + ")\n" + statement29;
					
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
	// src/C2JavaScript.g:198:1: whileStatement returns [String code] : 'while' '(' expr ')' statement ;
	public final String whileStatement() throws RecognitionException {
		String code = null;


		String expr30 =null;
		String statement31 =null;


			code = null;

		try {
			// src/C2JavaScript.g:202:2: ( 'while' '(' expr ')' statement )
			// src/C2JavaScript.g:202:4: 'while' '(' expr ')' statement
			{
			match(input,57,FOLLOW_57_in_whileStatement585); 
			match(input,14,FOLLOW_14_in_whileStatement587); 
			pushFollow(FOLLOW_expr_in_whileStatement589);
			expr30=expr();
			state._fsp--;

			match(input,15,FOLLOW_15_in_whileStatement591); 
			pushFollow(FOLLOW_statement_in_whileStatement593);
			statement31=statement();
			state._fsp--;


						code = "while (" + expr30 + ")\n"  + statement31;
					
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
	// src/C2JavaScript.g:208:1: returnStatement returns [String code] : 'return' expression ;
	public final String returnStatement() throws RecognitionException {
		String code = null;


		String expression32 =null;


			code = null;

		try {
			// src/C2JavaScript.g:212:2: ( 'return' expression )
			// src/C2JavaScript.g:212:4: 'return' expression
			{
			match(input,53,FOLLOW_53_in_returnStatement616); 
			pushFollow(FOLLOW_expression_in_returnStatement618);
			expression32=expression();
			state._fsp--;


						code = "return " + expression32;
					
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
	// src/C2JavaScript.g:218:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type33 =null;
		String singleVariableDefine34 =null;
		String variableDefineNext35 =null;


			code = null;

		try {
			// src/C2JavaScript.g:222:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:222:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine641);
			type33=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine643);
			singleVariableDefine34=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine645);
			variableDefineNext35=variableDefineNext();
			state._fsp--;


						code = type33 + " " + singleVariableDefine34 + variableDefineNext35;
					
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
	// src/C2JavaScript.g:228:1: singleVariableDefine returns [String code] : ID initialValue ;
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID36=null;
		String initialValue37 =null;


			code = null;

		try {
			// src/C2JavaScript.g:232:2: ( ID initialValue )
			// src/C2JavaScript.g:232:4: ID initialValue
			{
			ID36=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine668); 
			pushFollow(FOLLOW_initialValue_in_singleVariableDefine670);
			initialValue37=initialValue();
			state._fsp--;


						code = (ID36!=null?ID36.getText():null) + initialValue37;
					
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
	// src/C2JavaScript.g:238:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr38 =null;


			code = null;

		try {
			// src/C2JavaScript.g:242:2: ( '=' expr |)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==33) ) {
				alt8=1;
			}
			else if ( (LA8_0==21||LA8_0==28) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src/C2JavaScript.g:242:4: '=' expr
					{
					match(input,33,FOLLOW_33_in_initialValue693); 
					pushFollow(FOLLOW_expr_in_initialValue695);
					expr38=expr();
					state._fsp--;


								code = " = " + expr38;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:247:3: 
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
	// src/C2JavaScript.g:252:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine39 =null;


			code = null;

		try {
			// src/C2JavaScript.g:256:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==21) ) {
				alt9=1;
			}
			else if ( (LA9_0==28) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/C2JavaScript.g:256:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext725); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext727);
					singleVariableDefine39=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext731);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine39 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:260:4: ';'
					{
					match(input,28,FOLLOW_28_in_variableDefineNext740); 

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



	// $ANTLR start "expression"
	// src/C2JavaScript.g:266:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr40 =null;


			code = null;

		try {
			// src/C2JavaScript.g:270:2: ( expr ';' )
			// src/C2JavaScript.g:270:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression763);
			expr40=expr();
			state._fsp--;

			match(input,28,FOLLOW_28_in_expression765); 

						code = expr40 + ";\n";
					
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
	// src/C2JavaScript.g:276:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID41=null;
		Token INT43=null;
		String a =null;
		String b =null;
		String exprNext42 =null;
		String exprNext44 =null;
		String exprNext45 =null;
		String leftUnaryOperator46 =null;
		String exprNext47 =null;
		String functionCall48 =null;
		String exprNext49 =null;


			code = null;

		try {
			// src/C2JavaScript.g:280:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext )
			int alt10=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==14) ) {
					alt10=5;
				}
				else if ( ((LA10_1 >= 10 && LA10_1 <= 13)||(LA10_1 >= 15 && LA10_1 <= 40)||(LA10_1 >= 59 && LA10_1 <= 61)) ) {
					alt10=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				alt10=2;
				}
				break;
			case 14:
				{
				alt10=3;
				}
				break;
			case 9:
			case 19:
			case 22:
			case 23:
			case 63:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src/C2JavaScript.g:280:4: ID exprNext
					{
					ID41=(Token)match(input,ID,FOLLOW_ID_in_expr788); 
					pushFollow(FOLLOW_exprNext_in_expr790);
					exprNext42=exprNext();
					state._fsp--;


								code = (ID41!=null?ID41.getText():null) + exprNext42;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:284:4: INT exprNext
					{
					INT43=(Token)match(input,INT,FOLLOW_INT_in_expr799); 
					pushFollow(FOLLOW_exprNext_in_expr801);
					exprNext44=exprNext();
					state._fsp--;


								code = (INT43!=null?INT43.getText():null) + exprNext44;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:288:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr810); 
					pushFollow(FOLLOW_expr_in_expr814);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr816); 
					pushFollow(FOLLOW_exprNext_in_expr818);
					exprNext45=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext45;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:292:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr827);
					leftUnaryOperator46=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr831);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr833);
					exprNext47=exprNext();
					state._fsp--;


								code = leftUnaryOperator46 + b + exprNext47;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:296:4: functionCall exprNext
					{
					pushFollow(FOLLOW_functionCall_in_expr842);
					functionCall48=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr844);
					exprNext49=exprNext();
					state._fsp--;


								code = functionCall48 + exprNext49;
							
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
	// src/C2JavaScript.g:302:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator50 =null;
		String expr51 =null;
		String rightUnaryOperator52 =null;


			code = null;

		try {
			// src/C2JavaScript.g:306:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt11=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt11=1;
				}
				break;
			case 22:
				{
				alt11=1;
				}
				break;
			case 16:
				{
				alt11=1;
				}
				break;
			case 25:
				{
				alt11=1;
				}
				break;
			case 35:
				{
				alt11=1;
				}
				break;
			case 36:
				{
				alt11=1;
				}
				break;
			case 29:
				{
				alt11=1;
				}
				break;
			case 32:
				{
				alt11=1;
				}
				break;
			case 34:
				{
				alt11=1;
				}
				break;
			case 10:
				{
				alt11=1;
				}
				break;
			case 11:
				{
				alt11=1;
				}
				break;
			case 61:
				{
				alt11=1;
				}
				break;
			case 12:
				{
				alt11=1;
				}
				break;
			case 59:
				{
				alt11=1;
				}
				break;
			case 39:
				{
				alt11=1;
				}
				break;
			case 30:
				{
				alt11=1;
				}
				break;
			case 37:
				{
				alt11=1;
				}
				break;
			case 33:
				{
				alt11=1;
				}
				break;
			case 20:
				{
				alt11=1;
				}
				break;
			case 24:
				{
				alt11=1;
				}
				break;
			case 17:
				{
				alt11=1;
				}
				break;
			case 26:
				{
				alt11=1;
				}
				break;
			case 13:
				{
				alt11=1;
				}
				break;
			case 60:
				{
				alt11=1;
				}
				break;
			case 40:
				{
				alt11=1;
				}
				break;
			case 31:
				{
				alt11=1;
				}
				break;
			case 38:
				{
				alt11=1;
				}
				break;
			case 19:
				{
				alt11=2;
				}
				break;
			case 23:
				{
				alt11=2;
				}
				break;
			case 15:
			case 21:
			case 27:
			case 28:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// src/C2JavaScript.g:306:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext867);
					binaryOperator50=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext869);
					expr51=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext873);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator50 + " " + expr51 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:310:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext882);
					rightUnaryOperator52=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator52;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:315:3: 
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
	// src/C2JavaScript.g:320:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' | '-' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:324:2: ( '!' | '~' | '++' | '--' | '-' )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt12=1;
				}
				break;
			case 63:
				{
				alt12=2;
				}
				break;
			case 19:
				{
				alt12=3;
				}
				break;
			case 23:
				{
				alt12=4;
				}
				break;
			case 22:
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
					// src/C2JavaScript.g:324:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator912); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:328:4: '~'
					{
					match(input,63,FOLLOW_63_in_leftUnaryOperator921); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:332:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator930); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:336:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator939); 

								code = "--";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:340:4: '-'
					{
					match(input,22,FOLLOW_22_in_leftUnaryOperator948); 

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
	// src/C2JavaScript.g:346:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:350:2: ( '++' | '--' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==19) ) {
				alt13=1;
			}
			else if ( (LA13_0==23) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// src/C2JavaScript.g:350:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator971); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:354:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator980); 

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
	// src/C2JavaScript.g:360:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:364:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt14=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt14=1;
				}
				break;
			case 22:
				{
				alt14=2;
				}
				break;
			case 16:
				{
				alt14=3;
				}
				break;
			case 25:
				{
				alt14=4;
				}
				break;
			case 35:
				{
				alt14=5;
				}
				break;
			case 36:
				{
				alt14=6;
				}
				break;
			case 29:
				{
				alt14=7;
				}
				break;
			case 32:
				{
				alt14=8;
				}
				break;
			case 34:
				{
				alt14=9;
				}
				break;
			case 10:
				{
				alt14=10;
				}
				break;
			case 11:
				{
				alt14=11;
				}
				break;
			case 61:
				{
				alt14=12;
				}
				break;
			case 12:
				{
				alt14=13;
				}
				break;
			case 59:
				{
				alt14=14;
				}
				break;
			case 39:
				{
				alt14=15;
				}
				break;
			case 30:
				{
				alt14=16;
				}
				break;
			case 37:
				{
				alt14=17;
				}
				break;
			case 33:
				{
				alt14=18;
				}
				break;
			case 20:
				{
				alt14=19;
				}
				break;
			case 24:
				{
				alt14=20;
				}
				break;
			case 17:
				{
				alt14=21;
				}
				break;
			case 26:
				{
				alt14=22;
				}
				break;
			case 13:
				{
				alt14=23;
				}
				break;
			case 60:
				{
				alt14=24;
				}
				break;
			case 40:
				{
				alt14=25;
				}
				break;
			case 31:
				{
				alt14=26;
				}
				break;
			case 38:
				{
				alt14=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// src/C2JavaScript.g:364:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator1003); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:368:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator1012); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:372:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator1021); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:376:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator1030); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:380:4: '>'
					{
					match(input,35,FOLLOW_35_in_binaryOperator1039); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:384:4: '>='
					{
					match(input,36,FOLLOW_36_in_binaryOperator1048); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:388:4: '<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator1057); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:392:4: '<='
					{
					match(input,32,FOLLOW_32_in_binaryOperator1066); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:396:4: '=='
					{
					match(input,34,FOLLOW_34_in_binaryOperator1075); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:400:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator1084); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:404:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator1093); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:408:4: '||'
					{
					match(input,61,FOLLOW_61_in_binaryOperator1102); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:412:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator1111); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:416:4: '|'
					{
					match(input,59,FOLLOW_59_in_binaryOperator1120); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:420:4: '^'
					{
					match(input,39,FOLLOW_39_in_binaryOperator1129); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:424:4: '<<'
					{
					match(input,30,FOLLOW_30_in_binaryOperator1138); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:428:4: '>>'
					{
					match(input,37,FOLLOW_37_in_binaryOperator1147); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:432:4: '='
					{
					match(input,33,FOLLOW_33_in_binaryOperator1156); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:436:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator1165); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:440:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator1174); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:444:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator1183); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:448:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator1192); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:452:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator1201); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:456:4: '|='
					{
					match(input,60,FOLLOW_60_in_binaryOperator1210); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:460:4: '^='
					{
					match(input,40,FOLLOW_40_in_binaryOperator1219); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:464:4: '<<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator1228); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:468:4: '>>='
					{
					match(input,38,FOLLOW_38_in_binaryOperator1237); 

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
	// src/C2JavaScript.g:474:1: type returns [String code] : ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:478:2: ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext )
			int alt15=7;
			switch ( input.LA(1) ) {
			case 56:
				{
				alt15=1;
				}
				break;
			case 43:
				{
				alt15=2;
				}
				break;
			case 54:
				{
				alt15=3;
				}
				break;
			case 51:
				{
				alt15=4;
				}
				break;
			case 52:
				{
				alt15=5;
				}
				break;
			case 48:
				{
				alt15=6;
				}
				break;
			case 46:
				{
				alt15=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// src/C2JavaScript.g:478:4: 'void' typeNext
					{
					match(input,56,FOLLOW_56_in_type1260); 
					pushFollow(FOLLOW_typeNext_in_type1262);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:482:4: 'char' typeNext
					{
					match(input,43,FOLLOW_43_in_type1271); 
					pushFollow(FOLLOW_typeNext_in_type1273);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:486:4: 'short' typeNext
					{
					match(input,54,FOLLOW_54_in_type1282); 
					pushFollow(FOLLOW_typeNext_in_type1284);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:490:4: 'int' typeNext
					{
					match(input,51,FOLLOW_51_in_type1293); 
					pushFollow(FOLLOW_typeNext_in_type1295);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:494:4: 'long' typeNext
					{
					match(input,52,FOLLOW_52_in_type1304); 
					pushFollow(FOLLOW_typeNext_in_type1306);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:498:4: 'float' typeNext
					{
					match(input,48,FOLLOW_48_in_type1315); 
					pushFollow(FOLLOW_typeNext_in_type1317);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:502:4: 'double' typeNext
					{
					match(input,46,FOLLOW_46_in_type1326); 
					pushFollow(FOLLOW_typeNext_in_type1328);
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
	// src/C2JavaScript.g:508:1: typeNext : ( '*' |);
	public final void typeNext() throws RecognitionException {
		try {
			// src/C2JavaScript.g:509:2: ( '*' |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==16) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/C2JavaScript.g:509:4: '*'
					{
					match(input,16,FOLLOW_16_in_typeNext1343); 
					}
					break;
				case 2 :
					// src/C2JavaScript.g:511:2: 
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



	public static final BitSet FOLLOW_functionDefine_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionDefine34 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionDefine36 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_functionDefine38 = new BitSet(new long[]{0x0159480000008000L});
	public static final BitSet FOLLOW_functionArgument_in_functionDefine40 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDefine42 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_functionDefine44 = new BitSet(new long[]{0xC7FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_functionDefine46 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_functionDefine48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionArgument71 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgument73 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgument75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionArgumentNext105 = new BitSet(new long[]{0x0159480000000000L});
	public static final BitSet FOLLOW_type_in_functionArgumentNext107 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgumentNext109 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgumentNext113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall143 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_functionCall145 = new BitSet(new long[]{0x8000000000C8C260L});
	public static final BitSet FOLLOW_functionCallArgument_in_functionCall147 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionCall149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_functionCallArgument172 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgument174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionCallArgumentNext204 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_functionCallArgumentNext206 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefine_in_statement240 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement253 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement266 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchStatement_in_statement279 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement292 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement305 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement318 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_statement331 = new BitSet(new long[]{0xC7FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement335 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_statement337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_statement346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_statement355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ifStatement385 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ifStatement387 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_ifStatement389 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ifStatement391 = new BitSet(new long[]{0x87FFDA0000C84260L});
	public static final BitSet FOLLOW_statement_in_ifStatement393 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ifStatementNext_in_ifStatement395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_ifStatementNext418 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_ifStatementNext420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_switchStatement450 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_switchStatement452 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_switchStatement454 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_switchStatement456 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_switchStatement458 = new BitSet(new long[]{0x4000240000000000L});
	public static final BitSet FOLLOW_caseStatement_in_switchStatement460 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_switchStatement462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_caseStatement485 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_caseStatement487 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_caseStatement489 = new BitSet(new long[]{0x87FF7E0000C84260L});
	public static final BitSet FOLLOW_statement_in_caseStatement491 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_caseStatement504 = new BitSet(new long[]{0x87FF7E0000C84260L});
	public static final BitSet FOLLOW_statement_in_caseStatement506 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_forStatement540 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_forStatement542 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_forStatement546 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_forStatement548 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_forStatement552 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_forStatement554 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_forStatement558 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_forStatement560 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_forStatement562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_whileStatement585 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_whileStatement587 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_whileStatement589 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_whileStatement591 = new BitSet(new long[]{0x87FF5A0000C84260L});
	public static final BitSet FOLLOW_statement_in_whileStatement593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_returnStatement616 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expression_in_returnStatement618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine641 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine643 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine668 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_initialValue693 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_initialValue695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext725 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext727 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_variableDefineNext740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression763 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_expression765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr788 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr799 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr810 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_expr814 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr816 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr827 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_expr831 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr842 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext867 = new BitSet(new long[]{0x8000000000C84260L});
	public static final BitSet FOLLOW_expr_in_exprNext869 = new BitSet(new long[]{0x380001FFE7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_leftUnaryOperator921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_leftUnaryOperator948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_binaryOperator1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_binaryOperator1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_binaryOperator1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_binaryOperator1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_type1260 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_type1271 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_type1282 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_type1293 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_type1304 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_type1315 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type1326 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_typeNext_in_type1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_typeNext1343 = new BitSet(new long[]{0x0000000000000002L});
}
