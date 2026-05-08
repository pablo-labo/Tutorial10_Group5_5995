package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class d8i extends AbstractList<String> implements q1i, RandomAccess {
    public final l1i a;

    public d8i(l1i l1iVar) {
        this.a = l1iVar;
    }

    @Override // defpackage.q1i
    public final void O1(fvh fvhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q1i
    public final Object P(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        h8i h8iVar = new h8i();
        h8iVar.a = this.a.iterator();
        return h8iVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        k8i k8iVar = new k8i();
        k8iVar.a = this.a.listIterator(i);
        return k8iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.q1i
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // defpackage.q1i
    public final q1i zze() {
        return this;
    }
}
