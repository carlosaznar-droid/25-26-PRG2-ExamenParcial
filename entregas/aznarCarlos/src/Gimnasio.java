class Gimnasio { 

    private String NombreGimnasio = "FitLifeCenter";
    private String[] ListaActividades = {"yoga", "spinning", "pilates", "aquagym"};
    private String[] ListaSocios = {"Juan Garcia", "Gustavo Fring", "Maria Lopez", "Saul Perez"};
    private String[] ListaMonitores = {"Carlos Lopez", "Maria Martinez", "Ana Sobremazas", "Carmen Santamaria"};
    private String[] ListaDNI = {"12345678A", "87654321B", "79189017K", "11223344C"}; 
    private int[] Aforo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private String[] Fechas = {"Lunes/Viernes", "Martes/Jueves", "Miercoles", "Miércoles/Viernes"};
    
    private boolean EstadoSuscripcion;
    private String Motivo;
    private int reservasActuales = 0; 

    public Gimnasio(String NombreGimnasio, int[] Aforo) {
        this.NombreGimnasio = NombreGimnasio;
        this.Aforo = Aforo;
        System.out.println("Gimnasio '" + this.NombreGimnasio + "' abierto. Aforo: " + this.Aforo.length);
    }

    public void Actividad(String Actividad, String Monitores, String Fechas, int[] Aforo) {
        System.out.println("Sistema con " + this.ListaActividades.length + " actividades y " + this.Fechas.length + " fechas base.");
        System.out.println("Clase de " + Actividad + " programada para los " + Fechas);
    }

    public void Socios(String Socios, String DNI, boolean EstadoSuscripcion) {
        this.EstadoSuscripcion = EstadoSuscripcion;
        System.out.println("Verificando en base de " + this.ListaSocios.length + " socios y " + this.ListaDNI.length + " DNIs...");
        
        if (this.EstadoSuscripcion) {
            System.out.println("ACCESO PERMITIDO: " + Socios + " (DNI: " + DNI + ")");
        } else {
            System.out.println("ACCESO DENEGADO: " + Socios + " (DNI: " + DNI + ")");
        }
    }

    public void reservas(String Socios, String Actividad) {
        if (this.reservasActuales < this.Aforo.length) {
            this.reservasActuales++; 
            System.out.println("Reserva OK: " + Socios + " se ha apuntado a " + Actividad);
            System.out.println("Plazas ocupadas: " + this.reservasActuales + " de " + this.Aforo.length);
        } else {
            System.out.println("Aforo completo para " + Actividad);
        }
    }

    public void CancelarReserva(String Socio, String Actividad, String Motivo) {
        this.Motivo = Motivo;
        if (this.reservasActuales > 0) {
            this.reservasActuales--; 
            System.out.println("Reserva cancelada para " + Socio + " en " + Actividad);
            System.out.println("Motivo guardado: " + this.Motivo);
        }
    }

    public void Monitor(String Monitor, String Actividad) {
        System.out.println("Validando con plantilla de " + this.ListaMonitores.length + " instructores...");
        System.out.println("El monitor " + Monitor + " da la clase de " + Actividad);
    }

    public void EstadoReserva(String Socio, String Actividad, String EstadoReserva) {
        System.out.println("La reserva de " + Socio + " está: " + EstadoReserva);
    }

    public static void main(String[] args) {
        
        int[] miAforo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Gimnasio miGimnasio = new Gimnasio("FitLifeCenter", miAforo);
        
        System.out.println("---");
        miGimnasio.Actividad("yoga", "Carlos Lopez", "Lunes/Viernes", miAforo);
        
        System.out.println("---");
        miGimnasio.Monitor("Carlos Lopez", "yoga");
        
        System.out.println("---");
        miGimnasio.Socios("Gustavo Fring", "87654321B", true);
        
        System.out.println("---");
        miGimnasio.reservas("Gustavo Fring", "yoga");
        
        System.out.println("---");
        miGimnasio.CancelarReserva("Gustavo Fring", "yoga", "Reunión urgente");
    }
}