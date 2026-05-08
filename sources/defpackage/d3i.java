package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class d3i extends pzh<Double> implements rai, RandomAccess {
    public double[] b;
    public int c;

    static {
        new d3i(new double[0], 0).a = false;
    }

    public d3i() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        b(i, ((Double) obj).doubleValue());
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = p5i.a;
        collection.getClass();
        if (!(collection instanceof d3i)) {
            return super.addAll(collection);
        }
        d3i d3iVar = (d3i) collection;
        int i = d3iVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.b;
        if (i3 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(d3iVar.b, 0, this.b, this.c, d3iVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i, double d) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            l5.s(d(i));
            return;
        }
        double[] dArr = this.b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[akb.a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.b, i, dArr2, i + 1, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = d;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s5i
    public final /* synthetic */ s5i b0(int i) {
        if (i >= this.c) {
            return new d3i(Arrays.copyOf(this.b, i), this.c);
        }
        o6.h();
        return null;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            l5.s(d(i));
        }
    }

    public final String d(int i) {
        return uz.d(35, i, this.c, "Index:", ", Size:");
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3i)) {
            return super.equals(obj);
        }
        d3i d3iVar = (d3i) obj;
        if (this.c != d3iVar.c) {
            return false;
        }
        double[] dArr = d3iVar.b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Double.valueOf(this.b[i]);
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.c; i++) {
            iB = (iB * 31) + p5i.b(Double.doubleToLongBits(this.b[i]));
        }
        return iB;
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Double.valueOf(this.b[i]))) {
                double[] dArr = this.b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.c - i) - 1);
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
        double[] dArr = this.b;
        System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        c(i);
        double[] dArr = this.b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public d3i(double[] dArr, int i) {
        this.b = dArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        c(i);
        double[] dArr = this.b;
        double d = dArr[i];
        if (i < this.c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
