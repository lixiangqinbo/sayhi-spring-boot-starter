package sayhi.springboot.autoconfigure.properies;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("web.sayhi")
public class SayHiProperies {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
