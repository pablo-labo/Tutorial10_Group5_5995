package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r7h extends p7h {
    public static final Object[] X;
    public static final r7h Y;
    public final transient Object[] V;
    public final transient Object[] W;

    static {
        Object[] objArr = new Object[0];
        X = objArr;
        Y = new r7h(objArr, objArr);
    }

    public r7h(Object[] objArr, Object[] objArr2) {
        super(0);
        this.V = objArr;
        this.W = objArr2;
    }

    @Override // defpackage.l7h
    public final void a(Object[] objArr) {
        System.arraycopy(this.V, 0, objArr, 0, 0);
    }

    @Override // defpackage.l7h
    public final int b() {
        return 0;
    }

    @Override // defpackage.l7h
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.W.length;
        return false;
    }

    @Override // defpackage.l7h
    public final Object[] d() {
        return this.V;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        o7h o7hVar = this.e;
        if (o7hVar == null) {
            m7h m7hVar = o7h.e;
            o7hVar = q7h.V;
            this.e = o7hVar;
        }
        return o7hVar.listIterator(0);
    }

    @Override // defpackage.p7h
    public final void j() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
