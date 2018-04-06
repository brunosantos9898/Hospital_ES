import java.util.ArrayList;

public class Prescricao {
	private String data;
	private ArrayList <HorarioToma> lHorarios;
	
	public Prescricao(String data, ArrayList<HorarioToma> lHorarios) {
		this.data = data;
		this.lHorarios = lHorarios;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<HorarioToma> getlHorarios() {
		return lHorarios;
	}

	public void setlHorarios(ArrayList<HorarioToma> lHorarios) {
		this.lHorarios = lHorarios;
	}
	
	
	
}
