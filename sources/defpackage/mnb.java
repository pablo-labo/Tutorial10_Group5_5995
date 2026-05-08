package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mnb {
    public static final SparseArray<jnb> a = new SparseArray<>();
    public static final HashMap<jnb, Integer> b;

    static {
        HashMap<jnb, Integer> map = new HashMap<>();
        b = map;
        map.put(jnb.a, 0);
        map.put(jnb.b, 1);
        map.put(jnb.c, 2);
        for (jnb jnbVar : map.keySet()) {
            a.append(b.get(jnbVar).intValue(), jnbVar);
        }
    }

    public static int a(jnb jnbVar) {
        Integer num = b.get(jnbVar);
        if (num != null) {
            return num.intValue();
        }
        bg.n(jnbVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static jnb b(int i) {
        jnb jnbVar = a.get(i);
        if (jnbVar != null) {
            return jnbVar;
        }
        l5.q(p6.c(i, "Unknown Priority for value "));
        return null;
    }
}
