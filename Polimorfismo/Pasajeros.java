public class Pasajeros extends Aeronave{
	
	int maxTakeoffWeigth;	
	int numeroPasajeros;
	
	Pasajeros()
	{
		super();
		this.numeroPasajeros = 20;
		maxTakeoffWeigth = 45000;
	}
	
	Pasajeros(int motores, int combustible, String matricula, int numeroPasajeros, int maxTakeoffWeigth){
		
		//Llamada al constuctor padre
		super(motores, combustible,  matricula);
		
		this.numeroPasajeros = numeroPasajeros;
		this.maxTakeoffWeigth = maxTakeoffWeigth;
	}	
	
	
	//Metodo sobrescrito completamente
	@Override
	public void repostar(int combustible) {
		
		System.out.println("Gesti�n de respostaje en avi�n PASAJEROS");
		System.out.println("Comprobando l�mite de repostaje en base a numero de pasajeros...");
		int cargaPasajeros = numeroPasajeros * 75;
		if((combustible + cargaPasajeros) < maxTakeoffWeigth)
		{
			this.combustible = combustible;
			System.out.println("Repostaje sin incidentes. Combustible: " + combustible);

		}
		else
		{
			this.combustible = maxTakeoffWeigth - cargaPasajeros;
			System.out.println("Repostaje limitado. Combustible: " + combustible);
		}
	}
	

	/*@Override
	public void arranqueMotores() {
		System.out.println("Comprobando alimentaci�n auxiliar...");
		System.out.println("Iniciando secuencia de ignici�n...");
	} */
	

	
}