package virtusystem.test.contract.model;

import virtusystem.test.contract.domain.entity.InsuredEntity;


import java.sql.Date;

public class InsuredDTO {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date birthDate;
    private int passportSeries;
    private int passportNumber;

    public InsuredDTO() {
    }

    public InsuredDTO(int id, String surname, String name, String patronymic,
                      Date birthDate, int passportSeries, int passportNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public InsuredDTO convertInsuredEntityToInsuredDTO(InsuredEntity insuredEntity){
        return new InsuredDTO(
                insuredEntity.getId(),
                insuredEntity.getSurname(),
                insuredEntity.getName(),
                insuredEntity.getPatronymic(),
                insuredEntity.getBirthDate(),
                insuredEntity.getPassportSeries(),
                insuredEntity.getPassportNumber()
        );
    }

    public InsuredEntity convertInsuredDTOToInsuredEntity(InsuredDTO insuredDTO){
        return  new InsuredEntity(
                insuredDTO.getId(),
                insuredDTO.getSurname(),
                insuredDTO.getName(),
                insuredDTO.getPatronymic(),
                insuredDTO.getBirthDate(),
                insuredDTO.getPassportSeries(),
                insuredDTO.getPassportNumber()
        );
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
