package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class x4i extends pzh<Float> implements rai, RandomAccess {
    public float[] b;
    public int c;

    static {
        new x4i(0, new float[0]).a = false;
    }

    public x4i() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        b(((Float) obj).floatValue(), i);
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = p5i.a;
        collection.getClass();
        if (!(collection instanceof x4i)) {
            return super.addAll(collection);
        }
        x4i x4iVar = (x4i) collection;
        int i = x4iVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.b;
        if (i3 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(x4iVar.b, 0, this.b, this.c, x4iVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f, int i) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            l5.s(d(i));
            return;
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[akb.a(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i + 1, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = f;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s5i
    public final /* synthetic */ s5i b0(int i) {
        if (i >= this.c) {
            return new x4i(this.c, Arrays.copyOf(this.b, i));
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
        if (!(obj instanceof x4i)) {
            return super.equals(obj);
        }
        x4i x4iVar = (x4i) obj;
        if (this.c != x4iVar.c) {
            return false;
        }
        float[] fArr = x4iVar.b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.b[i]))) {
                float[] fArr = this.b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.c - i) - 1);
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
        float[] fArr = this.b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        c(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public x4i(int i, float[] fArr) {
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        c(i);
        float[] fArr = this.b;
        float f = fArr[i];
        if (i < this.c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}
