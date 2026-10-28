
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String name = scanner.next();
            double percentage = scanner.nextDouble();
            int backlogs = scanner.nextInt();
            int graduationYear = scanner.nextInt();

            Candidate candidate = new Candidate(
                    name,
                    percentage,
                    backlogs,
                    graduationYear
            );

            Job job = new Job(
                    "Infosys",
                    "Java Developer",
                    65.0,
                    0,
                    2026
            );

            EligibilityRule percentageRule = new PercentageRule();
            EligibilityRule backlogRule = new BacklogRule();
            EligibilityRule graduationYearRule = new GraduationYearRule();

            boolean percentagePass = percentageRule.check(candidate, job);
            boolean backlogPass = backlogRule.check(candidate, job);
            boolean yearPass = graduationYearRule.check(candidate, job);

            System.out.println("Percentage     : "
                    + (percentagePass ? "PASS" : "FAIL"));

            System.out.println("Backlogs       : "
                    + (backlogPass ? "PASS" : "FAIL"));

            System.out.println("Graduation Year: "
                    + (yearPass ? "PASS" : "FAIL"));

            boolean eligible = percentagePass
                    && backlogPass
                    && yearPass;

            System.out.println("Final Result   : "
                    + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
        }
    }
}
