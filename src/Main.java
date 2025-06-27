import TaskOne.BusinessContact;
import TaskOne.PersonalContact;
import TaskThree.History;
import TaskThree.Math;
import TaskThree.Science;
import TaskThree.Subject;
import TaskTwo.Converter;

public class Main {

    public static void main(String[] args) {

        //TaskOne
        PersonalContact personalContact = new PersonalContact("Ivan",
                891515230, "ivan@mail.ru", "Leninskaya street");

        BusinessContact businessContact = new BusinessContact("Mark",
                110023412, "mark_vah@gmail.com", "Boolvar street");

        personalContact.displayInfo();
        businessContact.displayInfo();

        //
        System.out.println();
        System.out.println();
        //TaskTwo

        Converter converter = new Converter();
        System.out.println("Перевод 100 метров в сантиметры:  " + converter.convertLength(100.0,"sm"));
        System.out.println("Перевод 100 метров в сантиметры:  " + converter.convertLength(100.0,"cm"));
        System.out.println("Перевод 10 километров в футы:  " + converter.convertLength(10.0f,"f"));

        System.out.println();

        System.out.println("Перевод 100 Кельвинов в Цельсии:  " + converter.convertTemperature(100,"C"));
        System.out.println("Перевод 36.6 Цельсии в Фаренгейты:  " + converter.convertTemperature(36.6,"F"));

        System.out.println();

        System.out.println("Перевод 100 килограмм в миллиграммы:  " + converter.convertWeight(100.0,"mgm"));
        System.out.println("Перевод 22 тонны в килограммы:  " + converter.convertWeight(22.0f,"kg"));


        //
        System.out.println();
        System.out.println();

        //TaskThree

        Subject[] plan = new Subject[5];

        Math firstLesson = new Math("Жукова М.А", "Алгебра");
        plan[0] = firstLesson;

        History secondLesson = new History("Совельев И.Н.", "История России 19 века");
        plan[1] = secondLesson;

        History thirdLesson = new History("Совельев И.Н.", "История России 20 века");
        plan[2] = thirdLesson;

        Science fourthLesson = new Science("Епифанова И.Г.", "Химия");
        plan[3] = fourthLesson;

        Math fifthLesson = new Math("Жукова М.А", "Геометрия");
        plan[4] = fifthLesson;

        for (int i = 0; i < plan.length; i++) {
            plan[i].study();
        }
    }
}
