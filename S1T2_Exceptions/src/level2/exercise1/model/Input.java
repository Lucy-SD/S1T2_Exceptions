package level2.exercise1.model;

import level2.exercise1.exceptions.InvalidStringException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner scan = new Scanner(System.in);

    public byte readByte(String message) {
        byte input = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextByte();
                scan.nextLine();
                if (input < 0 || input > 99) {
                    System.out.println("Dato inválido. Por favor, ingrese un número entre 0 y 99.\n");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese solamente números enteros.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public int readInt(String message) {
        int input = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextInt();
                scan.nextLine();
                if (input < 1925 || input > 2025) {
                    System.out.println("Dato inválido. Por favor, ingrese un número entre 1925 y 2025.\n");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese solamente número enteros.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public float readFloat(String message) {
        float input = 0f;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextFloat();
                scan.nextLine();
                if (input < 0.9 || input > 2.7) {
                    System.out.println("Dato inválido. Por favor ingrese un número entre 0,9 y 2,7.\n");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto. Por favor, ingrese enteros y decimales separados por una coma.\n");
                scan.nextLine();
            }
        }
        return input;
    }

    public double readDouble(String message) {
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

    public char readChar(String message) {
        String input;
        char validInput = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún carácter. Por favor, ingrese una respuesta válida.\n");
                }
                if (input.length() > 1) {
                    throw new InvalidStringException("Ha ingresado más de un carácter. Por favor, ingrese una respuesta válida\n");
                }
                validInput = input.charAt(0);
                valid = true;

            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
        return validInput;
    }

    public String readString(String message) {
        String input = "";
        boolean valid = false;

        while (!valid) {

            try {
                System.out.println(message);
                input = scan.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún carácter. Por favor, ingrese una respuesta válida.\n");
                } else {
                    valid = true;
                }
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }

        }
        return input;
    }

    public boolean readYesNo(String message) {
        String input;
        boolean validInput = false;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = scan.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidStringException("No ha ingresado ningún carácter. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no).\n");
                }
                if (input.length() > 1) {
                    throw new InvalidStringException("Ha ingresado más de un carácter. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no).\n");
                }
                if (input.equalsIgnoreCase("Y")) {
                    validInput = true;
                    valid = true;
                } else if (input.equalsIgnoreCase("N")) {
                    valid = true;
                } else {
                    throw new InvalidStringException("El carácter ingresado no es válido. Por favor, ingrese una respuesta válida " +
                            "(\"Y\" para \"si\" o \"N\" para \"no\").\n");
                }
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
        return validInput;
    }

    public void close() {
        scan.close();
    }

}
