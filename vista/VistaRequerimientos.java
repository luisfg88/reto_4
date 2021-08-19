package vista;

import controlador.ControladorRequerimientos;

import java.util.ArrayList;
import modelo.VO.*;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<LideresDocsBaqVO> consulta = controlador.consultarLideresDocsBaq();

            System.out.println("Requerimiento 1, Consulta 1:");
            System.out.println("Nombre Documento_Identidad");

            for (LideresDocsBaqVO registro : consulta) {
                String nombre = registro.getNombre();
                String documentoIdentidad = registro.getDocumento_Identidad();
               

                System.out.println(nombre + " " + documentoIdentidad);
                
            }
        } catch (Exception e) {
            System.err.println("Oops! Pasó algo" + e.getMessage());
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<MaterialesProyectosVO> consulta = controlador.consultarMaterialesProyectos();

            System.out.println("Requerimiento 2, Consulta 4:");
            System.out.println("Nombre_Material Precio_Unidad Total");

            for (MaterialesProyectosVO registro : consulta) {
                String nombreMaterial = registro.getNombre_Material();
                Integer precioUnidad = registro.getPrecio_Unidad();
                Integer total = registro.getTotal();

                System.out.println(nombreMaterial + " " + precioUnidad + " " + total);
                
            }
        } catch (Exception e) {
            System.err.println("Oops! Pasó algo" + e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<LideresCostosPromVO> consulta = controlador.consultarLideresCostosProm();

            System.out.println("Requerimiento 3, Consulta 5:");
            System.out.println("Nombre Promedio");

            for (LideresCostosPromVO registro : consulta) {
                String nombre = registro.getNombre();
                Integer promedio = registro.getPromedio();

                System.out.println(nombre + " " + promedio);
                
            }
        } catch (Exception e) {
            System.err.println("Oops! Pasó algo" + e.getMessage());
        }
    }
    
}
