package wenjie.deng.myboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("target.string")
public class AutoConfigurationProperties {

    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
