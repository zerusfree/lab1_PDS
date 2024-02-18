import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void Test_zavd2() {

        byte a = 0b00110100;
        byte b = (byte) 0b11011011;

        assertEquals(0b11111111, (a | b) & 0xFF, "Помилка в операції OR");
        assertEquals(0b00010000, (a & b) & 0xFF, "Помилка в операції AND");
        assertEquals(0b11101111, (a ^ b) & 0xFF, "Помилка в операції XOR");

    }
}