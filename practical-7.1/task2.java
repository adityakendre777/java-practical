class stringIterationA {

    public static int calCount(String s1, String s2) {
        int count = 0;
        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && s1.charAt(i+j) == s2.charAt(j)) {
                
                j++;
            }

            if (j == m) {
                count++;
            }
        }

        return count;
    } 

    
    public static void main(String[] args) {

        String s1 = "sggsietsggs";
        String s2 = "sggs";

        int ans = calCount(s1, s2);

        System.out.println("Iterative Count: " + ans);
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

        String s1 = "sggsietsggs";
        String s2 = "sggs";

        int ans = calCount(s1,s2,0);

        System.out.println("recursive Count: " + ans);
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

        String s1 = "sggsietsggs";
        String s2 = "sggs";

        int ans = calCount(s1,s2);

        System.out.println("iterative Count: " + ans);
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

        String s1 = "sggsietsggs";
        String s2 = "sggs";

        int ans = calCount(s1,s2,0);

        System.out.println("recursive Count: " + ans);
    }
}



          