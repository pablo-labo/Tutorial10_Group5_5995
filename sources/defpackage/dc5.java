package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dc5 {
    public static final ub5 a(String str, ArrayList arrayList, Function1 function1) {
        arrayList.getClass();
        function1.getClass();
        if (str == null) {
            return new ub5(zr4.a, arrayList);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> listG = new pxc("\\s+").g(lowerCase, 0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listG) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            String lowerCase2 = ((String) function1.invoke((Comparable) obj2)).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (!zve.L(lowerCase2, (String) it.next(), false)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj2);
        }
        return new ub5(arrayList2, z92.o1(arrayList3));
    }
}
