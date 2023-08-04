package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {

    static Principal m;
    static int m1[][];
    static int m2[][];
    static int m3[][];
    static int m4[][];

    @BeforeAll public static void setUp() {
        m = new Principal();
        m1 = m.leeMatriz("matriz1");
        m2 = m.leeMatriz("matriz2");
    }
    @Test public void testSuma() {
        m3 = m.sumaMatrices(m1,m2);
        assertTrue(m3[0][0]==5);
        assertTrue(m3[0][1]==8);
        assertTrue(m3[1][0]==-2);
        assertTrue(m3[1][1]==0);
    }
    @Test public void testMultiplicacion() {
        m4 = m.multiplicaMatrices(m1,m2);
        assertTrue(m4[0][0]==1);
        assertTrue(m4[0][1]==5);
        assertTrue(m4[1][0]==-4);
        assertTrue(m4[1][1]==-5);
    }
    @Test public void testSepuedeMultiplicar() {
        assertTrue(m.sePuedeMultiplicar(m1,m2));
    }
}