import java.util.Scanner;

class average{
	private int num_a, num_b, num_c;
	average(){
		num_a = 2;
		num_b = 2;
		num_c = 2;
	}
	average(int a, int b, int c){
		num_a = a;
		num_b = b;
		num_c = c;
	}
	
	float callAverage(){
		return (float)((num_a+num_b+num_c)/3);
	}
	
	//setters
	void setNuma(int a){
		num_a = a;
	}
	
	void setNumb(int b){
		num_b = b;
	}
	
	void setNumc(int c){
		num_c = c;
	}
	
	//getters
	
	int getNuma(){return num_a;}
	int getNumb(){return num_b;}
	int getNumc(){return num_c;}
}
public class file1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so 1: ");
		int a = in.nextInt();
		System.out.println("nhap so 2: ");
		int b = in.nextInt();
		System.out.println("nhap so 3: ");
		int c = in.nextInt();
		
		average av = new average(a, b, c);
		System.out.println("ket qua la: " + av.callAverage());
	}
}