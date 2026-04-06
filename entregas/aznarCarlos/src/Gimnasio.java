class Gimnasio {

    private String nombreGimnasio = "FitLifeCenter";
    private String[] listaActividades = { "yoga", "spinning", "pilates", "aquagym" };
    private String[] listaSocios = { "Juan Garcia", "Gustavo Fring", "Maria Lopez", "Saul Perez" };
    private String[] listaMonitores = { "Carlos Lopez", "Maria Martinez", "Ana Sobremazas", "Carmen Santamaria" };
    private String[] listaDNI = { "12345678A", "87654321B", "79189017K", "11223344C" };
    private int[] listaAforo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    private String[] listaFechas = { "Lunes/Viernes", "Martes/Jueves", "Miercoles", "Mircoles/Viernes" };
    private int reservasActuales = 0;

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

    public void Reservas(String Socios, String Actividad) {

        if (reservasActuales < listaAforo.length) {
            reservasActuales++;
            System.out.println(" RESERVA OK-> " + Socios + " se ha apuntado a " + Actividad + ".");
            System.out.println("   (Plazas ocupadas: " + reservasActuales + " de " + listaAforo.length + ")");
        } else {
            System.out.println(" ERROR-> No hay plazas para " + Actividad + ". Aforo completo.");
        }
    }

    public void CancelarReserva(String Socio, String Actividad, String Motivo) {
        if (reservasActuales > 0) {
            reservasActuales--;
            System.out.println(" CANCELACIoN: " + Socio + " se dio de baja de " + Actividad + ".");
            System.out.println("   Motivo: " + Motivo);
        } else {
            System.out.println("No hay ninguna reserva activa no podemos cancelar ");
        }
    }

    public Gimnasio(String NombreGimnasio, int[] Aforo) {
        System.out.println(" Gimnasio '" + NombreGimnasio + "' abierto. Aforo maximo: " + Aforo.length + " personas.");
    }

    public void Monitor(String Monitor, String Actividad) {
        System.out.println("[PERSONAL] El monitor " + Monitor + " ha fichado para dar " + Actividad + ".");
    }

public void EstadoReserva(String Socio, String Actividad, String EstadoReserva) {
        System.out.println("[CONSULTA] La reserva de " + Socio + " para la clase de " + Actividad + " esta: " + EstadoReserva.toUpperCase());
    }
}
