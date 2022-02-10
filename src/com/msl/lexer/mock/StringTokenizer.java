package com.msl.lexer.mock;

import com.msl.lexer.Lexer;
import com.msl.lexer.Token;
import com.msl.lexer.TokenType;

public class StringTokenizer implements Lexer
{
    private Token string;
    private boolean hasCreated;

    public StringTokenizer(String value)
    {
        this.string = new Token(TokenType.String, value, 0, value.length() - 1);
    }

    @Override
    public boolean next() {
        if (!hasCreated)
            return hasCreated = true;

        return false;
    }

    @Override
    public Token current() {
        return string;
    }
}
