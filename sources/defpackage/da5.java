package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class da5 {
    public final boolean a;
    public final boolean b;
    public final w5b c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<yd8<?>, Object> h;

    public da5(boolean z, boolean z2, w5b w5bVar, Long l, Long l2, Long l3, Long l4, Map<yd8<?>, ? extends Object> map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = w5bVar;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = lc9.g0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map<yd8<?>, Object> map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return z92.W0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ da5(boolean z, boolean z2, w5b w5bVar, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, w5bVar, l, l2, l3, l4, bs4.a);
    }
}
