package com.mostathmer.aykhdma.retrofit;


public class NetworkService {


    private static NetworkService INSTANCE = null;

    private NetworkService(){}

    public static NetworkService getInstance() {
        if (INSTANCE == null)
            INSTANCE = new NetworkService();
        return INSTANCE;
    }

    //TODO:implement any api method here
}
