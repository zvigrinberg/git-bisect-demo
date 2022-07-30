package service;

import data.Datasource;
import lombok.AllArgsConstructor;
import lombok.Data;
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
