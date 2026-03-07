#include<iostream>
using namespace std;
int main()
{
    int n,n1;
    cout<<"Enter any Integer Value:"<<endl;
    cin>>n;
    int *p=&n;
    int &ref=n;
    cout<<"enter integer use to get modified:"<<endl;
    cin>>n1;
    ref=n1;
    *p=ref;
    cout<<n<<endl;
    cout<<*p<<endl;
}