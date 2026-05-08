package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class znh extends AbstractSet<Map.Entry<String, Object>> {
    public final /* synthetic */ bnh a;

    public znh(bnh bnhVar) {
        this.a = bnhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        bnh bnhVar = this.a;
        xmh xmhVar = bnhVar.b;
        Iterator<String> it = xmhVar.d.iterator();
        while (it.hasNext()) {
            xmhVar.b(it.next()).c(bnhVar.a, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        bnh bnhVar = this.a;
        xmh xmhVar = bnhVar.b;
        Iterator<String> it = xmhVar.d.iterator();
        while (it.hasNext()) {
            if (hoh.a(bnhVar.a, xmhVar.b(it.next()).b) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new onh(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        bnh bnhVar = this.a;
        xmh xmhVar = bnhVar.b;
        Iterator<String> it = xmhVar.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (hoh.a(bnhVar.a, xmhVar.b(it.next()).b) != null) {
                i++;
            }
        }
        return i;
    }
}
