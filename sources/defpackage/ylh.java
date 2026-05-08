package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ylh extends qlh {
    final /* synthetic */ bmh zza;

    public ylh(bmh bmhVar) {
        this.zza = bmhVar;
    }

    @Override // defpackage.qjh
    public final s7h d() {
        return j().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // defpackage.rlh
    public final gkh k() {
        return new wlh(this);
    }
}
