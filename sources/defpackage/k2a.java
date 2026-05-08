package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k2a {
    public final to1 a;
    public long b;

    public k2a(to1 to1Var, String str) {
        this.a = to1Var;
    }

    public static LinkedHashMap b(zn1 zn1Var) {
        Collection collectionQ1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> listG = new pxc("\r\n").g(zn1Var.z1(), 0);
        if (listG.isEmpty()) {
            collectionQ1 = zr4.a;
        } else {
            ListIterator<String> listIterator = listG.listIterator(listG.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    collectionQ1 = z92.q1(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionQ1 = zr4.a;
        }
        for (String str : (String[]) collectionQ1.toArray(new String[0])) {
            int iS = zve.S(str, ":", 0, false, 6);
            if (iS != -1) {
                String strSubstring = str.substring(0, iS);
                int length = strSubstring.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = wl7.c(strSubstring.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String string = strSubstring.subSequence(i, length + 1).toString();
                String strSubstring2 = str.substring(iS + 1);
                int length2 = strSubstring2.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = wl7.c(strSubstring2.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                linkedHashMap.put(string, strSubstring2.subSequence(i2, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    public final void a(LinkedHashMap linkedHashMap, long j, boolean z, zp1 zp1Var) {
        if (linkedHashMap == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b > 16 || z) {
            this.b = jCurrentTimeMillis;
            long j2 = Long.parseLong((String) linkedHashMap.getOrDefault("Content-Length", "0"));
            if ("application/javascript".equals(linkedHashMap.get(TracingInterceptor.HEADER_CT))) {
                zp1Var.f.b(Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)), "Downloading");
            }
        }
    }
}
