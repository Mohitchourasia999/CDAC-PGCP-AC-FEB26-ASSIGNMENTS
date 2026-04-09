class datatype{
    int i;
        long l;
        short s;
        byte b;
        float f;
        double d;
        boolean t;
        
    public static void main(String[] args)
    {
        datatype obj=new datatype(); // by creating object it allocates memory to variables and initilizes with default value
        System.out.println("integer="+obj.i);
        System.out.println("long="+obj.l);
        System.out.println("short="+obj.s);
        System.out.println("byte="+obj.b);
        System.out.println("float="+obj.f);
        System.out.println("double="+obj.d);
        System.out.println("boolean="+obj.t);



    }
}
