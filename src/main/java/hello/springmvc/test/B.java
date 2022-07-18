package hello.springmvc.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class B implements C{
    private final A a;

    public void aa(){
        a.aa();
    }

}
