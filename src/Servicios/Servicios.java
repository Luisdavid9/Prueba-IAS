package Servicios;

import java.util.Scanner;


public class Servicios {
    
    public int idServicio;
    
    public String direccion;
    
    public String descripcionServicio;
    
    public String fechaInicio;
    
    public String fechaFin;
    
    public String tecnicoAsignado;
  
    public void DatosServicios() {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese ID del Servicio: ");
        this.idServicio = Integer.parseInt(consola.nextLine());
        System.out.println("idServicio = " + idServicio);
        
        System.out.println("Ingrese la direccion: ");
        this.direccion = consola.nextLine();
        System.out.println("direccion = " + direccion);
        
        System.out.println("Ingrese la descrpcion del servicio: ");
        this.descripcionServicio = consola.nextLine();
        System.out.println("descripcionServicio = " + descripcionServicio);
        
        System.out.println("Ingrese Fecha de inicio del servicio: ");
        this.fechaInicio = consola.nextLine();
        System.out.println("fechaInicio = " + fechaInicio);
        
        System.out.println("Ingrese Fecha fin del servicio: ");
        this.fechaFin = consola.nextLine();
        System.out.println("fechaFin = " + fechaFin);
        
        System.out.println("Ingrese el tecnico");
        this.tecnicoAsignado = consola.nextLine();
        System.out.println("tecnicoAsignado = " + tecnicoAsignado);
        
        
    }
    
    public String CambiarFechaVisita(String nuevaFecha){
        System.out.println("nueva Fecha de visita = " + nuevaFecha);
        this.fechaInicio = nuevaFecha;
        return this.fechaInicio;
    }
    
    
}
