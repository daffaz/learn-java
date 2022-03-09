
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class ScoreCounter {
    private ArrayList<Integer> scores;
    private ArrayList<Integer> passingScores;
    
    public ScoreCounter() {
        this.scores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
    }
    
    public void add(int newScore) {
        if (newScore >= 0 && newScore <= 100) {
            if (newScore >= 50) {
                this.passingScores.add(newScore);
            }
            this.scores.add(newScore);
        }
    }
    
    public String getAverageOfAllValue() {
        if (this.scores.size() > 0) {
            int total = 0;
            int scoresSize = this.scores.size();
        
            for (int i = 0; i < scoresSize; i++) {
                total += this.scores.get(i);
            }
            
            return "" + total / (scoresSize * 1.0);
        }
        
        return "-";
    }
    
    public String getAverageOfPassing() {
        if (this.passingScores.size() > 0) {
            int total = 0;
            int scoresSize = this.passingScores.size();
        
            for (int i = 0; i < scoresSize; i++) {
                total += this.passingScores.get(i);
            }
            
            return "" + total / (scoresSize * 1.0);
        }
        
        return "-";
    }
    
    public double passPercentage() {
        if (this.passingScores.size() > 0) {
            return 100 * (1.0 * this.passingScores.size() / this.scores.size());
        }
        
        return 0.0;
    }
    
    public void starPrinter() {
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;
        
        for (Integer score : this.scores) {
            if (score < 50) {
                grade0++;
            }else if (score < 60) {
                grade1++;
            }else if (score < 70) {
                grade2++;
            }
            else if (score < 80) {
                grade3++;
            }else if (score < 90) {
                grade4++;
            }else {
                grade5++;
            }
        }
        
        System.out.println(helperPrinter(grade5, "5"));
        System.out.println(helperPrinter(grade4, "4"));
        System.out.println(helperPrinter(grade3, "3"));
        System.out.println(helperPrinter(grade2, "2"));
        System.out.println(helperPrinter(grade1, "1"));
        System.out.println(helperPrinter(grade0, "0"));
    }
    
    private String helperPrinter(int gradeAmount, String grade) {
        String star = "";
        for (int i = 0; i < gradeAmount; i++) {
            star += "*";
        }
        
        return grade + ": " + star;
    }
}
