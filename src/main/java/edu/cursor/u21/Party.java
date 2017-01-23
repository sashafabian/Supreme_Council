package edu.cursor.u21;

/**
 * Created by Саша on 23.01.2017.
 */
public class Party extends SupremeCouncil{

    public void partyOfRegions(){
        partyOfRegions.add(new Deputy("Ничипоренко Валентин Миколайович",   "Party of Regions"));
        partyOfRegions.add(new Deputy("Атрошенко Владислав Анатолійович",   "Party of Regions"));
        partyOfRegions.add(new Deputy("Благодир Юрій Анатолійович",         "Party of Regions"));
        partyOfRegions.add(new Deputy("Бобов Геннадій Борисович",           "Party of Regions"));
        partyOfRegions.add(new Deputy("Бондар Віктор Васильович",           "Party of Regions"));
        partyOfRegions.add(new Deputy("Бушко Іван Іванович",                "Party of Regions"));
        partyOfRegions.add(new Deputy("Гайдош Іштван Ференцович",           "Party of Regions"));
        partyOfRegions.add(new Deputy("Ланьо Михайло Іванович",             "Party of Regions"));
        partyOfRegions.add(new Deputy("Мошак Сергій Миколайович",           "Party of Regions"));
        partyOfRegions.add(new Deputy("Развадовський Віктор Йосипович",     "Party of Regions"));
        partyOfRegions.add(new Deputy("Рудьковський Микола Миколайович",    "Party of Regions"));
        partyOfRegions.add(new Deputy("Шаповалов Юрій Анатолійович",        "Party of Regions"));
        partyOfRegions.add(new Deputy("Баграєв Микола Георгійович",         "Party of Regions"));

        for (Deputy d: partyOfRegions) System.out.println(d);
    }

    public void partyOfMotherLand(){
        partyOfMotherLand.add(new Deputy("Абдуллін Олександр Рафкатович",   "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Богдан Руслан Дмитрович",         "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Бухарєв Владислав Вікторович",    "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Дубіль Валерій Олександрович",    "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Євтушок Сергій Миколайович",      "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Івченко Вадим Євгенович",         "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Кириленко Іван Григорович",       "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Кондратюк Олена Костянтинівна",   "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Крулько Іван Іванович",           "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Кужель Олександра Володимирівна", "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Луценко Ігор Вікторович",         "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Немиря Григорій Михайлович",      "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Одарченко Юрій Віталійович",      "Party of MotherLand"));
        partyOfMotherLand.add(new Deputy("Рябчин Олексій Михайлович",       "Party of MotherLand"));

        for (Deputy name: partyOfMotherLand) System.out.println(name);
    }

    public void partyOfRadicals(){
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));
        partyOfRadicals.add(new Deputy("1","Party of Radicals"));

        for (Deputy name: partyOfRadicals) System.out.println(name);
    }
}
