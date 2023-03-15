package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:footerContent.properties"})

public interface ResourcesConfig extends Config {

    @Key("footerContent")
    String[] getArray();
}
