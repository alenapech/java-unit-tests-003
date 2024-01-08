package org.alenapech;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    boolean evenOddNumber(int value) {
        return (value % 2) == 0;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    boolean numberInInterval(int value) {
        return value > 25 && value < 100;
    }
}
