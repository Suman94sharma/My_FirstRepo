package Abstract;

public class abDemoC extends AbDemoP {
	abDemoC(){
		super(4);
		System.out.println("default const of abstract child");
	}

		@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract defined in child class");
                System.out.println("abstract defined in child class");

		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		abDemoC ob=new abDemoC();
		ob.show("suman");
		ob.Adddetails(9834);
		ob.display();
		AbDemoP.BatchC(1234);
		System.out.println(Companyname);
		

		}


	

}
