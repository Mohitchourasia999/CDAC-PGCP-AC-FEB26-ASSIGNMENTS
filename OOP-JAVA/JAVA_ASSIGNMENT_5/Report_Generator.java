public class Report_Generator {
    public static void main(String args[])
    {

        sales_info sf=new sales_info();

        Integer sales[]={1000,2500,1750,3200};
        System.out.println("sales report");
        sf.print(sales);

        String names[]={"rahul","priya","amit"};
        System.out.println("employee names");
        sf.print(names);

        Integer id[]={101,102,103};
        System.out.println("product ids");
        sf.print(id);

        Double sale[]={1000.5,2500.75,1750.25};
        System.out.println("sales report with double values");
        sf.print(sale);



    }
}
class sales_info{

    public <T> void print(T a[])
    {
        for(T i:a)
        {
            System.out.println(i);
        }
    }
}
