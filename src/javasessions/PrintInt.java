package javasessions;

public class PrintInt {

	// Interview questions

	public static void main(String[] args) {
		System.out.println("Hello");
		http: // its a label

		priyanka: //
		System.out.println("Ok! Bye");
		
		task:
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				if(i==5) {
					break;
				}
			}
		
		outerLoop:
			for(int i=0; i<5;i++) {
				innerLoop:
					for(int j=0;j<5;j++) {
						if(i!=j) {
							System.out.println("If block values" + i);
							break outerLoop;
						}
						else {
							System.out.println("Else block values" + i);
							continue innerLoop;
						}
					}
			}
	}

}
