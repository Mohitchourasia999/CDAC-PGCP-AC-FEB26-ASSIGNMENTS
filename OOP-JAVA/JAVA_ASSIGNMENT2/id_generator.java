public class id_generator {
    static int counter;
    int id;
    id_generator()
    {
        
       id=counter;
       counter++;
    }
    void details()
    {
        System.out.println("student id:- "+id);
    }

    public static void main(String[] args) {

        id_generator.counter=101;

        id_generator obj=new id_generator();
        obj.details();

         id_generator obj1=new id_generator();
         obj1.details();

          id_generator obj2=new id_generator();
          obj2.details();

    }


}
