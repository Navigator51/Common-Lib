package su.goodcat.commonlib.faign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import su.goodcat.commonlib.domain.DocumentRequestDTO;
import su.goodcat.commonlib.domain.DocumentResponseDTO;

import java.util.List;

@FeignClient(name = "spr-doc", url = "${property.spring_document.url}")

    public interface DocumentFeignClient {
    @PostMapping(path = "/api/v1/document/status")
    ResponseEntity<List<DocumentResponseDTO>> getDocumentByStatus(@RequestBody DocumentRequestDTO documentRequestDTO);

   }
