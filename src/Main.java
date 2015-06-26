import org.antlr.runtime.*;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = new ANTLRFileStream(args[0]);
		C2JavaScriptLexer lex = new C2JavaScriptLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		C2JavaScriptParser parser = new C2JavaScriptParser(tokens);
		parser.program();
	}
}

