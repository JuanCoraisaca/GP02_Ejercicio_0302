/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.gp02_ejercicio_0302;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       var inscripcion = new Inscripcion ("Inscripcion");
       inscripcion.setVisible(true);
       
       var datosPersonales = new DatosPersonales ("Datos Personales");
       datosPersonales.setVisible(true);
       
       var informacionCarrera = new InformacionCarrera("Informacion de Carrera");
       informacionCarrera.setVisible(true);
       
       var crearGrupo = new CrearGrupo("Crear Grupo");
       crearGrupo.setVisible(true);
       
       var ventana5 = new Ventana5("");
       ventana5.setVisible(true);
    
    }
    
}
