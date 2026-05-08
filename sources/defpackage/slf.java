package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class slf {
    public static final slf a = new slf();
    public static final Class<?> b = slf.class;

    public static final int a(InputStream inputStream, int i) {
        boolean z;
        int iJ;
        int i2;
        int i3;
        a.getClass();
        if (i <= 8) {
            i2 = 0;
            z = false;
            iJ = 0;
        } else {
            int iJ2 = boa.J(inputStream, 4, false);
            Class<?> cls = b;
            if (iJ2 == 1229531648 || iJ2 == 1296891946) {
                z = iJ2 == 1229531648;
                iJ = boa.J(inputStream, 4, z);
                i2 = i - 8;
                if (iJ < 8 || iJ - 8 > i2) {
                    s55.d(cls, "Invalid offset");
                    i2 = 0;
                }
            } else {
                s55.d(cls, "Invalid TIFF header");
                i2 = 0;
                z = false;
                iJ = 0;
            }
        }
        int i4 = iJ - 8;
        if (i2 != 0 && i4 <= i2) {
            inputStream.skip(i4);
            int i5 = i2 - i4;
            if (i5 < 14) {
                i3 = 0;
                if (i3 >= 10 && boa.J(inputStream, 2, z) == 3 && boa.J(inputStream, 4, z) == 1) {
                    return boa.J(inputStream, 2, z);
                }
            } else {
                int iJ3 = boa.J(inputStream, 2, z);
                int i6 = i5 - 2;
                while (true) {
                    int i7 = iJ3 - 1;
                    if (iJ3 <= 0 || i6 < 12) {
                        break;
                    }
                    i3 = i6 - 2;
                    if (boa.J(inputStream, 2, z) == 274) {
                        break;
                    }
                    inputStream.skip(10L);
                    i6 -= 12;
                    iJ3 = i7;
                }
                if (i3 >= 10) {
                    return boa.J(inputStream, 2, z);
                }
            }
        }
        return 0;
    }
}
