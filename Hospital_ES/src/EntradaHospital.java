import java.util.Date;

public class EntradaHospital {
	private Date data_hora;
	
	public EntradaHospital(Date data_hora) {
		this.data_hora = data_hora;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
}
