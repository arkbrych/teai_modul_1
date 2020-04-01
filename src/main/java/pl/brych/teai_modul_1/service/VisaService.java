package pl.brych.teai_modul_1.service;

import org.springframework.stereotype.Service;

@Service
public class VisaService implements Card {

    public VisaService() {
    }

    @Override
    public String getInfo() {
        return "Visacard";
    }
}
