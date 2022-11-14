package su.goodcat.commonlib.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CounterpartyDocumentRequestDTO {
    private FrontStatus frontStatus;
    private Status forbiddenStatus;
    private long counterpartyID;
    private long userId;
}
