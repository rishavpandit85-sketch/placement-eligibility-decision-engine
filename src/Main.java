
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
                    "TCS",
                    "Java Developer",
                    60.0,
                    2,
                    2026
            );

            EligibilityChecker checker = new EligibilityChecker();

            boolean eligible = checker.isEligible(candidate, job);

            System.out.println("Candidate: " + candidate.getName());
            System.out.println("Company: " + job.getCompany());
            System.out.println("Role: " + job.getRole());
            System.out.println("Result: " + (eligible ? "Eligible" : "Not Eligible"));
        }
    }
}
