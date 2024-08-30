//Interface para establecer el protocolo de comunicacion entre aviones para la gestión de evasión de colisiones
public interface  TrafficAdvisory {
	
	abstract public int getAltitude();
	abstract public int getVerticalSpeed();
	abstract public void setAltitudeOther(int altitude);
	abstract public void setVerticalSpeedOther(int vs);
}