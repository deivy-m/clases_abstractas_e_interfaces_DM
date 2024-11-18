package udla.dmolina.abstraccion.modelo;
    //se crea la clase abstracta
abstract public class Hoja {
    protected String contenido;

        public Hoja(String contenido) {
            this.contenido = contenido;
        }

        //una clase abstracta puede o no tener metodos abstractos
    //al momento de que se cree un metodo abstracto por default la clase se vuelve abstracta
    abstract public String imprimir();
}
