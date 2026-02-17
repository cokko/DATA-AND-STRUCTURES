import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Can Berk KILIC
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main2 {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String>pl= new LinkedList<>();
    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    pl.add("Java");
    pl.add("Python");
    pl.add("JavaScript");
    pl.add("C++");

    System.out.println("progLanguages after adding:" + pl);

    // 3. Remove the element "C++" from the list using .remove()
    pl.remove("C++");

    System.out.println("progLanguages after remove:" + pl);
    // 4. Add an element "HTML" at index 2.
    pl.add(2,"HTML");
    System.out.println("progLanguages after index 2:" + pl);

    // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
    System.out.println("Iterating list:");
    Iterator<String> iterator = pl.iterator();
    while (iterator.hasNext()) {
    System.out.println(iterator.next());}
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q
    Queue<String>q=new LinkedList<>();
    // 7. Add 5 first names to q.
    q.add("Java");
    q.add("Python");
    q.add("JavaScript");
    q.add("C++");

    // 8. Uncomment the following line
    //System.out.println("Elements of queue: " + q);
    System.out.println("Elements of queue: " + q);

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    //    Display the value of "Removed element: " + removedElement
    String removedElement = q.poll(); 
    System.out.println("Removed element: " + removedElement);
    // 10. View the head of the queue using peek(). Output it's value.
    System.out.println("Head of queue: " + q.peek());
    
    // 11. Using for(String element : q), output all of the values in the queue
    for (String element : q) {
    System.out.println(element);}
    
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<>();
    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
    
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");
    
    // 14. pop() 1 book off the stack. Display it's value
    
    String poppedBook = bookStack.pop();
    System.out.println("Popped book: " + poppedBook);
    
    // 15. Use the peek() method to view the top book on the stack
   
    System.out.println("Top stack: " + bookStack.peek());
    
    // 16. push() "Web DB Technologies" onto the stack
   
    bookStack.push("Web DB Technologies");
    
    // 17. Use the peek() method to view the top book on the stack
    
    System.out.println("Top stack after new push: " + bookStack.peek());
    
    // 18. Search for "Design Patterns" in the stack. Display the results of the search.
    
    int position = bookStack.search("Design Patterns");
    System.out.println("Location of 'Design Patterns': " + position);
    
    // 19. Call empty(). Output the results
    
    System.out.println("Stack empty? " + bookStack.empty());
    
    // 20. Print the titles of all of the books on the stack
   
    System.out.println("Current books in stack:");
    for (String book : bookStack) {
    System.out.println(book);}
  }

  
}