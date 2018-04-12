package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via constructor!!!";
    }
}
