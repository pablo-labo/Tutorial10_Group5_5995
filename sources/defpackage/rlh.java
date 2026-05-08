package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rlh extends qjh implements Set {
    public transient gkh b;

    public static rlh f(int i, Object... objArr) {
        if (i == 0) {
            return nnh.X;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new goh(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                ja.k(p6.c(i6, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i7 = iRotateLeft & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new goh(obj4);
        }
        if (i(i5) < i2 / 2) {
            return f(i5, objArr);
        }
        if (i5 <= 0) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new nnh(objArr, i4, objArr2, i3, i5);
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        l5.q("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof rlh) && g() && ((rlh) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public boolean g() {
        return this instanceof nnh;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ath.a(this);
    }

    public gkh j() {
        gkh gkhVar = this.b;
        if (gkhVar != null) {
            return gkhVar;
        }
        gkh gkhVarK = k();
        this.b = gkhVarK;
        return gkhVarK;
    }

    public gkh k() {
        Object[] array = toArray(qjh.a);
        ujh ujhVar = gkh.b;
        return gkh.i(array.length, array);
    }
}
