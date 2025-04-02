public class UsoWhile
{
    public static void main (String args[])
    {
        int i = 0;
        while (i < 500)
        {
            if ( (i % 2) != 0)
            {
                System.out.println("Número " + i + " e' impar!");
            }
            i = i + 1;
        }
    }
}
