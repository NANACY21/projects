package designPattern.demo1;

/**产品类
 *
 * 苹果
 */
public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("种苹果");
    }
}
