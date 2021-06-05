package DesignPattern;

class TV {
	private TV(){
	
	}
	private static TV tv;
	public static TV getTV() { //null =new TV()
		if(tv==null) {
			tv=new TV();
		}
		return tv;
	}
}	

public class Singleton {

	public static void main(String[] args) {
		TV t1=TV.getTV();
		TV t2=TV.getTV();
		System.out.println(t1);
		System.out.println(t2);
	
	}

}
