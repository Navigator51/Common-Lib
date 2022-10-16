package su.goodcat.commonlib.domain;

//создание ДТО через record
public record DocumentResponseDTO(Long id, String senderUserName, int countFiles, Status status) {
}
