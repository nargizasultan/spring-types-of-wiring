package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    @Autowired
    @Qualifier("needle7")
    private Needle7 needle7;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
