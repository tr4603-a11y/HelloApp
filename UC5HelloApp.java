public class HelloApp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder namesList = new StringBuilder();
            boolean isFirst = true;
            for (String name : args) {
                if (!isFirst) {
                    namesList.append(", ");
                }
                namesList.append(name);
                isFirst = false;
            }
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}