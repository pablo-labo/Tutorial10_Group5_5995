package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class goh extends rlh {
    public final transient Object c;

    public goh(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.qjh
    public final int a(Object[] objArr) {
        objArr[0] = this.c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // defpackage.qjh
    public final s7h d() {
        return new mmh(this.c);
    }

    @Override // defpackage.rlh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new mmh(this.c);
    }

    @Override // defpackage.rlh
    public final gkh j() {
        Object[] objArr = {this.c};
        for (int i = 0; i < 1; i++) {
            ujh ujhVar = gkh.b;
            if (objArr[i] == null) {
                ja.k(p6.c(i, "at index "));
                return null;
            }
        }
        return gkh.i(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l5.m("[", this.c.toString(), "]");
    }
}
