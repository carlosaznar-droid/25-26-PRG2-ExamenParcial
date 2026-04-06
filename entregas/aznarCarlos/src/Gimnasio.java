class Gimnasio {

private String NombreGimnasio = "FitLifeCenter";

private String[] Actividad = {"yoga","spinning","pilates","aquagym"};

private String[] Socios = {"Juan Garcia","Gustavo Fring","Maria Lopez","Saul Perez"};

private String[] Monitores = {"Carlos Lopez","Maria Martinez","Ana Sobremazas","Carmen Santamaria"};

private String[] DNI = {"12345678A","87654321B","79189017K","11223344C"};

private double[] Aforo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

private String[] Fechas = {"Lunes/Viernes","Martes/Jueves","Miercoles","Miercoles/Viernes"};

private boolean[] EstadoSuscripcion = {true, false};

private String Motivo = "...";

        public void Actividad(String Actividad, String Monitores, String Fechas, int[] Aforo) {
            System.out.println("[INFO] Clase de " + Actividad + " programada para los " + Fechas + ".");
            System.out.println("       Monitor asignado: " + Monitores + ".");
        }

        public void Socios(String Socios, String DNI, boolean EstadoSuscripcion) {
            if (EstadoSuscripcion == true) {
                System.out.println("[SOCIO] " + Socios + " (DNI: " + DNI + ") esta ACTIVO. Puede entrar.");
            } else {
                System.out.println("[SOCIO] " + Socios + " (DNI: " + DNI + ") esta INACTIVO. Acceso denegado.");
            }
        }

public void reservas(String Socios, String Actividad) {}

public void CancelarReserva(String Socio, String Actividad, String Motivo) {}

public Gimnasio(String NombreGimnasio, int[] Aforo) {
  System.out.println(" Gimnasio '" + NombreGimnasio + "' abierto. Aforo maximo: " + Aforo.length + " personas.");
    }

public void Monitor(String Monitor, String Actividad) {}

public void EstadoReserva(String Socio, String Actividad, boolean EstadoReserva) {}
