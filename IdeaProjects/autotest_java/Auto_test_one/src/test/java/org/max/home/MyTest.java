package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {


    static List<Door> doors;
    @Test
    @DisplayName(" Тест номер один")
    void checkNotRiskWin () {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @DisplayName("Тест номер два")
    void checkNotRiskLose() {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    @DisplayName("Тест номер три")
        void checkRiskWin () {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @DisplayName("Тест номер четыре")
    void checkRiskLose () {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }

}
