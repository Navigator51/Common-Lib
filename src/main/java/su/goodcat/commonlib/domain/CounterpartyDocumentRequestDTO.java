package su.goodcat.commonlib.domain;

import lombok.Value;

@Value
public class CounterpartyDocumentRequestDTO {
    FrontStatus frontStatus;
    Status forbiddenStatus;
    long counterpartyID;
}
