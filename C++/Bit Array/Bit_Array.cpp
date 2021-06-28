#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n,s,p,q;
    cout<<"Enter the value of n: ";
    cin>>n;
    if((n<1)||(n>(10^8)))
    {
        while((n<1)||(n>(10^8)))
        {
            cin>>n;
        }
    }
    cout<<"Enter the value of s: ";
    cin>>s;
    if((s<0)||(s>(2^31)))
    {
        while((s<0)||(s>(2^31)))
        {
            cin>>s;
        }
    }
    cout<<"Enter the value of p: ";
    cin>>p;
    if((p<0)||(p>(2^31)))
    {
        while((p<0)||(p>(2^31)))
        {
            cin>>p;
        }
    }
    cout<<"Enter the value of q: ";
    cin>>q;
    if((q<0)||(q>(2^31)))
    {
        while((q<0)||(q>(2^31)))
        {
            cin>>q;
        }
    }
    return 0;
}