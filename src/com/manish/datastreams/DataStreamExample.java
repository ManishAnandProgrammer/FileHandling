package com.manish.datastreams;

import java.io.*;

public class DataStreamExample {
    private static final String DATA_FILE = "resources/invoice-data.txt";

    private static final double[] PRICES = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    private static final int[] UNITS = { 12, 8, 13, 29, 50 };
    private static final String[] DESCRIPTION = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) {
        putDataInFile();
        readDataFromFile();
    }

    private static void putDataInFile() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(DATA_FILE)))) {
            for (int i = 0; i < PRICES.length; i ++) {
                dataOutputStream.writeDouble(PRICES[i]);
                dataOutputStream.writeInt(UNITS[i]);
                dataOutputStream.writeUTF(DESCRIPTION[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readDataFromFile() {
        try (DataInputStream in = new DataInputStream(new
                BufferedInputStream(new FileInputStream(DATA_FILE)))) {
            double price;
            int unit;
            String desc;
            double total = 0.0;

            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                            unit, desc, price);
                    total += unit * price;
                }
            } catch (EOFException ignored) {
            }
            System.out.println(total);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
