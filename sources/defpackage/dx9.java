package defpackage;

import defpackage.ex9;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class dx9 extends z79<ex9.a<Object>, Object> {
    @Override // defpackage.z79
    public final void c(ex9.a<Object> aVar, Object obj) {
        ex9.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = ex9.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
