package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s9b<T> extends x2<T> {
    public final q9b<T> c;
    public int d;
    public rtf<? extends T> e;
    public int f;

    public s9b(q9b<T> q9bVar, int i) {
        super(i, q9bVar.W);
        this.c = q9bVar;
        this.d = q9bVar.g();
        this.f = -1;
        b();
    }

    public final void a() {
        if (this.d == this.c.g()) {
            return;
        }
        q6.h();
    }

    @Override // defpackage.x2, java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.a;
        q9b<T> q9bVar = this.c;
        q9bVar.add(i, t);
        this.a++;
        this.b = q9bVar.a();
        this.d = q9bVar.g();
        this.f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        q9b<T> q9bVar = this.c;
        Object[] objArr = q9bVar.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (q9bVar.W - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (q9bVar.d / 5) + 1;
        rtf<? extends T> rtfVar = this.e;
        if (rtfVar == null) {
            this.e = new rtf<>(objArr, i2, i, i3);
            return;
        }
        rtfVar.a = i2;
        rtfVar.b = i;
        rtfVar.c = i3;
        if (rtfVar.d.length < i3) {
            rtfVar.d = new Object[i3];
        }
        rtfVar.d[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        rtfVar.e = r0;
        rtfVar.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            k20.p();
            return null;
        }
        int i = this.a;
        this.f = i;
        rtf<? extends T> rtfVar = this.e;
        q9b<T> q9bVar = this.c;
        if (rtfVar == null) {
            Object[] objArr = q9bVar.V;
            this.a = i + 1;
            return (T) objArr[i];
        }
        if (rtfVar.hasNext()) {
            this.a++;
            return rtfVar.next();
        }
        Object[] objArr2 = q9bVar.V;
        int i2 = this.a;
        this.a = i2 + 1;
        return (T) objArr2[i2 - rtfVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            k20.p();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        rtf<? extends T> rtfVar = this.e;
        q9b<T> q9bVar = this.c;
        if (rtfVar == null) {
            Object[] objArr = q9bVar.V;
            int i2 = i - 1;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = rtfVar.b;
        if (i <= i3) {
            this.a = i - 1;
            return rtfVar.previous();
        }
        Object[] objArr2 = q9bVar.V;
        int i4 = i - 1;
        this.a = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // defpackage.x2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f;
        if (i == -1) {
            bg.h();
            return;
        }
        q9b<T> q9bVar = this.c;
        q9bVar.b(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = q9bVar.a();
        this.d = q9bVar.g();
        this.f = -1;
        b();
    }

    @Override // defpackage.x2, java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.f;
        if (i == -1) {
            bg.h();
            return;
        }
        q9b<T> q9bVar = this.c;
        q9bVar.set(i, t);
        this.d = q9bVar.g();
        b();
    }
}
