package Servicios;

import java.util.Scanner;

public class ImprimirServicio {

    public static void main(String[] args) {
        Servicios datos = new Servicios();
        datos.DatosServicios();

        if (datos.idServicio == 2) {
            System.out.println("La visita con ID: " + datos.idServicio + " no puede ser agendada para la fecha solicitada");
            Scanner consola = new Scanner(System.in);
            System.out.println("Fecha elegida: " + datos.fechaInicio);
            System.out.println("Ingrese una nueva Fecha de visita: ");
            var nuevaFecha = consola.nextLine();
            datos.CambiarFechaVisita(nuevaFecha);
            System.out.println("Visita Registrada correctamente");
        } else {
            System.out.println("Visita Registrada correctamente");
        }

    }
}
