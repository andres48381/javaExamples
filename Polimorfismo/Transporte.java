public class Transporte extends Aeronave implements TrafficAdvisory{ 
	
	int pesoMercancia;
	
	Transporte()
	{
		super();
		this.pesoMercancia = 200;
	}
	
	Transporte(int motores, int combustible, String matricula, int pesoMercancia){
		
		//Llamada al constuctor padre
		super(motores, combustible,  matricula);
		
		this.pesoMercancia = pesoMercancia;
	}	
	
	//Metodo no definido, ya que usa por defecto el del padre
	/*@Override
	public void repostar(int combustible) {
		
		System.out.println("Gesti�n de respostaje en avi�n TRANSPORTE");
		
	}*/

	//METODOS ABASTRACTOS 
	/*@Override
	public void arranqueMotores() {
		System.out.println("Comprobando estado de helices...");
		System.out.println("Iniciando secuencia de ignici�n...");	
	}*/
	
	@Override
	public int getAltitude() {
		System.out.println("Aeronave: " + matricula + " ...Lanzando peticion de altitud al ordenador de sens�rica...");
		return 11000; //Ej. 11.000 ft
	}

	@Override
	public int getVerticalSpeed() {
		System.out.println("Aeronave: " + matricula + " ...Lanzando peticion de vertical speed al ordenador de sens�rica...");
		return 1900; //Ej. 1900 ft/min
	}

	@Override
	public void setAltitudeOther(int altitude) {
		System.out.println("Aeronave: " + matricula + " ...Enviando informaci�n de altitud conflicitva al sistema TCAS/ATC...");
	}

	@Override
	public void setVerticalSpeedOther(int vs) {
		System.out.println("Aeronave: " + matricula + " ...Enviando informaci�n de vertical speed de aeronave intrusa al sistema TCAS/ATC...");		
	}
}

