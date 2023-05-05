/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.io.Serializable;

import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Categorias<T> implements Serializable {

    private ArrayList<T> elementos;

    public Categorias() {
        elementos = new ArrayList<>();
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean contains(T elemento) {
        return elementos.contains(elemento);
    }

    public T get(int indice) {
        return elementos.get(indice);
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public void remove(int indice) {
        elementos.remove(indice);
    }

    public void clear() {
        elementos.clear();
    }

    public int indexOf(T elemento) {
        return elementos.indexOf(elemento);
    }

    public String[] toArray() {
        String[] array = new String[elementos.size()];
        for (int i = 0; i < elementos.size(); i++) {
            array[i] = elementos.get(i).toString();
        }
        return array;
    }

    public DefaultListModel<T> toDefaultListModel() {
        DefaultListModel<T> model = new DefaultListModel<>();
        for (T elemento : elementos) {
            model.addElement(elemento);
        }
        return model;
    }
}
