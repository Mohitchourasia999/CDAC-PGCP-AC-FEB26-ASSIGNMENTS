#include<iostream>
using namespace std;
class swapping{
    public:
    void swapbyvalue(int a,int b)
    {
        int t=a;
        a=b;
        b=t;
        cout<<"swapping by call by value"<<endl;
        cout<<"vales of a is "<<a <<"\n"<<"value of b is "<<b<<endl;
    }

    void swapbyaddress(int *a,int *b)
    {
        int t=*a;
        *a=*b;
        *b=t;
         cout<<"swapping by call by address"<<endl;
         cout<<"vales of a is "<<*a <<"\n"<<"value of b is "<<*b<<endl;
    }

    void swapbyreference(int &a,int &b)
    {
        int t=a;
        a=b;
        b=t;
        cout<<"swapping by call by reference"<<endl;
         cout<<"vales of a is "<<a <<"\n"<<"value of b is "<<b<<endl;
    }

};

int main()
{
    int a ,b;
    cout<<"enter value of a "<<endl;
    cin>>a;
    cout<<"enter value of b "<<endl;
    cin>>b;
    swapping s;
    s.swapbyvalue(a,b);
    s.swapbyaddress(&a,&b);
    s.swapbyreference(a,b);
}