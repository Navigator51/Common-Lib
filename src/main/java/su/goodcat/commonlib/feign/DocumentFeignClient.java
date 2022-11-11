package su.goodcat.commonlib.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import su.goodcat.commonlib.domain.CounterpartyDocumentRequestDTO;
import su.goodcat.commonlib.domain.DocumentRequestDTO;
import su.goodcat.commonlib.domain.DocumentResponseDTO;
import su.goodcat.commonlib.domain.ResponseDTOWithDTOList;

import java.util.List;

@FeignClient(name = "spr-doc", url = "${property.spring_document.url}")

    public interface DocumentFeignClient {
    @PostMapping(path = "/api/v1/document/status")
    ResponseEntity<List<DocumentResponseDTO>> getDocumentByStatus(@RequestBody DocumentRequestDTO documentRequestDTO);

    @PostMapping(path = "/api/v1/document/counterparty/read")
    ResponseEntity<ResponseDTOWithDTOList> getDocumentsByCounterparty(@RequestBody CounterpartyDocumentRequestDTO counterpartyDocumentRequestDTO);

   }
