package defpackage;

import defpackage.n2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mo7 extends n2<Object> {
    public final /* synthetic */ Iterator c;
    public final /* synthetic */ bjb d;

    public mo7(Iterator it, bjb bjbVar) {
        this.c = it;
        this.d = bjbVar;
    }

    @Override // defpackage.n2
    public final Object a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = n2.a.c;
                return null;
            }
            next = it.next();
        } while (!this.d.apply(next));
        return next;
    }
}
