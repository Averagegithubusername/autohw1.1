package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue444() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2556;
        int actual = service.remain(amount);
        int expected = 444;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue888() {
        CashbackHackService service = new CashbackHackService();
        int amount = 112;
        int actual = service.remain(amount);
        int expected = 888;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -556;
        int actual = service.remain(amount);
        int expected = 1556;
        assertEquals(actual, expected);
    }
}