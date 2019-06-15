package _201_OOP_6_TV_1;

public class mian {
	public static void main(String[] args) {
		
	TV tel= new TV();
	tel.on=true;
	System.out.println(tel.isOn());
	System.out.println(tel.getVolumeLevel());
	tel.setVolumeLevel(3);
	System.out.println(tel.getVolumeLevel());
	tel.volumeUp();
	System.out.println(tel.getVolumeLevel());
	tel.volumeUp();

}
}
