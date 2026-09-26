
package Question2;


public class PumblingJob  implements IPlumbingJob {
    private String JobType;
    private String PlumberName;
    private int JobsCompleted;

    // Constructor
    public PumblingJob(String JobType,
                          String PlumberName,
                          int JobsCompleted) {

        this.JobType = JobType;
        this.PlumberName = PlumberName;
        this.JobsCompleted = JobsCompleted;
    }

    // Get methods
    @Override
    public String getJobType() {
        return JobType;
    }

    @Override
    public String getPlumberName() {
        return PlumberName;
    }

    @Override
    public int getJobsCompleted() {
        return JobsCompleted;
    }
}

  