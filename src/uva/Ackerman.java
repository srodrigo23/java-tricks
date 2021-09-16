public class Ackerman
{
    
    public Ackerman()
    {       

    }
    
    public int ackerman(int m, int n) {
        int r;
        if(m == 0)
           r = n + 1;
        else {
           if (n == 0)
              r = ackerman(m-1, 1);
           else
              r = ackerman(m-1, ackerman(m, n-1));
       }
       return r;
    }

}
