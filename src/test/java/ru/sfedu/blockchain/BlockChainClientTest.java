package ru.sfedu.blockchain;

import org.junit.Test;
import static org.junit.Assert.*;

public class BlockChainClientTest {

    @Test
    public void testConstructorAndLogging() {
        BlockchainClient client = new BlockchainClient();
        assertNotNull(client);
    }

    /**
     * ПОЛОЖИТЕЛЬНЫЙ СЦЕНАРИЙ.
     * Проверяем, что при корректных данных метод возвращает результат.
     */
    @Test
    public void testValidateAndFindBlockPositive() {
        BlockchainClient client = new BlockchainClient();
        String validHash = "0xabc123";
        
        String result = client.validateAndFindBlock(validHash);
        
        assertNotNull(result);
        assertTrue(result.contains(validHash));
    }

    /**
     * ОТРИЦАТЕЛЬНЫЙ СЦЕНАРИЙ 1.
     * Проверяем, что при пустой строке выбрасывается IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValidateAndFindBlockNegativeEmpty() {
        BlockchainClient client = new BlockchainClient();
        client.validateAndFindBlock(""); 
    }

    /**
     * ОТРИЦАТЕЛЬНЫЙ СЦЕНАРИЙ 2.
     * Проверяем, что при передаче null выбрасывается IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValidateAndFindBlockNegativeNull() {
        BlockchainClient client = new BlockchainClient();
        client.validateAndFindBlock(null); 
    }
}