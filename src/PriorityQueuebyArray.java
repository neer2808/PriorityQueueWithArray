// implementation of priority queue by using array with non primitive type

class PriorityQueuebyArray
{
  int front;
  int rear;
  Element arr[];

  public PriorityQueuebyArray(int size) {
    arr = new Element[size];
    front = -1;
    rear = -1;
  }
  public boolean isfull()
  {
    return rear==arr.length+1;
  }
  public boolean isempty()
  {
    return front ==-1;
  }
  public void insert(Element newelement)
  {
    int i;
    if (isfull())
    {
      System.out.println("overflow error");
    }
    else if(isempty())
    {
      front =0;
      rear++;
      arr[rear]= newelement;
    }
    else
    {
      for( i = rear;i>=front;i--)
      {
        if (newelement.priority < arr[i].priority) {
          arr[i + 1] = arr[i];
        }
        else {
          break;
        }


      }
      arr[i+1]= newelement;
      rear++;
    }

  }
  public void display()
  {
    if(isempty())
    {
      System.out.println("Queue is empty");
    }
    else
    {
      for(int i = front;i<=rear;i++)
        System.out.println(arr[i].data+ " "+ arr[i].priority);
    }
  }

  public void dequeue()
  {
    if (isempty())
    {
      System.out.println("queue underflow");
    }
    else
      System.out.println(arr[front].data + " " + arr[front].priority);
    front++;
    if(front>rear)
    {
      front = rear =-1;
    }
  }
}