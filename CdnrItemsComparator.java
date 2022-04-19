
package com.mind.egsp.gstn.model.gstr1;
import java.util.Comparator;
import com.mind.egsp.gstn.model.gstr1.CDNRItem;

public class CdnrItemsComparator implements Comparator<CDNRItem> {
//	@Override
	public int compare(CDNRItem item1, CDNRItem item2) {
		if(item1.getNum()<item2.getNum())
			return -1;
		else if(item1.getNum()>item2.getNum())
			return 1;
		return 0;
	}
}