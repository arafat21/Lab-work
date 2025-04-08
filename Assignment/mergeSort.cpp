#include <bits/stdc++.h>
using namespace std;
void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void mergeSort(int arr[],int left,int mid,int right){
    int n1=mid-left+1;
    int n2=right - mid;
    
    int x[n1],y[n2];
    for(int i=0;i<n1;i++)
    x[i]=arr[left+i];
    for(int i=0;i<n2;i++)
    y[i]=arr[mid+1+i];
    int i=0,j=0,k=left;
    while(i<n1 && j<n2){
        if(x[i]<=y[j]){
            arr[k]=x[i];
            i++,k++;
        }
        else{
            arr[k]=y[j];
            j++,k++;
        }
    }
    while(i<n1){
        arr[k++]=x[i++];
    }
    while(j<n2){
        arr[k++]=y[j++];
    }
}
void merge(int arr[],int left,int right){
    if(left >= right){
        return;
    }
    int mid = (right-left)/2 + left;
    merge(arr,left,mid);
    merge(arr,mid+1,right);
    mergeSort(arr,left,mid,right);
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    merge(arr,0,n-1);
    cout<<"Sortd Array: ";
    printArray(arr,n);
}