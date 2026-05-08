package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y01 implements kna<u72> {
    public static final y01 a = new y01();
    public static final x85 b;
    public static final x85 c;
    public static final x85 d;
    public static final x85 e;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("window", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(2);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        c = new x85("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        gw0 gw0Var3 = new gw0(3);
        HashMap map3 = new HashMap();
        map3.put(z5c.class, gw0Var3);
        d = new x85("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        gw0 gw0Var4 = new gw0(4);
        HashMap map4 = new HashMap();
        map4.put(z5c.class, gw0Var4);
        e = new x85("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        u72 u72Var = (u72) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, u72Var.a);
        lnaVar2.b(c, u72Var.b);
        lnaVar2.b(d, u72Var.c);
        lnaVar2.b(e, u72Var.d);
    }
}
