/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread1;


public class Main {


    public static void main(String[] args) {
        
        Thread hiloPrincipal = Thread.currentThread(); 

        System.out.println("Nombre del hilo principal: " + hiloPrincipal.getName());

        hiloPrincipal.setName("Hilo_Principal_Modificado");
        System.out.println("Nuevo nombre del hilo principal: " + hiloPrincipal.getName());

        System.out.println("Prioridad del hilo principal: " + hiloPrincipal.getPriority());

        
        hiloPrincipal.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Prioridad del hilo principal después de cambiarla: " + hiloPrincipal.getPriority());

        MiHilo miHilo = new MiHilo();
        miHilo.start(); 
    }
        
}
