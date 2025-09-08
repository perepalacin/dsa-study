#include <stdlib.h>
#include <stdio.h>

void Insert(int x);
void InsertAtN(int x, int n);
void Print();

typedef struct Node {
    int data;
    struct Node* next;
} Node;

Node* head;


void Insert (int x) { // Inserting a node at the beginning!
    Node* temp = (Node*)malloc(sizeof(Node));
    temp->data = x;
    temp->next = head;
    head = temp;
}

void InsertAtN(int x, int n) {
    if (n < 0) {
        printf("Please provide a positive zero indexed value\n");
    }
    if (n == 0) {
        Insert(x);
        return;
    } 
    Node* temp = head;
    int i = 1;
    while (temp != NULL) {
        if (i == n) {
            Node* new_node = (Node*)malloc(sizeof(Node));
            new_node->data = x;
            Node* temp_next = temp->next;
            temp->next = new_node;
            new_node->next = temp_next;
            return;
        }
        i++;
        temp = temp->next;
    }
    printf("The index provided (%d) is out of bounds.\n", n);
}

void Print() {
    Node* temp = head;
    printf("The list is: ");
    while (temp != NULL) {
        printf("%d, ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    head = NULL;

    // printf("How many numbers?\n");

    // int n, i, x;
    // scanf("%d", &n);
    // for (i = 0; i<n; i++) {
    //     printf("Enter the number \n");
    //     scanf("%d", &x);
    //     Insert(x);
    //     Print();
    // }

InsertAtN(2,0);
Print();
InsertAtN(3,1);
Print();
InsertAtN(4,0);
Print();
InsertAtN(5,1);
Print();

}

