package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zd8 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(yd8<?> yd8Var) {
        yd8Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(yd8Var);
        if (str != null) {
            return str;
        }
        String name = jh2.p(yd8Var).getName();
        concurrentHashMap.put(yd8Var, name);
        return name;
    }
}
