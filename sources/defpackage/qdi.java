package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class qdi extends AbstractList<String> implements q6i, RandomAccess {
    public final t6i a;

    public qdi(t6i t6iVar) {
        this.a = t6iVar;
    }

    @Override // defpackage.q6i
    public final q6i d1() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        wdi wdiVar = new wdi();
        wdiVar.a = this.a.iterator();
        return wdiVar;
    }

    @Override // defpackage.q6i
    public final void j1(h0i h0iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        ndi ndiVar = new ndi();
        ndiVar.a = this.a.listIterator(i);
        return ndiVar;
    }

    @Override // defpackage.q6i
    public final List<?> m0() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
