package com.manning.streamingdatapipelines;

import java.util.Map;
import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

public class AnalyticsApiSourceConnectorConfig extends AbstractConfig {
    private final String baseUri;
    private final Long pollIntervalMs;
    private final String topicName;

    AnalyticsApiSourceConnectorConfig(Map<String, ?> originals) {
        super(config(), originals);
        baseUri = getString("base.uri");
        pollIntervalMs = getLong("poll.interval.ms");
        topicName = getString("topic.name");
    }

    public String getBaseUri() {
      return baseUri;
    }

    public Long getPollIntervalMs() {
      return pollIntervalMs;
    }

    public String getTopicName() {
      return topicName;
    }

    public static ConfigDef config() {
         return new ConfigDef()
             .define(
                 "base.uri",
                 ConfigDef.Type.STRING,
                 "http://localhost:8989",
                 ConfigDef.Importance.HIGH,
                 "The base URI of the API, e.g., http://localhost:8989."
             )
             .define(
                 "poll.interval.ms",
                 ConfigDef.Type.LONG,
                 30000,
                 ConfigDef.Importance.HIGH,
                 "The frequency of the polling in milliseconds."
             )
             .define(
                 "topic.name",
                 ConfigDef.Type.STRING,
                 ConfigDef.NO_DEFAULT_VALUE,
                 ConfigDef.Importance.HIGH,
                 "The name of the Kafka topic."
             );
    }
}
