package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l6c {
    public boolean c;
    public boolean d;
    public boolean e;
    public final qmf a = new qmf(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final g4b b = new g4b();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(g4b g4bVar) {
        int i = g4bVar.b;
        if (g4bVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        g4bVar.h(0, bArr, 9);
        g4bVar.J(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(n55 n55Var) {
        byte[] bArr = vjg.b;
        g4b g4bVar = this.b;
        g4bVar.getClass();
        g4bVar.H(bArr.length, bArr);
        this.c = true;
        n55Var.f();
    }
}
