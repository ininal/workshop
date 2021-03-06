package com.ininal.example.api.data;

import javax.validation.constraints.NotNull;

/**
 * Created by yaseminbakir on 11.11.2017.
 */
public class CreateUserRequest
{
    //Name of user
    private String name;

    //Surname of user
    private String surname;

    //E-mail address of user
    private String email;

    //User mobile phone number. Should be 10 digits and 5xxxxxxxxx format
    private String gsmNumber;

    //User TC Identification number. Should be number only and 11 digits
    private String tcIdentificationNumber;

    //User Password. Should include 1 digit and letter, minimum 8 characters without special characters
    private String password;

    //Birthdate of user. Should be on YYYY-MM-DD format
    private String birthDate;

    //Mother maiden name
    private String motherMaidenName;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getGsmNumber()
    {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber)
    {
        this.gsmNumber = gsmNumber;
    }

    public String getTcIdentificationNumber()
    {
        return tcIdentificationNumber;
    }

    public void setTcIdentificationNumber(String tcIdentificationNumber)
    {
        this.tcIdentificationNumber = tcIdentificationNumber;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }

    public String getMotherMaidenName()
    {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName)
    {
        this.motherMaidenName = motherMaidenName;
    }
}
