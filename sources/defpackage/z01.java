package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z01 implements kna<y96> {
    public static final z01 a = new z01();
    public static final x85 b;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        lnaVar.b(b, ((y96) obj).a);
    }
}
