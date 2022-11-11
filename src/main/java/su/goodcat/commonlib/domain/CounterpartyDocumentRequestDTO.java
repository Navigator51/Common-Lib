package su.goodcat.commonlib.domain;

import lombok.Data;

@Data
public class CounterpartyDocumentRequestDTO {
    private FrontStatus frontStatus;
    private Status forbiddenStatus;
    private long counterpartyID;
    private long userId;
}
