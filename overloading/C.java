package com.lumen.overloading;

class A{
static void process() {
	System.out.println("hello");
}
}
class B extends A{
	static void process() {
		System.out.println("great");
	}
}
public class C{
	public static void main(String[] args) {
		new B().process();
	}
}
