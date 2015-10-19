
public class Client {

	public static void main(String args[]) {
		ImageFile imageFile = new ImageFile();
		TextFile textFile = new TextFile();
		VideoFile videoFile = new VideoFile();
		MyFolder folder = new MyFolder();
		imageFile.setName("qing ming shang he tu");
		textFile.setName("wo de fen dou");
		videoFile.setName("da tao sha");
		folder.addFile(imageFile);
		folder.addFile(textFile);
		folder.addFile(videoFile);
		folder.killVirus();
	}
}
//注意：注意抽象和递归。这里有两个不同类型，一个是文件，一个是文件夹。抽象文件夹可以通过继承抽象文件来实现。递归，可以从根目录调用到子目录，遍历所有文件。