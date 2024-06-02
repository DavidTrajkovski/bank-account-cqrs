package com.techbank.cqrs.core.events;

import com.techbank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BaseEvent extends Message {
    /**
     * Important for when we replay the event store to recreate the state of the aggregate
     * It will also enable us to properly implement optimistic concurrency control
     */
    private int version;

    public BaseEvent(String id, int version) {
        super(id);
        this.version = version;
    }

    public BaseEvent(int version) {
        this.version = version;
    }

    public BaseEvent(MessageBuilder<?, ?> b, int version) {
        super(b);
        this.version = version;
    }
}
