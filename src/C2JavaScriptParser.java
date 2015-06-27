// $ANTLR 3.5.1 src/C2JavaScript.g 2015-06-27 15:39:16

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



	// $ANTLR start "statement"
	// src/C2JavaScript.g:48:1: statement returns [String code] : ( variableDefine a= statement | expression b= statement | '{' c= statement '}' |);
	public final String statement() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String c =null;
		String variableDefine10 =null;
		String expression11 =null;


			code = null;

		try {
			// src/C2JavaScript.g:52:2: ( variableDefine a= statement | expression b= statement | '{' c= statement '}' |)
			int alt3=4;
			switch ( input.LA(1) ) {
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
				{
				alt3=1;
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
				alt3=2;
				}
				break;
			case 45:
				{
				alt3=3;
				}
				break;
			case 49:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/C2JavaScript.g:52:4: variableDefine a= statement
					{
					pushFollow(FOLLOW_variableDefine_in_statement143);
					variableDefine10=variableDefine();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement147);
					a=statement();
					state._fsp--;


								code = variableDefine10 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:56:4: expression b= statement
					{
					pushFollow(FOLLOW_expression_in_statement156);
					expression11=expression();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement160);
					b=statement();
					state._fsp--;


								code = expression11 + b;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:60:4: '{' c= statement '}'
					{
					match(input,45,FOLLOW_45_in_statement169); 
					pushFollow(FOLLOW_statement_in_statement173);
					c=statement();
					state._fsp--;

					match(input,49,FOLLOW_49_in_statement175); 

								code = "{\n" + c + "}\n";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:65:3: 
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
	// src/C2JavaScript.g:70:1: variableDefine returns [String code] : type singleVariableDefine variableDefineNext ;
	public final String variableDefine() throws RecognitionException {
		String code = null;


		String type12 =null;
		String singleVariableDefine13 =null;
		String variableDefineNext14 =null;


			code = null;

		try {
			// src/C2JavaScript.g:74:2: ( type singleVariableDefine variableDefineNext )
			// src/C2JavaScript.g:74:4: type singleVariableDefine variableDefineNext
			{
			pushFollow(FOLLOW_type_in_variableDefine205);
			type12=type();
			state._fsp--;

			pushFollow(FOLLOW_singleVariableDefine_in_variableDefine207);
			singleVariableDefine13=singleVariableDefine();
			state._fsp--;

			pushFollow(FOLLOW_variableDefineNext_in_variableDefine209);
			variableDefineNext14=variableDefineNext();
			state._fsp--;


						code = type12 + " " + singleVariableDefine13 + variableDefineNext14;
					
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
	// src/C2JavaScript.g:80:1: singleVariableDefine returns [String code] : ID initialValue ;
	public final String singleVariableDefine() throws RecognitionException {
		String code = null;


		Token ID15=null;
		String initialValue16 =null;


			code = null;

		try {
			// src/C2JavaScript.g:84:2: ( ID initialValue )
			// src/C2JavaScript.g:84:4: ID initialValue
			{
			ID15=(Token)match(input,ID,FOLLOW_ID_in_singleVariableDefine232); 
			pushFollow(FOLLOW_initialValue_in_singleVariableDefine234);
			initialValue16=initialValue();
			state._fsp--;


						code = (ID15!=null?ID15.getText():null) + initialValue16;
					
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
	// src/C2JavaScript.g:90:1: initialValue returns [String code] : ( '=' expr |);
	public final String initialValue() throws RecognitionException {
		String code = null;


		String expr17 =null;


			code = null;

		try {
			// src/C2JavaScript.g:94:2: ( '=' expr |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==32) ) {
				alt4=1;
			}
			else if ( (LA4_0==21||LA4_0==27) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/C2JavaScript.g:94:4: '=' expr
					{
					match(input,32,FOLLOW_32_in_initialValue257); 
					pushFollow(FOLLOW_expr_in_initialValue259);
					expr17=expr();
					state._fsp--;


								code = " = " + expr17;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:99:3: 
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
	// src/C2JavaScript.g:104:1: variableDefineNext returns [String code] : ( ',' singleVariableDefine a= variableDefineNext | ';' );
	public final String variableDefineNext() throws RecognitionException {
		String code = null;


		String a =null;
		String singleVariableDefine18 =null;


			code = null;

		try {
			// src/C2JavaScript.g:108:2: ( ',' singleVariableDefine a= variableDefineNext | ';' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==21) ) {
				alt5=1;
			}
			else if ( (LA5_0==27) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/C2JavaScript.g:108:4: ',' singleVariableDefine a= variableDefineNext
					{
					match(input,21,FOLLOW_21_in_variableDefineNext289); 
					pushFollow(FOLLOW_singleVariableDefine_in_variableDefineNext291);
					singleVariableDefine18=singleVariableDefine();
					state._fsp--;

					pushFollow(FOLLOW_variableDefineNext_in_variableDefineNext295);
					a=variableDefineNext();
					state._fsp--;


								code = ", " + singleVariableDefine18 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:112:4: ';'
					{
					match(input,27,FOLLOW_27_in_variableDefineNext304); 

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
	// src/C2JavaScript.g:118:1: expression returns [String code] : expr ';' ;
	public final String expression() throws RecognitionException {
		String code = null;


		String expr19 =null;


			code = null;

		try {
			// src/C2JavaScript.g:122:2: ( expr ';' )
			// src/C2JavaScript.g:122:4: expr ';'
			{
			pushFollow(FOLLOW_expr_in_expression327);
			expr19=expr();
			state._fsp--;

			match(input,27,FOLLOW_27_in_expression329); 

						code = expr19 + ";\n";
					
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
	// src/C2JavaScript.g:128:1: expr returns [String code] : ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext );
	public final String expr() throws RecognitionException {
		String code = null;


		Token ID20=null;
		Token INT22=null;
		String a =null;
		String b =null;
		String exprNext21 =null;
		String exprNext23 =null;
		String exprNext24 =null;
		String leftUnaryOperator25 =null;
		String exprNext26 =null;


			code = null;

		try {
			// src/C2JavaScript.g:132:2: ( ID exprNext | INT exprNext | '(' a= expr ')' exprNext | leftUnaryOperator b= expr exprNext )
			int alt6=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case INT:
				{
				alt6=2;
				}
				break;
			case 14:
				{
				alt6=3;
				}
				break;
			case 9:
			case 19:
			case 23:
			case 50:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src/C2JavaScript.g:132:4: ID exprNext
					{
					ID20=(Token)match(input,ID,FOLLOW_ID_in_expr352); 
					pushFollow(FOLLOW_exprNext_in_expr354);
					exprNext21=exprNext();
					state._fsp--;


								code = (ID20!=null?ID20.getText():null) + exprNext21;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:136:4: INT exprNext
					{
					INT22=(Token)match(input,INT,FOLLOW_INT_in_expr363); 
					pushFollow(FOLLOW_exprNext_in_expr365);
					exprNext23=exprNext();
					state._fsp--;


								code = (INT22!=null?INT22.getText():null) + exprNext23;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:140:4: '(' a= expr ')' exprNext
					{
					match(input,14,FOLLOW_14_in_expr374); 
					pushFollow(FOLLOW_expr_in_expr378);
					a=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_expr380); 
					pushFollow(FOLLOW_exprNext_in_expr382);
					exprNext24=exprNext();
					state._fsp--;


								code = "(" + a + ")" + exprNext24;
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:144:4: leftUnaryOperator b= expr exprNext
					{
					pushFollow(FOLLOW_leftUnaryOperator_in_expr391);
					leftUnaryOperator25=leftUnaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr395);
					b=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_expr397);
					exprNext26=exprNext();
					state._fsp--;


								code = leftUnaryOperator25 + b + exprNext26;
							
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
	// src/C2JavaScript.g:150:1: exprNext returns [String code] : ( binaryOperator expr a= exprNext | rightUnaryOperator |);
	public final String exprNext() throws RecognitionException {
		String code = null;


		String a =null;
		String binaryOperator27 =null;
		String expr28 =null;
		String rightUnaryOperator29 =null;


			code = null;

		try {
			// src/C2JavaScript.g:154:2: ( binaryOperator expr a= exprNext | rightUnaryOperator |)
			int alt7=3;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt7=1;
				}
				break;
			case 22:
				{
				alt7=1;
				}
				break;
			case 16:
				{
				alt7=1;
				}
				break;
			case 25:
				{
				alt7=1;
				}
				break;
			case 34:
				{
				alt7=1;
				}
				break;
			case 35:
				{
				alt7=1;
				}
				break;
			case 28:
				{
				alt7=1;
				}
				break;
			case 31:
				{
				alt7=1;
				}
				break;
			case 33:
				{
				alt7=1;
				}
				break;
			case 10:
				{
				alt7=1;
				}
				break;
			case 11:
				{
				alt7=1;
				}
				break;
			case 48:
				{
				alt7=1;
				}
				break;
			case 12:
				{
				alt7=1;
				}
				break;
			case 46:
				{
				alt7=1;
				}
				break;
			case 38:
				{
				alt7=1;
				}
				break;
			case 29:
				{
				alt7=1;
				}
				break;
			case 36:
				{
				alt7=1;
				}
				break;
			case 32:
				{
				alt7=1;
				}
				break;
			case 20:
				{
				alt7=1;
				}
				break;
			case 24:
				{
				alt7=1;
				}
				break;
			case 17:
				{
				alt7=1;
				}
				break;
			case 26:
				{
				alt7=1;
				}
				break;
			case 13:
				{
				alt7=1;
				}
				break;
			case 47:
				{
				alt7=1;
				}
				break;
			case 39:
				{
				alt7=1;
				}
				break;
			case 30:
				{
				alt7=1;
				}
				break;
			case 37:
				{
				alt7=1;
				}
				break;
			case 19:
				{
				alt7=2;
				}
				break;
			case 23:
				{
				alt7=2;
				}
				break;
			case 15:
			case 21:
			case 27:
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
					// src/C2JavaScript.g:154:4: binaryOperator expr a= exprNext
					{
					pushFollow(FOLLOW_binaryOperator_in_exprNext420);
					binaryOperator27=binaryOperator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_exprNext422);
					expr28=expr();
					state._fsp--;

					pushFollow(FOLLOW_exprNext_in_exprNext426);
					a=exprNext();
					state._fsp--;


								code = " " + binaryOperator27 + " " + expr28 + a;
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:158:4: rightUnaryOperator
					{
					pushFollow(FOLLOW_rightUnaryOperator_in_exprNext435);
					rightUnaryOperator29=rightUnaryOperator();
					state._fsp--;


								code = rightUnaryOperator29;
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:163:3: 
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
	// src/C2JavaScript.g:168:1: leftUnaryOperator returns [String code] : ( '!' | '~' | '++' | '--' );
	public final String leftUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:172:2: ( '!' | '~' | '++' | '--' )
			int alt8=4;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt8=1;
				}
				break;
			case 50:
				{
				alt8=2;
				}
				break;
			case 19:
				{
				alt8=3;
				}
				break;
			case 23:
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
					// src/C2JavaScript.g:172:4: '!'
					{
					match(input,9,FOLLOW_9_in_leftUnaryOperator465); 

								code = "!";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:176:4: '~'
					{
					match(input,50,FOLLOW_50_in_leftUnaryOperator474); 

								code = "~";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:180:4: '++'
					{
					match(input,19,FOLLOW_19_in_leftUnaryOperator483); 

								code = "++";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:184:4: '--'
					{
					match(input,23,FOLLOW_23_in_leftUnaryOperator492); 

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
	// src/C2JavaScript.g:190:1: rightUnaryOperator returns [String code] : ( '++' | '--' );
	public final String rightUnaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:194:2: ( '++' | '--' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==19) ) {
				alt9=1;
			}
			else if ( (LA9_0==23) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/C2JavaScript.g:194:4: '++'
					{
					match(input,19,FOLLOW_19_in_rightUnaryOperator515); 

								code = "++";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:198:4: '--'
					{
					match(input,23,FOLLOW_23_in_rightUnaryOperator524); 

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
	// src/C2JavaScript.g:204:1: binaryOperator returns [String code] : ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' );
	public final String binaryOperator() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:208:2: ( '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '<<' | '>>' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt10=27;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt10=1;
				}
				break;
			case 22:
				{
				alt10=2;
				}
				break;
			case 16:
				{
				alt10=3;
				}
				break;
			case 25:
				{
				alt10=4;
				}
				break;
			case 34:
				{
				alt10=5;
				}
				break;
			case 35:
				{
				alt10=6;
				}
				break;
			case 28:
				{
				alt10=7;
				}
				break;
			case 31:
				{
				alt10=8;
				}
				break;
			case 33:
				{
				alt10=9;
				}
				break;
			case 10:
				{
				alt10=10;
				}
				break;
			case 11:
				{
				alt10=11;
				}
				break;
			case 48:
				{
				alt10=12;
				}
				break;
			case 12:
				{
				alt10=13;
				}
				break;
			case 46:
				{
				alt10=14;
				}
				break;
			case 38:
				{
				alt10=15;
				}
				break;
			case 29:
				{
				alt10=16;
				}
				break;
			case 36:
				{
				alt10=17;
				}
				break;
			case 32:
				{
				alt10=18;
				}
				break;
			case 20:
				{
				alt10=19;
				}
				break;
			case 24:
				{
				alt10=20;
				}
				break;
			case 17:
				{
				alt10=21;
				}
				break;
			case 26:
				{
				alt10=22;
				}
				break;
			case 13:
				{
				alt10=23;
				}
				break;
			case 47:
				{
				alt10=24;
				}
				break;
			case 39:
				{
				alt10=25;
				}
				break;
			case 30:
				{
				alt10=26;
				}
				break;
			case 37:
				{
				alt10=27;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src/C2JavaScript.g:208:4: '+'
					{
					match(input,18,FOLLOW_18_in_binaryOperator547); 

								code = "+";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:212:4: '-'
					{
					match(input,22,FOLLOW_22_in_binaryOperator556); 

								code = "-";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:216:4: '*'
					{
					match(input,16,FOLLOW_16_in_binaryOperator565); 

								code = "*";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:220:4: '/'
					{
					match(input,25,FOLLOW_25_in_binaryOperator574); 

								code = "/";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:224:4: '>'
					{
					match(input,34,FOLLOW_34_in_binaryOperator583); 

								code = ">";
							
					}
					break;
				case 6 :
					// src/C2JavaScript.g:228:4: '>='
					{
					match(input,35,FOLLOW_35_in_binaryOperator592); 

								code = ">=";
							
					}
					break;
				case 7 :
					// src/C2JavaScript.g:232:4: '<'
					{
					match(input,28,FOLLOW_28_in_binaryOperator601); 

								code = "<";
							
					}
					break;
				case 8 :
					// src/C2JavaScript.g:236:4: '<='
					{
					match(input,31,FOLLOW_31_in_binaryOperator610); 

								code = "<=";
							
					}
					break;
				case 9 :
					// src/C2JavaScript.g:240:4: '=='
					{
					match(input,33,FOLLOW_33_in_binaryOperator619); 

								code = "==";
							
					}
					break;
				case 10 :
					// src/C2JavaScript.g:244:4: '!='
					{
					match(input,10,FOLLOW_10_in_binaryOperator628); 

								code = "!=";
							
					}
					break;
				case 11 :
					// src/C2JavaScript.g:248:4: '&&'
					{
					match(input,11,FOLLOW_11_in_binaryOperator637); 

								code = "&&";
							
					}
					break;
				case 12 :
					// src/C2JavaScript.g:252:4: '||'
					{
					match(input,48,FOLLOW_48_in_binaryOperator646); 

								code = "||";
							
					}
					break;
				case 13 :
					// src/C2JavaScript.g:256:4: '&'
					{
					match(input,12,FOLLOW_12_in_binaryOperator655); 

								code = "&";
							
					}
					break;
				case 14 :
					// src/C2JavaScript.g:260:4: '|'
					{
					match(input,46,FOLLOW_46_in_binaryOperator664); 

								code = "|";
							
					}
					break;
				case 15 :
					// src/C2JavaScript.g:264:4: '^'
					{
					match(input,38,FOLLOW_38_in_binaryOperator673); 

								code = "^";
							
					}
					break;
				case 16 :
					// src/C2JavaScript.g:268:4: '<<'
					{
					match(input,29,FOLLOW_29_in_binaryOperator682); 

								code = "<<";
							
					}
					break;
				case 17 :
					// src/C2JavaScript.g:272:4: '>>'
					{
					match(input,36,FOLLOW_36_in_binaryOperator691); 

								code = ">>";
							
					}
					break;
				case 18 :
					// src/C2JavaScript.g:276:4: '='
					{
					match(input,32,FOLLOW_32_in_binaryOperator700); 

								code = "=";
							
					}
					break;
				case 19 :
					// src/C2JavaScript.g:280:4: '+='
					{
					match(input,20,FOLLOW_20_in_binaryOperator709); 

								code = "+=";
							
					}
					break;
				case 20 :
					// src/C2JavaScript.g:284:4: '-='
					{
					match(input,24,FOLLOW_24_in_binaryOperator718); 

								code = "-=";
							
					}
					break;
				case 21 :
					// src/C2JavaScript.g:288:4: '*='
					{
					match(input,17,FOLLOW_17_in_binaryOperator727); 

								code = "*=";
							
					}
					break;
				case 22 :
					// src/C2JavaScript.g:292:4: '/='
					{
					match(input,26,FOLLOW_26_in_binaryOperator736); 

								code = "/=";
							
					}
					break;
				case 23 :
					// src/C2JavaScript.g:296:4: '&='
					{
					match(input,13,FOLLOW_13_in_binaryOperator745); 

								code = "&=";
							
					}
					break;
				case 24 :
					// src/C2JavaScript.g:300:4: '|='
					{
					match(input,47,FOLLOW_47_in_binaryOperator754); 

								code = "|=";
							
					}
					break;
				case 25 :
					// src/C2JavaScript.g:304:4: '^='
					{
					match(input,39,FOLLOW_39_in_binaryOperator763); 

								code = "^=";
							
					}
					break;
				case 26 :
					// src/C2JavaScript.g:308:4: '<<='
					{
					match(input,30,FOLLOW_30_in_binaryOperator772); 

								code = "<<=";
							
					}
					break;
				case 27 :
					// src/C2JavaScript.g:312:4: '>>='
					{
					match(input,37,FOLLOW_37_in_binaryOperator781); 

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
	// src/C2JavaScript.g:318:1: type returns [String code] : ( 'void' | 'char' | 'short' | 'int' | 'long' );
	public final String type() throws RecognitionException {
		String code = null;



			code = null;

		try {
			// src/C2JavaScript.g:322:2: ( 'void' | 'char' | 'short' | 'int' | 'long' )
			int alt11=5;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt11=1;
				}
				break;
			case 40:
				{
				alt11=2;
				}
				break;
			case 43:
				{
				alt11=3;
				}
				break;
			case 41:
				{
				alt11=4;
				}
				break;
			case 42:
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
					// src/C2JavaScript.g:322:4: 'void'
					{
					match(input,44,FOLLOW_44_in_type804); 

								code = "var";
							
					}
					break;
				case 2 :
					// src/C2JavaScript.g:326:4: 'char'
					{
					match(input,40,FOLLOW_40_in_type813); 

								code = "var";
							
					}
					break;
				case 3 :
					// src/C2JavaScript.g:330:4: 'short'
					{
					match(input,43,FOLLOW_43_in_type822); 

								code = "var";
							
					}
					break;
				case 4 :
					// src/C2JavaScript.g:334:4: 'int'
					{
					match(input,41,FOLLOW_41_in_type831); 

								code = "var";
							
					}
					break;
				case 5 :
					// src/C2JavaScript.g:338:4: 'long'
					{
					match(input,42,FOLLOW_42_in_type840); 

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
	public static final BitSet FOLLOW_variableDefine_in_statement143 = new BitSet(new long[]{0x00043F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement156 = new BitSet(new long[]{0x00043F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_statement169 = new BitSet(new long[]{0x00063F0000884260L});
	public static final BitSet FOLLOW_statement_in_statement173 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDefine205 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefine207 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefine209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_singleVariableDefine232 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_initialValue_in_singleVariableDefine234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_initialValue257 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_initialValue259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_variableDefineNext289 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_singleVariableDefine_in_variableDefineNext291 = new BitSet(new long[]{0x0000000008200000L});
	public static final BitSet FOLLOW_variableDefineNext_in_variableDefineNext295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_variableDefineNext304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression327 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_expression329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr352 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr363 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_expr374 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_expr380 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftUnaryOperator_in_expr391 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_expr395 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_expr397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_exprNext420 = new BitSet(new long[]{0x0004000000884260L});
	public static final BitSet FOLLOW_expr_in_exprNext422 = new BitSet(new long[]{0x0001C0FFF7DF3C00L});
	public static final BitSet FOLLOW_exprNext_in_exprNext426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightUnaryOperator_in_exprNext435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_leftUnaryOperator465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_leftUnaryOperator474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_leftUnaryOperator483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_leftUnaryOperator492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rightUnaryOperator515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rightUnaryOperator524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_binaryOperator547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_binaryOperator556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_binaryOperator565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_binaryOperator574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_binaryOperator583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_binaryOperator592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_binaryOperator601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_binaryOperator610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_binaryOperator619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_binaryOperator628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_binaryOperator637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_binaryOperator646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_binaryOperator655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_binaryOperator664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_binaryOperator673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_binaryOperator682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_binaryOperator691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_binaryOperator700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_binaryOperator709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_binaryOperator718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_binaryOperator727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_binaryOperator736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_binaryOperator745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_binaryOperator754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_binaryOperator763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_binaryOperator772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_binaryOperator781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_type804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_type813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_type822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_type831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type840 = new BitSet(new long[]{0x0000000000000002L});
}
