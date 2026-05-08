package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class baf implements xv8 {
    public final Set<y9f<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.xv8
    public final void f() {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((y9f) it.next()).f();
        }
    }

    @Override // defpackage.xv8
    public final void onDestroy() {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((y9f) it.next()).onDestroy();
        }
    }

    @Override // defpackage.xv8
    public final void onStop() {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((y9f) it.next()).onStop();
        }
    }
}
