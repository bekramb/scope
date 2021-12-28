package ru.example.scope.service;

import org.springframework.stereotype.Component;
import ru.example.scope.counter.PrototypeCounter;
import ru.example.scope.counter.SingletonCounter;

@Component
public class SingletonIncrementService {

    private final PrototypeCounter prototypeCounter;
    private final SingletonCounter singletonCounter;

    public SingletonIncrementService(PrototypeCounter prototypeCounter, SingletonCounter singletonCounter) {
        this.prototypeCounter = prototypeCounter;
        this.singletonCounter = singletonCounter;
    }

    public PrototypeCounter getPrototypeCounter() {
        return prototypeCounter;
    }

    public SingletonCounter getSingletonCounter() {
        return singletonCounter;
    }
}
