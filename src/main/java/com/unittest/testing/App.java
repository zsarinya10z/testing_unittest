package com.unittest.testing;
import java.io.InputStream;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    
    {
    	Scanner input = new Scanner (System.in);
        System.out.println( " Input Celcius" );
        double celcius = input.nextDouble();
        Fahrengeit f = new Fahrengeit ();
        
        while (!f .isBound(celcius)) {
        	System.out.println("input Again !!!");
        	System.out.print("input Celcius !!!");  	
        }
        f.input(celcius);
        System.out.println("f.toString");
    }
    
}
    
