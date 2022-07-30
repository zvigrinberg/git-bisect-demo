package com.redhat.zvikag.testdemo.service;

import com.redhat.zvikag.testdemo.data.Datasource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
public class MyService {
    private Datasource datasource;
    public String getTheAge(Integer age) {
        return datasource.getPhonetics().get(age);
    }
}
