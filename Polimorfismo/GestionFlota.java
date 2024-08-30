//Clase para la gestión de Aeronaves
public class GestionFlota {

	public static void main(String[] args) {
		
		
		System.out.println("*********** Programa de gestión de flota ***********");
		
		Aeronave[] flota = new Aeronave[5]; //Nuevo array de 5 posiciones para objetos del tipo "Aeronave"
		
		//Polimorfismo
		flota[0] = new Caza(2, 200, "EF", 1500); //Nueva instancia de objeto "Caza" recogido en una variable del tipo "Aeronave". Es posible al ser del tipo padre
		flota[1] = new Transporte(4, 5000, "A400", 7000); //Nueva instancia de objeto "Transporte" recogido en una variable del tipo "Aeronave". Es posible al ser del tipo padre
		flota[2] = new Pasajeros(); //Nueva instancia de objeto "Pasajeros" recogido en una variable del tipo "Aeronave". Es posible al ser del tipo padre
		flota[3] = new Caza(2, 150, "F18", 1400); //Nueva instancia de objeto "Caza" recogido en una variable del tipo "Aeronave". Es posible al ser del tipo padre
		flota[4] = new Aeronave();
		
		//Repostaje de toda la flota de "Aeronaves"
		for(int i=0;i<flota.length;i++)
		{
			if(flota[i]!=null)
			{
				System.out.println("------ Solicitando repostaje de la aeronave: " + i);
				flota[i].repostar(100); //Es posible la invocación del método "repostar" ya que forma parte de la clase padre, y las clases hijas lo han implementado
			}
		}
		
		//Lanzamiento de misiles
		for(int i=0;i<flota.length;i++)
		{
			//Se verifica que existe Aeronave en el array y que el elemento es un objeto de la clase Caza
			if(flota[i]!=null && (flota[i] instanceof Caza))
			{
				//flota[i].lanzarMisil(); //no compila. no es un metodo del padre y el polimorfimo no funciona
				Caza caza = (Caza) flota[i]; //Se castea al tipo de clase Claza
				caza.lanzarMisil();
			}
		}
		
		//Simulacion de TCAS. Uso de interface
		Caza caza = (Caza)flota[0]; //Se hace un casteo forzoso. Arriesgado sin comprobar si es del tipo
		Transporte trasnporte = (Transporte)flota[1];
		
		//Recepción de información desde el caza
		caza.setAltitudeOther(trasnporte.getAltitude());
		caza.setVerticalSpeedOther(trasnporte.getVerticalSpeed());
		
		//Recepción de información desde el trasnporte
		trasnporte.setAltitudeOther(caza.getAltitude());
		trasnporte.setVerticalSpeedOther(caza.getVerticalSpeed());
	}
}
