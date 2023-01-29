package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_revolver extends SuperObject {
	
	public OBJ_revolver() {
		name = "Revolver";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/revolver.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
