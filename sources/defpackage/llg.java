package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class llg implements r6e<klg> {
    public final ArrayList a = new ArrayList();

    public final void b(Object obj, String str) {
        this.a.add(new klg(obj, str));
    }

    @Override // defpackage.r6e
    public final Iterator<klg> iterator() {
        return this.a.iterator();
    }
}
