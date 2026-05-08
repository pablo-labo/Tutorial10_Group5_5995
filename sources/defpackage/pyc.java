package defpackage;

import defpackage.f47;
import defpackage.ryc;

/* JADX INFO: loaded from: classes2.dex */
public final class pyc<K, V> extends v37<K, V> {
    public static final pyc<Object, Object> X = new pyc<>();
    public final transient int V;
    public final transient pyc<V, K> W;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public pyc(Object[] objArr, int i) {
        this.e = objArr;
        this.V = i;
        this.f = 0;
        int i2 = i >= 2 ? i47.i(i) : 0;
        Object objH = ryc.h(objArr, i, i2, 0);
        if (objH instanceof Object[]) {
            throw ((f47.a.C0227a) ((Object[]) objH)[2]).a();
        }
        this.d = objH;
        Object objH2 = ryc.h(objArr, i, i2, 1);
        if (objH2 instanceof Object[]) {
            throw ((f47.a.C0227a) ((Object[]) objH2)[2]).a();
        }
        this.W = new pyc<>(objH2, objArr, i, this);
    }

    @Override // defpackage.f47
    public final ryc.a b() {
        return new ryc.a(this, this.e, this.f, this.V);
    }

    @Override // defpackage.f47
    public final ryc.b d() {
        return new ryc.b(this, new ryc.c(this.e, this.f, this.V));
    }

    @Override // defpackage.f47, java.util.Map
    public final V get(Object obj) {
        V v = (V) ryc.i(this.d, this.e, this.V, this.f, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // defpackage.v37
    public final pyc h() {
        return this.W;
    }

    @Override // java.util.Map
    public final int size() {
        return this.V;
    }

    @Override // defpackage.v37, defpackage.f47
    public Object writeReplace() {
        return super.writeReplace();
    }

    public pyc(Object obj, Object[] objArr, int i, pyc<V, K> pycVar) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.V = i;
        this.W = pycVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pyc() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.V = 0;
        this.W = this;
    }
}
