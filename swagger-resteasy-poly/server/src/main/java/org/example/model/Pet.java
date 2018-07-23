package org.example.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

@ApiModel(
        discriminator = "type",
        subTypes = { Cat.class, Dog.class } )
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class),
        @JsonSubTypes.Type(value = Dog.class)
})
public class Pet {

    public Pet(){}

}

