class sample{
    public static void main(String[] args)
    {
        //char c=97;//decimal assignment.
       // char c='\u0061';//hexa assignment
       //char c='\141';//octal assignment
        //System.out.println(c);
        // explicit type conversion
        //int a=10;
        //byte b=(byte)a;
        //System.out.println(b);
///////////////////////////////////////////////////////////////////////////
        // type promotion
        /*int a=5;
        double d=25.3;
        int c=a*d;//error -> Type mismatch: cannot convert from double to int
         System.out.println(c);*/
//////////////////////////////////////////////////////////////////////////
        /* int a=5;
         double d=a;
         System.out.println(d);*/
/////////////////////////////////////////////////////////////
         /*  int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 1);*/
         /* int[] a = new int[3];
        System.out.println(a[0]);*/
//////////////////////////////////////////////////
         /*  char ch = 65;
        System.out.println(ch);*/
//////////////////////////////////////////////////
        /*int a=0113;
        System.out.println(a);*/   //Calculation: 0*8*8*8+1*8*8+1*8+3*(8 ki power 1)1=75.
        //////////////////////////////////////////
        /*int a=5;
        int b=a++;
        System.out.println(a);
   System.out.println(b);*/ // a=6 , b=5 o/p
/////////////////////////////////////////////////

   /*  int a=5;
        int b=++a;
        System.out.println(a);
   System.out.println(b);*/
///////////////////////////////////////////////

  /*  int x=1;
   int y=5;
   int d=0;
   if(x==0&&y++<10)
    d=10;              // o/p - 1,5,0 with &&
System.out.println(x);
System.out.println(y);
System.out.println(d);*/
/////////////////////////////////////////////////
/*int x=1;
   int y=5;
   int d=0;
   if(x==0&y++<10)
    d=10;             // o/p - 1,6,0 with &(it will check both condition even the whole if condition not runs)
System.out.println(x);
System.out.println(y);
System.out.println(d);*/

///////////////////////////////////////////////////////

/*int a;
a=a*5;   // error -> local variable not initialized;
a=5;
System.out.println(a);*/


}
}