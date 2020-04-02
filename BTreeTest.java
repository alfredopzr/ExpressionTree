import java.util.Scanner;

public class BTreeTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("BTree Test");
 
        /** make object of ExpressionTree **/
        BTree et = new BTree();
 
        System.out.println("\nEnter equation in prefix form");
        et.buildTree(scan.next());
 
        System.out.print("\nPrefix  : ");
        et.prefix();
        System.out.print("\n\nInfix   : ");
        et.infix();
        System.out.print("\n\nPostfix : ");
        et.postfix();
    }
}
