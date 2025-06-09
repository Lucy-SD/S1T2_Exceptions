package level2.excercise1.runner;

import level2.excercise1.model.Input;

import java.io.FilterOutputStream;

public class ProgramRunner {

    public static void run () {

        byte age;
        int year;
        float height;
        double pi;
        char firstLetter;
        String lastname;
        boolean yesOrNo;


        System.out.println("Bienvenido al sistema de testeo.\nPor favor, responda a estas preguntas:");
        age = Input.readByte("Que edad tienes ¿?");
        year = Input.readInt("Desde que año vives en Barcelona ¿?");
        height = Input.readFloat("Cúanto mides ¿? (metros y centímetros separados por \",\")");
        pi = Input.readDouble("Ingresa todos los número que recuerdas de la constante Pi:" +
                "\n(enteros y decimales separados por \",\")");
        firstLetter = Input.readChar("Cúal es la inicial de tu nombre ¿?");
        lastname = Input.readString("Cúal es tu apellido ¿?");
        yesOrNo = Input.readYesNo("Vives sola ¿? (\"Y\" para \"si\" o \"N\" para \"no\")");
        System.out.println(firstLetter + " " + lastname + (yesOrNo? " ": " no ") + "vive sola, tiene " + age + " años, " +
                "vive en Barcelona desde el " + year + ", mide " + height + " mts, y todos los números que recuerda " +
                "de la constante Pi son: " + pi + ".\nMuchas gracias por participar de este testeo.");
    }
}
