package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class y6e implements Iterable<Object>, ze8 {
    public final /* synthetic */ r6e a;

    public y6e(r6e r6eVar) {
        this.a = r6eVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
