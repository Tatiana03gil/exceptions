import java.text.ParseException;

public class Person {
 private String surname;
 private String name;
 private String patronymic;
 private String dateOfBirth;
 private int contact;
 private char sex;

 Person (String [] string) throws ParseException {
    this.surname = isDataValid.validFullName(string[0]);
    this.name = isDataValid.validFullName(string[1]);
    this.patronymic = isDataValid.validFullName(string[2]);
    this.dateOfBirth = isDataValid.validDate(string[3]);
    this.contact = isDataValid.validNumber(string[4]);
    this.sex = isDataValid.validSex(string[5]);
 }

 public String getSurame () {
    return this.surname;
 }

 public String getName () {
    return this.name;
 }

 public String getPatronymic () {
    return this.patronymic;
 }

 public String getBirthday () {
    return this.dateOfBirth;
 }

 public int getContact () {
    return this.contact;
 }

 public char getSex () {
    return this.sex;
 }

 public String toString () {
    return ("<"+getSurame()+"> <"+getName()+"> <"+getPatronymic()+"> <"+getBirthday()+"> <"+getContact()+"> <"+getSex()+">");
 }
}
