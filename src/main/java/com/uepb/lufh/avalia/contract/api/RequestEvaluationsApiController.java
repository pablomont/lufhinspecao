package com.uepb.lufh.avalia.contract.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
@Controller
@RequestMapping("${openapi.lufhInspeo.base-path:/pablo.santos/LufhInspecao/1.0.0}")
public class RequestEvaluationsApiController implements RequestEvaluationsApi {

    private final RequestEvaluationsApiDelegate delegate;

    public RequestEvaluationsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) RequestEvaluationsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RequestEvaluationsApiDelegate() {});
    }

    @Override
    public RequestEvaluationsApiDelegate getDelegate() {
        return delegate;
    }

}
