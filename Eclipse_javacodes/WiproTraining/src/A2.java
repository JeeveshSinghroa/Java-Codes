class A1 {
private void m1() {
System.out.println("m1 method of class A1");
}
}
class A2 extends A1 {
public void m1() {
System.out.println("m1 method of class A2");
}
public static void main(String[] args) {
A2 x = new A2();
x.m1();
}
}