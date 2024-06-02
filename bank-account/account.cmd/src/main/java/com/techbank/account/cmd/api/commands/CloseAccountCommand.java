package com.techbank.account.cmd.api.commands;

import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
