package school;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String csvFile = "students.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = "\t";
        Student newStudent;
        
        try {

        	FileReader fr = new FileReader(csvFile);
            br = new BufferedReader(fr);
            
            while ((line = br.readLine()) != null) {

                // use tab as separator
                String[] studentData = line.split(cvsSplitBy);
                newStudent = new Student(studentData[0],studentData[1]);
                
                System.out.println(newStudent.fullName());


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

		
		
		

	}

}
