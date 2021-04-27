package assigmentsDay2;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"C","Şura KARA","120 saat 10 hafta");
		Course course2=new Course(2,"JAVA","Engin DEMİROĞ","120 saat 12 hafta");
		Course course3=new Course(3,"Js","Alihan KARA","70 saat 10 hafta");
		
		// TODO Auto-generated method stub
		Course[] courses= {course1,course2,course3};
		
		for(Course course: courses){
			
			System.out.println("BULUNAN KURSLAR : " + course.name);
			
		}
		
		CourseManager courseManager= new CourseManager();
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course3);
		courseManager.updateCourse(course2);
		
		

	}

}
