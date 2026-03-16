class UtsavString
{
    public static void main(String[] args)
    {
        long start=System.nanoTime();
        String Utsav="U";
        for (int i=1;i<=2026;i++) 
        {
            Utsav+="_"+i;
        }
        System.out.println(Utsav);
        long end=System.nanoTime();
        long executionTime=end-start;
        System.out.println("Execution time: "+executionTime+" nanoseconds");
    }
}
class UtsavStringBuilder
{
    public static void main(String[] args) 
    {
        long start=System.nanoTime();
        StringBuilder Utsav=new StringBuilder("U");
        for(int i=1;i<=2026;i++) 
        {
            Utsav.append("_").append(i);
        }
        System.out.println(Utsav.toString());
        long end=System.nanoTime();
        long executionTime=end-start;
        System.out.println("Execution time: "+executionTime+" nanoseconds");
    }
}
class UtsavStringBuffer
{
      public static void main(String[] args) 
      {
        long start=System.nanoTime();
        StringBuffer Utsav=new StringBuffer("U");
        for(int i=1;i<=2026;i++) 
        {
            Utsav.append("_").append(i);
        }
        System.out.println(Utsav.toString());
        long end=System.nanoTime();
        long executionTime=end-start;
        System.out.println("Execution time: "+executionTime+" nanoseconds");
    }
}