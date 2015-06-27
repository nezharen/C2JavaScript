// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 16:36:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C2JavaScriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", 
		"'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "';'", 
		"'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", 
		"'>>='", "'^'", "'^='", "'char'", "'double'", "'else'", "'float'", "'if'", 
		"'int'", "'long'", "'short'", "'void'", "'{'", "'|'", "'|='", "'||'", 
		"'}'", "'~'"
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
			match(input,49,FOLLOW_49_in_functionDefine44); 
			pushFollow(FOLLOW_statement_in_functionDefine46);
			statement4=statement();
			state._fsp--;

			match(input,53,FOLLOW_53_in_functionDefine48); 

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


		Token ID6=null;
		String type5 =null;
		String functionArgumentNext7 =null;


			code = null;

		try {
			// src/C2JavaScript.g:24:2: ( type ID functionArgumentNext |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= 40 && LA1_0 <= 41)||LA1_0==43||(LA1_0 >= 45 && LA1_0 <= 48)) ) {
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
					type5=type();
					state._fsp--;

					ID6=(Token)match(input,ID,FOLLOW_ID_in_functionArgument73); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgument75);
					functionArgumentNext7=functionArgumentNext();
					state._fsp--;


								code = type5 + " " + (ID6!=null?ID6.getText():null) + functionArgumentNext7;
							
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


		Token ID9=null;
		String a =null;
		String type8 =null;


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
					type8=type();
					state._fsp--;

					ID9=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentNext109); 
					pushFollow(FOLLOW_functionArgumentNext_in_functionArgumentNext113);
					a=functionArgumentNext();
					state._fsp--;


								code = ", " + type8 + " " + (ID9!=null?ID9.getText():null) + a;
							
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


		Token ID10=null;
		String functionCallArgument11 =null;


			code = null;

		try {
			// src/C2JavaScript.g:52:2: ( ID '(' functionCallArgument ')' )
			// src/C2JavaScript.g:52:4: ID '(' functionCallArgument ')'
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_functionCall143); 
			match(input,14,FOLLOW_14_in_functionCall145); 
			pushFollow(FOLLOW_functionCallArgument_in_functionCall147);
			functionCallArgument11=functionCallArgument();
			state._fsp--;

			match(input,15,FOLLOW_15_in_functionCall149); 

						code = (ID10!=null?ID10.getText():null) + "(" + functionCallArgument11 + ")";
					
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


		String expr12 =null;
		String functionCallArgumentNext13 =null;


			code = null;

		try {
			// src/C2JavaScript.g:62:2: ( expr functionCallArgumentNext |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= ID && LA3_0 <= INT)||LA3_0==9||LA3_0==14||LA3_0==19||(LA3_0 >= 22 && LA3_0 <= 23)||LA3_0==54) ) {
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
					expr12=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgument174);
					functionCallArgumentNext13=functionCallArgumentNext();
					state._fsp--;


								code = expr12 + functionCallArgumentNext13;
							
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
		String expr14 =null;


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
					expr14=expr();
					state._fsp--;

					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210);
					a=functionCallArgumentNext();
					state._fsp--;


								code = ", " + expr14 + a;
							
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
	// src/C2JavaScript.g:86:1: statement returns [String code] : ( variableDefine a= statement | expression b= statement | ifStatement c= statement | '{' d= statement '}' |);
	public final String statement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String d =null;
		String variableDefine15 =null;
		String expression16 =null;
		String ifStatement17 =null;


			code = null;

		try {
			// src/C2JavaScript.g:90:2: ( variableDefine a= statement | expression b= statement | ifStatement c= statement | '{' d= statement '}' |)
			int alt5=5;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt5=1;
				}
				break;
			case 40:
				{
				alt5=1;
				}
				break;
			case 47:
				{
				alt5=1;
				}
				break;
			case 45:
				{
				alt5=1;
				}
				break;
			case 46:
				{
				alt5=1;
				}
				break;
			case 43:
				{
				alt5=1;
				}
				break;
			case 41:
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
			case 54:
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
			case 44:
				{
				alt5=3;
				}
				break;
			case 49:
				{
				alt5=4;
				}
				break;
			case 42:
			case 53:
				{
				alt5=5;
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
					variableDefine15=variableDefine();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement244);
					a=statement();
					state._fsp--;


								code = variableDefine15 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:94:4: expression b= statement
					{
					pushFollow(FOLLOW_expression_in_statement253);
					expression16=expression();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement257);
					b=statement();
					state._fsp--;


								code = expression16 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:98:4: ifStatement c= statement
					{
					pushFollow(FOLLOW_ifStatement_in_statement266);
					ifStatement17=ifStatement();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement270);
					c=statement();
					state._fsp--;


								code = ifStatement17 + c;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:102:4: '{' d= statement '}'
					{
					match(input,49,FOLLOW_49_in_statement279); 
					pushFollow(FOLLOW_statement_in_statement283);
					d=statement();
					state._fsp--;

					match(input,53,FOLLOW_53_in_statement285); 

								code = "{\n" + d + "}\n";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:107:3: 
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
	// src/C2JavaScript.g:112:1: ifStatement returns [String code] : 'if' '(' expr ')' statement ifStatementNext ;
	public final String ifStatement() throws RecognitionException {
		String code = null;


		String expr18 =null;
		String statement19 =null;
		String ifStatementNext20 =null;


			code = null;

		try {
			// src/C2JavaScript.g:116:2: ( 'if' '(' expr ')' statement ifStatementNext )
			// src/C2JavaScript.g:116:4: 'if' '(' expr ')' statement ifStatementNext
			{
			match(input,44,FOLLOW_44_in_ifStatement315); 
			match(input,14,FOLLOW_14_in_ifStatement317); 
			pushFollow(FOLLOW_expr_in_ifStatement319);
			expr18=expr();
			state._fsp--;

			match(input,15,FOLLOW_15_in_ifStatement321); 
			pushFollow(FOLLOW_statement_in_ifStatement323);
			statement19=statement();
			state._fsp--;

			pushFollow(FOLLOW_ifStatementNext_in_ifStatement325);
			ifStatementNext20=ifStatementNext();
			state._fsp--;


						code = "if (" + expr18 + ")\n" + statement19 + ifStatementNext20;
					
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
	// src/C2JavaScript.g:122:1: ifStatementNext returns [String code] : ( 'else' statement |);
	public final String ifStatementNext() throws RecognitionException {
		String code = null;


		String statement21 =null;


			code = null;

		try {
			// src/C2JavaScript.g:126:2: ( 'else' statement |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==42) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= ID && LA6_0 <= INT)||LA6_0==9||LA6_0==14||LA6_0==19||(LA6_0 >= 22 && LA6_0 <= 23)||(LA6_0 >= 40 && LA6_0 <= 41)||(LA6_0 >= 43 && LA6_0 <= 49)||(LA6_0 >= 53 && LA6_0 <= 54)) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:126:4: 'else' statement
					{
					match(input,42,FOLLOW_42_in_ifStatementNext348); 
					pushFollow(FOLLOW_statement_in_ifStatementNext350);
					statement21=statement();
					state._fsp--;


								code = "else\n" + statement21;
							
					}
					break;
				case 2 :
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
	// $ANTLR end "ifStatementNext"



	// $ANTLR start "variableDefine"
	// src/C2JavaScript.g:136:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type22 =null;
		String singleVariableDefine23 =null;
		String variableDefineNext24 =null;


			code = null;

		try {
			// src/C2JavaScript.g:140:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:140:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine380);
			type22=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine382);
			singleVariableDefine23=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine384);
			variableDefineNext24=variableDefineNext();
			state._fsp--;


						code = type22 + " " + singleVariableDefine23 + variableDefineNext24;
					
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
	// src/C2JavaScript.g:146:1: singleVariableDefine returns [String code] : ID initialValue ;
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID25=null;
		String initialValue26 =null;


			code = null;

		try {
			// src/C2JavaScript.g:150:2: ( ID initialValue )
			// src/C2JavaScript.g:150:4: ID initialValue
			{
			ID25=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine407); 
			pushFollow(FOLLOW_initialValue_in_singleVariableDefine409);
			initialValue26=initialValue();
			state._fsp--;


						code = (ID25!=null?ID25.getText():null) + initialValue26;
					
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
	// src/C2JavaScript.g:156:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr27 =null;


			code = null;

		try {
			// src/C2JavaScript.g:160:2: ( '=' expr |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==32) ) {
				alt7=1;
			}
			else if ( (LA7_0==21||LA7_0==27) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:160:4: '=' expr
					{
					match(input,32,FOLLOW_32_in_initialValue432); 
					pushFollow(FOLLOW_expr_in_initialValue434);
					expr27=expr();
					state._fsp--;


								code = " = " + expr27;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:165:3: 
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
	// src/C2JavaScript.g:170:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine28 =null;


			code = null;

		try {
			// src/C2JavaScript.g:174:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==21) ) {
				alt8=1;
			}
			else if ( (LA8_0==27) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src/C2JavaScript.g:174:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext464); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext466);
					singleVariableDefine28=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext470);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine28 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:178:4: ';'
					{
					match(input,27,FOLLOW_27_in_variableDefineNext479); 

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
	// src/C2JavaScript.g:184:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr29 =null;


			code = null;

		try {
			// src/C2JavaScript.g:188:2: ( expr ';' )
			// src/C2JavaScript.g:188:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression502);
			expr29=expr();
			state._fsp--;

			match(input,27,FOLLOW_27_in_expression504); 

						code = expr29 + ";\n";
					
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
	// src/C2JavaScript.g:194:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID30=null;
		Token INT32=null;
		String a =null;
		String b =null;
		String exprNext31 =null;
		String exprNext33 =null;
		String exprNext34 =null;
		String leftUnaryOperator35 =null;
		String exprNext36 =null;
		String functionCall37 =null;
		String exprNext38 =null;


			code = null;

		try {
			// src/C2JavaScript.g:198:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext )
			int alt9=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==14) ) {
					alt9=5;
				}
				else if ( ((LA9_1 >= 10 && LA9_1 <= 13)||(LA9_1 >= 15 && LA9_1 <= 39)||(LA9_1 >= 50 && LA9_1 <= 52)) ) {
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
				break;
			case INT:
				{
				alt9=2;
				}
				break;
			case 14:
				{
				alt9=3;
				}
				break;
			case 9:
			case 19:
			case 22:
			case 23:
			case 54:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src/C2JavaScript.g:198:4: ID exprNext
					{
					ID30=(Token)match(input,ID,FOLLOW_ID_in_expr527); 
					pushFollow(FOLLOW_exprNext_in_expr529);
					exprNext31=exprNext();
					state._fsp--;


								code = (ID30!=null?ID30.getText():null) + exprNext31;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:202:4: INT exprNext
					{
					INT32=(Token)match(input,INT,FOLLOW_INT_in_expr538); 
					pushFollow(FOLLOW_exprNext_in_expr540);
					exprNext33=exprNext();
					state._fsp--;


								code = (INT32!=null?INT32.getText():null) + exprNext33;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:206:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr549); 
					pushFollow(FOLLOW_expr_in_expr553);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr555); 
					pushFollow(FOLLOW_exprNext_in_expr557);
					exprNext34=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext34;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:210:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr566);
					leftUnaryOperator35=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr570);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr572);
					exprNext36=exprNext();
					state._fsp--;


								code = leftUnaryOperator35 + b + exprNext36;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:214:4: functionCall exprNext
					{
					pushFollow(FOLLOW_functionCall_in_expr581);
					functionCall37=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr583);
					exprNext38=exprNext();
					state._fsp--;


								code = functionCall37 + exprNext38;
							
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
	// src/C2JavaScript.g:220:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator39 =null;
		String expr40 =null;
		String rightUnaryOperator41 =null;


			code = null;

		try {
			// src/C2JavaScript.g:224:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt10=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt10=1;
				}
				break;
			case 22:
				{
				alt10=1;
				}
				break;
			case 16:
				{
				alt10=1;
				}
				break;
			case 25:
				{
				alt10=1;
				}
				break;
			case 34:
				{
				alt10=1;
				}
				break;
			case 35:
				{
				alt10=1;
				}
				break;
			case 28:
				{
				alt10=1;
				}
				break;
			case 31:
				{
				alt10=1;
				}
				break;
			case 33:
				{
				alt10=1;
				}
				break;
			case 10:
				{
				alt10=1;
				}
				break;
			case 11:
				{
				alt10=1;
				}
				break;
			case 52:
				{
				alt10=1;
				}
				break;
			case 12:
				{
				alt10=1;
				}
				break;
			case 50:
				{
				alt10=1;
				}
				break;
			case 38:
				{
				alt10=1;
				}
				break;
			case 29:
				{
				alt10=1;
				}
				break;
			case 36:
				{
				alt10=1;
				}
				break;
			case 32:
				{
				alt10=1;
				}
				break;
			case 20:
				{
				alt10=1;
				}
				break;
			case 24:
				{
				alt10=1;
				}
				break;
			case 17:
				{
				alt10=1;
				}
				break;
			case 26:
				{
				alt10=1;
				}
				break;
			case 13:
				{
				alt10=1;
				}
				break;
			case 51:
				{
				alt10=1;
				}
				break;
			case 39:
				{
				alt10=1;
				}
				break;
			case 30:
				{
				alt10=1;
				}
				break;
			case 37:
				{
				alt10=1;
				}
				break;
			case 19:
				{
				alt10=2;
				}
				break;
			case 23:
				{
				alt10=2;
				}
				break;
			case 15:
			case 21:
			case 27:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src/C2JavaScript.g:224:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext606);
					binaryOperator39=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext608);
					expr40=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext612);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator39 + " " + expr40 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:228:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext621);
					rightUnaryOperator41=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator41;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:233:3: 
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
	// src/C2JavaScript.g:238:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' | '-' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:242:2: ( '!' | '~' | '++' | '--' | '-' )
			int alt11=5;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt11=1;
				}
				break;
			case 54:
				{
				alt11=2;
				}
				break;
			case 19:
				{
				alt11=3;
				}
				break;
			case 23:
				{
				alt11=4;
				}
				break;
			case 22:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// src/C2JavaScript.g:242:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator651); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:246:4: '~'
					{
					match(input,54,FOLLOW_54_in_leftUnaryOperator660); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:250:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator669); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:254:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator678); 

								code = "--";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:258:4: '-'
					{
					match(input,22,FOLLOW_22_in_leftUnaryOperator687); 

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
	// src/C2JavaScript.g:264:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:268:2: ( '++' | '--' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==19) ) {
				alt12=1;
			}
			else if ( (LA12_0==23) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src/C2JavaScript.g:268:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator710); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:272:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator719); 

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
	// src/C2JavaScript.g:278:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:282:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt13=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt13=1;
				}
				break;
			case 22:
				{
				alt13=2;
				}
				break;
			case 16:
				{
				alt13=3;
				}
				break;
			case 25:
				{
				alt13=4;
				}
				break;
			case 34:
				{
				alt13=5;
				}
				break;
			case 35:
				{
				alt13=6;
				}
				break;
			case 28:
				{
				alt13=7;
				}
				break;
			case 31:
				{
				alt13=8;
				}
				break;
			case 33:
				{
				alt13=9;
				}
				break;
			case 10:
				{
				alt13=10;
				}
				break;
			case 11:
				{
				alt13=11;
				}
				break;
			case 52:
				{
				alt13=12;
				}
				break;
			case 12:
				{
				alt13=13;
				}
				break;
			case 50:
				{
				alt13=14;
				}
				break;
			case 38:
				{
				alt13=15;
				}
				break;
			case 29:
				{
				alt13=16;
				}
				break;
			case 36:
				{
				alt13=17;
				}
				break;
			case 32:
				{
				alt13=18;
				}
				break;
			case 20:
				{
				alt13=19;
				}
				break;
			case 24:
				{
				alt13=20;
				}
				break;
			case 17:
				{
				alt13=21;
				}
				break;
			case 26:
				{
				alt13=22;
				}
				break;
			case 13:
				{
				alt13=23;
				}
				break;
			case 51:
				{
				alt13=24;
				}
				break;
			case 39:
				{
				alt13=25;
				}
				break;
			case 30:
				{
				alt13=26;
				}
				break;
			case 37:
				{
				alt13=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src/C2JavaScript.g:282:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator742); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:286:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator751); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:290:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator760); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:294:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator769); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:298:4: '>'
					{
					match(input,34,FOLLOW_34_in_binaryOperator778); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:302:4: '>='
					{
					match(input,35,FOLLOW_35_in_binaryOperator787); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:306:4: '<'
					{
					match(input,28,FOLLOW_28_in_binaryOperator796); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:310:4: '<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator805); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:314:4: '=='
					{
					match(input,33,FOLLOW_33_in_binaryOperator814); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:318:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator823); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:322:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator832); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:326:4: '||'
					{
					match(input,52,FOLLOW_52_in_binaryOperator841); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:330:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator850); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:334:4: '|'
					{
					match(input,50,FOLLOW_50_in_binaryOperator859); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:338:4: '^'
					{
					match(input,38,FOLLOW_38_in_binaryOperator868); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:342:4: '<<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator877); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:346:4: '>>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator886); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:350:4: '='
					{
					match(input,32,FOLLOW_32_in_binaryOperator895); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:354:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator904); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:358:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator913); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:362:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator922); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:366:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator931); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:370:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator940); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:374:4: '|='
					{
					match(input,51,FOLLOW_51_in_binaryOperator949); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:378:4: '^='
					{
					match(input,39,FOLLOW_39_in_binaryOperator958); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:382:4: '<<='
					{
					match(input,30,FOLLOW_30_in_binaryOperator967); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:386:4: '>>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator976); 

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
	// src/C2JavaScript.g:392:1: type returns [String code] : ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:396:2: ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' )
			int alt14=7;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt14=1;
				}
				break;
			case 40:
				{
				alt14=2;
				}
				break;
			case 47:
				{
				alt14=3;
				}
				break;
			case 45:
				{
				alt14=4;
				}
				break;
			case 46:
				{
				alt14=5;
				}
				break;
			case 43:
				{
				alt14=6;
				}
				break;
			case 41:
				{
				alt14=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// src/C2JavaScript.g:396:4: 'void'
					{
					match(input,48,FOLLOW_48_in_type999); 

								code = "var";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:400:4: 'char'
					{
					match(input,40,FOLLOW_40_in_type1008); 

								code = "var";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:404:4: 'short'
					{
					match(input,47,FOLLOW_47_in_type1017); 

								code = "var";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:408:4: 'int'
					{
					match(input,45,FOLLOW_45_in_type1026); 

								code = "var";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:412:4: 'long'
					{
					match(input,46,FOLLOW_46_in_type1035); 

								code = "var";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:416:4: 'float'
					{
					match(input,43,FOLLOW_43_in_type1044); 

								code = "var";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:420:4: 'double'
					{
					match(input,41,FOLLOW_41_in_type1053); 

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



	public static final BitSet FOLLOW_functionDefine_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionDefine34 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionDefine36 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_functionDefine38 = new BitSet(new long[]{0x0001EB0000008000L});
	public static final BitSet FOLLOW_functionArgument_in_functionDefine40 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDefine42 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_functionDefine44 = new BitSet(new long[]{0x0063FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_functionDefine46 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_functionDefine48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionArgument71 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgument73 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgument75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionArgumentNext105 = new BitSet(new long[]{0x0001EB0000000000L});
	public static final BitSet FOLLOW_type_in_functionArgumentNext107 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgumentNext109 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgumentNext113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall143 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_functionCall145 = new BitSet(new long[]{0x0040000000C8C260L});
	public static final BitSet FOLLOW_functionCallArgument_in_functionCall147 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionCall149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_functionCallArgument172 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgument174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionCallArgumentNext204 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_functionCallArgumentNext206 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefine_in_statement240 = new BitSet(new long[]{0x0043FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement253 = new BitSet(new long[]{0x0043FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement266 = new BitSet(new long[]{0x0043FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_statement279 = new BitSet(new long[]{0x0063FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_statement283 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_statement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ifStatement315 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ifStatement317 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_ifStatement319 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ifStatement321 = new BitSet(new long[]{0x0043FF0000C84260L});
	public static final BitSet FOLLOW_statement_in_ifStatement323 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ifStatementNext_in_ifStatement325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ifStatementNext348 = new BitSet(new long[]{0x0043FB0000C84260L});
	public static final BitSet FOLLOW_statement_in_ifStatementNext350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine380 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine382 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine407 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_initialValue432 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_initialValue434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext464 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext466 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_variableDefineNext479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression502 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_expression504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr527 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr538 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr549 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_expr553 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr555 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr566 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_expr570 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr581 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext606 = new BitSet(new long[]{0x0040000000C84260L});
	public static final BitSet FOLLOW_expr_in_exprNext608 = new BitSet(new long[]{0x001C00FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_leftUnaryOperator660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_leftUnaryOperator687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_binaryOperator841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_binaryOperator859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_binaryOperator949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_type999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_type1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_type1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_type1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_type1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type1053 = new BitSet(new long[]{0x0000000000000002L});
}
