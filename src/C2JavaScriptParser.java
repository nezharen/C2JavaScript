// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 16:04:21

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
		"'>>='", "'^'", "'^='", "'char'", "'int'", "'long'", "'short'", "'void'", 
		"'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
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
			match(input,45,FOLLOW_45_in_functionDefine44); 
			pushFollow(FOLLOW_statement_in_functionDefine46);
			statement4=statement();
			state._fsp--;

			match(input,49,FOLLOW_49_in_functionDefine48); 

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
			if ( ((LA1_0 >= 40 && LA1_0 <= 44)) ) {
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
	// src/C2JavaScript.g:58:1: functionCallArgument returns [String code] : ( ID functionCallArgumentNext |);
	public final String functionCallArgument() throws RecognitionException {
		String code = null;


		Token ID12=null;
		String functionCallArgumentNext13 =null;


			code = null;

		try {
			// src/C2JavaScript.g:62:2: ( ID functionCallArgumentNext |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
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
					// src/C2JavaScript.g:62:4: ID functionCallArgumentNext
					{
					ID12=(Token)match(input,ID,FOLLOW_ID_in_functionCallArgument172); 
					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgument174);
					functionCallArgumentNext13=functionCallArgumentNext();
					state._fsp--;


								code = (ID12!=null?ID12.getText():null) + functionCallArgumentNext13;
							
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
	// src/C2JavaScript.g:72:1: functionCallArgumentNext returns [String code] : ( ',' ID a= functionCallArgumentNext |);
	public final String functionCallArgumentNext() throws RecognitionException {
		String code = null;


		Token ID14=null;
		String a =null;


			code = null;

		try {
			// src/C2JavaScript.g:76:2: ( ',' ID a= functionCallArgumentNext |)
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
					// src/C2JavaScript.g:76:4: ',' ID a= functionCallArgumentNext
					{
					match(input,21,FOLLOW_21_in_functionCallArgumentNext204); 
					ID14=(Token)match(input,ID,FOLLOW_ID_in_functionCallArgumentNext206); 
					pushFollow(FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210);
					a=functionCallArgumentNext();
					state._fsp--;


								code = ", " + (ID14!=null?ID14.getText():null) + a;
							
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
	// src/C2JavaScript.g:86:1: statement returns [String code] : ( variableDefine a= statement | expression b= statement | '{' c= statement '}' |);
	public final String statement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String variableDefine15 =null;
		String expression16 =null;


			code = null;

		try {
			// src/C2JavaScript.g:90:2: ( variableDefine a= statement | expression b= statement | '{' c= statement '}' |)
			int alt5=4;
			switch ( input.LA(1) ) {
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
				{
				alt5=1;
				}
				break;
			case ID:
			case INT:
			case 9:
			case 14:
			case 19:
			case 23:
			case 50:
				{
				alt5=2;
				}
				break;
			case 45:
				{
				alt5=3;
				}
				break;
			case 49:
				{
				alt5=4;
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
					// src/C2JavaScript.g:98:4: '{' c= statement '}'
					{
					match(input,45,FOLLOW_45_in_statement266); 
					pushFollow(FOLLOW_statement_in_statement270);
					c=statement();
					state._fsp--;

					match(input,49,FOLLOW_49_in_statement272); 

								code = "{\n" + c + "}\n";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:103:3: 
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



	// $ANTLR start "variableDefine"
	// src/C2JavaScript.g:108:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type17 =null;
		String singleVariableDefine18 =null;
		String variableDefineNext19 =null;


			code = null;

		try {
			// src/C2JavaScript.g:112:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:112:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine302);
			type17=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine304);
			singleVariableDefine18=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine306);
			variableDefineNext19=variableDefineNext();
			state._fsp--;


						code = type17 + " " + singleVariableDefine18 + variableDefineNext19;
					
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
	// src/C2JavaScript.g:118:1: singleVariableDefine returns [String code] : ID initialValue ;
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID20=null;
		String initialValue21 =null;


			code = null;

		try {
			// src/C2JavaScript.g:122:2: ( ID initialValue )
			// src/C2JavaScript.g:122:4: ID initialValue
			{
			ID20=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine329); 
			pushFollow(FOLLOW_initialValue_in_singleVariableDefine331);
			initialValue21=initialValue();
			state._fsp--;


						code = (ID20!=null?ID20.getText():null) + initialValue21;
					
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
	// src/C2JavaScript.g:128:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr22 =null;


			code = null;

		try {
			// src/C2JavaScript.g:132:2: ( '=' expr |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==32) ) {
				alt6=1;
			}
			else if ( (LA6_0==21||LA6_0==27) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:132:4: '=' expr
					{
					match(input,32,FOLLOW_32_in_initialValue354); 
					pushFollow(FOLLOW_expr_in_initialValue356);
					expr22=expr();
					state._fsp--;


								code = " = " + expr22;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:137:3: 
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
	// src/C2JavaScript.g:142:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine23 =null;


			code = null;

		try {
			// src/C2JavaScript.g:146:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==21) ) {
				alt7=1;
			}
			else if ( (LA7_0==27) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/C2JavaScript.g:146:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext386); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext388);
					singleVariableDefine23=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext392);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine23 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:150:4: ';'
					{
					match(input,27,FOLLOW_27_in_variableDefineNext401); 

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
	// src/C2JavaScript.g:156:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr24 =null;


			code = null;

		try {
			// src/C2JavaScript.g:160:2: ( expr ';' )
			// src/C2JavaScript.g:160:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression424);
			expr24=expr();
			state._fsp--;

			match(input,27,FOLLOW_27_in_expression426); 

						code = expr24 + ";\n";
					
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
	// src/C2JavaScript.g:166:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID25=null;
		Token INT27=null;
		String a =null;
		String b =null;
		String exprNext26 =null;
		String exprNext28 =null;
		String exprNext29 =null;
		String leftUnaryOperator30 =null;
		String exprNext31 =null;
		String functionCall32 =null;
		String exprNext33 =null;


			code = null;

		try {
			// src/C2JavaScript.g:170:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext | functionCall exprNext )
			int alt8=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==14) ) {
					alt8=5;
				}
				else if ( ((LA8_1 >= 10 && LA8_1 <= 13)||(LA8_1 >= 15 && LA8_1 <= 39)||(LA8_1 >= 46 && LA8_1 <= 48)) ) {
					alt8=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				alt8=2;
				}
				break;
			case 14:
				{
				alt8=3;
				}
				break;
			case 9:
			case 19:
			case 23:
			case 50:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// src/C2JavaScript.g:170:4: ID exprNext
					{
					ID25=(Token)match(input,ID,FOLLOW_ID_in_expr449); 
					pushFollow(FOLLOW_exprNext_in_expr451);
					exprNext26=exprNext();
					state._fsp--;


								code = (ID25!=null?ID25.getText():null) + exprNext26;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:174:4: INT exprNext
					{
					INT27=(Token)match(input,INT,FOLLOW_INT_in_expr460); 
					pushFollow(FOLLOW_exprNext_in_expr462);
					exprNext28=exprNext();
					state._fsp--;


								code = (INT27!=null?INT27.getText():null) + exprNext28;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:178:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr471); 
					pushFollow(FOLLOW_expr_in_expr475);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr477); 
					pushFollow(FOLLOW_exprNext_in_expr479);
					exprNext29=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext29;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:182:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr488);
					leftUnaryOperator30=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr492);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr494);
					exprNext31=exprNext();
					state._fsp--;


								code = leftUnaryOperator30 + b + exprNext31;
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:186:4: functionCall exprNext
					{
					pushFollow(FOLLOW_functionCall_in_expr503);
					functionCall32=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr505);
					exprNext33=exprNext();
					state._fsp--;


								code = functionCall32 + exprNext33;
							
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
	// src/C2JavaScript.g:192:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator34 =null;
		String expr35 =null;
		String rightUnaryOperator36 =null;


			code = null;

		try {
			// src/C2JavaScript.g:196:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt9=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt9=1;
				}
				break;
			case 22:
				{
				alt9=1;
				}
				break;
			case 16:
				{
				alt9=1;
				}
				break;
			case 25:
				{
				alt9=1;
				}
				break;
			case 34:
				{
				alt9=1;
				}
				break;
			case 35:
				{
				alt9=1;
				}
				break;
			case 28:
				{
				alt9=1;
				}
				break;
			case 31:
				{
				alt9=1;
				}
				break;
			case 33:
				{
				alt9=1;
				}
				break;
			case 10:
				{
				alt9=1;
				}
				break;
			case 11:
				{
				alt9=1;
				}
				break;
			case 48:
				{
				alt9=1;
				}
				break;
			case 12:
				{
				alt9=1;
				}
				break;
			case 46:
				{
				alt9=1;
				}
				break;
			case 38:
				{
				alt9=1;
				}
				break;
			case 29:
				{
				alt9=1;
				}
				break;
			case 36:
				{
				alt9=1;
				}
				break;
			case 32:
				{
				alt9=1;
				}
				break;
			case 20:
				{
				alt9=1;
				}
				break;
			case 24:
				{
				alt9=1;
				}
				break;
			case 17:
				{
				alt9=1;
				}
				break;
			case 26:
				{
				alt9=1;
				}
				break;
			case 13:
				{
				alt9=1;
				}
				break;
			case 47:
				{
				alt9=1;
				}
				break;
			case 39:
				{
				alt9=1;
				}
				break;
			case 30:
				{
				alt9=1;
				}
				break;
			case 37:
				{
				alt9=1;
				}
				break;
			case 19:
				{
				alt9=2;
				}
				break;
			case 23:
				{
				alt9=2;
				}
				break;
			case 15:
			case 21:
			case 27:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src/C2JavaScript.g:196:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext528);
					binaryOperator34=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext530);
					expr35=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext534);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator34 + " " + expr35 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:200:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext543);
					rightUnaryOperator36=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator36;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:205:3: 
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
	// src/C2JavaScript.g:210:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:214:2: ( '!' | '~' | '++' | '--' )
			int alt10=4;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt10=1;
				}
				break;
			case 50:
				{
				alt10=2;
				}
				break;
			case 19:
				{
				alt10=3;
				}
				break;
			case 23:
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
					// src/C2JavaScript.g:214:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator573); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:218:4: '~'
					{
					match(input,50,FOLLOW_50_in_leftUnaryOperator582); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:222:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator591); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:226:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator600); 

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
	// $ANTLR end "leftUnaryOperator"



	// $ANTLR start "rightUnaryOperator"
	// src/C2JavaScript.g:232:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:236:2: ( '++' | '--' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==19) ) {
				alt11=1;
			}
			else if ( (LA11_0==23) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src/C2JavaScript.g:236:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator623); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:240:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator632); 

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
	// src/C2JavaScript.g:246:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:250:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt12=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt12=1;
				}
				break;
			case 22:
				{
				alt12=2;
				}
				break;
			case 16:
				{
				alt12=3;
				}
				break;
			case 25:
				{
				alt12=4;
				}
				break;
			case 34:
				{
				alt12=5;
				}
				break;
			case 35:
				{
				alt12=6;
				}
				break;
			case 28:
				{
				alt12=7;
				}
				break;
			case 31:
				{
				alt12=8;
				}
				break;
			case 33:
				{
				alt12=9;
				}
				break;
			case 10:
				{
				alt12=10;
				}
				break;
			case 11:
				{
				alt12=11;
				}
				break;
			case 48:
				{
				alt12=12;
				}
				break;
			case 12:
				{
				alt12=13;
				}
				break;
			case 46:
				{
				alt12=14;
				}
				break;
			case 38:
				{
				alt12=15;
				}
				break;
			case 29:
				{
				alt12=16;
				}
				break;
			case 36:
				{
				alt12=17;
				}
				break;
			case 32:
				{
				alt12=18;
				}
				break;
			case 20:
				{
				alt12=19;
				}
				break;
			case 24:
				{
				alt12=20;
				}
				break;
			case 17:
				{
				alt12=21;
				}
				break;
			case 26:
				{
				alt12=22;
				}
				break;
			case 13:
				{
				alt12=23;
				}
				break;
			case 47:
				{
				alt12=24;
				}
				break;
			case 39:
				{
				alt12=25;
				}
				break;
			case 30:
				{
				alt12=26;
				}
				break;
			case 37:
				{
				alt12=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// src/C2JavaScript.g:250:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator655); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:254:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator664); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:258:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator673); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:262:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator682); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:266:4: '>'
					{
					match(input,34,FOLLOW_34_in_binaryOperator691); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:270:4: '>='
					{
					match(input,35,FOLLOW_35_in_binaryOperator700); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:274:4: '<'
					{
					match(input,28,FOLLOW_28_in_binaryOperator709); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:278:4: '<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator718); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:282:4: '=='
					{
					match(input,33,FOLLOW_33_in_binaryOperator727); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:286:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator736); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:290:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator745); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:294:4: '||'
					{
					match(input,48,FOLLOW_48_in_binaryOperator754); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:298:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator763); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:302:4: '|'
					{
					match(input,46,FOLLOW_46_in_binaryOperator772); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:306:4: '^'
					{
					match(input,38,FOLLOW_38_in_binaryOperator781); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:310:4: '<<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator790); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:314:4: '>>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator799); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:318:4: '='
					{
					match(input,32,FOLLOW_32_in_binaryOperator808); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:322:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator817); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:326:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator826); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:330:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator835); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:334:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator844); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:338:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator853); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:342:4: '|='
					{
					match(input,47,FOLLOW_47_in_binaryOperator862); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:346:4: '^='
					{
					match(input,39,FOLLOW_39_in_binaryOperator871); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:350:4: '<<='
					{
					match(input,30,FOLLOW_30_in_binaryOperator880); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:354:4: '>>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator889); 

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
	// src/C2JavaScript.g:360:1: type returns [String code] : ( 'void' | 'char' | 'short' | 'int' | 'long' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:364:2: ( 'void' | 'char' | 'short' | 'int' | 'long' )
			int alt13=5;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt13=1;
				}
				break;
			case 40:
				{
				alt13=2;
				}
				break;
			case 43:
				{
				alt13=3;
				}
				break;
			case 41:
				{
				alt13=4;
				}
				break;
			case 42:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src/C2JavaScript.g:364:4: 'void'
					{
					match(input,44,FOLLOW_44_in_type912); 

								code = "var";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:368:4: 'char'
					{
					match(input,40,FOLLOW_40_in_type921); 

								code = "var";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:372:4: 'short'
					{
					match(input,43,FOLLOW_43_in_type930); 

								code = "var";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:376:4: 'int'
					{
					match(input,41,FOLLOW_41_in_type939); 

								code = "var";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:380:4: 'long'
					{
					match(input,42,FOLLOW_42_in_type948); 

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
	public static final BitSet FOLLOW_14_in_functionDefine38 = new BitSet(new long[]{0x00001F0000008000L});
	public static final BitSet FOLLOW_functionArgument_in_functionDefine40 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDefine42 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_functionDefine44 = new BitSet(new long[]{0x00063F0000884260L});
	public static final BitSet FOLLOW_statement_in_functionDefine46 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_functionDefine48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionArgument71 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgument73 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgument75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionArgumentNext105 = new BitSet(new long[]{0x00001F0000000000L});
	public static final BitSet FOLLOW_type_in_functionArgumentNext107 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionArgumentNext109 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionArgumentNext_in_functionArgumentNext113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall143 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_functionCall145 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_functionCallArgument_in_functionCall147 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionCall149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_functionCallArgument172 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgument174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_functionCallArgumentNext204 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_functionCallArgumentNext206 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_functionCallArgumentNext_in_functionCallArgumentNext210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefine_in_statement240 = new BitSet(new long[]{0x00043F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement253 = new BitSet(new long[]{0x00043F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_statement266 = new BitSet(new long[]{0x00063F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement270 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine302 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine304 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine329 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_initialValue354 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_initialValue356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext386 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext388 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_variableDefineNext401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression424 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_expression426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr449 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr460 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr471 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_expr475 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr477 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr488 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_expr492 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr503 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext528 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_exprNext530 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_leftUnaryOperator582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_binaryOperator754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_binaryOperator772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_binaryOperator862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_type912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_type921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_type930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type948 = new BitSet(new long[]{0x0000000000000002L});
}
