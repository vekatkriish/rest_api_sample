package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
	
	@RequestMapping("/details")
    public Map<String, String> getDeviceDetails() {
		Map<String, String> map = new HashMap<>();
		map.put("status", "success");
    	map.put("msisdn", "5106404974");
    	map.put("imei","353661080003678");
    	map.put("name","T-Mobile");
    	map.put("location","factoria");
		map.put("building","NP4");
        return map;
    }

	@RequestMapping("/regData")
	public Map<String, String> getDeviceDates() {
		Map<String, String> map = new HashMap<>();
		map.put("status", "Progress");
    	map.put("msisdn", "76252453");
    	map.put("imei","353661080003678");
    	map.put("registered","16-02-2018");
    	map.put("expiry","16-02-2020");
    	map.put("location","ohio");
        return map;
    }


}
