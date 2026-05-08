package defpackage;

import defpackage.ht0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nsh {
    public static final ht0 a = new ht0();

    public static synchronized void a() {
        Iterator it = ((ht0.e) a.values()).iterator();
        if (it.hasNext()) {
            ((nsh) it.next()).getClass();
            throw null;
        }
        a.clear();
    }
}
