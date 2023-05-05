/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import Frames.*;
import Imagenes.*;
import Listas.Listas;

/**
 *
 * @author ricar
 */
public class threads extends Thread{
   Listas usuario = new Listas();
    ImagesController imagenes1 = new ImagesController();
    ImagesFunctions imagenes2 = new ImagesFunctions();
    public Editor editor = new Editor();
    
}
