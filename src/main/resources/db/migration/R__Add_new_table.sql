 CREATE TABLE if not exists  patients (
                                         id serial,
                                         patient_name text NOT NULL,
                                         patient_surname text not null,
                                         patient_patronimic text not null,
                                         adress text not null,
                                         status text not null,
                                         diagnosis text not null




);

insert into patients (patient_name, patient_surname, patient_patronimic, adress, status, diagnosis)
values
('Boris', 'Stepanov', 'Alexeevich', 'Rostov', 'Out', 'Healthy'),
('Matvey', 'Zaytsev', 'Timurovich', 'Rostov', 'Out', 'Healthy'),
('Vsevolod', 'Volkov', 'Ilyich', 'Rostov', 'Out', 'Healthy'),
('Valeria', 'Egorova', 'Dabilovna', 'Rostov', 'Out', 'Healthy'),
('Polina', 'Knyazeva', 'Michaylovna', 'Rostov', 'Out', 'Healthy');