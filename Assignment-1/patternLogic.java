class Pattern1 {
       public static void main (String args[]){
           int size=6,ln=0,row=0;
         for(ln=0;ln<size;ln++){
            for(row=0;row<=2*size;row++){
                if(ln+row==size || row-ln==size){ 
                     System.out.print("*");
                    }
                else{
                     System.out.print(" ");
                   }
               } 
           System.out.print("\n");
        }
        for(ln=size-2;ln>=0;ln--){
           for(row=0;row<=2*size;row++){
               if(ln+row==size || row-ln==size){
                  System.out.print("*");
                }
               else{
                      System.out.print(" ");
                    }
               }
          System.out.print("\n");
       }
    }
}

class Pattern2 {
       public static void main (String args[]){
           int size=6,ln=0,space=0,row=1;
         for(ln=1;ln<=size;ln++){
            for(space=1;space<=size-ln;space++){
                System.out.print(" ");
               } 
            for(row=1;row<=2*ln-1;row++){
                if(row==1 || row==2*ln-1){
                  System.out.print("*");
                }
               else{
                      System.out.print(" ");
                    }

               }
           System.out.print("\n");
        }
        for(ln=size-1;ln>=1;ln--){
          for(space=1;space<=size-ln;space++){
              System.out.print(" ");
              }
           for(row=1;row<=2*ln-1;row++){
              if(row==1 || row==2*ln-1){
                  System.out.print("*");
                }
               else{
                      System.out.print(" ");
                    }
               }
          System.out.print("\n");
       }
    }
}


class Pattern3 {
    public static void main(String args[]) {
        int size = 5, ln = 0, row = 0;

        for (ln = 0; ln <= 2 * size; ln++) {
            for (row = 0; row <= 2 * size; row++) {

                if (Math.abs(ln - size) + Math.abs(row - size) == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    
    }}