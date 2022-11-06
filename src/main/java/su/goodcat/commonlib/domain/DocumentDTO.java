package su.goodcat.commonlib.domain;

import java.time.LocalDateTime;


public record DocumentDTO(long documentId, LocalDateTime modifyDate) {
}
