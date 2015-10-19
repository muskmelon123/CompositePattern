
public class VideoFile extends AbstractFile {

	@Override
	public void showFunction() {
		// TODO Auto-generated method stub
		System.out.print("This is VideoFile! name is " + name);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.print("VideoFile " + name + " kill virus!");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
