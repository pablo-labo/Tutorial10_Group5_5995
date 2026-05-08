package defpackage;

import androidx.media3.common.ParserException;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;

/* JADX INFO: loaded from: classes.dex */
public final class o5 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 480, DataOkHttpUploader.HTTP_BAD_REQUEST, DataOkHttpUploader.HTTP_BAD_REQUEST, 2048};

    public static final class a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public int e;
        public int f;
        public int g;
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static void a(int i, g4b g4bVar) {
        g4bVar.G(7);
        byte[] bArr = g4bVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o5.b b(defpackage.f4b r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = defpackage.o5.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            o5$b r1 = new o5$b
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5.b(f4b):o5$b");
    }

    public static void c(f4b f4bVar, a aVar) throws ParserException {
        int iG = f4bVar.g(5);
        f4bVar.o(2);
        if (f4bVar.f()) {
            f4bVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            f4bVar.n();
        }
        if (f4bVar.f()) {
            int iG2 = f4bVar.g(3);
            if (aVar.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                aVar.b = iG;
            }
            if (f4bVar.f()) {
                e(f4bVar);
            }
        }
    }

    public static void d(f4b f4bVar, a aVar) throws ParserException {
        f4bVar.o(2);
        boolean zF = f4bVar.f();
        int iG = f4bVar.g(8);
        for (int i = 0; i < iG; i++) {
            f4bVar.o(2);
            if (f4bVar.f()) {
                f4bVar.o(5);
            }
            if (zF) {
                f4bVar.o(24);
            } else {
                if (f4bVar.f()) {
                    if (!f4bVar.f()) {
                        f4bVar.o(4);
                    }
                    aVar.c = f4bVar.g(6) + 1;
                }
                f4bVar.o(4);
            }
        }
        if (f4bVar.f()) {
            f4bVar.o(3);
            if (f4bVar.f()) {
                e(f4bVar);
            }
        }
    }

    public static void e(f4b f4bVar) throws ParserException {
        int iG = f4bVar.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        f4bVar.o(iG * 8);
    }
}
