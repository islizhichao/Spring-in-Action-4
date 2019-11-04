package soundSystem;

import org.springframework.stereotype.Component;

/**
 * @Component :表明会为该类创建bean
 * 但是组件扫描默认是不启用的，我们需要显示的配置Spring来寻找带有@Component注解的类
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title="Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";
    public void play() {
        System.out.println("Playing "+title+" by"+artist);
    }
}
