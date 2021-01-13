package ar.com.xeven;

public class Gato {
    private Integer energia;
    private String nombre;

    // getter de energia
    // me devuelve el valor de la energia
    public Integer getEnergia() {
        return energia;
    }
    // setter de energia
    // permite establecer el valor de energia
    public void setEnergia(Integer energia) {
        this.energia = (energia < 0) ? 0 : energia;
    }

    public Gato(String nombre, Integer energia){
        this.nombre = nombre;
        this.energia = energia;
    }

    public void caminar(int metros) {
        System.out.println("Estoy caminando.");
        System.out.println("No me gusta caminar porque me canso.");
        this.energia -= metros / 2;
        if(energia < 0) energia = 0;
    }

    public boolean estaCansado() {
        return energia < 50;
    }

    public void descansar() {
        energia += 20;
    }

    public void informarEstado() {
        System.out.println("Mi energia es "+ energia);
        if (this.estaCansado()){
            System.out.println("Necesito dormir más");
        }
    }
}
