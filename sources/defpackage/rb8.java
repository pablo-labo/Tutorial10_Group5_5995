package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class rb8 {
    public char[] a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.a = Arrays.copyOf(cArr, i3);
        }
    }

    public final void b() {
        p22 p22Var = p22.c;
        char[] cArr = this.a;
        p22Var.getClass();
        cArr.getClass();
        synchronized (p22Var) {
            try {
                int i = p22Var.b;
                if (cArr.length + i < lt0.a) {
                    p22Var.b = i + cArr.length;
                    p22Var.a.addLast(cArr);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), this.a, this.b);
        this.b += length;
    }

    public final void d(long j) {
        c(String.valueOf(j));
    }

    public final void e(String str) {
        byte b;
        str.getClass();
        a(this.b, str.length() + 2);
        char[] cArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = jve.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    a(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = jve.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        this.a[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = jve.a[cCharAt];
                            str2.getClass();
                            a(i4, str2.length());
                            str2.getChars(0, str2.length(), this.a, i4);
                            int length3 = str2.length() + i4;
                            this.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = this.a;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            this.b = i4;
                        }
                    }
                }
                a(i4, 1);
                this.a[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}
