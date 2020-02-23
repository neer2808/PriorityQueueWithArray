
public class PriorityQueueMain {
  public static void main(String[] args) {
    System.out.println("Priority queue example");
    Element e1 = new Element(27,4);
    Element e2 = new Element(11,2);
    Element e3 = new Element(10,2);
    Element e4 = new Element(20,3);
    PriorityQueuebyArray obj = new PriorityQueuebyArray(5);
    obj.insert(e1);
    obj.insert(e2);
    obj.insert(e3);
    obj.insert(e4);
    obj.display();
    System.out.println("dequeue element");
    obj.dequeue();
    obj.dequeue();
    System.out.println("after dequeue");
    obj.display();

  }
}
