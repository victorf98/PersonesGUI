/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.model.business.entities;

/**
 *
 * @author Victo
 */
public class Persona extends Entity implements Comparable<Persona> {
    private String nom, dni;
    private short edat;

    public Persona() {
        this("", "", (short)0);
    }
    
    /**
     *
     * @param nom
     * @param dni
     * @param edat
     */
    public Persona(String nom, String dni, short edat) {
        super();
        this.nom = nom;
        this.dni = dni;
        this.edat = edat;
    }public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public short getEdat() {
        return edat;
    }

    public void setEdat(short edat) {
        this.edat = edat;
    }
    
    public void visualitzar(){
//        System.out.println("DNI: " + getDni());
//        System.out.println("Nom: " + getNom());
//        System.out.println("Edat: " + getEdat());
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return String.format("ID: %s\n" + "DNI: %s\n" + "Nom: %s\n" + "Edat %d\n",getId(), getDni(), getNom(), getEdat());
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNom().compareTo(o.getNom());
    }

    void compareToIgnoreCase(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
