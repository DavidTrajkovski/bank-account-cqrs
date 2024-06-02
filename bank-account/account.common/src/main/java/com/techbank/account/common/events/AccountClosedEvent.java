package com.techbank.account.common.events;

import com.techbank.cqrs.core.events.BaseEvent;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class AccountClosedEvent extends BaseEvent {

    public AccountClosedEvent(String id, int version) {
        super(id, version);
    }

    public AccountClosedEvent(int version) {
        super(version);
    }

    public AccountClosedEvent(MessageBuilder<?, ?> b, int version) {
        super(b, version);
    }

}
