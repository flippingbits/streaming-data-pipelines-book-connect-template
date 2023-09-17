package com.manning.streamingdatapipelines;

import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class AnalyticsApiSourceTask extends SourceTask {
    AnalyticsApiSourceConnectorConfig config;

    @Override
    public String version() {
        return "0.0.1";
    }

    @Override
    public void start(Map<String, String> settings) {
        this.config = new AnalyticsApiSourceConnectorConfig(settings);
    }

    @Override
    public List<SourceRecord> poll() throws InterruptedException {
      List<SourceRecord> sourceRecords = new ArrayList<>();
      // TODO: To be implemented
      return sourceRecords;
    }

    @Override
    public void stop() {
    }
}