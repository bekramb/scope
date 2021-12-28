package ru.example.scope.counter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.example.scope.service.StringProcessor;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeCounter {

    private final StringProcessor stringProcessor;
    private int count = 0;

    public PrototypeCounter(StringProcessor stringProcessor) {
        this.stringProcessor = stringProcessor;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public String process(String str) {
        return stringProcessor.process(str);
    }
}
