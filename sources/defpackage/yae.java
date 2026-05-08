package defpackage;

import defpackage.n2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yae extends n2<Object> {
    public final Iterator<Object> c;
    public final /* synthetic */ zae d;

    public yae(zae zaeVar) {
        this.d = zaeVar;
        this.c = zaeVar.a.iterator();
    }

    @Override // defpackage.n2
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.c;
            if (!it.hasNext()) {
                this.a = n2.a.c;
                return null;
            }
            next = it.next();
        } while (!this.d.b.contains(next));
        return next;
    }
}
