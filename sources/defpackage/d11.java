package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d11 implements kna<bue> {
    public static final d11 a = new d11();
    public static final x85 b;
    public static final x85 c;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(2);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        c = new x85("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        bue bueVar = (bue) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, bueVar.a);
        lnaVar2.i(c, bueVar.b);
    }
}
