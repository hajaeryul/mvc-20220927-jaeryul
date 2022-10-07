package DI_IoC;

public class Main {

    public static void main(String[] args) {

        ClassB classB1 = new ClassBImpl1();
        ClassB classB2 = new ClassBImpl2();

        ClassA classA = new ClassAImpl1(classB2); //이거만 수정하면 마음대로 쓸 수 있음. 뒤에거 안건드려도

        classA.logic1();
        classA.logic2();
        classA.logic3();


    }
}
