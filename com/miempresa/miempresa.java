package com.miempresa;

public class miempresa {
     public int evaluarNumero(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return -1;
    }
}

