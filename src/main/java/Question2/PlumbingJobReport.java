
package Question2;


public class PlumbingJobReport extends PumblingJob{
    
    public PlumbingJobReport(String JobType, String PlumberName, int JobsCompleted) {
        super(JobType, PlumberName, JobsCompleted);
    }
        // Print report
    public void printPlumbingJobReport() {

        System.out.println();
        System.out.println("PUMBLING JOB REPORT");
        System.out.println("**********************");

        System.out.println("JOB TYPE: "
                + getJobType());

        System.out.println("PLUMBER: "
                + getPlumberName());

        System.out.println("JOBS COMPLETED: "
                + getJobsCompleted());
    }
}
    

