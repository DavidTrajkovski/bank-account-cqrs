package com.techbank.cqrs.core.commands;

import com.techbank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Data
//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BaseCommand extends Message {
    public BaseCommand(String id) {
        super(id);
    }
}
