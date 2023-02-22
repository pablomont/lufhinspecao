package api.controller;

import contract.RequestEvaluationsApi;
import model.RequestEvaluationDto;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RequestEvaluationsController implements RequestEvaluationsApi {


    @Override
    public ResponseEntity<List<RequestEvaluationDto>> _findRequestEvaluations(final String customerCpfCnpj) {
        return ResponseEntity.of(Optional.of(List.of(new RequestEvaluationDto())));
    }

}
