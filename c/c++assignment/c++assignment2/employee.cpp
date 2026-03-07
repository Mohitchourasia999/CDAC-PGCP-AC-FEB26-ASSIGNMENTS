#include<iostream>
using namespace std;
class Employee{
    const int employeeid;
    string name;
    float salary;
    public:
    Employee(int id,string n,float sal):employeeid(id),name(n),salary(sal){

    }
    void displaydetails()
    {
        cout<<"employee id: "<<employeeid<<endl;
         cout<<"employee name: "<<name<<endl;
          cout<<"employee salary: "<<salary<<endl;
    }
};
int main()
{
    int id;string n; float sal;
    cin>> id >> n >> sal ;
    Employee e(id,n,sal);
    e.displaydetails();
}