/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_jtable;

/**
 *
 * @author usuario
 */
public class Producto {
    
    private String nombre;
    private int piezas;
    private double precio;

    public Producto(String nombre, int piezas, double precio) {
        this.nombre = nombre;
        this.piezas = piezas;
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the piezas
     */
    public int getPiezas() {
        return piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
