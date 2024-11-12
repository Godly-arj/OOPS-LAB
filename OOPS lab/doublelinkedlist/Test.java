import java.util.Scanner;
class LinkedList {
private Node head;
class Node {
private int data;
private Node left;
private Node right;
public Node(int data) {
this.data = data;
this.left = null;
this.right = null;
}
}
public void insert(int data) {
Node temp = new Node(data);
if (head == null) {
head = temp;
}
else {
Node ptr = head;
while (ptr.right != null) {
ptr = ptr.right;
}
ptr.right = temp;
temp.left = ptr;
}
System.out.println("Data inserted successfully!\n");
}
public void delete() {
if (head == null) {
System.out.println("Empty list!\n");
System.exit(1);
}
else if (head.right != null) {
int x = head.data;
head = head.right;
head.left = null;
System.out.println("Element " + x + " got deleted\n");
}
else {
int x = head.data;
head = null;
System.out.println("Element " + x + " got deleted\n");
}
}
public void display() {
if (head == null) {
System.out.println("List is empty!");
}
else {
Node ptr = head;
System.out.println("The list is: ");
while (ptr.right != null) {
System.out.print(ptr.data + ",\t");
ptr = ptr.right;
}
System.out.print(ptr.data);
System.out.println("\n");
}
}
}
class Test {
public static void main(String[] args) {
LinkedList list = new LinkedList();
Scanner sc = new Scanner(System.in);
int choice;
System.out.println("1. Display the list");
System.out.println("2. Insert an element to the list");
System.out.println("3. Delete an element from the list");
System.out.println("4. Quit the program");
while (true) {
System.out.print("Enter your selection: ");
choice = sc.nextInt();
if (choice == 1) {
list.display();
}
else if (choice == 2) {
System.out.print("Enter the data (num) to insert: ");
int data = sc.nextInt();
list.insert(data);
}
else if (choice == 3) {
list.delete();
}
else if (choice == 4) {
System.out.println("Quitting!\n");
break;
}
else {
System.out.println("Invalid option, please retry!\n");
}
}
}
}
