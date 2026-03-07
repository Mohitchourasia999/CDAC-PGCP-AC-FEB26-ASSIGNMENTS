#include<iostream>
using namespace std;
class Box{
    int length , height, width;
    public:

    Box(int l , int w , int h) 
    {
      length=l;
        width=w;
        height=h;
    }

    void setdimensions(int length,int width,int height)
    {
        this->length=length;
        this->width=width;
        this->height=height;
    }

    int volume()
    {
        return (length*width*height);
    }
};

int main()
{
    int len,w,h;
    cout<<"enter the lenght of the box:-"<<endl;
    cin>>len;
     cout<<"enter the width of the box:-"<<endl;
    cin>>w;
     cout<<"enter the height of the box:-"<<endl;
    cin>>h;
    Box b(len,w,h);
   b.setdimensions(len,w,h);
    cout<<"volume of cube:-"<<b.volume()<<endl;

}