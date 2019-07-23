package co.uksafebear.kennels;

public class Dog {

    private int age;
    private boolean isEmployed;
    private String skin;

    //string will allow you to select a colour

    public void setSkin(String newskin) {

        skin = newskin;

    }

    public String getskin() {

        return skin;

    }

    public void bark() {

        System.out.println("Bark");


        }




}
