package javapackage;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FirstTutorial {

	int a=20;
	int b=10;
	
	void pv() {      //void mean it is a return type.
		
		char y='Y';
		System.out.println('Y');
	}
	public static void main(String[] args) {  // it is main method. it is java execution point. 
		                                      //all java program can be executive with the help of main method.
		String s= "Sanjay";
		
		FirstTutorial f=new FirstTutorial();  // main and first class of object as above
		
		System.out.println(f.a);
		System.out.println(f.b);
		System.out.println(s);
		System.out.println("Hello world");
		
		f.pv();
		secondnew o=new secondnew();         // this second class of object below
		System.out.println(o.i);
	
	}

}
class secondnew {
	int i=123456;

}





	
	
	
	
	