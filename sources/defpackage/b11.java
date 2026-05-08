package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b11 implements kna<m39> {
    public static final b11 a = new b11();
    public static final x85 b;
    public static final x85 c;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("logSource", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(2);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        c = new x85("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        m39 m39Var = (m39) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, m39Var.a);
        lnaVar2.b(c, m39Var.b);
    }
}
