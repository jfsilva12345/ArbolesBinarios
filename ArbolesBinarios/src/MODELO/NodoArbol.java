/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Lenovo
 */
public class NodoArbol
        {
            public int dato;
            public String nombre;
            NodoArbol hijoIzquierdo,hijoDerecho;
            //constructor
            public NodoArbol(int d, String nom)
            {
                this.dato = d;
                this.nombre = nom;
                this.hijoDerecho = null;
                this.hijoIzquierdo = null;
            } 
    //permite mostrar la informacion completa del objeto     
            public String toString()
                {
                    return nombre + "Su dato es: "+dato;
                }
        }