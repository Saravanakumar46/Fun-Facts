package com.example.saran.helloworld;

import java.util.Random;

/**
 * Created by Saran on 01-Jul-15.
 */
public class FactBook {

    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster then horses. ",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the sun to reach earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "An average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the grate pyramid was begin built."
    };

    public String getFact(){



        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
