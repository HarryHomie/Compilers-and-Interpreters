package console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import lexer.Lexer;
import token.Token;
import token.TokenType;


public class Console{
    static final String Prompt = ">>";

    public static void go(InputStream in, PrintStream out) {
       
        Scanner sc = new Scanner(in);
        while(true){
            out.print(Prompt);

            if(!sc.hasNextLine()){
                sc.close();
                return;
            }
            String line = sc.nextLine();
            
            Lexer lexer = new Lexer(line);

            Token tok;

            while((tok=lexer.getToken()).type != TokenType.EOF){
                out.println(tok);
            }       
        }
    }     
}


