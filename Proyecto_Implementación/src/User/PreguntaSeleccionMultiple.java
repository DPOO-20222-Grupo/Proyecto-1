package User;

public class PreguntaSeleccionMultiple extends Pregunta {
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private int opcionCorrecta;
    private int opcionEscogida;

    // Constructor
    public PreguntaSeleccionMultiple(String enunciado, String opcion1, String opcion2, String opcion3, String opcion4, int opcionCorrecta) {
        super(enunciado);
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.opcionCorrecta = opcionCorrecta;
        this.opcionEscogida = -1; // Inicialmente ninguna opción está escogida
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public int getOpcionEscogida() {
        return opcionEscogida;
    }

    public void setOpcionEscogida(int opcionEscogida) {
        this.opcionEscogida = opcionEscogida;
    }
}

