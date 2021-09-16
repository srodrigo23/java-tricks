package instancia;

import java.util.ArrayList;

class HorarioClases {
    Fecha fechaActual;
    ArrayList<Clase>clases;

    public HorarioClases(Fecha fechaActual, ArrayList<Clase> clases) {
        this.fechaActual = fechaActual;
        this.clases = clases;
    }

    public void crearHorario(){
        clases.add(new Clase("Intro", "Jorge", new Hora(), new Hora(), 123));
        clases.add(new Clase("Calculo", "Andres", new Hora(), new Hora(), 123));
        clases.add(new Clase("Algebra", "Pedro", new Hora(), new Hora(), 123));
        clases.add(new Clase("Ingles", "Manuel", new Hora(), new Hora(), 123));
        clases.add(new Clase("Fisica", "Enrrique", new Hora(), new Hora(), 123));
    }

}

class Clase{

    String nombreMateria;
    String nombreDocente;
    Hora horaInicio;
    Hora horaFin;
    int aula;

    public Clase(String nombreMateria,
                 String nombreDocente,
                 Hora horaInicio, Hora horaFin, int aula) {
        this.nombreMateria = nombreMateria;
        this.nombreDocente = nombreDocente;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.aula = aula;
    }

    public void mostrarClase(){
        System.out.println("Nombre de la materia " + nombreMateria);
        System.out.println("Nombre del docente " + nombreMateria);
        System.out.println("Hora inicio " + horaInicio.toString());
        System.out.println("Hora final " + horaFin.toString());
        System.out.println("Aula asiganada " + aula);

    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public void setHoraInicio(Hora horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(Hora horaFin) {
        this.horaFin = horaFin;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }
}


