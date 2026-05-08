package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class loe<E> implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public loe(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new Object[i5];
    }

    public final void c(int i, ColorStateList colorStateList) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            g(i, colorStateList);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            u63.i(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.b = Arrays.copyOf(this.b, i7);
            this.c = Arrays.copyOf(this.c, i7);
        }
        this.b[i3] = i;
        this.c[i3] = colorStateList;
        this.d = i3 + 1;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final loe<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        loe<E> loeVar = (loe) objClone;
        loeVar.b = (int[]) this.b.clone();
        loeVar.c = (Object[]) this.c.clone();
        return loeVar;
    }

    public final E e(int i) {
        E e;
        int iA = pyd.a(this.d, i, this.b);
        if (iA < 0 || (e = (E) this.c[iA]) == u63.e) {
            return null;
        }
        return e;
    }

    public final int f(int i) {
        if (this.a) {
            u63.i(this);
        }
        return this.b[i];
    }

    public final void g(int i, E e) {
        int iA = pyd.a(this.d, i, this.b);
        if (iA >= 0) {
            this.c[iA] = e;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == u63.e) {
                this.b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            u63.i(this);
            i2 = ~pyd.a(this.d, i, this.b);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.b = Arrays.copyOf(this.b, i8);
            this.c = Arrays.copyOf(this.c, i8);
        }
        int i9 = this.d;
        if (i9 - i2 != 0) {
            int[] iArr = this.b;
            int i10 = i2 + 1;
            pyd.h(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.c;
            pyd.j(objArr2, i10, objArr2, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = e;
        this.d++;
    }

    public final int h() {
        if (this.a) {
            u63.i(this);
        }
        return this.d;
    }

    public final E i(int i) {
        if (this.a) {
            u63.i(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            E eI = i(i2);
            if (eI != this) {
                sb.append(eI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public loe() {
        this(0);
    }
}
