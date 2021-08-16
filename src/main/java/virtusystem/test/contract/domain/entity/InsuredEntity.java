package virtusystem.test.contract.domain.entity;


import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="insured")
public class InsuredEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="surname")
    private String surname;

    @Column(name="name")
    private String name;

    @Column(name="patronymic")
    private String patronymic;

    @Column(name="date_of_birth")
    private Date birthDate;

    @Column(name="passport_series")
    private int passportSeries;

    @Column(name="passport_number")
    private int passportNumber;

    public InsuredEntity() {
    }

    public InsuredEntity(int id, String surname, String name, String patronymic,
                         Date birthDate, int passportSeries, int passportNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "InsuredEntity{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }
}
