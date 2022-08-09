package hello.hellospring.domain;

public class Member {

    private Long id;
    private String name;

    public void setId(Long id) {    // get/setter 단축키 = Alt + Ins
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
