import java.io.*;
public class CmdLineArgsV3 extends Object {
    public static void main(String args[]) {
        CmdLineArgsV3 obj = new CmdLineArgsV3();
        if(args.length!=2){
        System.out.println("Invalid number of arguments \n You need to pass two integers");
        }
        else{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of"+x+"and"+y+"is"+z);
        }
    }
}
