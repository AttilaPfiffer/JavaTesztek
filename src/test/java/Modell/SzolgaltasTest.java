package Modell;

import hu.szamalk.Modell.Szolgaltatas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SzolgaltasTest {

    @Test
    void paramNelkKonstrUresLista() {
        ArrayList<String> nevek = new ArrayList<>();
        nevek.add("Pál");
        nevek.add("Ede");
        Szolgaltatas sz = new Szolgaltatas();
        Assertions.assertEquals(sz.nevekDb(), 1);
    }

    @Test
    void egyParamKstregyNevListaban() {

    }

    @Test
    void tobbParamKstrtobbNevListaban() {

    }

}