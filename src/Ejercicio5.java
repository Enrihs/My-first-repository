public class Ejercicio5 {
    public static void main (String[] args){
        final String APLICACION="Mi app";
        final String VERSION="1.0.0";
        final double PI=3.14159;
        String usuarioActual="Laura";
        int nivel=1;
        int puntuacion=0;

        System.out.println("Aplicación:"+APLICACION);
        System.out.println("Versión:"+VERSION);
        System.out.println("Valor de PI:"+PI);
        System.out.println("Usuario actual:"+usuarioActual);
        System.out.println("Nivel:"+nivel);
        System.out.println("Puntuación:"+puntuacion);

        usuarioActual="Miguel";
        nivel=2;
        puntuacion=150;

        System.out.println("Usuario actualizado:"+usuarioActual);
        System.out.println("Nivel actualizado:"+nivel);
        System.out.println("Puntuación acitualizada:"+puntuacion);

    }
}
