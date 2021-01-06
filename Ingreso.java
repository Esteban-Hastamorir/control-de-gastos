
public class Ingreso {
	private long valorIngreso;
	private int[] fecha = new int [3];
	private String motivo; 
	private boolean debito; 
	
	
	 /**
	  * 
	  * @param valorIngreso
	  * @param fecha
	  * @param motivo
	  * @param debito
	  */
	
	public Ingreso (long valorIngreso, int[] fecha, String motivo, boolean debito) {
		this.valorIngreso = valorIngreso;
		this.fecha = fecha;
		this.motivo = motivo;
		this.debito = debito;
	} 
	
	
	
}
