package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_wip extends SuperObject{
	
	public OBJ_wip() {
		name = "WIP";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/PLACEHOLDER.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
