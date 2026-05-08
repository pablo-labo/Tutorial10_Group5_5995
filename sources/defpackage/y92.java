package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class y92 implements r6e<Object> {
    public final /* synthetic */ Iterable a;

    public y92(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.r6e
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
