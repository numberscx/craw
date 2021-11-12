package com.dao.dao.entity;

import lombok.Data;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Data
public class Funds {
    private Long id;
    private String fundCode;
    private String fundName;
    private String fundManager;
    private JSONObject careerRatio;
    private JSONObject shareRatio;
    private JSONObject assetRatio;
}
