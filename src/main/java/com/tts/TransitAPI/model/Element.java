package com.tts.TransitAPI.model;

import lombok.Data;

@Data
public class Element {

    public Distance distance;
    public Duration duration;
    public String status;
}
