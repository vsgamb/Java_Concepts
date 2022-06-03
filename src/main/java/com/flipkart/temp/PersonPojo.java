package temp;

import com.flipkart.temp.Name;

import java.util.Optional;

public class PersonPojo {
    int ageofPerson;
    //Optional<Name> nameofPerson;
    Name nameofPerson;

//    public Optional<Name> getNameofPerson() {
//        return nameofPerson;
//    }
//
//    public void setNameofPerson(Optional<Name> nameofPerson) {
//        this.nameofPerson = nameofPerson;
//    }

    public Name getNameofPerson() {
        return nameofPerson;
    }

    public void setNameofPerson(Name nameofPerson) {
        this.nameofPerson = nameofPerson;
    }

    public int getAgeofPerson() {
        return ageofPerson;
    }

    public void setAgeofPerson(int ageofPerson) {
        this.ageofPerson = ageofPerson;
    }

}
