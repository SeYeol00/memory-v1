package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@Slf4j
@AutoConfiguration // 라이브러리 자동 구성 컨피규레이션 ////
@ConditionalOnProperty(name = "memory", havingValue = "on") // 어노테이션 if문
public class MemoryAutoConfig {

    @Bean
    public MemoryFinder memoryFinder(){
        return new MemoryFinder();
    }

    @Bean
    public MemoryController memoryController(){
        return new MemoryController(memoryFinder());
    }

    @PostConstruct
    public void init(){
        log.info("MemoryAutoConfig Init");
    }
}
