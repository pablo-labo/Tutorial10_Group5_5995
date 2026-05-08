package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class gdd<T> extends w2<T> implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public static final class a extends o2<T> {
        public int c;
        public int d;
        public final /* synthetic */ gdd<T> e;

        public a(gdd<T> gddVar) {
            this.e = gddVar;
            this.c = gddVar.d;
            this.d = gddVar.c;
        }

        @Override // defpackage.o2
        public final void a() {
            int i = this.c;
            if (i == 0) {
                this.a = 2;
                return;
            }
            gdd<T> gddVar = this.e;
            Object[] objArr = gddVar.a;
            int i2 = this.d;
            this.b = (T) objArr[i2];
            this.a = 1;
            this.d = (i2 + 1) % gddVar.b;
            this.c = i - 1;
        }
    }

    public gdd(Object[] objArr, int i) {
        this.a = objArr;
        if (i < 0) {
            h5.k(p6.c(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            s40.g(objArr.length, o6.g(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // defpackage.l1
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        if (i < 0) {
            h5.k(p6.c(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.d) {
            s40.g(this.d, o6.g(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final T get(int i) {
        int i2 = this.d;
        if (i < 0 || i >= i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }
        return (T) this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // defpackage.l1, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        tArr.getClass();
        int length = tArr.length;
        int i = this.d;
        if (length < i) {
            tArr = (T[]) Arrays.copyOf(tArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            tArr[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            tArr[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l1, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
