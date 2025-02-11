package com.playtika.testcontainer.nats;

import com.playtika.testcontainer.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.nats")
public class NatsProperties extends CommonContainerProperties {
    static final String BEAN_NAME_EMBEDDED_NATS = "embeddedNats";
    static final String BEAN_NAME_EMBEDDED_NATS_TOXI_PROXY = "embeddedNatsToxiproxy";

    int clientPort = 4222;
    int httpMonitorPort = 8222;
    int routeConnectionsPort = 6222;

    @Override
    public String getDefaultDockerImage() {
        // Please don`t remove this comment.
        // renovate: datasource=docker
        return "nats:2.9";
    }
}
