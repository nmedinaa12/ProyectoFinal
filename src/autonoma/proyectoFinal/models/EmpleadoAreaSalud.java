/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectoFinal.models;

/**
 *
 * @author user
 */
public class EmpleadoAreaSalud extends Empleado {
    private String especialidad;
    private double numeroHorasTrabajadas;

    public EmpleadoAreaSalud(String nombre, String cedula, String edad, double salario,
                             String especialidad, double numeroHorasTrabajadas) {
        super(nombre, cedula, edad, salario);
        this.especialidad = especialidad;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(double numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    
    @Override
    public double calcularSalario() {
        return (salario * 0.012) * numeroHorasTrabajadas; // 1.2% por hora trabajada
    }
}
