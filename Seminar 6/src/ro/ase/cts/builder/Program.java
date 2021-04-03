package ro.ase.cts.builder;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Program {
	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(123, false, false, false, true, "Jazz");
		Rezervare rezervare2 = new BuilderRezervare(21).setAreScaunErgonomic(true).setAreBauturaInclusa(true).build();
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		
		BuilderRezervare builderRezervare = new BuilderRezervare();
		Rezervare rezervare3 = builderRezervare.setCod(1251).setAreBauturaInclusa(true).build();
		Rezervare rezervare4 = builderRezervare.setCod(215).setAreScaunErgonomic(true).build();
		
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2();
		builderRezervareV2.setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		
		Rezervare rezervare5 = builderRezervareV2.setCod(519).build();
		Rezervare rezervare6 = builderRezervareV2.setCod(520).build();
		
		System.out.println(rezervare5);
		System.out.println(rezervare6);
	}
}
