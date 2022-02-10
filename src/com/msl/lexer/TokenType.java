package com.msl.lexer;

public enum TokenType
{
    Program,
    None,

    Newline,
    Unsolved,
    EOF,

    Number,
    String,
    Function,
    Quote,

    Declare,
    Let,

    LeftParentess,
    RightParentess
}