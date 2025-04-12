#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node *left,*right;
};
void inorder(Node* root){
    if(root){
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
    }
}
Node *createNode(int val){
    Node* temp = new Node();
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}
Node* insert(Node* root,int val){
    if(!root){
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
    inorder(root);
}