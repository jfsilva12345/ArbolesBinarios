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

public class ArbolBinario
{

            public NodoArbol raiz;
            public int NumerosNodos=0;
            public String Matriz[][];
            private int contadorPos;
            private int vectorPos[];
            private int contadorIn;
            private int vectorIn[];
            
              //constructor para inicializar el puntero de la raiz en nulo
            public ArbolBinario()
                {
                    raiz = null;
                }
    //metodo para insertar un nodo en el arbol
            public void agregarNodo(int d, String nom)
                {
                    NumerosNodos=NumerosNodos+1;
                    NodoArbol nuevo = new NodoArbol(d,nom);
                    if(raiz == null)
                        {
                            raiz = nuevo;
                        }
                    else
                        {
                            NodoArbol auxiliar = raiz;
                            NodoArbol padre;
                            while(true)
                                {
                                    padre = auxiliar;
                                    if(d < auxiliar.dato)
                                        {
                                            auxiliar = auxiliar.hijoIzquierdo;
                                            if(auxiliar == null)
                                                {
                                                    padre.hijoIzquierdo = nuevo;
                                                    return; 
    //sirve para finalizar el metodo cuando suretorno es void
                                                }
                                        }
    //que implementen que pasaria al lado derecho
                                    else
                                        {
                                            auxiliar = auxiliar.hijoDerecho;
                                            if(auxiliar == null)
                                                {
                                                    padre.hijoDerecho = nuevo;
                                                    return;
                                                }
                                        }
                                }
                        }
                    }
            //metodo para saber cuando un arbol esta vacio
            public boolean estaVacio()
                {
                    return raiz == null;
                }
            //meteodo para recorrer el arbol INORDEN
            public void inOrden(NodoArbol r)
                {
                    
                 
                    if(r != null)
                        {
                            try
                            {

                            inOrden(r.hijoIzquierdo);
                            //System.out.println(r.dato);
                            
                            vectorIn[contadorIn]=r.dato;
                            contadorIn = contadorIn+1;
                            inOrden(r.hijoDerecho);
                            
                                
                            }
                            catch(NumberFormatException n)
                            {
                                
                            }

                            
                            
                        }
                }
             public void PostOrden(NodoArbol r)
                {
                    if(r != null)
                        {
                            try
                            {
                               
                            PostOrden(r.hijoIzquierdo);
                            PostOrden(r.hijoDerecho);
                            //System.out.println(r.dato);
                             
                            vectorPos[contadorPos]=r.dato;
                            contadorPos= contadorPos+1;
                             
                                
                            }
                            catch(NumberFormatException n)
                            {
                                
                            }

                            
                        }
                }
              public void PreOrden(NodoArbol r)
                {
                    if(r != null)
                        {
                            System.out.println(r.dato);
                            PreOrden(r.hijoIzquierdo);
                            PreOrden(r.hijoDerecho);
                            
                            
                        }
                }
              public NodoArbol BuscarNodo(int dato)
              {
                  NodoArbol NodoAuxiliar= this.raiz;
                  while(NodoAuxiliar.dato != dato)
                  {
                      if(dato < NodoAuxiliar.dato)
                      {
                          NodoAuxiliar= NodoAuxiliar.hijoIzquierdo;    
                      }
                      else
                      {
                          NodoAuxiliar= NodoAuxiliar.hijoDerecho;
                      }
                      if(NodoAuxiliar== null)
                      {
                          return null;
                      }
                  }
                   return NodoAuxiliar;
              }
              
              public void Reconstruccion(NodoArbol Arbol)
              { 
                  vectorIn= new int[NumerosNodos];
                  vectorPos= new int[NumerosNodos];
                  Matriz= new String[NumerosNodos][NumerosNodos];
                PostOrden(Arbol);
                inOrden(Arbol);
                int x,y=0;
                while(y<NumerosNodos)
                {
                    int primero = vectorPos[0];
                
                for(x= 0; x<vectorPos.length-1; x++)
                {
                    vectorPos[x] = vectorPos[x+1];
                }
                vectorPos[x]= primero;
                y++;
                }
                  for (int i = 0; i < vectorPos.length; i++) {
                      System.out.print(vectorPos[i]);
                      
                  }
               for (int i = 0; i < vectorIn.length; i++)
                          {
                              try{
                                  for (int j = 0; j < vectorPos.length; j++) {
                                  if(vectorIn[j]==vectorPos[i])
                                  {
                                        Matriz[i][j]=String.valueOf(vectorPos[i]);
                                       
                                  }
                                  else
                                  {
                                      Matriz[i][j]="";
                                  }
                                  System.out.print(Matriz[i][j]+"\t");
  
                                  
                              }  
                                System.out.println("");
                                  
                              }
                               catch (NumberFormatException n)
                        {
                           System.out.println("error"); 
                        }
                              
                      
                  } 
              }
              




}
