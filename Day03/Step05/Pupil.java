public class Pupil{

    public ScholarSchedule schedule;

    public void wakeUp(){
	switch (schedule.getDayOfWeek()) {

	 case SUNDAY:
                System.out.println("I can sleep more!");
                break;

	 default:
                System.out.println("I have to go to school!");
                break;
        }
    }
}
