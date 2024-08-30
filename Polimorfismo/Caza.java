public class Caza extends Aeronave implements TrafficAdvisory{

	protected int combustibleManiobras;
	
	Caza()
	{
		super();
		this.combustibleManiobras = 50;
	}
	
	Caza(int motores, int combustible, String matricula, int combustibleManiobras){
		
		//Llamada al constuctor padre
		super(motores, combustible,  matricula);
		
		this.combustibleManiobras = combustibleManiobras;
	}
	
	@Override
	public void repostar(int combustible) {
		
		//Llamada al método del padre
		super.repostar(combustible);
		
		//Se amplia el método en la clase hijo		
		System.out.println("Gestión de respostaje en avión CAZA");
		if(this.combustible > combustibleManiobras)
		{
			System.out.println("El avión CAZA está preparado para la maniobra");
		}
	}
	
	//Metodo propio de la clase
	public void lanzarMisil()
	{
		System.out.println("Caza: " + this.matricula + " .....Lanzamiento de misil completado");
	}

	@Override
	public int getAltitude() {
		System.out.println("Aeronave: " + matricula + " ...Lanzando peticion de altitud al ordenador de sensórica...");
		return 10000; //Ej. 10.000 ft
	}

	@Override
	public int getVerticalSpeed() {
		System.out.println("Aeronave: " + matricula + " ...Lanzando peticion de vertical speed al ordenador de sensórica...");
		return 1500; //Ej. 1500 ft/min
	}

	@Override
	public void setAltitudeOther(int altitude) {
		System.out.println("Aeronave: " + matricula + " ...Enviando información de altitud conflicitva al sistema TCAS/ATC...");
	}

	@Override
	public void setVerticalSpeedOther(int vs) {
		System.out.println("Aeronave: " + matricula + " ...Enviando información de vertical speed de aeronave intrusa al sistema TCAS/ATC...");		
	}

	//METODOS ABASTRACTOS 
	/*@Override
	public void arranqueMotores() {
		System.out.println("Comprobando posquemadores...");
		System.out.println("Iniciando secuencia de ignición...");		
	}*/	
}