package com.example.demo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SerDeser {
    //private Map<String, String> abbreviations;
    private List<MutablePair<String, String>> abbreviations = new ArrayList<>();

}
