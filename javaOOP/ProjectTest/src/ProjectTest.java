public class ProjectTest {

	public static void main(String[] args) {
		Project p1 = new Project();
		System.out.println(p1.elevatorPitch());
		p1.setDescription("This is Dummy");
		System.out.println(p1.getDescription());
		System.out.println(p1.elevatorPitch());

		Project p2 = new Project("Pro");
		System.out.println(p2.elevatorPitch());
		p2.setName("Project2");
		System.out.println(p2.getName());
		System.out.println(p2.elevatorPitch());

		Project p3 = new Project("Pro", "project is not awesome");
		System.out.println(p3.elevatorPitch());
	}

}
