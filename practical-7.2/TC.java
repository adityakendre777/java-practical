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

	  int ans=0;
	  long total_time=0;
	  FactIteration run=new FactIteration();
	   int[] setOfInt={2,5,9,12,7,4,11,10,6,8};
	for(int i=0;i<setOfInt.length;i++){
		int n=setOfInt[i];
		long st_time=System.nanoTime();
		ans=Factorial(n);
		long ed_time=System.nanoTime();
		 if(ans==-1){
             	System.out.print("negative number factorial is not defined");
          	 }
           	else{
            	 System.out.println(" factorial of "+n+" is "+ ans);
             	}
		total_time+=(ed_time-st_time);
	}
		System.out.println("total time "+total_time);
		long avg_time=total_time/setOfInt.length;
		System.out.println("average time "+avg_time);
          
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
          int ans=0;
	  long total_time=0;
	  FactIteration run=new FactIteration();
	   int[] setOfInt={2,5,9,12,7,4,11,10,6,8};
	for(int i=0;i<setOfInt.length;i++){
		int n=setOfInt[i];
		long st_time=System.nanoTime();
		ans=Factorial(n);
		long ed_time=System.nanoTime();
		 if(ans==-1){
             	System.out.print("negative number factorial is not defined");
          	 }
           	else{
            	 System.out.println(" factorial of "+n+" is "+ ans);
             	}
		total_time+=(ed_time-st_time);
	}
		System.out.println("total time "+total_time);
		long avg_time=total_time/setOfInt.length;
		System.out.println("average time "+avg_time);
         }
}   
 



class PE{
	
	
        public static void main(String[] args){
	PE run = new PE();
	long f1_time=0;
	long f2_time;
	int n=20;
	for(int i=1;i<=n;i++){
	    long st_time=System.currentTimeMillis();
        	run.f1();
	    long ed_time=System.currentTimeMillis();

		f1_time+=(ed_time-st_time);
	}
	double f1_avg=f1_time/n;
	System.out.print(f1_avg);


	}

	void f1(){
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
   		System.out.println("SGGSIE&T");
	}

	
}

class stringIterationA {

    public static int calCount(String s1, String s2) {
        int count = 0;
        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && s1.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        stringIterationA run = new stringIterationA();

        String[][] setOfString = {
            {"sggsietsggs", "sggs"},
            {"aaaaaa", "aa"},
            {"VaradPatilVarad", "Varad"},
            {"abcabcabc", "abc"},
            {"mississippi", "issi"},
            {"javajavaprogram", "java"},
            {"aaaaabaaaacaaa", "aaa"},
            {"computerengineer", "er"},
            {"collegeprojectjava", "ja"},
            {"developmentdeveloper", "dev"}
        };

        long total_time = 0;
	int ans=0;
        for (int i = 0; i < setOfString.length; i++) {

            String s1 = setOfString[i][0];
            String s2 = setOfString[i][1];

            long st_time = System.currentTimeMillis();
            ans=run.calCount(s1, s2);
	    System.out.println(ans);
            long ed_time = System.currentTimeMillis();

            total_time += (ed_time - st_time);

           }
	System.out.println("total time "+total_time);
        double avg_time = total_time / 10;
	System.out.print("avg time "+avg_time);
        
    }
}

class stringRecursionA {
       public static int calCount(String s1, String s2,int i){
            int j=0 , count=0 ;
            boolean match=false;
            if(i>s1.length()-s2.length()){
                 return 0;
              }
            while(j<s2.length() && s1.charAt(i+j)==s2.charAt(j)){
               match=true;
               j++;
               
              }
             if (j==s2.length()){
               count=1;
               }
          return count+calCount(s1,s2,i+1);
     }
        public static void main(String[] args) {
        stringRecursionA run=new stringRecursionA();
        
	String[][] setOfString = {
            {"sggsietsggs", "sggs"},
            {"aaaaaa", "aa"},
            {"VaradPatilVarad", "Varad"},
            {"abcabcabc", "abc"},
            {"mississippi", "issi"},
            {"javajavaprogram", "java"},
            {"aaaaabaaaacaaa", "aaa"},
            {"computerengineer", "er"},
            {"collegeprojectjava", "ja"},
            {"developmentdeveloper", "dev"}
        };
	int ans=0;
	long total_time=0;
	for(int i=0;i<setOfString.length;i++){
		String s1 = setOfString[i][0];
            	String s2 = setOfString[i][1];

		long st_time=System.currentTimeMillis();
		ans = calCount(s1,s2,0);
		System.out.println("count of "+(i+1)+" String is "+ans);
		long ed_time=System.currentTimeMillis();
		total_time+=(ed_time-st_time);
	}
	System.out.println("total time "+total_time);
	double avg_time=total_time/10;
	System.out.print("average time "+avg_time);
       }
}


class stringIterationB {
       public static int calCount(String s1, String s2){
            int j=0 , count=0 ;
           for(j=0;j<=s1.length()-s2.length();j++){
                if(s1.substring(j,j+s2.length()).equals(s2)){
                    count++;
                    }
              }
        return count;
     }
        public static void main(String[] args) {

  	 stringIterationB run=new stringIterationB();
        
	String[][] setOfString = {
            {"sggsietsggs", "sggs"},
            {"aaaaaa", "aa"},
            {"VaradPatilVarad", "Varad"},
            {"abcabcabc", "abc"},
            {"mississippi", "issi"},
            {"javajavaprogram", "java"},
            {"aaaaabaaaacaaa", "aaa"},
            {"computerengineer", "er"},
            {"collegeprojectjava", "ja"},
            {"developmentdeveloper", "dev"}
        };
	int ans=0;
	long total_time=0;
	for(int i=0;i<setOfString.length;i++){
		String s1 = setOfString[i][0];
            	String s2 = setOfString[i][1];

		long st_time=System.currentTimeMillis();
		ans = calCount(s1,s2);
		System.out.println("count of "+(i+1)+" String is "+ans);
		long ed_time=System.currentTimeMillis();
		total_time+=(ed_time-st_time);
	}
	System.out.println("total time "+total_time);
	double avg_time=total_time/10;
	System.out.print("average time "+avg_time);
     
        
    }
}


class stringRecursionB {
       public static int calCount(String s1, String s2,int i){
            int j=0 , count=0 , r=0;
           if(i>s1.length()-s2.length()){
              return 0;
        }
          if(s1.substring(i,i+s2.length()).equals(s2)){
                count++;
             }
         return count+calCount(s1,s2,i+1);
     }
        public static void main(String[] args) {

         stringRecursionB run=new stringRecursionB();
        
	String[][] setOfString = {
            {"sggsietsggs", "sggs"},
            {"aaaaaa", "aa"},
            {"VaradPatilVarad", "Varad"},
            {"abcabcabc", "abc"},
            {"mississippi", "issi"},
            {"javajavaprogram", "java"},
            {"aaaaabaaaacaaa", "aaa"},
            {"computerengineer", "er"},
            {"collegeprojectjava", "ja"},
            {"developmentdeveloper", "dev"}
        };
	int ans=0;
	long total_time=0;
	for(int i=0;i<setOfString.length;i++){
		String s1 = setOfString[i][0];
            	String s2 = setOfString[i][1];

		long st_time=System.currentTimeMillis();
		ans = calCount(s1,s2,0);
		System.out.println("count of "+(i+1)+" String is "+ans);
		long ed_time=System.currentTimeMillis();
		total_time+=(ed_time-st_time);
	}
	System.out.println("total time "+total_time);
	double avg_time=total_time/10;
	System.out.print("average time "+avg_time);

    }
}

