package example.com.jsonparsingstringrequest_recyclerview_modelclass;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by compaq on 3/30/2018.
 */

public class Data {

    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private boolean email;
    @SerializedName("gender")
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
