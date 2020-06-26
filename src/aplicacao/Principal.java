package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Resevar;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("número do quarto");
		int numeroQuarto = sc.nextInt();

		System.out.println("data de check-in com formato dd/mm/yyyy");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.println("data de check-out com formato dd/mm/yyyy");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)){
			System.out.println("Data de check-out inferior a de check-in");
		}else {
			Resevar rvr = new Resevar(numeroQuarto, checkIn, checkOut); 
			System.out.println("Reserva "+rvr);
		}

	}
}
