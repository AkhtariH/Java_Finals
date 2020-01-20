package com.company;

public class PriceException extends Exception
{
    public PriceException()
    {
        super("Price must be higher than 0!");
    }
}