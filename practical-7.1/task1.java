class FactIteration{
      public static int Factorial(int n){
          if(n==0 || n==1){
             return 1;
              }
         else if(n<0){
             return -1;
          }
         else{
              int f=1;
               for(int i=n;i>=1;i--){
                     f=f*i;
                   }
                 return f;
             }
         }
      public static void main(String args[]){
          int  n=5;
           int ans=Factorial(n);
           if(ans==-1){
             System.out.print("negative number factorial is not defined");
           }
           else{
             System.out.print("using Iteration factorial of "+n+" is "+ ans);
             }
    }
}     

class FactRecursion{
      public static int Factorial(int n){
          if(n==0 || n==1){
             return 1;
              }
         else if(n<0){
             return -1;
          }
         else{
              return n*Factorial(n-1);
             }
         }
      public static void main(String args[]){
          int  n=5;
           int ans=Factorial(n);
           if(ans==-1){
             System.out.print("negative number factorial is not defined");
           }
           else{
             System.out.print("using Recursion factorial of "+n+" is "+ ans);
             }

         }
}   
 

