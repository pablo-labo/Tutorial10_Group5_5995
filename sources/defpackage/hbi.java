package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class hbi {
    public static final Class<?> a;
    public static final rci<?, ?> b;
    public static final rci<?, ?> c;
    public static final wci d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = d(false);
        c = d(true);
        d = new wci();
    }

    public static <UT, UB> UB a(int i, List<Integer> list, v5i v5iVar, UB ub, rci<UT, UB> rciVar) {
        if (v5iVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!v5iVar.a()) {
                    if (ub == null) {
                        ub = (UB) rciVar.l();
                    }
                    rciVar.b(ub, i, iIntValue);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (v5iVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = (UB) rciVar.l();
                }
                rciVar.b(ub, i, iIntValue2);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends n4i<FT>> void b(t3i<FT> t3iVar, T t, T t2) {
        mbi mbiVar = t3iVar.f(t2).a;
        if (mbiVar.isEmpty()) {
            return;
        }
        h4i<T> h4iVarG = t3iVar.g(t);
        h4iVarG.getClass();
        for (int i = 0; i < mbiVar.b.size(); i++) {
            h4iVarG.e(mbiVar.d(i));
        }
        Iterator<T> it = mbiVar.h().iterator();
        while (it.hasNext()) {
            h4iVarG.e((Map.Entry) it.next());
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static rci<?, ?> d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (rci) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }
}
