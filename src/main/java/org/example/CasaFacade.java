package org.example;

// La clase Facade simplifica la interacción con varios subsistemas de la casa
public class CasaFacade {

    // Instancias de los subsistemas
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;

    // Constructor que inicializa los subsistemas
    public CasaFacade() {
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento();
    }

    // Método que activa el modo noche
    public void modoNoche() {
        iluminacion.apagarLuces();  // Apaga las luces
        climatizacion.encenderAireAcondicionado();  // Enciende el aire acondicionado
        seguridad.activarSistema();  // Activa la seguridad
        entretenimiento.apagarTelevisor();  // Asegura que el televisor esté apagado
        System.out.println("Modo noche activado.");
    }

    // Método que activa el modo día
    public void modoDia() {
        iluminacion.encenderLuces();  // Enciende las luces
        climatizacion.apagarAireAcondicionado();  // Apaga el aire acondicionado
        seguridad.desactivarSistema();  // Desactiva la seguridad
        entretenimiento.apagarTelevisor();  // Asegura que el televisor esté apagado
        System.out.println("Modo día activado.");
    }

    // Método que activa el modo cine
    public void modoCine() {
        iluminacion.apagarLuces();  // Apaga las luces para crear ambiente
        entretenimiento.encenderTelevisor();  // Enciende el televisor
        seguridad.activarSistema();  // Activa la seguridad durante la sesión de cine
        System.out.println("Modo cine activado.");
    }
}

