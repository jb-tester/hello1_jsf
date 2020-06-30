package jakarta.tutorial.hello1;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class Foo {
   @Inject Hello hello;

    String bar = "***************";

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
