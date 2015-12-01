public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.method_1();
        component.method_2();

        System.out.println("");

        Component component_A = new ConcreteDecorator_A(component);
        component_A.method_1();
        component_A.method_2();

        System.out.println("");

        Component component_B = new ConcreteDecorator_B(component);
        component_B.method_1();
        component_B.method_2();

        System.out.println("");

    }
}
