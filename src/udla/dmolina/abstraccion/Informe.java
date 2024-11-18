package udla.dmolina.abstraccion.modelo;
//con la palabra extends se hereda
//informe.java es la clase hija de la clase abstracta

public class Informe extends Hoja{
    //metodo abstracto y constructor nos ayudo a desaparecer el error
    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;

    }
    //se implemento un metodo de la clase abstracta
    //se aplica el concepto de polimorfismo
    //override nos dice que existe un metodo que nos ayuda a nuestras necesidades
    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor
                + "Revisado por: " + this.revisor
                //se puede usa "contenido" porque es protected
                + "\n" + this.contenido;
    }
}
