package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Ion", 23);
		ICopiere client2 = client1.copiaza();
	
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet bilet1 = new Bilet(1, "Romania", "Germania", "21:45");
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet2.setCod(2);
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCod(3);
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);
	}
}
