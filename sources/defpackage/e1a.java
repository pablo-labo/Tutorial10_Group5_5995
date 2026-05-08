package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e1a {

    public static class a {
        public int a;
        public long b;
        public int c;
    }

    public static int a(f4b f4bVar, int i, int i2, int i3) {
        ka2.l(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        ih7.a(ih7.a(i4, i5), 1 << i3);
        if (f4bVar.b() < i) {
            return -1;
        }
        int iG = f4bVar.g(i);
        if (iG == i4) {
            if (f4bVar.b() < i2) {
                return -1;
            }
            int iG2 = f4bVar.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (f4bVar.b() < i3) {
                    return -1;
                }
                return f4bVar.g(i3) + iG;
            }
        }
        return iG;
    }

    public static void b(f4b f4bVar) {
        f4bVar.o(3);
        f4bVar.o(8);
        boolean zF = f4bVar.f();
        boolean zF2 = f4bVar.f();
        if (zF) {
            f4bVar.o(5);
        }
        if (zF2) {
            f4bVar.o(6);
        }
    }

    public static void c(f4b f4bVar) {
        int iG;
        int iG2 = f4bVar.g(2);
        if (iG2 == 0) {
            f4bVar.o(6);
            return;
        }
        int iA = a(f4bVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            f4bVar.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = f4bVar.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (f4bVar.f()) {
                    f4bVar.o(7);
                    iG = 0;
                } else {
                    if (f4bVar.g(2) == 3 && f4bVar.g(i2) * i != 0) {
                        f4bVar.n();
                    }
                    iG = f4bVar.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        f4bVar.n();
                    }
                    f4bVar.n();
                }
                if (iG != 0 && iG != 180 && f4bVar.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
