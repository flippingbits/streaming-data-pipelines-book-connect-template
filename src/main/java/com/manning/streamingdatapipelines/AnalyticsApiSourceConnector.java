package com.manning.streamingdatapipelines;

import java.util.List;
import java.util.Map;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.source.SourceConnector;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class AnalyticsApiSourceConnector extends SourceConnector {
    private Map<String, String> settings;

    @Override
    public void start(Map<String, String> settings) {
        this.settings = settings;
    }

    @Override
    public ConfigDef config() {
        return AnalyticsApiSourceConnectorConfig.config();
    }

    @Override
    public Class<? extends Task> taskClass() {
        return AnalyticsApiSourceTask.class;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        return range(0, maxTasks).boxed().map(__ -> settings).collect(toList());
    }

    @Override
    public void stop() {
    }

    @Override
    public String version() {
        return "0.0.1";
    }
}
