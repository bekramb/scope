package ru.example.scope.service;

import org.springframework.stereotype.Service;
import ru.example.scope.counter.PrototypeCounter;
import ru.example.scope.counter.SingletonCounter;

@Service
public class PrototypeIncrementService {

    private final PrototypeCounter prototypeCounter;
    private final SingletonCounter singletonCounter;

    public PrototypeIncrementService(PrototypeCounter prototypeCounter, SingletonCounter singletonCounter) {
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
