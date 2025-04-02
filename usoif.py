public class UsoIF
{
    public static void main (String args[])
    {
        int a = 10;
        int b = 20;
        int c = 300;

        if (c > b)
            a = c;
        else
            c = b;

        System.out.println("O maior valor = " + c);   
    }
}
