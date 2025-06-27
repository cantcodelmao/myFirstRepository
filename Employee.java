package lab7;
class CourseFullException extends Exception {
    CourseFullException(String str){
        super(str);
    }
    
}
class Course{
    private String CourseName;
    private int capacity;
    private int enrolledStudents=0;

    void enrollStudent (String CourseName,int capacity) throws CourseFullException{
        this.CourseName=CourseName;
        this.capacity=capacity;
        if(enrolledStudents>capacity){
            throw new CourseFullException("Course is full");
        }
        enrolledStudents++;
        System.out.println("Student successfully added,Total Students"+enrolledStudents);

    }
}
class Demo{
    public static void main(String [] args){
      
        Course ob = new Course();
        System.out.println("Enter number of students to be enrolled");
        
        for(int n=0;n<=7;n++){
        try{
            ob.enrollStudent("Name",2 );
            
        }
    
        catch(CourseFullException e){
            System.out.println(e.getMessage());
        }
        
    }
}
}