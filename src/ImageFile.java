
public class ImageFile extends AbstractFile {

	@Override
	public void showFunction() {
		// TODO Auto-generated method stub
		System.out.print("This is imagefile! name is " + name);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.print("Imagefile " + name + " kill virus!");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
