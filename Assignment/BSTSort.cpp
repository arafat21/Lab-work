#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node *left,*right;
};
Node *createNode(int val){
    Node *temp = new Node();
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}
Node *insert(Node *root, int val){
    if(root == nullptr){
        return createNode(val);
    }
    if(val <= root->data){
        root->left = insert(root->left,val);
    }
    else if(val > root->data){
        root->right = insert(root->right,val);
    }

    return root;
}
void inorder(Node *root){
    if(root){
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
    }
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    Node* root = nullptr;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        root = insert(root,arr[i]);
    }
    cout<<"Sorted item = ";
    inorder(root);
    cout<<endl;
}