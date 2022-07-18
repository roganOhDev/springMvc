package hello.springmvc.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class A {
    private final C c;

    public void aa(){
        c.aa();
    }
}
