package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz4 {
    public static void main(String[] args) {
        // 학생목록을 저장할 map 생성
        HashMap<Integer,Student> map = new HashMap<>();

        Student student1 = new Student(1001,"둘리",90,80,70);
        Student student2 = new Student(1002,"도우너",55,65,75);
        Student student3 = new Student(1003,"또치",80,50,50);

        // 학생 추가
        map.put(student1.getStudentId(),student1);
        map.put(student2.getStudentId(),student2);
        map.put(student3.getStudentId(),student3);


        Set<Integer> KeySet = map.keySet();

        // 학생별 점수 총합
        for(Integer k : KeySet){
            Student key = map.get(k);
            System.out.println(key.getName()+" 점수 총합 : " + +key.studentTotalGrade(key.getKorScore(),key.getEngScore(),key.getMathScore()));
//            System.out.println(key.getName()+" 점수 평균 : " + +key.studentAvg(key.getKorScore(),key.getEngScore(),key.getMathScore());
        }

        // 과목별 총점 구하기
        Collection<Student> values = map.values();
        int engTotalScore = 0;
        for(Student v : values){
            engTotalScore+=v.getEngScore();


        }

        int korTotalScore = 0;
        for(Student v : values){
            korTotalScore+=v.getKorScore();
        }

        int mathTotalScore = 0;
        for(Student v : values){
            mathTotalScore+=v.getMathScore();
        }


        // 과목별 총점 구하기
        System.out.println("영어점수 총합 : " + engTotalScore);
        System.out.println("국어점수 총합 : "+ korTotalScore);
        System.out.println("수학점수 총합 : "+ mathTotalScore);


    }
}

class Student{

    private int studentId;
    private String name;
    private int korScore;
    private int mathScore;
    private int engScore;

    public Student(int studentId, String name, int korScore, int mathScore, int engScore) {
        this.studentId = studentId;
        this.name = name;
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEngScore() {
        return engScore;
    }


    public int studentTotalGrade(int korScore, int engScore , int mathScore){

        return korScore + engScore + mathScore;
    }

    public int studentAvg(Student kor){

        return (korScore + engScore + mathScore) / 3;
    }

    public double studentSbjAvg(int korScore, int engScore , int mathScore){

        return (korScore + engScore + mathScore) / 3.0;
    }




}
