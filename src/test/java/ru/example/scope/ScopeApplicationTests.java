package ru.example.scope;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScopeApplicationTests {

    @Autowired
    private ScopeApplication scopeApplication;

    @Test
    void shouldCheckPrototypeAndSingletonScopeValues() {

        assertThat(scopeApplication.getPrototypeIncrementService().getPrototypeCounter().getCount()).isEqualTo(1);
        assertThat(scopeApplication.getSingletonIncrementService().getPrototypeCounter().getCount()).isEqualTo(1);
        assertThat(scopeApplication.getPrototypeIncrementService().getSingletonCounter().getCount()).isEqualTo(2);
        assertThat(scopeApplication.getSingletonIncrementService().getSingletonCounter().getCount()).isEqualTo(2);
        assertThat(scopeApplication.getPrototypeIncrementService().getPrototypeCounter().process("String1")).isEqualTo("STRING1");
        assertThat(scopeApplication.getSingletonIncrementService().getPrototypeCounter().process("String2")).isEqualTo("STRING2");
    }
}
