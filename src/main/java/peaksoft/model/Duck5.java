package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    @Qualifier("egg6")
    private Egg6 egg6;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}
