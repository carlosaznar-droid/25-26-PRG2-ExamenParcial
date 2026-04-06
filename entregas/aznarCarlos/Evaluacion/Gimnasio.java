class Gimnasio { 

    private String NombreGimnasio = "FitLifeCenter";
    private String[] ListaActividades = {"yoga", "spinning", "pilates", "aquagym"};
    private String[] ListaSocios = {"Juan Garcia", "Gustavo Fring", "Maria Lopez", "Saul Perez"};
    private String[] ListaMonitores = {"Carlos Lopez", "Maria Martinez", "Ana Sobremazas", "Carmen Santamaria"};
    private String[] ListaDNI = {"12345678A", "87654321B", "79189017K", "11223344C"}; 
    private int[] Aforo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private String[] Fechas = {"Lunes/Viernes", "Martes/Jueves", "Miercoles", "Miercoles/Viernes"};
    
    private boolean EstadoSuscripcion;
    private String Motivo;
    private int reservasActuales = 0; 

    public Gimnasio(String NombreGimnasio, int[] Aforo) {
        this.NombreGimnasio = NombreGimnasio;
        this.Aforo = Aforo;
        System.out.println("Gimnasio '" + this.NombreGimnasio + "' abierto. Aforo maximo: " + this.Aforo.length + " personas.");
    }

    public void Actividad(String Actividad, String Monitores, String Fechas, int[] Aforo) {
        System.out.println("Actividad seleccionada de nuestra lista de " + this.ListaActividades.length + " opciones.");
        System.out.println("Fechas disponibles en sistema: " + this.Fechas.length + " franjas.");
        System.out.println("Clase de " + Actividad + " programada.");
    }

    public void Socios(String Socios, String DNI, boolean EstadoSuscripcion) {
        this.EstadoSuscripcion = EstadoSuscripcion;
        System.out.println("Verificando en base de " + this.ListaSocios.length + " socios y " + this.ListaDNI.length + " DNIs registrados.");
        
        if (this.EstadoSuscripcion) {
            System.out.println(Socios + " (DNI: " + DNI + ") esta ACTIVO. Puede entrar.");
        } else {
            System.out.println(Socios + " (DNI: " + DNI + ") esta INACTIVO. Acceso denegado.");
        }
    }

    public void reservas(String Socios, String Actividad) {
        if (this.reservasActuales < this.Aforo.length) {
            this.reservasActuales++; 
            System.out.println("RESERVA OK: " + Socios + " se ha apuntado a " + Actividad + ".");
            System.out.println("Plazas ocupadas: " + this.reservasActuales + " de " + this.Aforo.length);
        } else {
            System.out.println("ERROR: No hay plazas para " + Actividad + ". Aforo completo.");
        }
    }

    public void CancelarReserva(String Socio, String Actividad, String Motivo) {
        this.Motivo = Motivo;
        if (this.reservasActuales > 0) {
            this.reservasActuales--; 
            System.out.println("CANCELACIoN: " + Socio + " se dio de baja de " + Actividad + ".");
            System.out.println("Motivo guardado: " + this.Motivo);
        } else {
            System.out.println("No hay ninguna reserva activa en este momento.");
        }
    }

    public void Monitor(String Monitor, String Actividad) {
        System.out.println("Validando con nuestra plantilla de " + this.ListaMonitores.length + " profesionales.");
        System.out.println("El monitor " + Monitor + " ha fichado para dar " + Actividad + ".");
    }

    public void EstadoReserva(String Socio, String Actividad, String EstadoReserva) {
        System.out.println("La reserva de " + Socio + " para " + Actividad + " esta: " + EstadoReserva);
    }
}   