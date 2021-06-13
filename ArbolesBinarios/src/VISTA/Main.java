/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;
import MODELO.ArbolBinario;
import MODELO.NodoArbol;
import javax.swing.JOptionPane; 

/**
 *
 * @author Lenovo
 */
class ArbolesBinarios 
    {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) 
        {
            int opcion = 0,elemento;
            String nombre;
            ArbolBinario myTree = new ArbolBinario();
            do
                {
                    try
                        {
                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "1. Agregar un Nodo\n"+
                                    "2. Recorrer el Arbol INORDEN \n"+
                                    "3. Recorrer el Arbol PREORDEN \n"+
                                    "4. Recorrer el Arbol POSTORDEN \n"+
                                    "5. BuscarNodo \n"+
                                    
                                    "6.Reconstruccion\n"+
                                            "7. Salir\n"+
                                           
                                    "Elige una opcion....","Arboles Binarios",JOptionPane.QUESTION_MESSAGE));
                            switch(opcion)
                                {
                                    case 1:
                                        elemento = Integer.parseInt(JOptionPane.showInputDialog(
                                                null,"Ingresa el Numero del Nodo...","Agregando Nodo",
                                                JOptionPane.QUESTION_MESSAGE));
                                        nombre = JOptionPane.showInputDialog(null,
                                                "Ingresa el Nombre del nodo...","Agregando Nodo",
                                                JOptionPane.QUESTION_MESSAGE);
                                        myTree.agregarNodo(elemento, nombre);
                                        break;
                                    case 2:
                                        if(!myTree.estaVacio())
                                            {
                                                myTree.inOrden(myTree.raiz);
                                            }
                                        else
                                            {
                                                JOptionPane.showMessageDialog(null,
                                                "Arbol esta vacio","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        break;
                                    case 3:
                                        if(!myTree.estaVacio())
                                            {
                                                myTree.PreOrden(myTree.raiz);
                                            }
                                        else
                                            {
                                                JOptionPane.showMessageDialog(null,
                                                "Arbol esta vacio","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        
                                        break;
                                     case 4:
                                        if(!myTree.estaVacio())
                                            {
                                                myTree.PostOrden(myTree.raiz);
                                            }
                                        else
                                            {
                                                JOptionPane.showMessageDialog(null,
                                                "Arbol esta vacio","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        
                                        break; 
                                     case 5:
                                         
                                     if(!myTree.estaVacio())
                                            {
                                         elemento = Integer.parseInt(JOptionPane.showInputDialog(
                                                null,"Ingresa el Numero del Nodo a buscar...","",
                                                JOptionPane.QUESTION_MESSAGE));
                                   
                                      NodoArbol Nodo = myTree.BuscarNodo(elemento);
                                        if(Nodo != null)
                                        {
                                            System.out.println(Nodo.dato);
                                            System.out.println(Nodo.nombre);
                                        }
                                            
                                         
                                         else
                                            {
                                                JOptionPane.showMessageDialog(null,
                                                "NODO NO ENCONTRADO","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,
                                                "Arbol esta vacio","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                         }
                                            
                                         break;
                                         
                                     case 7:
                                        JOptionPane.showMessageDialog(null,
                                        "Aplicacion finalizada","Fin",
                                        JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                        
                                     case 6:
                                         myTree.agregarNodo(4, "a");
                                                myTree.agregarNodo(2, "b");
                                                myTree.agregarNodo(7, "c");
                                                myTree.agregarNodo(1, "d");
                                                myTree.agregarNodo(3, "e");
                                                myTree.agregarNodo(5, "f");
                                                myTree.agregarNodo(8, "g");
                                                myTree.agregarNodo(6, "h");
                                          if(!myTree.estaVacio())
                                            {
                                                
                                                
                                                myTree.Reconstruccion(myTree.raiz);
                                            }
                                        else
                                            {
                                                JOptionPane.showMessageDialog(null,
                                                "Arbol esta vacio","¡CUIDADO!",
                                                JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        
                                        break;   
                                        
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null,
                                        "OpcionIncorrecta","¡CUIDADO!",
                                        JOptionPane.INFORMATION_MESSAGE);
                                       
                            }
                        }
                    catch (NumberFormatException n)
                        {
                            JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                        }
                }while(opcion!=7);
        }
} 
