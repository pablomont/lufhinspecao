package com.uepb.lufh.avalia.contract.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:21:14.348877-03:00[America/Fortaleza]")
@Controller
@RequestMapping("${openapi.lufhInspeo.base-path:/pablo.santos/LufhInspecao/1.0.0}")
public class ReportsApiController implements ReportsApi {

    private final ReportsApiDelegate delegate;

    public ReportsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ReportsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ReportsApiDelegate() {});
    }

    @Override
    public ReportsApiDelegate getDelegate() {
        return delegate;
    }

}
