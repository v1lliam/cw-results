package Java.CodeWars.cw3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {
    @Test
    public void test1(){
         assertEquals("Failed at paperWork(5,5)",25, Paper.paperWork1(5,5));
    }
  
    @Test
    public void test2(){
        assertEquals("Failed at paperWork(5,-5)",0, Paper.paperWork1(5,-5));
    }
    
    @Test
    public void test3(){
        assertEquals("Failed at paperWork(-5,-5)",0, Paper.paperWork1(-5,-5));
    }
    
    @Test
    public void test4(){
        assertEquals("Failed at paperWork(-5,5)",0, Paper.paperWork1(-5,5));
    }
    
    @Test
    public void test5(){
        assertEquals("Failed at paperWork(5,0)",0, Paper.paperWork1(5,0));
    }
}

