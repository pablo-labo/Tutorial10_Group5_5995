package defpackage;

import defpackage.z03;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x05 extends q1 implements z03 {
    public static final x05 b = new x05(z03.a.a);
    public static final Object c = new Object();

    static {
        new ArrayList();
        new LinkedHashMap();
    }

    @Override // defpackage.z03
    public final void N0(v03 v03Var, Throwable th) {
        synchronized (c) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x05) || (obj instanceof y05);
    }
}
