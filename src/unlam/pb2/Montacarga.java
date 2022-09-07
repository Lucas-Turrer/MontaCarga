package unlam.pb2;

public class Montacarga {
	private Integer pisoActual;
	private Double pesoMaximo;
	private Double pesoActual = 0.00;

	public Montacarga(Integer piso, Double pesoMaximo) {
		this.pisoActual = piso;
		this.pesoMaximo = pesoMaximo;
	}

	public Integer getPisoActual() {
		return pisoActual;
	}

	public void setPiso(Integer pisoActual) {
		this.pisoActual = pisoActual;
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public void cargarMercaderia(Mercaderia caja) {
		if(pesoActual <= pesoMaximo) {
			pesoActual = pesoActual + caja.getPeso();
		}
		
	}

	public void subirPiso(Integer pisoSolicitado) {
		if(pesoActual <= pesoMaximo) {
			pisoActual = pisoSolicitado;
		}
		
	}
	
	

}
