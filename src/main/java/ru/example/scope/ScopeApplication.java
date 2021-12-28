package ru.example.scope;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.example.scope.service.PrototypeIncrementService;
import ru.example.scope.service.SingletonIncrementService;

@SpringBootApplication
public class ScopeApplication implements ApplicationRunner {

    private final PrototypeIncrementService prototypeIncrementService;
    private final SingletonIncrementService singletonIncrementService;

    public ScopeApplication(PrototypeIncrementService prototypeIncrementService, SingletonIncrementService singletonIncrementService) {
        this.prototypeIncrementService = prototypeIncrementService;
        this.singletonIncrementService = singletonIncrementService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ScopeApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {

        prototypeIncrementService.getPrototypeCounter().increment();
        prototypeIncrementService.getSingletonCounter().increment();
        singletonIncrementService.getPrototypeCounter().increment();
        singletonIncrementService.getSingletonCounter().increment();
    }

    public PrototypeIncrementService getPrototypeIncrementService() {
        return prototypeIncrementService;
    }

    public SingletonIncrementService getSingletonIncrementService() {
        return singletonIncrementService;
    }
}
