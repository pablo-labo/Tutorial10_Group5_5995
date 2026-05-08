package defpackage;

import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ao2 {
    public final b[] a;

    public static final class a {
        public static final ao2 a = new ao2(new b[0]);
    }

    public static abstract class b {
    }

    public ao2(b... bVarArr) {
        this.a = bVarArr;
    }

    public final void a(String str, HashMap map) {
        if (map.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append(':');
            sb.append((String) entry.getValue());
        }
        wn2.b.a(str, 4, sb.toString());
    }

    public final void b(Object obj, String str) {
        for (b bVar : this.a) {
            try {
                bVar.getClass();
                throw null;
            } catch (NumberFormatException unused) {
            }
        }
        if (obj != null) {
            wn2.b.a(str, 4, obj);
        }
    }

    public final boolean c(String str, boolean z) {
        b(Boolean.valueOf(z), str);
        return z;
    }

    public final float d(String str, float f) {
        b(Float.valueOf(f), str);
        return f;
    }

    public final int e(int i, String str) {
        b(Integer.valueOf(i), str);
        return i;
    }

    public final void f(String str, BitSet bitSet) {
        j(str, null);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                wn2.b.a(str, 4, sb.toString());
                return;
            }
            int iNextClearBit = bitSet.nextClearBit(iNextSetBit);
            if (sb.length() > 0) {
                sb.append(',');
            }
            if (iNextSetBit < iNextClearBit - 1) {
                sb.append(iNextSetBit);
                sb.append('-');
                sb.append(iNextClearBit);
            } else {
                sb.append(iNextSetBit);
            }
            i = iNextClearBit;
        }
    }

    public final List<String> g(String str) {
        j(str, null);
        return Collections.EMPTY_LIST;
    }

    public final HashMap h(String str) {
        HashMap map = new HashMap();
        b[] bVarArr = this.a;
        int length = bVarArr.length - 1;
        if (length < 0) {
            a(str, map);
            return map;
        }
        ((v3c) bVarArr[length]).getClass();
        throw null;
    }

    public final HashMap i(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            b[] bVarArr = this.a;
            int length = bVarArr.length - 1;
            if (length >= 0) {
                ((v3c) bVarArr[length]).getClass();
                throw null;
            }
            a(str, map);
        }
        return map;
    }

    public final void j(String str, String str2) {
        b[] bVarArr = this.a;
        if (bVarArr.length > 0) {
            bVarArr[0].getClass();
            throw null;
        }
        if (str2 != null) {
            wn2.b.a(str, 4, str2);
        }
    }

    public final boolean k(Collection collection, String str, String str2, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            String strM = z3.m(str, (String) it.next(), str2);
            if (!strM.startsWith("trace.")) {
                strM = "trace.".concat(strM);
            }
            c(strM, z);
            z2 = z ? z2 & z : z2 | z;
        }
        return z2;
    }
}
