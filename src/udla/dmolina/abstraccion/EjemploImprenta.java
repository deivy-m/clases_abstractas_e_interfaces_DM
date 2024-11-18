package udla.dmolina.abstraccion;

import udla.dmolina.abstraccion.modelo.Curriculo;
import udla.dmolina.abstraccion.modelo.Hoja;
import udla.dmolina.abstraccion.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        //se puede instanciar la clase curriculo porque no es una clase abstracta
        Curriculo cv = new Curriculo("Juan Galan", "Ing. Sistemas", "Resumen Laboral...");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollador FullStack");
        cv.experiencia("Angular");

        Informe informe = new Informe("JJJ\n", "KKK", "Contenido: Estudio Microservicios" );
        //se aplica polimorfismo
        imprimir(cv);
        imprimir(informe);
    }
    public static void imprimir(Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}
