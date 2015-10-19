import java.util.ArrayList;


public class MyFolder extends AbstractFolderFile {

	private ArrayList<AbstractFile> filelist = new ArrayList<AbstractFile>();
	@Override
	public void addFile(AbstractFile abstractFile) {
		// TODO Auto-generated method stub
		filelist.add(abstractFile);
	}

	@Override
	public void deleteFile(AbstractFile abstractFile) {
		// TODO Auto-generated method stub
		filelist.remove(abstractFile);
	}

	@Override
	public void showFunction() {
		// TODO Auto-generated method stub
		System.out.print("This is MyFolder! name is " + name);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.print("MyFolder kill virus!");
		for(AbstractFile file:filelist) {
			file.killVirus();
		}
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
