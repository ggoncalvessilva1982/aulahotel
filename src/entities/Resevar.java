package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevar {
	private Integer Nquarto;
	private Date checkIn, checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Resevar(Integer nquarto, Date checkIn, Date checkout) {
		Nquarto = nquarto;
		this.checkIn = checkIn;
		this.checkout = checkout;
	}

	public Integer getCheckin() {
		return Nquarto;
	}

	public void setCheckin(Integer Nquarto) {
		this.Nquarto = Nquarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duracao() {
		long diff = checkout.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void atualizaData(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkout = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto " +
				Nquarto +
				" checkIn = "+
				sdf.format(checkIn)+
				", checkOut = "+
				sdf.format(checkout)
				+" "
				+duracao()
				+" noites"
				;
	
	}
}
