//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void changeValue(int value) {
        value = 22;
    }

    public static void main(String[] args) {
        int value = 33;
        changeValue(33);
        System.out.println(value);
    }
}
