package com.example.demo.dto;

import java.io.IOException;

import com.example.demo.entity.Location;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class LocationSerializer extends StdSerializer<Location> {

    public LocationSerializer() {
        this(null);
    }

    public LocationSerializer(Class<Location> t) {
        super(t);
    }

    @Override
    public void serialize(Location location, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("locationId", location.getLocationId());
        gen.writeStringField("locationName", location.getLocationName());
        gen.writeEndObject();
    }

	
}
