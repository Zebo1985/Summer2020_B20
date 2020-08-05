package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,93, 90, 75,86, 88, 80, 65,68,79, 55, 45, 73, 57, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();//
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p-> p<90);
        System.out.println("Grade A: "+gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>();//
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p-> p<80 || p>89);
        System.out.println("Grade B: "+gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>();//
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p-> p<70 || p>79);
        System.out.println("Grade C: "+gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>();//
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p-> p<60 || p>69);
        System.out.println("Grade D: "+gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>();//
        gradeOfF.addAll(grades);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        gradeOfF.removeIf(p-> p>59);
        System.out.println("Grade F: "+gradeOfF);
        System.out.println("=================================================");
        System.out.println(gradeOfA.size()+" Student made A");
        System.out.println(gradeOfB.size()+" Student made B");
        System.out.println(gradeOfC.size()+" Student made C");
        System.out.println(gradeOfD.size()+" Student made D");
        System.out.println(gradeOfF.size()+" Student faild");

    }
}
