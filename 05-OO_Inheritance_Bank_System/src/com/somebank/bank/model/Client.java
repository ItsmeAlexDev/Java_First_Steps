package com.somebank.bank.model;


/**
 * Class that represents a client on a bank system
 *
 * @author AlexDev
 * @version 1.0
 */

/*
 * Basically the same "Client" as the last project
 */
public class Client  {

	
	//Some things that every bank account got
    private String name;
    private String ssn;
    private String profession;

    //This class getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

}
