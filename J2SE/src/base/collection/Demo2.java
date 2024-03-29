package base.collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

/**
 * 泛型，通配符
 * E -- 变量类型
 */
public class Demo2 {
    public static void main(String[] args) {

        /**默认初始化长度10 扩容增量原来的一倍
         * 线程安全，这也导致了效率不如ArrayList
         * 底层数据结构是数组
         * 加载因子为1：即当 元素个数 超过 容量长度 时，进行扩容
         */
        Vector<?> v1 = new Vector<>();
        /*
        <? extends 父类> 表示父类及父类的子类均可
        <? super 子类> 表示子类及子类的父类均可
         */
        Vector<String> v2 = new Vector<>();//钻石操作符
        v2.addElement("a");
        v2.addElement("b");
        v2.addElement("c");
        v1 = v2;
        System.out.print(v1);

        /**
         * 非线程安全 默认初始长度16
         * 加载因子是0.75，即元素个数超过原来的0.75倍时扩容 扩容为原来一倍
         * 底层保存数据的是HashMap
         * 自动排序 性能优于TreeSet
         */
        HashSet hs = new HashSet();
        hs.add(6);
        hs.add(null);//只能放一个null
        hs.add(null);
        hs.add(3);
        hs.add(30);
        hs.add(1);
        Iterator iterator = hs.iterator();
        for (; iterator.hasNext(); ) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
