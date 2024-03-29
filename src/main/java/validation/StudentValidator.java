package validation;

import domain.Student;


public class StudentValidator implements Validator<Student> {

    /**
     * Valideaza un student
     * @param entity - studentul pe care il valideaza
     * @throws ValidationException - daca studentul nu e valid
     */
    @Override
    public void validate(Student entity) throws ValidationException {
        //put null validations first + changed validation message
        if(entity.getID() == null){
            throw new ValidationException("Id-ul nu poate fi null!");
        }
        if(entity.getEmail() == null){
            throw new ValidationException("Email-ul nu poate fi null!");
        }
        if(entity.getNume() == null){
            throw new ValidationException("Numele nu poate fi null!");
        }
        if(entity.getID().equals("")){
            throw new ValidationException("Id incorect!");
        }
        if(entity.getNume() == ""){
            throw new ValidationException("Nume incorect!");
        }
        if(entity.getGrupa() < 0) {
            throw new ValidationException("Grupa incorecta!");
        }
        if(entity.getEmail().equals("")){
            throw new ValidationException("Email incorect!");
        }
    }
}