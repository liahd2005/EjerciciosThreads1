/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread;


public class Main {


    public static void main(String[] args) {
        
        // 2. Crear una instancia del hilo principal Thread
        Thread hiloPrincipal = Thread.currentThread(); // Obtener referencia al hilo principal

        // Obtener el nombre del hilo principal
        System.out.println("Nombre del hilo principal: " + hiloPrincipal.getName());

        // Cambiar el nombre del hilo principal
        hiloPrincipal.setName("Hilo_Principal_Modificado");
        System.out.println("Nuevo nombre del hilo principal: " + hiloPrincipal.getName());

        // Obtener la prioridad del hilo principal
        System.out.println("Prioridad del hilo principal: " + hiloPrincipal.getPriority());

        // Establecer la prioridad del hilo principal en MAX(10)
        hiloPrincipal.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Prioridad del hilo principal después de cambiarla: " + hiloPrincipal.getPriority());

        // Crear e iniciar una instancia de la clase MiHilo
        MiHilo miHilo = new MiHilo();
        miHilo.start(); // Iniciar el hilo, lo que llamará al método run() de la clase MiHilo
    }
        
}
