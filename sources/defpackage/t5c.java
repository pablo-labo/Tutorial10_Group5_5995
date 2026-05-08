package defpackage;

import defpackage.d6c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t5c {
    public static final d6c a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(t5c.class, c11.a);
        map2.remove(t5c.class);
        map.put(u72.class, y01.a);
        map2.remove(u72.class);
        map.put(amf.class, e11.a);
        map2.remove(amf.class);
        map.put(m39.class, b11.a);
        map2.remove(m39.class);
        map.put(b39.class, a11.a);
        map2.remove(b39.class);
        map.put(y96.class, z01.a);
        map2.remove(y96.class);
        map.put(bue.class, d11.a);
        map2.remove(bue.class);
        a = new d6c(new HashMap(map), new HashMap(map2), d6c.a.a);
    }

    public abstract u72 a();
}
