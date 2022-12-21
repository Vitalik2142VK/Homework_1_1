public class Main
{
    public static void Task1_3()
    {
        System.out.println("Task1_3:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        Print_for_Task1_3(dog, cat, paper);
        dog += 4;
        cat += 4;
        paper += 4;
        Print_for_Task1_3(dog, cat, paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        Print_for_Task1_3(dog, cat, paper);
    }
    public static void Print_for_Task1_3(double dog, double cat, int paper)
    {
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("##########");

    }

    public static  void Task4()
    {
        System.out.println("Task4:");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 3;
        System.out.println("friend = " + friend);
        System.out.println("##########");
    }

    public static  void Task5()
    {
        System.out.println("Task5:");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);
        System.out.println("##########");
    }

    public static  void Task6_7()
    {
        System.out.println("Task6_7:");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Общий вес боксеров = " + (weightFirstBoxer + weightSecondBoxer));
        System.out.println("Разница веса боксеров через вычитание = " + (weightSecondBoxer % weightFirstBoxer));
        System.out.println("Разница веса боксеров через остаток от деления = " + (weightSecondBoxer % weightFirstBoxer));
        System.out.println("##########");
    }

    public static  void Task8()
    {
        System.out.println("Task8:");
        var sharedHours = 640;
        var hoursOneEmployee = 8;
        var numberEmployee = sharedHours / hoursOneEmployee;
        System.out.println("Всего работников компании - " + numberEmployee + " человек.");
        numberEmployee += 94;
        sharedHours = numberEmployee * hoursOneEmployee;
        System.out.println("Если в компании работает " + numberEmployee + " человекa, то всего " + sharedHours + " часa работы.");
        System.out.println("##########");
    }

    public static void main(String[] args)
    {
        Task1_3();
        Task4();
        Task5();
        Task6_7();
        Task8();
    }
}