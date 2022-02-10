package com.msl.lexer.mock;

import com.msl.lexer.Lexer;
import com.msl.lexer.Token;
import com.msl.lexer.TokenType;

public class QuoteTokenizer implements Lexer
{
    private Token quote;
    private boolean hasCreated;

    public QuoteTokenizer(String quote)
    {
        this.quote = new Token(TokenType.Quote, quote, 0, quote.length() - 1);
    }

    public QuoteTokenizer()
    {
        this("myQuote");
    }

    @Override
    public boolean next() {
        if (!hasCreated)
            return hasCreated = true;

        return false;
    }

    @Override
    public Token current() {
        return quote;
    }
}
