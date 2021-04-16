FROM openjdk:8
ADD /target/clinic_reworked.jar clinic.reworked.jar
EXPOSE 8080
CMD ["java", "-jar", "private_clinic.jar"]