package com.mind.egsp.gstn.model.gstr1;
import java.util.Comparator;
import com.mind.egsp.gstn.model.gstr1.B2bItem;

public class B2bItemsComparator implements Comparator<B2bItem> {
//	@Override
	public int compare(B2bItem item1, B2bItem item2) {
		if(item1.getNum()<item2.getNum())
			return -1;
		else if(item1.getNum()>item2.getNum())
			return 1;
		return 0;
	}
}
