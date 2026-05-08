package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sve extends awd {
    public static String v(String str) {
        return a7e.T(new xrf(new yve(str), new d12("    ", 3)), "\n");
    }

    public static final String w(String str) throws IOException {
        int length;
        Comparable comparable;
        str.getClass();
        List listX = zve.X(str);
        List list = listX;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!zve.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!ypd.E(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listX.size();
        int size = listX.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                u63.o0();
                throw null;
            }
            String str3 = (String) obj2;
            String strW0 = ((length == 0 || length == size) && zve.U(str3)) ? null : awe.w0(iIntValue, str3);
            if (strW0 != null) {
                arrayList3.add(strW0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        z92.V0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String x(String str) throws IOException {
        if (zve.U("|")) {
            l5.q("marginPrefix must be non-blank string.");
            return null;
        }
        List listX = zve.X(str);
        int length = str.length();
        listX.size();
        int size = listX.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listX) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && zve.U(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ypd.E(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && wve.J(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        z92.V0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
