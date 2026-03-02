class Pattern1 {
       public static void main(String args[]){
          int ln=0 , space=0 , star=0 , size=3;
          for (ln=0 ; ln < size ; ln++){
                for( space =0 ; space < ln ; space++){
                     System.out.print(" ");
                }
                for(star =0 ; star <size ; star++){
                      System.out.print("*");
                }
            System.out.print("\n");
         }
      } 
}    

class Pattern2 {
     public static void main(String args[]){
          int ln=0 , space=0 , star=0 , size=4;
          for (ln=0 ; ln < size ; ln++){
                for( space =0 ; space < ln ; space++){
                     System.out.print(" ");
                }
                for(star =0 ; star <size ; star++){
                      System.out.print("*");
                }
            System.out.print("\n");
         }
      } 

}

class Pattern3 {
    public static void main(String args[]){
        int ln=0 , space=0 , plus=0 , size=3;

        for(ln=0; ln<size; ln++){
            for(space=size-ln-1; space>0; space--){
                System.out.print(" ");
            }
            for(plus=0; plus<=ln; plus++){
                System.out.print("+ ");
            }
            System.out.print("\n");
        }

        for(ln=size-2; ln>=0; ln--){
            for(space=size-ln-1; space>0; space--){
                System.out.print(" ");
            }
            for(plus=0; plus<=ln; plus++){
                System.out.print("+ ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern4 {
    public static void main(String args[]){
        int ln=0 , space=0 , plus=0 , size=3;

        for(ln=0; ln<size; ln++){
            for(space=size-ln-1; space>0; space--){
                System.out.print(" ");
            }
            for(plus=0; plus<=ln; plus++){
                System.out.print("+ ");
            }
            System.out.print("\n");
        }

        for(ln=size-2; ln>=0; ln--){
            for(space=size-ln-1; space>0; space--){
                System.out.print(" ");
            }
            for(plus=0; plus<=ln; plus++){
                System.out.print("+ ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern5 {
      public static void main(String args[]){
       int ln=1 , num =1 , size =3;
       
       for (ln=1;ln<=size;ln++){
           for(int PrintNum=1;PrintNum<=ln;PrintNum++){
              System.out.print(num+" ");
              num++;
             }
        System.out.print("\n");
      }
    }
}
              

class Pattern6 {
      public static void main(String args[]){
       int ln=1, num=1 , size =3 , space=0 , PrintNum=0;

       for(ln=1 ; ln<=size ; ln++){
            for(space=size-ln; space>0 ; space--){
               System.out.print(" ");
               }
            for( PrintNum=1;PrintNum <=ln ; PrintNum++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print("\n");
       }
       
       for(ln=size+1; ln<=size+2 ; ln++){
            for(space=1 ;space<=ln-size ; space++){
                System.out.print(" ");
             }
             if(ln == size + 1){      
             num = size-1;
             System.out.print(num + " ");
             num++;
             System.out.print(num + " ");      
                }

             else {                   
             System.out.print("1 ");          
             }
            System.out.print("\n");
          }
       }
 }

class Pattern7 {
        public static void main(String args[]){
        int ln=0 ,star=0 , size=3 , space=0 ;

        for(ln=1 ; ln<=size ; ln++){
            for(star=1 ; star<=ln ; star++){
               System.out.print("*");
             }
            if(ln==1){
               for(space=1; space<=size ; space++){
                   System.out.print(" ");
             }
         }
            else{
               for(space=size-ln ; space>0 ; space--){
                    System.out.print(" ");
            }
         }
           if (ln == size) {
                for (star = 1; star < ln; star++) {   // print ln-1 stars
                    System.out.print("*");
                }
            } else {
                for (star = 1; star <= ln; star++) {
                    System.out.print("*");
                }
            }
         System.out.print("\n");
        }
    }
}
      
class Pattern8 {
        public static void main(String args[]){
          int ln =0 , space = 0 , PrintZero=0 ,  size=6 ;
          for(ln=1;ln<=size-3;ln++){
             for(space=1;space<ln;space++){
                 System.out.print(" ");
               }
             for(PrintZero=size-(ln-1)*2;PrintZero>=1;PrintZero--){
                  System.out.print("0");
               }
           System.out.print("\n");
         }
      }
 }

class Pattern9 {
    public static void main(String args[]) {

        int size = 3;

        for (int ln = 0; ln < size; ln++) {
            for (int row = 0; row < size; row++) {

                if (row == ln || ln+row == size - 1 ) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




