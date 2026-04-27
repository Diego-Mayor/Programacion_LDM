package com.miempresa;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvaluarNumerTest {
    @Test
    public void testNPositivoPar() {
        EvaluarNumero eval = new EvaluarNumero();
        assertEquals(1, eval.evaluarNumero(4));
    }

    @Test
    public void testNPositivoImpar() {
        EvaluarNumero eval = new EvaluarNumero();
        assertEquals(2, eval.evaluarNumero(3));
    }

    @Test
    public void testNNegativoOCero() {
        EvaluarNumero eval = new EvaluarNumero();
        assertEquals(-1, eval.evaluarNumero(0));
    }
}
