import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What homework part do you want to check?");
        System.out.println("Choose 1,2,3");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                firstPart();
                break;
            case 2:
                secondPart();
                break;
            case 3:
                thirdPart();
                break;
            default:
                System.out.println("I'm sorry, I've only done the required part so far :(");
        }

    }static void secondPart(){
        System.out.println("Система мультинаследования");
        First f = new First();
        Second s = new Second();
        Third t = new Third();
        f.override();
        s.override();
        t.override();
        System.out.println("Итак, вывилась 1, так как это сумма чисел с метода в 1м классе." +
                "Затем вывелось 2, так как это сумма чисел со второго класса, ну а так как метод перезаписался, метод первого класса он нетрогает." +
                "Далее выводится 3 - это сумма чисел из 3го класса, соответсвенно метод тоже перезаписан и метод второго класса он не трогает." +
                "Ну и последней вывелось 2, так как мы после своего перезаписанного метода вызвали еще супер метод, " +
                "соответвенно вывев свой метод он пошел к папке и вывел его метод, так как 2й класс радной папка 3го)))");
    }
    static void firstPart(){
        Eagle e = new Eagle();
        Penguin pn = new Penguin();
        Pelican pl = new Pelican();
        System.out.println("Eagle skills");
        e.eat();
        e.fly();
        e.sleep();
        e.voice();
        System.out.println();
        System.out.println("Penguin skills");
        pn.eat();
        pn.swim();
        pn.sleep();
        pn.voice();
        System.out.println();
        System.out.println("Pelican skills");
        pl.eat();
        pl.fly();
        pl.swim();
        pl.sleep();
        pl.voice();
    }
    static void thirdPart(){
        Cars bmv = new Cars("Black", 4, 4);
        Cars opel = new Cars("Gray", 5, 4);
        Cars reno = new Cars("White", 3, 4);
        opel.setWheels(3);
        opel.setDoors(3);
//        bmv.setDoors(8); закоментил, так как будет эксепшн выбивать
        System.out.println(opel);
        System.out.println(bmv);
        System.out.println(reno);
        System.out.println(opel.getWheels() + " " + opel.getDoors());

    }
}