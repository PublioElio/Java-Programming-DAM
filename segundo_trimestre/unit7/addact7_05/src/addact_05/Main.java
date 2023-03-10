package addact_05;

import java.util.Scanner;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el
 * código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones: 1. Listado 2. Alta 3. Baja 4. Modificación 5. Entrada de
 * mercancía 6. Salida de mercancía 7. Salir La entrada y salida de mercancía
 * supone respectivamente el incremento y decremento de stock de un determinado
 * artículo. Hay que controlar que no se pueda sacar más mercancía de la que hay
 * en el almacén.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);

    private static int getInteger(String message, String error, int min,
            int max) {
        int num;
        boolean validNum;
        do {
            System.out.print(message);
            num = sc.nextInt();
            validNum = num <= max && num >= min;
            if (!validNum) {
                System.out.print(error);
            }
        } while (!validNum);
        return (num);
    }

    private static String getString(String message) {
        String s;
        System.out.print(message);
        s = sc.nextLine();
        return (s);
    }

    private static double getDouble(String message, String error, double min) {
        double num;
        boolean notValidNum;
        do {
            System.out.print(message);
            num = sc.nextDouble();
            notValidNum = num < min;
            if (notValidNum) {
                System.out.print(error);
            }
        } while (notValidNum);
        return (num);
    }

    private static Item askForItem(ItemList list) {
        String code, description;
        double purchasePrice, sellPrice;
        int stock;
        boolean codeRepeated;
        do {
            code = getString("Enter new item code: ");
            Item test = new Item(code);
            codeRepeated = list.searchItem(test) != -1;
            if (codeRepeated) {
                System.out.print("Item code repeated. ");
            }
        } while (codeRepeated);
        description = getString("Enter new item description: ");
        purchasePrice = getDouble("Enter new item purchase price: ",
                "ERROR. Purchase price can't be negative. ", 0);
        sellPrice = getDouble("Enter new item sell price: ",
                "ERROR. Sell price must be higher than purchase price. ",
                purchasePrice);
        stock = getInteger("Enter new item stock: ",
                "ERROR: stock must be a positive number", 0,
                Integer.MAX_VALUE);
        Item newItem = new Item(code, description, purchasePrice,
                sellPrice, stock);
        return (newItem);
    }

    private static void modify(ItemList list) {
        Item itemToModify = new Item(getString("Enter item code to modify: "));
        int itemPos = list.searchItem(itemToModify);
        if (itemPos == -1) {
            System.out.println("\nERROR: item code not found.\n");
        } else {
            boolean exit = false;
            do {
                int selection = getInteger("""
                                           Enter a number to choose option: 
                                           1. Modify code 
                                           2. Modify description 
                                           3. Modify purchase price 
                                           4. Modify sell price 
                                           5. Back to main menu 
                                            -> """,
                        "ERROR: choose a valid option. ", 1, 5);
                sc.nextLine();
                switch (selection) {
                    case 1 -> {
                        String code;
                        boolean codeRepeated;
                        do {
                            code = getString("Enter new item code: ");
                            Item test = new Item(code);
                            codeRepeated = list.searchItem(test) != -1;
                            if (codeRepeated) {
                                System.out.print("Item code repeated. ");
                            }
                        } while (codeRepeated);
                        list.getList()[itemPos].setCode(code);
                    }
                    case 2 -> {
                        list.getList()[itemPos].setDescription(
                                getString("Enter new item description: "));
                    }
                    case 3 -> {
                        list.getList()[itemPos].setPurchasePrice(
                                getDouble("Enter new item purchase price: ",
                                        "ERROR. Purchase price can't be negative. ", 0));
                    }
                    case 4 -> {
                        list.getList()[itemPos].setSellPrice(
                                getDouble("Enter new item sell price: ",
                                        "ERROR. Sell price must be higher than purchase price. ",
                                        list.getList()[itemPos].getPurchasePrice()));
                    }
                    case 5 -> {
                        exit = true;
                    }
                }
            } while (!exit);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        ItemList list1 = new ItemList(3); // Lista de ejemplo para testear

        do {

            menu = getInteger("Enter a number to choose option: "
                    + "\n1. List items "
                    + "\n2. Register item "
                    + "\n3. Cancel product "
                    + "\n4. Edit product "
                    + "\n5. Enter goods "
                    + "\n6. Exit goods "
                    + "\n7. Exit program"
                    + "\n - ", "Choose a valid option. ", 1, 7);
            sc.nextLine(); // limpiar buffer de entrada de teclado

            switch (menu) {
                case 1 ->
                    System.out.println(list1.toString());
                case 2 -> {
                    if (list1.maxItemReached()) {
                        System.out.println("\nERROR: maximum number "
                                + "of items reached. Delete items first.\n");
                    } else {
                        Item newItem = askForItem(list1);
                        String message = !list1.insertItem(newItem)
                                ? "\nERROR: item not registered.\n"
                                : "\nItem registered\n";
                        System.out.println(message);
                    }
                }
                case 3 -> {
                    Item itemToDelete = new Item(getString(
                            "Enter item code to delete: "));
                    Item result = list1.deleteItem(itemToDelete); // he guardado el objeto a borrar, por si me sirve de algo
                    if (result.getCode() != null) {
                        System.out.println("Deleted item:\n" + result.toString());
                    } else {
                        System.out.println("\nERROR: item code not found.\n");
                    }
                }
                case 4 -> {
                    modify(list1);
                }
                case 5 -> {
                    Item itemStockToIncrease = new Item(
                            getString("Enter item code to increase stock: "));
                    int itemPos = list1.searchItem(itemStockToIncrease);
                    if (itemPos == -1) {
                        System.out.println("\nERROR: item code not found.\n");
                    } else {
                        list1.getList()[itemPos].increaseStock(
                                getInteger("Enter new item stock: ",
                                        "ERROR: stock must be a positive number",
                                        0, Integer.MAX_VALUE));
                    }
                }
                case 6 -> {
                    Item itemStockToDecrease = new Item(
                            getString("Enter item code to decrease stock: "));
                    int itemPos = list1.searchItem(itemStockToDecrease);
                    if (itemPos == -1) {
                        System.out.println("\nERROR: item code not found.\n");
                    } else {
                        list1.getList()[itemPos].decreaseStock(getInteger("Enter item stock to decrease: ",
                                "ERROR: maximum stock reached. ",
                                1, list1.getList()[itemPos].getStock()));
                    }
                }
                case 7 -> {
                    System.out.println("BYE!");
                }
            }
        } while (menu != 7);
    }

}
