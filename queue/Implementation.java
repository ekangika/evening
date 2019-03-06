package queue;

public class Implementation {
 int arr[]=new int[5];
int front=0,rear=0;
 void enque(int num)
{
	if(rear>=arr.length)
		System.out.println("Queue is full");
	else {
		arr[rear]=num;
		rear++;
	}
	
}
void deque() {
	if(front==rear)
		System.out.println("Queue is empty");
	else {
		System.out.println("Deleted element is:"+arr[front]);
		arr[front]=0;
		front++;
	}
}
void display() {
	for(int i=front;i<rear;i++) {
		System.out.print(arr[i]+" ");
	}
}

void size() {
	System.out.println("Size is "+(rear-front));
}

 public static void main(String args[]) {
	 Implementation obj=new Implementation();
	 obj.enque(10);
	 obj.enque(20);
	 obj.enque(30);
	 obj.enque(40);
	 obj.enque(50);
	 obj.size();
	 obj.display();
	 obj.enque(60);
	 obj.deque();
	 obj.size();
	/* obj.display();
	 obj.deque();
	 obj.display();
	 obj.deque();
	 obj.deque();
	 obj.deque();
	 obj.deque();*/
 }
}
