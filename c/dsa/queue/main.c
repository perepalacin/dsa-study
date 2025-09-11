#include <stdlib.h>
#include <stdio.h>

// Linked list implementation:
int IsEmpty();

typedef struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
} Node;

Node *front = NULL;
Node *back = NULL;
int queue = 0; 

void Enqueue(int x) {
    if (IsEmpty()) {
        front = (Node*)malloc(sizeof(Node));
        front->data = x;
        front->next = NULL;
        front->prev = NULL;
        back = front;
        queue++;
        return;
    }
    Node* temp = (Node*)malloc(sizeof(Node));
    temp->data = x;
    temp->next = NULL;
    temp->prev = front;
    front->next = temp;
    front = temp;
    queue++;

}

Node* Dequeue() {
    if (IsEmpty()) {
        printf("No items to dequeue\n");
        return NULL;
    }
    Node* temp = back;
    back = back->next;
    queue--;
    return temp;
}

Node* GetFront() {
    return front;
}

Node* GetBack() {
    return back;
}

int IsEmpty() {
    return queue == 0;
}

int main (void) {

    Dequeue();
    for (int i = 0; i < 15; i++) {
        Enqueue(i);
    }

    for (int i = 0; i < 15; i++) {
        Dequeue();
        printf("The current value of the front is: %d and the back is: %d\n", GetFront()->data, GetBack()->data);
    }
}