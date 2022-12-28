package example.sample;

import example.processor.ClassBuilder;
import example.processor.ClassBuilderIgnore;

@ClassBuilder
public class Sample2 {

    private int id;

    private String name;

    @ClassBuilderIgnore
    private Boolean enable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Sample [id=" + id + ", name=" + name + ", enable=" + enable + "]";
    }
}
