import java.util.Scanner;
import java.util.StringTokenizer;

public class BTreeTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("BTree Test");
 
        /** make object of ExpressionTree **/
        BTree et = new BTree();
 
        System.out.println("\nEnter equation: ");
        
        
        String input = scan.next();
        
		char firstCharacter = input.charAt(0);

		
		switch (firstCharacter) {
		case '!': et.buildTreePre(input.substring(1));
		break;
		case '@': et.buildTreePost(input.substring(1));
		break;
		default: System.out.println("Neither ");
	}
        
        System.out.print("\nPrefix  : ");
        et.prefix();
        System.out.print("\n\nInfix   : ");
        et.infix();
        System.out.print("\n\nPostfix : ");
        et.postfix();
    }
}
