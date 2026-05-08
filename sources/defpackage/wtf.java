package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wtf {
    public static final Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        pyd.l(objArr, 0, objArr2, i, 6);
        pyd.j(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        pyd.l(objArr, 0, objArr2, i, 6);
        pyd.j(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        pyd.l(objArr, 0, objArr2, i, 6);
        pyd.j(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static final int d(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static long e(float f, float f2) {
        return ((long) Float.floatToRawIntBits(f2)) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static qih f(AbstractSafeParcelable abstractSafeParcelable) {
        return new qih(abstractSafeParcelable.getClass().getSimpleName());
    }
}
