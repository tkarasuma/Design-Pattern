public class ConcreteDecorator_A extends Decorator{
    public ConcreteDecorator_A(Component component) {
        super(component);
    }
    @Override
    public void method_1() {
        System.out.println("ConcreteDecorator_A#method_1 ===START===");
        component.method_1();
        System.out.println("ConcreteDecorator_A#method_1 === END ===");
    }

    @Override
    public void method_2() {
        System.out.println("ConcreteDecorator_A#method_2 ===START===");
        component.method_2();
        System.out.println("ConcreteDecorator_A#method_2 === END ===");
    }
}
