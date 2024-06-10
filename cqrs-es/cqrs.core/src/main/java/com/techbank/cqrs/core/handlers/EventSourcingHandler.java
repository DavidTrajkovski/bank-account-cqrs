package com.techbank.cqrs.core.handlers;

import com.techbank.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregate); // Liskov Substitution principle
    T getById(String id); // return the latest state of the aggregate
}
