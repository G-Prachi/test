
package com.mind.egsp.gstn.model.gstr1;
import java.util.Comparator;
import com.mind.egsp.gstn.model.gstr1.B2clItem;

public class B2clItemsComparator implements Comparator<B2clItem> {
//	@Override
	public int compare(B2clItem item1, B2clItem item2) {
		if(item1.getNum()<item2.getNum())
			return -1;
		else if(item1.getNum()>item2.getNum())
			return 1;
		return 0;
	}
}