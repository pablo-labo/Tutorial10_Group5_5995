package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xmh {
    public static final WeakHashMap e = new WeakHashMap();
    public static final WeakHashMap f = new WeakHashMap();
    public final Class<?> a;
    public final boolean b;
    public final IdentityHashMap<String, hoh> c = new IdentityHashMap<>();
    public final List<String> d;

    public xmh(Class<?> cls, boolean z) {
        this.a = cls;
        this.b = z;
        boolean z2 = (z && cls.isEnum()) ? false : true;
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(strValueOf);
        String string = sb.toString();
        if (!z2) {
            l5.q(string);
            throw null;
        }
        TreeSet treeSet = new TreeSet(new wc0(3));
        for (Field field : cls.getDeclaredFields()) {
            hoh hohVarB = hoh.b(field);
            if (hohVarB != null) {
                String strIntern = hohVarB.c;
                strIntern = z ? strIntern.toLowerCase(Locale.US).intern() : strIntern;
                hoh hohVar = this.c.get(strIntern);
                boolean z3 = hohVar == null;
                Object[] objArr = {z ? "case-insensitive " : "", strIntern, field, hohVar == null ? null : hohVar.b};
                if (!z3) {
                    l5.q(ojh.z("two fields have the same %sname <%s>: %s and %s", objArr));
                    throw null;
                }
                this.c.put(strIntern, hohVarB);
                treeSet.add(strIntern);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            xmh xmhVarA = a(superclass, z);
            treeSet.addAll(xmhVarA.d);
            for (Map.Entry<String, hoh> entry : xmhVarA.c.entrySet()) {
                String key = entry.getKey();
                if (!this.c.containsKey(key)) {
                    this.c.put(key, entry.getValue());
                }
            }
        }
        this.d = treeSet.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static xmh a(Class<?> cls, boolean z) {
        xmh xmhVar;
        WeakHashMap weakHashMap = z ? f : e;
        synchronized (weakHashMap) {
            try {
                xmhVar = (xmh) weakHashMap.get(cls);
                if (xmhVar == null) {
                    xmhVar = new xmh(cls, z);
                    weakHashMap.put(cls, xmhVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xmhVar;
    }

    public final hoh b(String str) {
        if (str != null) {
            if (this.b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.c.get(str);
    }
}
