package org.example.school;

public class Student {
    String id ;
    String name ;
    int englishScore ;
    int mathScore ;


    public Student(String name, int englishScore, int mathScore) {
        this.name = name ;
        this.englishScore = englishScore ;
        this.mathScore = mathScore ;

    }

    public  int highest(){
        return  (englishScore >= mathScore) ? englishScore : mathScore ;
    }

    public  void show(){
        int average = getAverage();
        System.out.println("名字:" + name + "\t" +
                "英文:" +  englishScore + "\t" +
                "數學:" +  mathScore + "\t" +
                "平均:" + average + "\t" +
                ((average >= 60) ? "PASS" : "FAILED")
        );
        char grading = 'F';

        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }

        System.out.println(grading);

    }
    public int getAverage(){
        return (englishScore+mathScore)/2 ;
    }
}
