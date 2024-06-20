package com.techbank.account.cmd.api.commands;

public interface CommandHandler {                   // zasto ova ne se napravi genericko posto site ovie nasleduvaat od BaseCommand
    void handle(OpenAccountCommand command);
    void handle(DepositFundsCommand command);
    void handle(WithdrawFundsCommand command);
    void handle(CloseAccountCommand command);
    void handle(RestoreReadDbCommand command);
}
