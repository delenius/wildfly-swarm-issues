package org.example.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Cat")
@JsonTypeName("Cat")
public class Cat extends Pet {

    protected int sleepingHoursPerDay;

    public Cat(){}

    @ApiModelProperty(required=true)
    public int getSleepingHoursPerDay() { return sleepingHoursPerDay; }

    public Cat setSleepingHoursPerDay(int hours) { this.sleepingHoursPerDay = hours; return this; }

}
