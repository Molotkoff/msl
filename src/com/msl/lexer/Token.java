package com.msl.lexer;

public class Token
{
    private TokenType type;
    private String source;

    private int fromIndex, toIndex;
    private String value;

    public Token(TokenType type, String source, int fromIndex, int toIndex)
    {
        this.type = type;
        this.source = source;

        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
    }

    public TokenType getType()
    {
        return type;
    }

    public String getValue()
    {
        if (value == null)
            value = source.substring(fromIndex, toIndex);

        return value;
    }
}