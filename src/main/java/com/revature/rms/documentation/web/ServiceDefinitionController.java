package com.revature.rms.documentation.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.rms.documentation.swagger.ServiceDefinitionContext;

/**
 *
 * @author satish sharma
 * <pre>
 *  Controller to serve the JSON from our in-memory store. So that UI can render the API-Documentation
 * </pre>
 */
@RestController
public class ServiceDefinitionController {

    @Autowired
    private ServiceDefinitionContext definitionContext;

    @GetMapping("/service/{servicename}")
    public String getServiceDefinition(@PathVariable("servicename") String serviceName){

        return definitionContext.getSwaggerDefinition(serviceName);

    }
}
