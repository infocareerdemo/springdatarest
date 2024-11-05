package com.example.demo.config;

import com.example.demo.entity.Location;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.core.mapping.ResourceMetadata;
import org.springframework.data.rest.core.mapping.ResourceMapping;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderFactory;
import org.springframework.stereotype.Component;

@Component
public class LocationResourceProcessor implements RepresentationModelProcessor<EntityModel<Location>> {

	  @Override
	    public EntityModel<Location> process(EntityModel<Location> model) {
	        model.removeLinks(); // Remove all links
	        return model;
	    }
}
