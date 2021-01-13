package ar.com.xeven;

public class Main {

    public static void main(String[] args) {
	    Gato felix = new Gato("felix", 80);
	    felix.caminar(10);
	    if(felix.estaCansado()){
	        felix.descansar();
        }
	    felix.informarEstado();
    }
}
