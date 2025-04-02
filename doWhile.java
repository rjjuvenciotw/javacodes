public class UsoDoWhile
{
    public static void main(String args[])
    {
        int i = 0;
        
        do
        {
            if ( (i % 2) == 0)
            {
                System.out.println("Número " + i + " e' par !");
            }
            i = i + 1;
        }       
        while (i < 11);
    
    } 
}

