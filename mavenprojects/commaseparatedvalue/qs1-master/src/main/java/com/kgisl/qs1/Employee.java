package com.kgisl.qs1;

/**
 * CsvDemo
 */
public class Employee {
    private int id;
    private String name;
    private String age;
    private String country;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param fileReader the id to set
     */
    public void setId(String fileReader) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }
    /**
     * @param fileReader the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+country;
    }
}