/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author harum
 */
public interface IMetodos<T> {
    public int tamanio();
    public boolean EsVacia();
    public T Obtener(int i);
    public void Agregar(T x);
    public void Eliminar (int i);


}
