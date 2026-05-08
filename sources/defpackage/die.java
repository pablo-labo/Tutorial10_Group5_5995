package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class die<E> extends i47<E> {
    public final transient E d;

    public die(E e) {
        e.getClass();
        this.d = e;
    }

    @Override // defpackage.i47, defpackage.x37
    public final e47<E> a() {
        return e47.n(this.d);
    }

    @Override // defpackage.x37
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.x37
    public final boolean f() {
        return false;
    }

    @Override // defpackage.i47, defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public final r6g<E> iterator() {
        return new oo7(this.d);
    }

    @Override // defpackage.i47, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // defpackage.i47, defpackage.x37
    public Object writeReplace() {
        return super.writeReplace();
    }
}
