package lexer;

import token.Token;
import token.TokenType;

public class Lexer {

    private String input;
    private boolean done = false;

    public Lexer(String input) {
        this.input = input;
    }

    public Token getToken() {

        if (!done) {
            done = true;
            return new Token(TokenType.WORD, input);
        }

        return new Token(TokenType.EOF, "");
    }
}