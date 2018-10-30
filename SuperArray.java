public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public SuperArray(int index){
    if (index < 0 ){
      throw new IllegalArgumentException("Illegal Argument at SuperArray(int)");
    }
    data = new String[index];
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
    if (data.length == size){
      resize();
    }
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
    if (data.length == 0){
      return null;
    }
    for(int c = 0; c != data.length - 1; c++){
      ans = ans + data[c] + ",";
    }
    ans = ans + data[data.length -1];
    ans = ans + "]";
    return ans;

  }
  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Bad Index at get(int)");
    }
    return data[index];
  }
  public String set(int index,String newthing){
    String returnthing = "";
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Bad Index at set(int,String)");
    }
    returnthing = data[index];
    data[index] = newthing;
    return returnthing;
  }
private void resize(){
  String[] ans = new String[(data.length * 2)+1];
  for (int i = 0; i < size; i++){
    ans[i] = data[i];
  }
  data = ans;
}
public boolean contains(String target){
  boolean ans = false;
  for (int i = 0; i < size;i++){
    if (data[i].equals(target)){
      ans = true;
    }
  }
  return ans;
}
public int indexOf(String target){
  for (int i = 0; i < size; i++){
    if (data[i].equals(target)){
      return i;
    }
  }
  return -1;
}
public int lastIndexOf(String target){
  int ans = -1;
  for (int i = 0; i < size; i++){
    if (data[i].equals(target)){
      ans = i;
    }
}
return ans;
}
public void add (int index, String test){
  boolean flag = false;
  String[] ans = new String[data.length + 1];
  if (index < 0 || index >= size()) {
    throw new IndexOutOfBoundsException("Bad Index at add(int,String)");
  }
  for (int i = 0; i < size; i++){
    if (i == index){
      flag = true;
      ans[i] = test;
    }
    if (flag == false){
      ans[i] = data[i];
    }
    if (flag){
      ans[i+1] = data[i];
    }
}
data = ans;
size = size + 1;
}
public String remove (int index){
  boolean flag = false;
  String removed = "";
  String[] ans = new String[data.length -1 ];
  if (index < 0 || index >= size()) {
    throw new IndexOutOfBoundsException("Bad Index at remove(int)");
  }
  for (int i = 0; i < size; i++){
    if (i == index){
      flag = true;
      removed = data[i];
      ans[i] = data[i + 1 ];
    }
    if (flag == false){
      ans[i] = data[i];
    }
    if (flag){
      ans[i] = data[i+1];
    }
}
data = ans;
size = size -1;
return removed;
}
public boolean remove(String test){
  if (indexOf(test) == -1){
    return false;
  }
  int index = indexOf(test);
  remove(index);
  return true;
}
}
