package memory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemoryFinderTest {

    @Test
    void get() {
        // given
        MemoryFinder memoryFinder = new MemoryFinder();
        // when
        Memory memory = memoryFinder.get();
        // then
        assertThat(memory).isNotNull();
    }

    @Test
    void init() {
    }
}