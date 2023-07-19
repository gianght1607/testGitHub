package package2;

import mytestpack.riengtu2;

//Định nghĩa interface
abstract class Animal {
	abstract void makeSound(); // Phương thức trừu tượng không có định nghĩa
}

//Lớp Cat triển khai interface Animal
class Cat extends Animal {
 public void makeSound() {
     System.out.println("Meow");
 }
}

//Lớp Dog triển khai interface Animal
class Dog extends Animal {
 public void makeSound() {
     System.out.println("Woof");
 }
}

public class riengtu {
 public static void main(String[] args) {
	 String originalStr = "Hello";
			 String reversedStr = "";
			 for (int i = 0; i < originalStr.length(); i++) {
			 reversedStr = originalStr.charAt(i)+ reversedStr;}
			 System.out.println("Reversed string: "+ reversedStr);
 }
}








