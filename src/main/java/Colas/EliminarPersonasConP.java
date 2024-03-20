package Colas;

public class EliminarPersonasConP {
    public static void main(String[] args) {
        Cola<Persona> cola = new Cola<>();
        cola.encolar(new Persona("Jero"));
        cola.encolar(new Persona("Pedro"));
        cola.encolar(new Persona("Pablo"));
        cola.encolar(new Persona("Aleja"));

        cola = elimarP(cola);

    }
    public static Cola<Persona> elimarP(Cola<Persona> c){
        int i = c.getSize();
        while (i>0){
            Persona p =c.desencolar();
            if(!p.getName().startsWith("P")){
                c.encolar(p);
            }
            i--;
        }
        return c;
    }
}
