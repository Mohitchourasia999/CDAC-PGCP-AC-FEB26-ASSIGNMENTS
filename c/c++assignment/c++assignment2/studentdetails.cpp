#include<iostream>
using namespace std;
class student{
 
    int rollno;
    string name;
    int age;
    public:
    student()
    {
        rollno=0;
        name= " ";
        age=0;
    }
    student(int rollno,string name,int age)
    {
        this->rollno=rollno;
        this->name=name;
        this->age=age;
    }
    int getrollno() const{
        return (rollno);
    }
    string getname() const{
        return (name);
    }
    int getage() const{
        return (age);
    }
 };

int main()
{
    int r;
    string n; int a;
    cin>>r;
    cin>>n;
    cin>>a;
    student s;
    cout<<"student details from default constructor:"<<endl;
    cout<<s.getrollno()<<" | "<<s.getname()<<" | "<<s.getage()<<endl;

      student s1(r,n,a);
      cout<<"student details from parameterized constructor using s1 object:"<<endl;
      cout<<s1.getrollno()<<" | "<<s1.getname()<<" | "<<s1.getage()<<endl;

      student s2(r,n,a);
      cout<<"student details from parameterized constructor using s2 object:"<<endl;
      cout<<s2.getrollno()<<" | "<<s2.getname()<<" | "<<s2.getage()<<endl;
}