import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
            ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list

        Hero heroes1 = new Hero("Black Widow", 34);
        Hero heroes2 = new Hero("Captain America", 100);
        Hero heroes3 = new Hero("Vision", 3);
        Hero heroes4 = new Hero("Iron Man", 48);
        Hero heroes5 = new Hero("Scarlet Witch", 29);
        Hero heroes6 = new Hero("Thor", 1500);
        Hero heroes7 = new Hero("Hulk", 49);
        Hero heroes8 = new Hero("Doctor Stange", 42);

        heroes.add(heroes1);
        heroes.add(heroes2);
        heroes.add(heroes3);
        heroes.add(heroes4);
        heroes.add(heroes5);
        heroes.add(heroes6);
        heroes.add(heroes7);
        heroes.add(heroes8);

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes6.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        List<Hero> michel = heroes.subList(heroes.size() /2, heroes.size());

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero elem: michel) {
            System.out.println (elem.display());
        }
    }
}
