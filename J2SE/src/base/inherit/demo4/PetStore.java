package base.inherit.demo4;
import base.inherit.demo1.Student;
import java.util.Scanner;

public class PetStore {
    /**
     * 主界面
     */
    public void mainMenu(){
        System.out.println("欢迎来到宠物商店");
        System.out.println("1.购买宠物");
        System.out.println("2.退出");
        System.out.println("请输入序号");
    }

    /**
     * 宠物列表
     */
    public void showPet(){
        System.out.println("1.狗");
        System.out.println("2.猫");
        System.out.println("3.企鹅");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetStore petStore = new PetStore();
        Student s1 = new Student("软件学院");
        petStore.mainMenu();
        int num1 = scanner.nextInt();
        while (true) {
            if (num1 == 1) {
                petStore.showPet();
                int num2 = scanner.nextInt();
                if (num2 == 1) {
                    //买狗
                    Dog dog = new Dog();
                    s1.buyPet(dog);
                } else if (num2 == 2) {
                    //买猫
                } else {

                }
            } else if (num1 == 2) {
                System.exit(0);
            } else {
                System.out.println("输入错误，重新输入");
                num1 = scanner.nextInt();
            }
        }
    }
}
