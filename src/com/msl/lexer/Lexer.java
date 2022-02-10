package com.msl.lexer;

public interface Lexer
{
    boolean next();
    Token current();
}