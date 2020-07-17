import java.util.ArrayList;

/**
 * @Description
 * @Author: Lihuaidong
 * @Date: Created at 16:42 2020/7/16
 */
public class CreateOOM {

	public static void main(String[] args) {
		ArrayList arryList = new ArrayList();
		int i = 0;
		while (true) {
			i++;
			arryList.add(String.valueOf(i));
			if (i < 0) {
				break;
			}
		}
	}

}
