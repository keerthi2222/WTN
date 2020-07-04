package interfaces.live;
import interfaces.music.*;
import interfaces.music.string.*;
import interfaces.music.wind.*;

public class Test 
{
	public static void main(String args[])
	{
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
		
	}

}
