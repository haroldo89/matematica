
public class matematica {

	int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	 
	static int min(int a, int b){
		if(a<b)return a;
		return b;
	}

	public static void main(String[] args) {
		
		matematica objMate= new matematica();
		System.out.println(objMate.min(6,10));
		
		
	}
}
