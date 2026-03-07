#include<iostream>
using namespace std;
int main()
{
    int *arr=new int[5];
    cout<<"enter the elements of array:"<<endl;
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];   
     }
         for(int i=0;i<5;i++)
    {
        cout<<arr[i]<<" ";
     }
     cout<<""<<endl;
     delete[]arr;
     arr=nullptr;
     if(arr==nullptr)
     {
        cout<<"memory deallocated successfully:"<<endl;
     }
     

}