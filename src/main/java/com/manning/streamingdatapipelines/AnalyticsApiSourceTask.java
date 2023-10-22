package com.manning.streamingdatapipelines;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import static java.util.Collections.emptyMap;
import static org.apache.kafka.connect.data.SchemaBuilder.string;

public class AnalyticsApiSourceTask extends SourceTask {
    private AnalyticsApiSourceConnectorConfig config;
    private ObjectMapper objectMapper;

    @Override
    public String version() {
        return "0.0.1";
    }

    @Override
    public void start(Map<String, String> settings) {
        this.config = new AnalyticsApiSourceConnectorConfig(settings);
        this.objectMapper = new ObjectMapper();
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
