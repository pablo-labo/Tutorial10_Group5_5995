package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p3b extends r3b<Iterable<Object>> {
    public final /* synthetic */ r3b a;

    public p3b(r3b r3bVar) {
        this.a = r3bVar;
    }

    @Override // defpackage.r3b
    public final void a(s3d s3dVar, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.a.a(s3dVar, it.next());
        }
    }
}
