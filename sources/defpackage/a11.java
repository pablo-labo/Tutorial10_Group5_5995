package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a11 implements kna<b39> {
    public static final a11 a = new a11();
    public static final x85 b;
    public static final x85 c;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(3);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        c = new x85("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        b39 b39Var = (b39) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, b39Var.a);
        lnaVar2.b(c, b39Var.b);
    }
}
