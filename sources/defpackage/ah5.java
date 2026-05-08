package defpackage;

import androidx.media3.common.a;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ah5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final js9 l;

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public ah5(byte[] bArr, int i) {
        f4b f4bVar = new f4b(bArr, bArr.length);
        f4bVar.m(i * 8);
        this.a = f4bVar.g(16);
        this.b = f4bVar.g(16);
        this.c = f4bVar.g(24);
        this.d = f4bVar.g(24);
        int iG = f4bVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = f4bVar.g(3) + 1;
        int iG2 = f4bVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = f4bVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final androidx.media3.common.a c(byte[] bArr, js9 js9Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        js9 js9Var2 = this.l;
        if (js9Var2 != null) {
            js9Var = js9Var2.b(js9Var);
        }
        a.C0036a c0036a = new a.C0036a();
        c0036a.m = st9.p("audio/flac");
        c0036a.n = i;
        c0036a.E = this.g;
        c0036a.F = this.e;
        String str = vjg.a;
        c0036a.G = vjg.B(this.h, ByteOrder.LITTLE_ENDIAN);
        c0036a.p = Collections.singletonList(bArr);
        c0036a.k = js9Var;
        return new androidx.media3.common.a(c0036a);
    }

    public ah5(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, js9 js9Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = js9Var;
    }
}
