package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q7h extends o7h {
    public static final q7h V = new q7h(new Object[0]);
    public final transient Object[] f;

    public q7h(Object[] objArr) {
        super(0);
        this.f = objArr;
    }

    @Override // defpackage.o7h, defpackage.l7h
    public final void a(Object[] objArr) {
        System.arraycopy(this.f, 0, objArr, 0, 0);
    }

    @Override // defpackage.l7h
    public final int b() {
        return 0;
    }

    @Override // defpackage.l7h
    public final int c() {
        return 0;
    }

    @Override // defpackage.l7h
    public final Object[] d() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j7h.a(i, 0);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
