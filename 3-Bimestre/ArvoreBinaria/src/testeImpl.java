

import org.junit.Before;
import org.junit.Test;

public class testeImpl {
    private BinaryTreeImplmple impl;

    @Before
    public void setUp() {
        impl = new BinaryTreeImplmple();
    }

    @Test
    public void testAdd() {
        impl.add(6);
        impl.add(4);
        impl.add(7);
        //impl.add(2);
        impl.add(3);
        System.out.println(impl.contains(2));
    }

    @Test
    public void testeEmpty(){
        impl.isEmpty();
    }

}
