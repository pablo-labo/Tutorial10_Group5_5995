package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class u7i extends pzh<Long> implements rai, RandomAccess {
    public long[] b;
    public int c;

    static {
        new u7i(new long[0], 0).a = false;
    }

    public u7i() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        b(i, ((Long) obj).longValue());
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = p5i.a;
        collection.getClass();
        if (!(collection instanceof u7i)) {
            return super.addAll(collection);
        }
        u7i u7iVar = (u7i) collection;
        int i = u7iVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(u7iVar.b, 0, this.b, this.c, u7iVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i, long j) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            l5.s(e(i));
            return;
        }
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[akb.a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = j;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s5i
    public final /* synthetic */ s5i b0(int i) {
        if (i >= this.c) {
            return new u7i(Arrays.copyOf(this.b, i), this.c);
        }
        o6.h();
        return null;
    }

    public final void c(long j) {
        b(this.c, j);
    }

    public final void d(int i) {
        if (i < 0 || i >= this.c) {
            l5.s(e(i));
        }
    }

    public final String e(int i) {
        return uz.d(35, i, this.c, "Index:", ", Size:");
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7i)) {
            return super.equals(obj);
        }
        u7i u7iVar = (u7i) obj;
        if (this.c != u7iVar.c) {
            return false;
        }
        long[] jArr = u7iVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Long.valueOf(this.b[i]);
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.c; i++) {
            iB = (iB * 31) + p5i.b(this.b[i]);
        }
        return iB;
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.b[i]))) {
                long[] jArr = this.b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            l5.s("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        d(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public u7i(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
