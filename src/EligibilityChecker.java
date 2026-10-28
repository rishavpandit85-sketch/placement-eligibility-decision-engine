
public class EligibilityChecker {

    public boolean isEligible(Candidate candidate, Job job) {

        boolean percentageEligible
                = candidate.getPercentage() >= job.getMinimumPercentage();

        boolean backlogEligible
                = candidate.getBacklogs() <= job.getMaximumBacklogs();

        boolean graduationYearEligible
                = candidate.getGraduationYear() <= job.getRequiredGraduationYear();

        return percentageEligible
                && backlogEligible
                && graduationYearEligible;
    }
}
