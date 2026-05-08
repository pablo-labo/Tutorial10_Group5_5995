package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q3i extends o4i {
    public q3i() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    @Override // defpackage.o4i
    public final void a() {
        if (!this.d) {
            if (this.b > 0) {
                ((owh) f(0).a).zze();
                throw null;
            }
            Iterator it = b().iterator();
            if (it.hasNext()) {
                ((owh) ((Map.Entry) it.next()).getKey()).zze();
                throw null;
            }
        }
        super.a();
    }
}
