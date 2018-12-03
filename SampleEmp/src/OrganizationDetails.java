public class OrganizationDetails extends Employee{
    boolean fresher;
    boolean exp;
    String name_of_Org;
    String project;
    int duration;

    public OrganizationDetails(String name_of_Org, String project, int duration)
    {

        this.name_of_Org=name_of_Org;
        this.project=project;
        this.duration=duration;
    }

    public void setName_of_Org(){
        this.name_of_Org=name_of_Org;
    }
    public void setProject(){
        this.project=project;
    }
    public void setDuration(){
        this.duration=duration;
    }

    public String getName_of_Org(){
        return name_of_Org;
    }
    public String getProject(){
        return project;
    }
    public int getDuration(){
        return duration;
    }
}
