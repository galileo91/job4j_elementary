package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenByeBot() {
/*        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );*/
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenUnknownBot() {
/*        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );*/
        String in = "Сколько будет 2 + 2?";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }
}
