package com.mysteriuostrousers.firehose;


import java.net.URL;
import java.util.ArrayList;

public class Agent extends FHObject {

    private String  _accessToken;
    private String  _urlToken;

    private String  _firstName;
    private String  _lastName;
    private String  _email;

    private URL     _avatarURL;

    private Company _company;

    private DNDSettings _dndSettings;



    // region: Constructors

    public Agent() {
        super();
    }

    // endregion
}