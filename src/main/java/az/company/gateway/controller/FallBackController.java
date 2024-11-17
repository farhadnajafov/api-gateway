package az.company.gateway.controller;

import az.company.gateway.model.FallbackResponse;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/productServiceFallBack")
    public FallbackResponse productFallback(){
        return new FallbackResponse("Product service is down");
    }

    @GetMapping("/orderServiceFallBack")
    public FallbackResponse orderFallback(){
        return new FallbackResponse("Order service is down");
    }
    @GetMapping("/paymentServiceFallBack")
    public FallbackResponse paymentFallback(){
        return new FallbackResponse("Payment service is down");
    }
}
