
package com.mind.egsp.gstn.model.gstr1;
import java.util.Comparator;
import com.mind.egsp.gstn.model.gstr1.DocumentList;

public class DocumentListsComparator implements Comparator<DocumentList> {
//	@Override
	public int compare(DocumentList item1, DocumentList item2) {
		if(item1.getNum()<item2.getNum())
			return -1;
		else if(item1.getNum()>item2.getNum())
			return 1;
		return 0;
	}
}