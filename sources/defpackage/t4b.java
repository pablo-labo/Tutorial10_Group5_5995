package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class t4b {
    public String a;
    public jw5 b;
    public int c;
    public int d;

    public final int a() {
        jw5 jw5Var = this.b;
        String str = this.a;
        if (jw5Var == null) {
            return str.length();
        }
        return (jw5Var.a - jw5Var.a()) + (str.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            be7.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            be7.a("start must be non-negative, but was " + i);
        }
        jw5 jw5Var = this.b;
        if (jw5Var == null) {
            int iMax = Math.max(255, str.length() + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            String str2 = this.a;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.a;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            jw5 jw5Var2 = new jw5();
            jw5Var2.a = iMax;
            jw5Var2.b = cArr;
            jw5Var2.c = length;
            jw5Var2.d = i4;
            this.b = jw5Var2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > jw5Var.a - jw5Var.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > jw5Var.a()) {
            int iA = length2 - jw5Var.a();
            int i9 = jw5Var.a;
            do {
                i9 *= 2;
            } while (i9 - jw5Var.a < iA);
            char[] cArr2 = new char[i9];
            System.arraycopy(jw5Var.b, 0, cArr2, 0, jw5Var.c);
            int i10 = jw5Var.a;
            int i11 = jw5Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy(jw5Var.b, i11, cArr2, i13, (i12 + i11) - i11);
            jw5Var.b = cArr2;
            jw5Var.a = i9;
            jw5Var.d = i13;
        }
        int i14 = jw5Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = jw5Var.b;
            System.arraycopy(cArr3, i8, cArr3, jw5Var.d - i15, i15);
            jw5Var.c = i7;
            jw5Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = jw5Var.a() + i7;
            int iA3 = jw5Var.a() + i8;
            int i16 = jw5Var.d;
            int i17 = iA2 - i16;
            char[] cArr4 = jw5Var.b;
            System.arraycopy(cArr4, i16, cArr4, jw5Var.c, i17);
            jw5Var.c += i17;
            jw5Var.d = iA3;
        } else {
            jw5Var.d = jw5Var.a() + i8;
            jw5Var.c = i7;
        }
        str.getChars(0, str.length(), jw5Var.b, jw5Var.c);
        jw5Var.c = str.length() + jw5Var.c;
    }

    public final String toString() {
        jw5 jw5Var = this.b;
        String str = this.a;
        if (jw5Var == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.c);
        sb.append(jw5Var.b, 0, jw5Var.c);
        char[] cArr = jw5Var.b;
        int i = jw5Var.d;
        sb.append(cArr, i, jw5Var.a - i);
        String str2 = this.a;
        sb.append((CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }
}
