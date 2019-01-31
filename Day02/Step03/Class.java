class Class{

    private int classRoomNumber;
    private Teacher teacher;
    private Student student[];

    public Class(Teacher teacher, int numberOfStudents, int classRoomNumber){

	this.teacher = teacher;
	this.classRoomNumber = classRoomNumber;
	this.student = new Student[numberOfStudents];
	
    }

    public int getClassRoomNumber() {
	return this.classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
	this.classRoomNumber = classRoomNumber;
    }

    public Teacher getTeacher(){
	return this.teacher;
    }

    public void setTeacher(Teacher teacher){
	this.teacher = teacher;
    }

    public Student[] getStudent(){
	return this.student;
    }

    public void setStudent(Student student[]){
	this.student = student;
    }

}
    
