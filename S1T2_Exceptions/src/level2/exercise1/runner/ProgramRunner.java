package level2.exercise1.runner;

import level2.exercise1.model.Input;

public class ProgramRunner {

    public static void run () {

        Input input = new Input();

        byte age;
        int year;
        float height;
        double pi;
        char firstLetter;
        String lastname;
        boolean yesOrNo;


        System.out.println("Bienvenido al sistema de testeo.\nPor favor, responda a estas preguntas:");

        age = input.readByte("Que edad tienes ¿?");
        year = input.readInt("Desde que año vives en Barcelona ¿?");
        height = input.readFloat("Cúanto mides ¿? (metros y centímetros separados por \",\")");
        pi = input.readDouble("Ingresa todos los número que recuerdas de la constante Pi:" +
                "\n(enteros y decimales separados por \",\")");
        firstLetter = input.readChar("Cúal es la inicial de tu nombre ¿?");
        lastname = input.readString("Cúal es tu apellido ¿?");
        yesOrNo = input.readYesNo("Vives sola ¿? (\"Y\" para \"si\" o \"N\" para \"no\")");

        System.out.println(firstLetter + " " + lastname + (yesOrNo? " ": " no ") + "vive sola, tiene " + age + " años, " +
                "vive en Barcelona desde el " + year + ", mide " + height + " mts, y todos los números que recuerda " +
                "de la constante Pi son: " + pi + ".\nMuchas gracias por participar de este testeo.");

        input.close();
    }
}
