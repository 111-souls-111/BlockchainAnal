package ru.sfedu.blockchain;

import org.apache.log4j.Logger;

/**
 * Главный класс-клиент для взаимодействия с системой блокчейн-аналитики.
 */
public class BlockchainClient {
    
    private static final Logger log = Logger.getLogger(BlockchainClient.class);

    public BlockchainClient() {
        log.debug("BlockchainClient[0]: starting application......");
        logBasicSystemInfo();
    }

    private void logBasicSystemInfo() {
        log.info("Launching the application...");
        log.info("Operating System: " + System.getProperty("os.name") + " " + System.getProperty("os.version"));
        log.info("JRE: " + System.getProperty("java.version"));
        log.info("Test INFO logging.");
    }

    /**
     * Метод бизнес-логики с проверкой входных данных.
     * Если хэш пустой или null, выбрасывается исключение.
     * 
     * @param hash хэш блока
     * @return строка с результатом поиска
     * @throws IllegalArgumentException если хэш пустой или null
     */
    public String validateAndFindBlock(String hash) {
        log.debug("validateAndFindBlock[1]: started with hash=" + hash);
        if (hash == null || hash.isEmpty()) {
            log.error("validateAndFindBlock[2]: error - Hash cannot be empty");
            throw new IllegalArgumentException("Hash cannot be empty");
        }
        log.info("Block with hash " + hash + " successfully found.");
        return "Block data for: " + hash;
    }
}