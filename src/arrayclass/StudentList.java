
package arrayclass;


public class StudentList {
    public static void main(String[] args){
    Student s1= new Student("s1", "Love1");
    Student[] StudentList= new Student[3];
    StudentList[0]=s1;
     StudentList[1]=new Student("s2", "abc");
      StudentList[2]=new Student("s3", "def");
      
      for(int i=0; i<StudentList.length; i++){
          System.out.println(StudentList[i].getStudentName());
      }
      
    
    
    }
}
