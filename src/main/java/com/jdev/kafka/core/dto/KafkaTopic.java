package com.jdev.kafka.core.dto;

public enum KafkaTopic {

    EVENT_MESSAGES("EVENT_MESSAGES"),
    EVENT_TODO("EVENT_TODO");

    private final String event;

    KafkaTopic(String event) {
        this.event = event;
    }

    public String getTopicName() {
        return event;
    }
}
