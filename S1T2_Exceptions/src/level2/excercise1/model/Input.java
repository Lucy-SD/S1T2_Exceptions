package level2.excercise1.model;

import level2.excercise1.exceptions.InvalidStringException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scan = new Scanner(System.in);

    public static byte readByte(String message) {
        byte input = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextByte();
                scan.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese solamente números enteros.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public static int readInt(String message) {
        int input = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextInt();
                scan.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese solamente número enteros.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public static float readFloat(String message) {
        float input = 0f;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextFloat();
                scan.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese enteros y decimales separados por una coma.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public static double readDouble(String message) {
        double input = 0d;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextDouble();
                scan.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese enteros y decimales separados por una coma.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public static char readChar(String message) {
        String input = "";
        char validInput = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún caracter. Por favor, ingrese una respuesta válida.\n");
                }
                if (input.length() > 1) {
                    throw new InvalidStringException("Ha ingresado más de un caracter. Por favor, ingrese una respuesta válida\n");
                }
                validInput = input.charAt(0);
                valid = true;

            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
        return validInput;
    }

    public static String readString(String message) {
        String input = "";
        boolean valid = false;

        while (!valid) {

            try {
                System.out.println(message);
                input = scan.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún caracter. Por favor, ingrese una respuesta válida.\n");
                } else {
                    valid = true;
                }
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }

        }
        return input;
    }

    public static boolean readYesNo(String message) {
        String input = "";
        boolean validInput = false;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún caracter. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no).\n");
                }
                if (input.length() > 1) {
                    throw new InvalidStringException("Ha ingresado más de un caracter. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no).\n");
                }
                if (input.equalsIgnoreCase("Y")) {
                    validInput = true;
                    valid = true;
                } else if (input.equalsIgnoreCase("N")) {
                    valid = true;
                } else {
                    throw new InvalidStringException("El caracter ingresado no es válido. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no\").") ;
                }
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
        return validInput;
    }

}
