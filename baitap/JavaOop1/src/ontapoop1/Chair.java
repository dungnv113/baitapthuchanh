package ontapoop1;

public class Chair {
String nhasanxuat;
int namsanxuat;
String chatlieu;

public Chair() {
	System.out.println("cai nay tui tao ra");

}
public Chair(int namsanxuat, String nhasanxuat, String chatlieu) {
	System.out.println("thiet lap nam, nhasx, chatlieu ");
	this.namsanxuat = namsanxuat;
	this.nhasanxuat = nhasanxuat;
	this.chatlieu = chatlieu;
}
}
