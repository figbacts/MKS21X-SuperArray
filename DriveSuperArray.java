public class DriveSuperArray{
  public static void main(String[] args) {
      SuperArray l1 = new SuperArray();
      System.out.println (l1.size()); //0
      System.out.println (l1.isEmpty()); //true
      System.out.println (l1); //[]
      System.out.println (l1.toStringDebug()); // [10 null array]
      l1.add("cat");
      System.out.println (l1.size()); //1
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1); //[cat]
      System.out.println (l1.toStringDebug()); // [cat, nullx9]
      l1.add("horse");
      System.out.println (l1.size()); //2
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1); //[cat, horse]
      System.out.println (l1.toStringDebug()); // [cat, horse, nullx8]
      System.out.println (l1.get(1)); // horse
      System.out.println (l1.get(0)); // cat
      System.out.println (l1.set(1, "camel")); //horse
      System.out.println (l1); // [cat, camel]
      l1.clear();
      System.out.println (l1.size()); //0
      System.out.println (l1.isEmpty()); //true
      System.out.println (l1); //[]
      System.out.println (l1.toStringDebug()); // [10 null array]
      l1.add("cat");
      System.out.println (l1.size()); //1
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1); //[cat]
      System.out.println (l1.toStringDebug()); // [cat, nullx9]
      l1.add("cow");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      l1.add("pig");
      System.out.println(l1);// [cat,cow, pigx8]
      System.out.println(l1.toStringDebug()); // [cat,cow, pigx8]
      l1.add("new");
      System.out.println("added new " + l1.toStringDebug());// [cat, cow, pigx8, new, nullx10]
      System.out.println(l1.contains("meow"));//false
      System.out.println(l1.indexOf("meow"));//-1
      System.out.println(l1.lastIndexOf("meow"));//-1
      System.out.println(l1.contains("pig"));//true
      System.out.println(l1.indexOf("pig"));//2
      System.out.println(l1.lastIndexOf("pig"));//9
      l1.add(3, "hi");
      System.out.println("added hi using void add " + l1); // [cat, cow, pig, hi, pigx7, new]
      System.out.println(l1.toStringDebug());// [cat, cow, pig, hi, pigx7, new, nullx9]
      l1.remove(2);
      System.out.println("removed by index " + l1); // [cat, cow, hi, pigx7, new]
      System.out.println(l1.toStringDebug());// [cat, cow, hi, pigx7, new, nullx10]
      System.out.println(l1.remove("hello")); // false;
      System.out.println("removed from a nonexistent val " + l1.toStringDebug());
      System.out.println(l1.remove("pig")); // true;
      System.out.println("removed by val "+  l1);// [cat, cow, hi, pigx6, new]
      System.out.println(l1.toStringDebug()); // [cat, cow, hi, pigx6, new, nullx11]
      try {l1.add(-1,"eep");} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.add(30,"eep");} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.get(-1);} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.get(30);} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.set(-1,"eep");} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.set(30,"eep");} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.remove(-1);} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
      try {l1.remove(30);} catch (IndexOutOfBoundsException e) {System.out.println(e.getMessage());}
	try {new SuperArray(-1);} catch (IllegalArgumentException e) {System.out.println(e.getMessage());}
	try {new SuperArray(-5);} catch (IllegalArgumentException e) {System.out.println(e.getMessage());}
}
}
