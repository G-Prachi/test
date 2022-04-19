
package com.mind.egsp.gstn.model.gstr1;
import java.util.Comparator;
import com.mind.egsp.gstn.model.gstr1.CdnurItem;

public class CdnurItemsComparator implements Comparator<CdnurItem> {
//	@Override
	public int compare(CdnurItem item1, CdnurItem item2) {
		if(item1.getNum()<item2.getNum())
			return -1;
		else if(item1.getNum()>item2.getNum())
			return 1;
		return 0;
	}
}