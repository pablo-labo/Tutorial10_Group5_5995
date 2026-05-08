package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uzh implements Iterator {
    public final Iterator a;

    public uzh(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof zzh ? new rzh(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
