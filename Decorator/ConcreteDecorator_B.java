public class ConcreteDecorator_B extends Decorator{
    public ConcreteDecorator_B(Component component) {
        super(component);
    }
    @Override
    public void method_1() {
        System.out.println("ConcreteDecorator_B#method_1 ===START===");
        component.method_1();
        System.out.println("ConcreteDecorator_B#method_1 === END ===");
    }

    @Override
    public void method_2() {
        System.out.println("ConcreteDecorator_B#method_2 ===START===");
        component.method_2();
        System.out.println("ConcreteDecorator_B#method_2 === END ===");
    }
}
