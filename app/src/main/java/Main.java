import jp.ac.uryukyu.ie.e245710.*;
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        EnemyTest enemy = new EnemyTest("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.name, enemy.name);

        int turn = 0;
        while( hero.dead == false && enemy.dead == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }    
}
