package org.indiastack.depa.provider.gateway.controllers.v1;

import org.indiastack.depa.provider.gateway.models.consent.Consent;
import org.indiastack.depa.provider.gateway.services.ConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Consent")
public class ConsentController {
    private ConsentService consentService;

    @Autowired
    public ConsentController(ConsentService consentService) {
        this.consentService = consentService;
    }

    @PostMapping("")
    public Consent createConsent(@RequestBody Consent consent) {
        return consentService.createConsent(consent);
    }
}