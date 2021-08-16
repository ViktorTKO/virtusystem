CREATE SEQUENCE if not exists insured_id_seq;
CREATE TABLE IF NOT EXISTS  insured (
  id int  PRIMARY KEY DEFAULT nextval('insured_id_seq'),
  surname varchar(45) DEFAULT NULL,
  name varchar(45) DEFAULT NULL,
  patronymic varchar(45) DEFAULT NULL,
  date_of_birth DATE,
  passport_series INT,
  passport_number INT
);

CREATE SEQUENCE calculation_id_seq;
CREATE TABLE calculation(
    id int PRIMARY KEY  DEFAULT  nextval('calculation_id_seq'),
    sum_insured serial,
    beginning_of_contract date,
    end_of_contract date,
    type_of_real_estate varchar(45) DEFAULT NULL,
    year_of_construction varchar(45) DEFAULT NULL,
    square varchar(45) DEFAULT NULL,
    date_of_calculation date,
    prize varchar(45),
    contract_number serial,
    contract_date date
);

CREATE  SEQUENCE real_estate_address_id_seq;
CREATE TABLE real_estate_address(
    id int PRIMARY KEY  DEFAULT  nextval('real_estate_address_id_seq'),
    state varchar(45) DEFAULT NULL,
    index varchar(45) DEFAULT NULL,
    region varchar(45) DEFAULT NULL,
    area varchar(45) DEFAULT NULL,
    locality varchar(45) DEFAULT NULL,
    street varchar(45) DEFAULT NULL,
    house_number serial,
    frame varchar(45) DEFAULT NULL,
    apartment_number serial,
    comment text DEFAULT NULL
);
