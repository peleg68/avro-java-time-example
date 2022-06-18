package example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class UserMixIn
{
    @JsonIgnore
    abstract void getSchema();

    @JsonIgnore
    abstract void getSpecificData();

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    abstract void getStartTime();
}
