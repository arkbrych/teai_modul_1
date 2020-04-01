package pl.brych.teai_modul_1.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CardServiceMain {

    private Card card;

    @Autowired
    public CardServiceMain(Card card){
        this.card = card;
        final String info = card.getInfo();
        System.out.println(info);
    }
}
