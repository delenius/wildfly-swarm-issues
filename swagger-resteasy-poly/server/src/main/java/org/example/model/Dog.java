package org.example.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Dog")
@JsonTypeName("Dog")
public class Dog extends Pet {

    protected String breed;

    public Dog(){}

    @ApiModelProperty()
    public String getBreed() { return breed; }

    public Dog setBreed(String breed) { this.breed = breed; return this; }

}
