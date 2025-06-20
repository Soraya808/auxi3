
package empleado;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public float getSalario() { return salario; }

    @Override
    public String toString() {
        return nombre + "," + edad + "," + salario;
    }

    public static Empleado fromString(String linea) {
        String[] partes = linea.split(",");
        return new Empleado(partes[0], Integer.parseInt(partes[1]), Float.parseFloat(partes[2]));
    }
}
