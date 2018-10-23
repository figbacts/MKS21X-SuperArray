public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public void clear(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }
  public boolean add(String newthing){
    data[size] = newthing;
    return true;
  }
  public String toString(){
    String ans = "[";
    for(int c = 0; c != size; c++){
      ans = ans + data[c] + ", ";
    }
    ans = ans + "]";
    return ans;
  }
  public String toString(){
    String ans = "[";
    for(int c = 0; c != size; c++){
      ans = ans + data[c] + ", ";
    }
    for (int i = size; i != 11; c++){
      ans = ans + "null, ";
    }
    ans = ans + "]";
    return ans;
  }
  public String get(int index){
    
  }

}
