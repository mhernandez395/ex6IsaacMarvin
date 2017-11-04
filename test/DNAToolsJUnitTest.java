import dnatools.DNATools;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Marvin y Isaac
 */
public class DNAToolsJUnitTest {
    
    public DNAToolsJUnitTest() {
    }

    @Test
    public void reverseStringTest1() {
        String inputData = "acgtttacgg";
        String expected = "ggcatttgca";
        assertEquals(expected, DNATools.reverseString(inputData));
    }
    
    @Test
    public void reverseStringTest2() {
        String inputData = "aacttacgatgcr";
        String expected = "rcgtagcattcaa";
        assertEquals(expected, DNATools.reverseString(inputData));
    }
    
    @Test
    public void isADNTest1() {
        String inputData = "acgtttacgg";
        boolean expected = true;
        assertEquals(expected, DNATools.isADN(inputData));
    }
    
    @Test
    public void isADNTest2() {
        String inputData = "acgtttdacggR";
        boolean expected = false;
        assertEquals(expected, DNATools.isADN(inputData));
    }
    
    @Test
    public void isADNTest3() {
        String inputData = "ACTTACGTAGGGAT";
        boolean expected = true;
        assertEquals(expected, DNATools.isADN(inputData));
    }
    
    @Test
    public void isValidStringLengthTest1() {
        String inputData = "acgtttacgg";
        int maxLenght = 20;
        boolean expected = true;
        assertEquals(expected, DNATools.isValidStringLength(inputData,maxLenght));
    }
    
    @Test
    public void isValidStringLengthTest2() {
        String inputData = "acgtttacggRr";
        int maxLenght = 20;
        boolean expected = true;
        assertEquals(expected, DNATools.isValidStringLength(inputData,maxLenght));
    }
    
    @Test
    public void isValidStringLengthTest3() {
        String inputData = "acgtttacgg";
        int maxLenght = 5;
        boolean expected = false;
        assertEquals(expected, DNATools.isValidStringLength(inputData,maxLenght));
    }
    
    @Test
    public void contarCaracterTest1() {
        char c = 'a';
        String inputData = "acgtttacgg";
        int expected = 2;
        assertEquals(expected, DNATools.contarCaracter(c,inputData));
    }
    
    @Test
    public void contarCaracterTest2() {
        char c = 'C';
        String inputData = "acgtttacgg";
        int expected = 2;
        assertEquals(expected, DNATools.contarCaracter(c,inputData));
    }
    
    @Test
    public void contarCaracterTest3() {
        char c = 't';
        String inputData = "acgtttacgg";
        int expected = 3;
        assertEquals(expected, DNATools.contarCaracter(c,inputData));
    }
    
    @Test
    public void contarCaracterTest4() {
        char c = 'h';
        String inputData = "acgtttacgg";
        int expected = 0;
        assertEquals(expected, DNATools.contarCaracter(c,inputData));
    }
    
    @Test
    public void baseMasRepetidaTest1() {
        String inputData = "aaagttacgg";
        char expected = 'a';
        assertEquals(expected, DNATools.baseMasRepetida(inputData));
    }
    
    @Test
    public void baseMasRepetidaTest2() {
        String inputData = "AAACGTAA";
        char expected = 'a';
        assertEquals(expected, DNATools.baseMasRepetida(inputData));
    }
    
    @Test
    public void baseMasRepetidaTest3() {
        String inputData = "AACTRgAcaarhhhhhhhhh";
        char expected = 'a';
        assertEquals(expected, DNATools.baseMasRepetida(inputData));
    }
    
    @Test
    public void baseMasRepetidaTest4() {
        String inputData = "";
        char expected = ' ';
        assertEquals(expected, DNATools.baseMasRepetida(inputData));
    }
    
    @Test
    public void baseMenosRepetidaTest1() {
        String inputData = "aaagttacgg";
        char expected = 'c';
        assertEquals(expected, DNATools.baseMenosRepetida(inputData));
    }
    
    @Test
    public void baseMenosRepetidaTest2() {
        String inputData = "AAACGTAA";
        char expected = 'c';
        assertEquals(expected, DNATools.baseMenosRepetida(inputData));
    }
    
    @Test
    public void baseMenosRepetidaTest3() {
        String inputData = "AACTRgAcaarhhhhhhhhh";
        char expected = 'g';
        assertEquals(expected, DNATools.baseMenosRepetida(inputData));
    }
    
    @Test
    public void baseMenosRepetidaTest4() {
        String inputData = "AAAGAA";
        char expected = 'g';
        assertEquals(expected, DNATools.baseMenosRepetida(inputData));
    }
    
    @Test
    public void baseMenosRepetidaTest5() {
        String inputData = "";
        char expected = ' ';
        assertEquals(expected, DNATools.baseMenosRepetida(inputData));
    }

}
