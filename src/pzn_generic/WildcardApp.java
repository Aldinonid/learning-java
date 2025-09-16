package pzn_generic;

import pzn_generic.MultipleConstraintApp.Manager;

public class WildcardApp {
	public static void main(String[] args) {
		print(new MyData<>(1000));
		print(new MyData<>("Eko"));
		print(new MyData<Manager>(new Manager()));
	}
	
	public static void print(MyData<?> data) {
		System.out.println(data.getData());
	}
}
