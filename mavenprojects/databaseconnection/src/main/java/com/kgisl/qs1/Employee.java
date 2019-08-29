package com.kgisl.qs1;

/**
 * Employee
 */
public class Employee {

    private String Id;
    private String Name;
    private String Age;
    private String Country;

    Employee() {
        this.setId(Id);
        this.setName(Name);
        this.setAge(Age);
        this.setCountry(Country);
    }

    /**
     * @return the id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.Id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return Age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.Age = age;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public String toString() {
        return Id+" "+Name+" "+Age+" "+Country;
    }

}