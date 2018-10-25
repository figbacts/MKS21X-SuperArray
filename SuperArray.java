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
    size += 1;
    return true;
  }
  public String toString(){
    String ans = "[";
    if (size == 0){
      return "[]";
    }
    if (size == 1){
      return "[" + data[0] + "]";
    }
    for(int c = 0; c < size - 1 ; c++){
      ans = ans + data[c] + ",";
    }
    ans = ans + data[size - 1];
    ans = ans + "]";
    return ans;
  }
  public String toStringDebug(){
    String ans = "[";
    for(int c = 0; c != size; c++){
      ans = ans + data[c] + ", ";
    }
    for (int i = size; i != 11; i ++){
      ans = ans + "null, ";
    }
    ans = ans + "]";
    return ans;

  }
  public String get(int index){
    if (index < 0 || index >= size()){
      System.out.println("INDEX NOT VALID");
      return null;
    }
    return data[index];
  }
  public String set(int index,String newthing){
    String returnthing = "";
    if (index < 0 || index >= size()){
      System.out.println("INDEX NOT VALID");
      return null;
    }
    returnthing = data[index];
    data[index] = newthing;
    return returnthing;
  }

}
