package com.tts.TransitAPI.model;

import lombok.Data;

import java.util.List;

@Data
public class GeocodingResponse {

    public List<Geocoding> results;
}
