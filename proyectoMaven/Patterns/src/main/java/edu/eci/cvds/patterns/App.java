package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	String aux;
    	aux = "";
		if (args.length == 0){
			System.out.println( "Hello World!"  );
		}else{
			for (int i = 0; i < args.length; i ++) {
				aux = aux + " " + args[i] ;
			}
			System.out.println( "Hello " + aux  );
		}
    }
}
