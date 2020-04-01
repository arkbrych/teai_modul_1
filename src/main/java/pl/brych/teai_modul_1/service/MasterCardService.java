package pl.brych.teai_modul_1.service;

import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card {

    public MasterCardService() {
    }

    @Override
    public String getInfo(){
        return "MasterCardService";
    }
}
