public /*abstract*/ class Aeronave {
	
	protected int motores;
	protected int combustible;
	protected String matricula;
		
	//Constructor defecto
	Aeronave(){
		
		//this(1,50,"N/A"); //Mediante la llamada al otro constructor
		
		motores = 1;
		combustible = 50;
		matricula = "N/A";
	};
	
	//Constructor por parametros
	Aeronave(int motores, int combustible, String matricula){
		this.motores = motores;
		this.combustible = combustible;
		this.matricula = matricula;
	}
	
	//Por tener un solo método "abstract" la clase debe de ser "abstract" y no se puede instanciar (no es posible new Aeronave()).
	//abstract public void arranqueMotores(); 
	
	public void repostar(int combustible){
		
		System.out.println("Sistema por defecto de repostaje. Cantidad: " + combustible);
		this.combustible = combustible;		
	};
}