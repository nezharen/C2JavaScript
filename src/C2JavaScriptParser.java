// $ANTLR 3.5.1 src\\C2JavaScript.g 2015-06-29 14:55:37

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
	@Override public String getGrammarFileName() { return "src\\C2JavaScript.g"; }


		ArrayList<String> variableName = new ArrayList();
		ArrayList<String> variableError = new ArrayList();
		int tabNum = 0;



	// $ANTLR start "program"
	// src\\C2JavaScript.g:9:1: program : programBlock ;
	public final void program() throws RecognitionException {
		String programBlock1 =null;

		try {
			// src\\C2JavaScript.g:10:2: ( programBlock )
			// src\\C2JavaScript.g:10:4: programBlock
			{
			pushFollow(FOLLOW_programBlock_in_program16);
			programBlock1=programBlock();
			state._fsp--;


						if (variableError.isEmpty())
							System.out.println(programBlock1);
						else
							for (String i : variableError)
								System.out.println("Cannot find variable: " + i);
					
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
	// src\\C2JavaScript.g:20:1: programBlock returns [String code] : ( functionDefine a= programBlock |);
	public final String programBlock() throws RecognitionException {
		String code = null;


		String a =null;
		String functionDefine2 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:24:2: ( functionDefine a= programBlock |)
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
					// src\\C2JavaScript.g:24:4: functionDefine a= programBlock
					{
					pushFollow(FOLLOW_functionDefine_in_programBlock39);
					functionDefine2=functionDefine();
					state._fsp--;

					pushFollow(FOLLOW_programBlock_in_programBlock43);
					a=programBlock();
					state._fsp--;


								code = functionDefine2 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:29:3: 
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
	// src\\C2JavaScript.g:34:1: functionDefine returns [String code] : type ID '(' functionArgument ')' '{' functionStatement '}' ;
	public final String functionDefine() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String functionArgument4 =null;
		String functionStatement5 =null;


			tabNum++;
			variableName.clear();
			code = null;

		try {
			// src\\C2JavaScript.g:40:2: ( type ID '(' functionArgument ')' '{' functionStatement '}' )
			// src\\C2JavaScript.g:40:4: type ID '(' functionArgument ')' '{' functionStatement '}'
			{
			pushFollow(FOLLOW_type_in_functionDefine73);
			type();
			state._fsp--;

			ID3=(Token)match(input,ID,FOLLOW_ID_in_functionDefine75); 
			match(input,15,FOLLOW_15_in_functionDefine77); 
			pushFollow(FOLLOW_functionArgument_in_functionDefine79);
			functionArgument4=functionArgument();
			state._fsp--;

			match(input,16,FOLLOW_16_in_functionDefine81); 
			match(input,61,FOLLOW_61_in_functionDefine83); 
			pushFollow(FOLLOW_functionStatement_in_functionDefine85);
			functionStatement5=functionStatement();
			state._fsp--;

			match(input,65,FOLLOW_65_in_functionDefine87); 

						code = "function " + (ID3!=null?ID3.getText():null) + "(" + functionArgument4 + ")\n" + "{\n" + functionStatement5 + "}\n\n";
						tabNum--;
					
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
	// src\\C2JavaScript.g:47:1: functionArgument returns [String code] : ( type ID functionArgumentNext |);
	public final String functionArgument() throws RecognitionException {
		String code = null;


		Token ID6=null;
		String functionArgumentNext7 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:51:2: ( type ID functionArgumentNext |)
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
					// src\\C2JavaScript.g:51:4: type ID functionArgumentNext
					{
					pushFollow(FOLLOW_type_in_functionArgument110);
					type();
					state._fsp--;

					ID6=(Token)match(input,ID,FOLLOW_ID_in_functionArgument112); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgument114);
					functionArgumentNext7=functionArgumentNext();
					state._fsp--;


								variableName.add((ID6!=null?ID6.getText():null));
								code = (ID6!=null?ID6.getText():null) + functionArgumentNext7;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:57:3: 
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
	// src\\C2JavaScript.g:62:1: functionArgumentNext returns [String code] : ( ',' type ID a= functionArgumentNext |);
	public final String functionArgumentNext() throws RecognitionException {
		String code = null;


		Token ID8=null;
		String a =null;


			code = null;

		try {
			// src\\C2JavaScript.g:66:2: ( ',' type ID a= functionArgumentNext |)
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
					// src\\C2JavaScript.g:66:4: ',' type ID a= functionArgumentNext
					{
					match(input,22,FOLLOW_22_in_functionArgumentNext144); 
					pushFollow(FOLLOW_type_in_functionArgumentNext146);
					type();
					state._fsp--;

					ID8=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentNext148); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgumentNext152);
					a=functionArgumentNext();
					state._fsp--;


								variableName.add((ID8!=null?ID8.getText():null));
								code = ", " + (ID8!=null?ID8.getText():null) + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:72:3: 
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
	// src\\C2JavaScript.g:77:1: functionCall returns [String code] : ID '(' functionCallArgument ')' ;
	public final String functionCall() throws RecognitionException {
		String code = null;


		Token ID9=null;
		String functionCallArgument10 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:81:2: ( ID '(' functionCallArgument ')' )
			// src\\C2JavaScript.g:81:4: ID '(' functionCallArgument ')'
			{
			ID9=(Token)match(input,ID,FOLLOW_ID_in_functionCall182); 
			match(input,15,FOLLOW_15_in_functionCall184); 
			pushFollow(FOLLOW_functionCallArgument_in_functionCall186);
			functionCallArgument10=functionCallArgument();
			state._fsp--;

			match(input,16,FOLLOW_16_in_functionCall188); 

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
	// src\\C2JavaScript.g:87:1: functionCallArgument returns [String code] : ( expr functionCallArgumentNext |);
	public final String functionCallArgument() throws RecognitionException {
		String code = null;


		String expr11 =null;
		String functionCallArgumentNext12 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:91:2: ( expr functionCallArgumentNext |)
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
					// src\\C2JavaScript.g:91:4: expr functionCallArgumentNext
					{
					pushFollow(FOLLOW_expr_in_functionCallArgument211);
					expr11=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgument213);
					functionCallArgumentNext12=functionCallArgumentNext();
					state._fsp--;


								code = expr11 + functionCallArgumentNext12;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:96:3: 
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
	// src\\C2JavaScript.g:101:1: functionCallArgumentNext returns [String code] : ( ',' expr a= functionCallArgumentNext |);
	public final String functionCallArgumentNext() throws RecognitionException {
		String code = null;


		String a =null;
		String expr13 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:105:2: ( ',' expr a= functionCallArgumentNext |)
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
					// src\\C2JavaScript.g:105:4: ',' expr a= functionCallArgumentNext
					{
					match(input,22,FOLLOW_22_in_functionCallArgumentNext243); 
					pushFollow(FOLLOW_expr_in_functionCallArgumentNext245);
					expr13=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext249);
					a=functionCallArgumentNext();
					state._fsp--;


								code = ", " + expr13 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:110:3: 
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
	// src\\C2JavaScript.g:115:1: functionStatement returns [String code] : ( variableDefine a= functionStatement | expression a= functionStatement | ifStatement a= functionStatement | switchStatement a= functionStatement | forStatement a= functionStatement | whileStatement a= functionStatement | returnStatement a= functionStatement | '{' a= functionStatement '}' | 'break;' | 'continue;' |);
	public final String functionStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String variableDefine14 =null;
		String expression15 =null;
		String ifStatement16 =null;
		String switchStatement17 =null;
		String forStatement18 =null;
		String whileStatement19 =null;
		String returnStatement20 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:119:2: ( variableDefine a= functionStatement | expression a= functionStatement | ifStatement a= functionStatement | switchStatement a= functionStatement | forStatement a= functionStatement | whileStatement a= functionStatement | returnStatement a= functionStatement | '{' a= functionStatement '}' | 'break;' | 'continue;' |)
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
					// src\\C2JavaScript.g:119:4: variableDefine a= functionStatement
					{
					pushFollow(FOLLOW_variableDefine_in_functionStatement279);
					variableDefine14=variableDefine();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement283);
					a=functionStatement();
					state._fsp--;


								code = variableDefine14 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:123:4: expression a= functionStatement
					{
					pushFollow(FOLLOW_expression_in_functionStatement292);
					expression15=expression();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement296);
					a=functionStatement();
					state._fsp--;


								code = expression15 + a;
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:127:4: ifStatement a= functionStatement
					{
					pushFollow(FOLLOW_ifStatement_in_functionStatement305);
					ifStatement16=ifStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement309);
					a=functionStatement();
					state._fsp--;


								code = ifStatement16 + a;
							
					}
					break;
				case 4 :
					// src\\C2JavaScript.g:131:4: switchStatement a= functionStatement
					{
					pushFollow(FOLLOW_switchStatement_in_functionStatement318);
					switchStatement17=switchStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement322);
					a=functionStatement();
					state._fsp--;


								code = switchStatement17 + a;
							
					}
					break;
				case 5 :
					// src\\C2JavaScript.g:135:4: forStatement a= functionStatement
					{
					pushFollow(FOLLOW_forStatement_in_functionStatement331);
					forStatement18=forStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement335);
					a=functionStatement();
					state._fsp--;


								code = forStatement18 + a;
							
					}
					break;
				case 6 :
					// src\\C2JavaScript.g:139:4: whileStatement a= functionStatement
					{
					pushFollow(FOLLOW_whileStatement_in_functionStatement344);
					whileStatement19=whileStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement348);
					a=functionStatement();
					state._fsp--;


								code = whileStatement19 + a;
							
					}
					break;
				case 7 :
					// src\\C2JavaScript.g:143:4: returnStatement a= functionStatement
					{
					pushFollow(FOLLOW_returnStatement_in_functionStatement357);
					returnStatement20=returnStatement();
					state._fsp--;

					pushFollow(FOLLOW_functionStatement_in_functionStatement361);
					a=functionStatement();
					state._fsp--;


								code = returnStatement20 + a;
							
					}
					break;
				case 8 :
					// src\\C2JavaScript.g:147:4: '{' a= functionStatement '}'
					{
					match(input,61,FOLLOW_61_in_functionStatement370); 
					pushFollow(FOLLOW_functionStatement_in_functionStatement374);
					a=functionStatement();
					state._fsp--;

					match(input,65,FOLLOW_65_in_functionStatement376); 

								code = "";
								for (int i = 0; i + 1 < tabNum; i++)
									code = code + "\t";
								code = code + "{\n" + a;
								for (int i = 0; i + 1 < tabNum; i++)
									code = code + "\t";
								code = code + "}\n";
							
					}
					break;
				case 9 :
					// src\\C2JavaScript.g:157:4: 'break;'
					{
					match(input,44,FOLLOW_44_in_functionStatement385); 

								code = "";
								for (int i = 0; i < tabNum; i++)
									code = code + "\t";
								code = code + "break;\n";
							
					}
					break;
				case 10 :
					// src\\C2JavaScript.g:164:4: 'continue;'
					{
					match(input,47,FOLLOW_47_in_functionStatement394); 

								code = "";
								for (int i = 0; i < tabNum; i++)
									code = code + "\t";
								code = code + "continue;\n";
							
					}
					break;
				case 11 :
					// src\\C2JavaScript.g:172:3: 
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
	// src\\C2JavaScript.g:177:1: ifStatement returns [String code] : 'if' '(' expr ')' functionStatement ifStatementNext ;
	public final String ifStatement() throws RecognitionException {
		String code = null;


		String expr21 =null;
		String functionStatement22 =null;
		String ifStatementNext23 =null;


			code = null;
			tabNum++;

		try {
			// src\\C2JavaScript.g:182:2: ( 'if' '(' expr ')' functionStatement ifStatementNext )
			// src\\C2JavaScript.g:182:4: 'if' '(' expr ')' functionStatement ifStatementNext
			{
			match(input,53,FOLLOW_53_in_ifStatement424); 
			match(input,15,FOLLOW_15_in_ifStatement426); 
			pushFollow(FOLLOW_expr_in_ifStatement428);
			expr21=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_ifStatement430); 
			pushFollow(FOLLOW_functionStatement_in_ifStatement432);
			functionStatement22=functionStatement();
			state._fsp--;

			pushFollow(FOLLOW_ifStatementNext_in_ifStatement434);
			ifStatementNext23=ifStatementNext();
			state._fsp--;


						tabNum--;
						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "if (" + expr21 + ")\n" + functionStatement22 + ifStatementNext23;
					
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
	// src\\C2JavaScript.g:192:1: ifStatementNext returns [String code] : ( 'else' functionStatement |);
	public final String ifStatementNext() throws RecognitionException {
		String code = null;


		String functionStatement24 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:196:2: ( 'else' functionStatement |)
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
					// src\\C2JavaScript.g:196:4: 'else' functionStatement
					{
					match(input,50,FOLLOW_50_in_ifStatementNext457); 
					pushFollow(FOLLOW_functionStatement_in_ifStatementNext459);
					functionStatement24=functionStatement();
					state._fsp--;


								tabNum--;
								code = "";
								for (int i = 0; i < tabNum; i++)
									code = code + "\t";
								code = code + "else\n" + functionStatement24;
								tabNum++;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:206:3: 
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
	// src\\C2JavaScript.g:211:1: switchStatement returns [String code] : 'switch' '(' expr ')' '{' caseStatement '}' ;
	public final String switchStatement() throws RecognitionException {
		String code = null;


		String expr25 =null;
		String caseStatement26 =null;


			code = null;
			tabNum++;

		try {
			// src\\C2JavaScript.g:216:2: ( 'switch' '(' expr ')' '{' caseStatement '}' )
			// src\\C2JavaScript.g:216:4: 'switch' '(' expr ')' '{' caseStatement '}'
			{
			match(input,58,FOLLOW_58_in_switchStatement489); 
			match(input,15,FOLLOW_15_in_switchStatement491); 
			pushFollow(FOLLOW_expr_in_switchStatement493);
			expr25=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_switchStatement495); 
			match(input,61,FOLLOW_61_in_switchStatement497); 
			pushFollow(FOLLOW_caseStatement_in_switchStatement499);
			caseStatement26=caseStatement();
			state._fsp--;

			match(input,65,FOLLOW_65_in_switchStatement501); 

						tabNum--;
						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "switch (" + expr25 + ")\n";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "{\n" + caseStatement26;
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "}\n";
					
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
	// src\\C2JavaScript.g:232:1: caseStatement returns [String code] : ( 'case' expr ':' functionStatement a= caseStatement | 'default:' functionStatement a= caseStatement |);
	public final String caseStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String expr27 =null;
		String functionStatement28 =null;
		String functionStatement29 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:236:2: ( 'case' expr ':' functionStatement a= caseStatement | 'default:' functionStatement a= caseStatement |)
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
					// src\\C2JavaScript.g:236:4: 'case' expr ':' functionStatement a= caseStatement
					{
					match(input,45,FOLLOW_45_in_caseStatement524); 
					pushFollow(FOLLOW_expr_in_caseStatement526);
					expr27=expr();
					state._fsp--;

					match(input,28,FOLLOW_28_in_caseStatement528); 
					pushFollow(FOLLOW_functionStatement_in_caseStatement530);
					functionStatement28=functionStatement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement534);
					a=caseStatement();
					state._fsp--;


								code = "";
								for (int i = 0; i + 1 < tabNum; i++)
									code = code + "\t";
								code = code + "case " + expr27 + ":\n" + functionStatement28 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:243:4: 'default:' functionStatement a= caseStatement
					{
					match(input,48,FOLLOW_48_in_caseStatement543); 
					pushFollow(FOLLOW_functionStatement_in_caseStatement545);
					functionStatement29=functionStatement();
					state._fsp--;

					pushFollow(FOLLOW_caseStatement_in_caseStatement549);
					a=caseStatement();
					state._fsp--;


								code = "";
								for (int i = 0; i + 1 < tabNum; i++)
									code = code + "\t";
								code = code + "default:\n" + functionStatement29 + a;
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:251:3: 
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
	// src\\C2JavaScript.g:256:1: forStatement returns [String code] : 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement ;
	public final String forStatement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String functionStatement30 =null;


			code = null;
			tabNum++;

		try {
			// src\\C2JavaScript.g:261:2: ( 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement )
			// src\\C2JavaScript.g:261:4: 'for' '(' a= expr ';' b= expr ';' c= expr ')' functionStatement
			{
			match(input,52,FOLLOW_52_in_forStatement579); 
			match(input,15,FOLLOW_15_in_forStatement581); 
			pushFollow(FOLLOW_expr_in_forStatement585);
			a=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_forStatement587); 
			pushFollow(FOLLOW_expr_in_forStatement591);
			b=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_forStatement593); 
			pushFollow(FOLLOW_expr_in_forStatement597);
			c=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_forStatement599); 
			pushFollow(FOLLOW_functionStatement_in_forStatement601);
			functionStatement30=functionStatement();
			state._fsp--;


						tabNum--;
						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "for (" + a + "; " + b + "; " + c + ")\n" + functionStatement30;
					
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
	// src\\C2JavaScript.g:271:1: whileStatement returns [String code] : 'while' '(' expr ')' functionStatement ;
	public final String whileStatement() throws RecognitionException {
		String code = null;


		String expr31 =null;
		String functionStatement32 =null;


			code = null;
			tabNum++;

		try {
			// src\\C2JavaScript.g:276:2: ( 'while' '(' expr ')' functionStatement )
			// src\\C2JavaScript.g:276:4: 'while' '(' expr ')' functionStatement
			{
			match(input,60,FOLLOW_60_in_whileStatement624); 
			match(input,15,FOLLOW_15_in_whileStatement626); 
			pushFollow(FOLLOW_expr_in_whileStatement628);
			expr31=expr();
			state._fsp--;

			match(input,16,FOLLOW_16_in_whileStatement630); 
			pushFollow(FOLLOW_functionStatement_in_whileStatement632);
			functionStatement32=functionStatement();
			state._fsp--;


						tabNum--;
						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "while (" + expr31 + ")\n"  + functionStatement32;
					
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
	// src\\C2JavaScript.g:286:1: returnStatement returns [String code] : 'return' expr ';' ;
	public final String returnStatement() throws RecognitionException {
		String code = null;


		String expr33 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:290:2: ( 'return' expr ';' )
			// src\\C2JavaScript.g:290:4: 'return' expr ';'
			{
			match(input,56,FOLLOW_56_in_returnStatement655); 
			pushFollow(FOLLOW_expr_in_returnStatement657);
			expr33=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_returnStatement659); 

						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + "return " + expr33 + ";\n";
					
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
	// src\\C2JavaScript.g:299:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type34 =null;
		String singleVariableDefine35 =null;
		String variableDefineNext36 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:303:2: ( type singleVariableDefine variableDefineNext )
			// src\\C2JavaScript.g:303:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine682);
			type34=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine684);
			singleVariableDefine35=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine686);
			variableDefineNext36=variableDefineNext();
			state._fsp--;


						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + type34 + " " + singleVariableDefine35 + variableDefineNext36;
					
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
	// src\\C2JavaScript.g:312:1: singleVariableDefine returns [String code] : ( ID initialValue | ID '[' NUM ']' );
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID37=null;
		Token ID39=null;
		Token NUM40=null;
		String initialValue38 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:316:2: ( ID initialValue | ID '[' NUM ']' )
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
					// src\\C2JavaScript.g:316:4: ID initialValue
					{
					ID37=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine709); 
					pushFollow(FOLLOW_initialValue_in_singleVariableDefine711);
					initialValue38=initialValue();
					state._fsp--;


								variableName.add((ID37!=null?ID37.getText():null));
								code = (ID37!=null?ID37.getText():null) + initialValue38;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:321:4: ID '[' NUM ']'
					{
					ID39=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine720); 
					match(input,40,FOLLOW_40_in_singleVariableDefine722); 
					NUM40=(Token)match(input,NUM,FOLLOW_NUM_in_singleVariableDefine724); 
					match(input,41,FOLLOW_41_in_singleVariableDefine726); 

								variableName.add((ID39!=null?ID39.getText():null));
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
	// src\\C2JavaScript.g:328:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr41 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:332:2: ( '=' expr |)
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
					// src\\C2JavaScript.g:332:4: '=' expr
					{
					match(input,34,FOLLOW_34_in_initialValue749); 
					pushFollow(FOLLOW_expr_in_initialValue751);
					expr41=expr();
					state._fsp--;


								code = " = " + expr41;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:337:3: 
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
	// src\\C2JavaScript.g:342:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine42 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:346:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
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
					// src\\C2JavaScript.g:346:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,22,FOLLOW_22_in_variableDefineNext781); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext783);
					singleVariableDefine42=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext787);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine42 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:350:4: ';'
					{
					match(input,29,FOLLOW_29_in_variableDefineNext796); 

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
	// src\\C2JavaScript.g:356:1: arrayCall returns [String code] : ID '[' expr ']' ;
	public final String arrayCall() throws RecognitionException {
		String code = null;


		Token ID43=null;
		String expr44 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:360:2: ( ID '[' expr ']' )
			// src\\C2JavaScript.g:360:4: ID '[' expr ']'
			{
			ID43=(Token)match(input,ID,FOLLOW_ID_in_arrayCall819); 
			match(input,40,FOLLOW_40_in_arrayCall821); 
			pushFollow(FOLLOW_expr_in_arrayCall823);
			expr44=expr();
			state._fsp--;

			match(input,41,FOLLOW_41_in_arrayCall825); 

						if (variableName.indexOf((ID43!=null?ID43.getText():null)) == -1)
							variableError.add((ID43!=null?ID43.getText():null));
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
	// src\\C2JavaScript.g:369:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr45 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:373:2: ( expr ';' )
			// src\\C2JavaScript.g:373:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression849);
			expr45=expr();
			state._fsp--;

			match(input,29,FOLLOW_29_in_expression851); 

						code = "";
						for (int i = 0; i < tabNum; i++)
							code = code + "\t";
						code = code + expr45 + ";\n";
					
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
	// src\\C2JavaScript.g:382:1: expr returns [String code] : ( ID exprNext | NUM exprNext | CHAR exprNext | '(' a= expr ')' exprNext | leftUnaryOperator a= expr exprNext | functionCall exprNext | arrayCall exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID46=null;
		Token NUM48=null;
		Token CHAR50=null;
		String a =null;
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
			// src\\C2JavaScript.g:386:2: ( ID exprNext | NUM exprNext | CHAR exprNext | '(' a= expr ')' exprNext | leftUnaryOperator a= expr exprNext | functionCall exprNext | arrayCall exprNext )
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
					// src\\C2JavaScript.g:386:4: ID exprNext
					{
					ID46=(Token)match(input,ID,FOLLOW_ID_in_expr874); 
					pushFollow(FOLLOW_exprNext_in_expr876);
					exprNext47=exprNext();
					state._fsp--;


								if (variableName.indexOf((ID46!=null?ID46.getText():null)) == -1)
									variableError.add((ID46!=null?ID46.getText():null));
								code = (ID46!=null?ID46.getText():null) + exprNext47;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:392:4: NUM exprNext
					{
					NUM48=(Token)match(input,NUM,FOLLOW_NUM_in_expr885); 
					pushFollow(FOLLOW_exprNext_in_expr887);
					exprNext49=exprNext();
					state._fsp--;


								code = (NUM48!=null?NUM48.getText():null) + exprNext49;
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:396:4: CHAR exprNext
					{
					CHAR50=(Token)match(input,CHAR,FOLLOW_CHAR_in_expr896); 
					pushFollow(FOLLOW_exprNext_in_expr898);
					exprNext51=exprNext();
					state._fsp--;


								code = (CHAR50!=null?CHAR50.getText():null) + exprNext51;
							
					}
					break;
				case 4 :
					// src\\C2JavaScript.g:400:4: '(' a= expr ')' exprNext
					{
					match(input,15,FOLLOW_15_in_expr907); 
					pushFollow(FOLLOW_expr_in_expr911);
					a=expr();
					state._fsp--;

					match(input,16,FOLLOW_16_in_expr913); 
					pushFollow(FOLLOW_exprNext_in_expr915);
					exprNext52=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext52;
							
					}
					break;
				case 5 :
					// src\\C2JavaScript.g:404:4: leftUnaryOperator a= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr924);
					leftUnaryOperator53=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr928);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr930);
					exprNext54=exprNext();
					state._fsp--;


								code = leftUnaryOperator53 + a + exprNext54;
							
					}
					break;
				case 6 :
					// src\\C2JavaScript.g:408:4: functionCall exprNext
					{
					pushFollow(FOLLOW_functionCall_in_expr939);
					functionCall55=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr941);
					exprNext56=exprNext();
					state._fsp--;


								code = functionCall55 + exprNext56;
							
					}
					break;
				case 7 :
					// src\\C2JavaScript.g:412:4: arrayCall exprNext
					{
					pushFollow(FOLLOW_arrayCall_in_expr950);
					arrayCall57=arrayCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr952);
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
	// src\\C2JavaScript.g:418:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator59 =null;
		String expr60 =null;
		String rightUnaryOperator61 =null;


			code = null;

		try {
			// src\\C2JavaScript.g:422:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
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
					// src\\C2JavaScript.g:422:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext975);
					binaryOperator59=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext977);
					expr60=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext981);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator59 + " " + expr60 + a;
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:426:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext990);
					rightUnaryOperator61=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator61;
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:431:3: 
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
	// src\\C2JavaScript.g:436:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' | '-' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src\\C2JavaScript.g:440:2: ( '!' | '~' | '++' | '--' | '-' )
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
					// src\\C2JavaScript.g:440:4: '!'
					{
					match(input,10,FOLLOW_10_in_leftUnaryOperator1020); 

								code = "!";
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:444:4: '~'
					{
					match(input,66,FOLLOW_66_in_leftUnaryOperator1029); 

								code = "~";
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:448:4: '++'
					{
					match(input,20,FOLLOW_20_in_leftUnaryOperator1038); 

								code = "++";
							
					}
					break;
				case 4 :
					// src\\C2JavaScript.g:452:4: '--'
					{
					match(input,24,FOLLOW_24_in_leftUnaryOperator1047); 

								code = "--";
							
					}
					break;
				case 5 :
					// src\\C2JavaScript.g:456:4: '-'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator1056); 

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
	// src\\C2JavaScript.g:462:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src\\C2JavaScript.g:466:2: ( '++' | '--' )
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
					// src\\C2JavaScript.g:466:4: '++'
					{
					match(input,20,FOLLOW_20_in_rightUnaryOperator1079); 

								code = "++";
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:470:4: '--'
					{
					match(input,24,FOLLOW_24_in_rightUnaryOperator1088); 

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
	// src\\C2JavaScript.g:476:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src\\C2JavaScript.g:480:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
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
					// src\\C2JavaScript.g:480:4: '+'
					{
					match(input,19,FOLLOW_19_in_binaryOperator1111); 

								code = "+";
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:484:4: '-'
					{
					match(input,23,FOLLOW_23_in_binaryOperator1120); 

								code = "-";
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:488:4: '*'
					{
					match(input,17,FOLLOW_17_in_binaryOperator1129); 

								code = "*";
							
					}
					break;
				case 4 :
					// src\\C2JavaScript.g:492:4: '/'
					{
					match(input,26,FOLLOW_26_in_binaryOperator1138); 

								code = "/";
							
					}
					break;
				case 5 :
					// src\\C2JavaScript.g:496:4: '>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator1147); 

								code = ">";
							
					}
					break;
				case 6 :
					// src\\C2JavaScript.g:500:4: '>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator1156); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src\\C2JavaScript.g:504:4: '<'
					{
					match(input,30,FOLLOW_30_in_binaryOperator1165); 

								code = "<";
							
					}
					break;
				case 8 :
					// src\\C2JavaScript.g:508:4: '<='
					{
					match(input,33,FOLLOW_33_in_binaryOperator1174); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src\\C2JavaScript.g:512:4: '=='
					{
					match(input,35,FOLLOW_35_in_binaryOperator1183); 

								code = "==";
							
					}
					break;
				case 10 :
					// src\\C2JavaScript.g:516:4: '!='
					{
					match(input,11,FOLLOW_11_in_binaryOperator1192); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src\\C2JavaScript.g:520:4: '&&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator1201); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src\\C2JavaScript.g:524:4: '||'
					{
					match(input,64,FOLLOW_64_in_binaryOperator1210); 

								code = "||";
							
					}
					break;
				case 13 :
					// src\\C2JavaScript.g:528:4: '&'
					{
					match(input,13,FOLLOW_13_in_binaryOperator1219); 

								code = "&";
							
					}
					break;
				case 14 :
					// src\\C2JavaScript.g:532:4: '|'
					{
					match(input,62,FOLLOW_62_in_binaryOperator1228); 

								code = "|";
							
					}
					break;
				case 15 :
					// src\\C2JavaScript.g:536:4: '^'
					{
					match(input,42,FOLLOW_42_in_binaryOperator1237); 

								code = "^";
							
					}
					break;
				case 16 :
					// src\\C2JavaScript.g:540:4: '<<'
					{
					match(input,31,FOLLOW_31_in_binaryOperator1246); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src\\C2JavaScript.g:544:4: '>>'
					{
					match(input,38,FOLLOW_38_in_binaryOperator1255); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src\\C2JavaScript.g:548:4: '='
					{
					match(input,34,FOLLOW_34_in_binaryOperator1264); 

								code = "=";
							
					}
					break;
				case 19 :
					// src\\C2JavaScript.g:552:4: '+='
					{
					match(input,21,FOLLOW_21_in_binaryOperator1273); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src\\C2JavaScript.g:556:4: '-='
					{
					match(input,25,FOLLOW_25_in_binaryOperator1282); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src\\C2JavaScript.g:560:4: '*='
					{
					match(input,18,FOLLOW_18_in_binaryOperator1291); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src\\C2JavaScript.g:564:4: '/='
					{
					match(input,27,FOLLOW_27_in_binaryOperator1300); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src\\C2JavaScript.g:568:4: '&='
					{
					match(input,14,FOLLOW_14_in_binaryOperator1309); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src\\C2JavaScript.g:572:4: '|='
					{
					match(input,63,FOLLOW_63_in_binaryOperator1318); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src\\C2JavaScript.g:576:4: '^='
					{
					match(input,43,FOLLOW_43_in_binaryOperator1327); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src\\C2JavaScript.g:580:4: '<<='
					{
					match(input,32,FOLLOW_32_in_binaryOperator1336); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src\\C2JavaScript.g:584:4: '>>='
					{
					match(input,39,FOLLOW_39_in_binaryOperator1345); 

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
	// src\\C2JavaScript.g:590:1: type returns [String code] : ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src\\C2JavaScript.g:594:2: ( 'void' typeNext | 'char' typeNext | 'short' typeNext | 'int' typeNext | 'long' typeNext | 'float' typeNext | 'double' typeNext )
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
					// src\\C2JavaScript.g:594:4: 'void' typeNext
					{
					match(input,59,FOLLOW_59_in_type1368); 
					pushFollow(FOLLOW_typeNext_in_type1370);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:598:4: 'char' typeNext
					{
					match(input,46,FOLLOW_46_in_type1379); 
					pushFollow(FOLLOW_typeNext_in_type1381);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 3 :
					// src\\C2JavaScript.g:602:4: 'short' typeNext
					{
					match(input,57,FOLLOW_57_in_type1390); 
					pushFollow(FOLLOW_typeNext_in_type1392);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 4 :
					// src\\C2JavaScript.g:606:4: 'int' typeNext
					{
					match(input,54,FOLLOW_54_in_type1401); 
					pushFollow(FOLLOW_typeNext_in_type1403);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 5 :
					// src\\C2JavaScript.g:610:4: 'long' typeNext
					{
					match(input,55,FOLLOW_55_in_type1412); 
					pushFollow(FOLLOW_typeNext_in_type1414);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 6 :
					// src\\C2JavaScript.g:614:4: 'float' typeNext
					{
					match(input,51,FOLLOW_51_in_type1423); 
					pushFollow(FOLLOW_typeNext_in_type1425);
					typeNext();
					state._fsp--;


								code = "var";
							
					}
					break;
				case 7 :
					// src\\C2JavaScript.g:618:4: 'double' typeNext
					{
					match(input,49,FOLLOW_49_in_type1434); 
					pushFollow(FOLLOW_typeNext_in_type1436);
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
	// src\\C2JavaScript.g:624:1: typeNext : ( '*' |);
	public final void typeNext() throws RecognitionException {
		try {
			// src\\C2JavaScript.g:625:2: ( '*' |)
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
					// src\\C2JavaScript.g:625:4: '*'
					{
					match(input,17,FOLLOW_17_in_typeNext1451); 
					}
					break;
				case 2 :
					// src\\C2JavaScript.g:627:2: 
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



	public static final BitSet FOLLOW_programBlock_in_program16 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefine_in_programBlock39 = new BitSet(new long[]{0x0ACA400000000000L});
	public static final BitSet FOLLOW_programBlock_in_programBlock43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionDefine73 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionDefine75 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDefine77 = new BitSet(new long[]{0x0ACA400000010000L});
	public static final BitSet FOLLOW_functionArgument_in_functionDefine79 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_functionDefine81 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_functionDefine83 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000006L});
	public static final BitSet FOLLOW_functionStatement_in_functionDefine85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_functionDefine87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionArgument110 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionArgument112 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgument114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_functionArgumentNext144 = new BitSet(new long[]{0x0ACA400000000000L});
	public static final BitSet FOLLOW_type_in_functionArgumentNext146 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_functionArgumentNext148 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgumentNext152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall182 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionCall184 = new BitSet(new long[]{0x0000000001918550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionCallArgument_in_functionCall186 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_functionCall188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_functionCallArgument211 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgument213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_functionCallArgumentNext243 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_functionCallArgumentNext245 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefine_in_functionStatement279 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_functionStatement292 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_functionStatement305 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchStatement_in_functionStatement318 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_functionStatement331 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_functionStatement344 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_functionStatement357 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_functionStatement370 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000006L});
	public static final BitSet FOLLOW_functionStatement_in_functionStatement374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_functionStatement376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_functionStatement385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_functionStatement394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ifStatement424 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ifStatement426 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_ifStatement428 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ifStatement430 = new BitSet(new long[]{0x3FFED00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_ifStatement432 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_ifStatementNext_in_ifStatement434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ifStatementNext457 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_ifStatementNext459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_switchStatement489 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_switchStatement491 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_switchStatement493 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_switchStatement495 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_switchStatement497 = new BitSet(new long[]{0x0001200000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_switchStatement499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_switchStatement501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_caseStatement524 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_caseStatement526 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_caseStatement528 = new BitSet(new long[]{0x3FFBF00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_caseStatement530 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_caseStatement543 = new BitSet(new long[]{0x3FFBF00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_caseStatement545 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_caseStatement_in_caseStatement549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_forStatement579 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_forStatement581 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement585 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forStatement587 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement591 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forStatement593 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_forStatement597 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_forStatement599 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_forStatement601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_whileStatement624 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_whileStatement626 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStatement628 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_whileStatement630 = new BitSet(new long[]{0x3FFAD00001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionStatement_in_whileStatement632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_returnStatement655 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_returnStatement657 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_returnStatement659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine682 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine684 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine709 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine720 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_singleVariableDefine722 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUM_in_singleVariableDefine724 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_singleVariableDefine726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_initialValue749 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_initialValue751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_variableDefineNext781 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext783 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_variableDefineNext796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arrayCall819 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_arrayCall821 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_arrayCall823 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_arrayCall825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression849 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_expression851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr874 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expr885 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_expr896 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr907 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr911 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expr913 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr924 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr928 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr939 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCall_in_expr950 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_expr952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext975 = new BitSet(new long[]{0x0000000001908550L,0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_exprNext977 = new BitSet(new long[]{0xC0000CFFCFBE7800L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprNext_in_exprNext981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_leftUnaryOperator1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_leftUnaryOperator1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_leftUnaryOperator1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_leftUnaryOperator1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rightUnaryOperator1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rightUnaryOperator1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_binaryOperator1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_binaryOperator1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_binaryOperator1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_binaryOperator1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_binaryOperator1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_binaryOperator1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_binaryOperator1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_binaryOperator1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_binaryOperator1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_binaryOperator1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_type1368 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type1379 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_type1390 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_type1401 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_type1412 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_type1423 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_type1434 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_typeNext_in_type1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_typeNext1451 = new BitSet(new long[]{0x0000000000000002L});
}
