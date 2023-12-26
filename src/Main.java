public class Main {
    public static void main(String[] args) {
        var dog = 5;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper =  763789;
        System.out.println (paper);

        var x = 4;

        var resultDogAddition = x + dog;
        System.out.println ("x + dog = " +resultDogAddition);
        var resultCatAddition = x + cat;
        System.out.println ("x + cat = " +resultCatAddition);
        var resultPaperAddition = x + paper;
        System.out.println ("x + paper = " +resultPaperAddition);

        var dogSubtraction = 3.5;
        var catSubtraction = 1.6;
        var paperSubtraction = 7639;

        var resultDogSubtraction = resultDogAddition - dogSubtraction;
        System.out.println ("dog - 3.5 = " +resultDogAddition);
        var resultCatSubtraction = resultCatAddition - catSubtraction;
        System.out.println ("cat - 1.6 = " +resultCatAddition);
        var resultPaperSubtraction = resultPaperAddition - paperSubtraction;
        System.out.println ("paper - 7639 = " +resultPaperAddition);

        var friends = 19;
        System.out.println ("friends initially = " +friends);
        var y = 2;
        var resultFriendsAddition = y + friends;
        System.out.println ("friends + 2 = " +resultFriendsAddition);
        var z = 7;
        var resultFriendsDivision = resultFriendsAddition / z;
        System.out.println ("friends / 7 = " +resultFriendsDivision);

        var frogs = 3.5;
        System.out.println ("frogs initially = " +frogs);
        var a = 10;
        var b = 3.5;
        var c = 4;
        var resultFrogsAddition = a * frogs;
        System.out.println ("frogs * 10 = " +resultFrogsAddition);
        var resultFrogsDivision = resultFrogsAddition / b;
        System.out.println ("resultFrogsAddition / 3.5 = " +resultFrogsDivision);
        var resultFrogsSummation = resultFrogsDivision + c;
        System.out.println ("resultFrogsDivision + 4 = " +resultFrogsSummation);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println ( "Масса первого боксера = " +boxerWeight1+ " кг");
        System.out.println ( "Масса второго боксера = " +boxerWeight2+ " кг");
        var resultSummationBoxersWeight = (boxerWeight1 + boxerWeight2);
        System.out.println ( "Масса обоих боксеров = " +resultSummationBoxersWeight+ " кг");

        var resultDifferenceBoxersWeight_1 = (boxerWeight1 - boxerWeight2);
        System.out.println ( "Разность массы обоих боксеров (задача 6) = " +resultDifferenceBoxersWeight_1+ " кг");

        var resultDifferenceBoxersWeight_2 = (boxerWeight2 - boxerWeight1);
        System.out.println ( "Разность массы обоих боксеров (задача 7) = " +resultDifferenceBoxersWeight_2+ " кг");

        var time = 640;
        var timeForOneWorker = 8;
        System.out.println ("Общее рабочее время = " +time+ " часов");
        System.out.println ("Рабочее время на одного работника = " +timeForOneWorker+ " часов");
        var workers = time / timeForOneWorker;
        System.out.println ("Всего работников в компании = " +workers+ " человек");
        var otherWorkers = workers + 94;
        System.out.println ("Всего работников в компании + 94 человека = " +otherWorkers+ " человек(а)");
        var timeAllWorkers = otherWorkers * timeForOneWorker;
        System.out.println ("Если в компании работает " +otherWorkers+ " человек, то всего " +timeAllWorkers+ " часа(ов) работы может быть поделено между сотрудниками");

    }
}

