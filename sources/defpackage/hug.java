package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes.dex */
public final class hug {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(n55 n55Var, g4b g4bVar) {
            n55Var.h(0, g4bVar.a, 8);
            g4bVar.J(0);
            return new a(g4bVar.j(), g4bVar.o());
        }
    }

    public static boolean a(n55 n55Var) {
        g4b g4bVar = new g4b(8);
        int i = a.a(n55Var, g4bVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        n55Var.h(0, g4bVar.a, 4);
        g4bVar.J(0);
        int iJ = g4bVar.j();
        if (iJ == 1463899717) {
            return true;
        }
        zkd.w("WavHeaderReader", "Unsupported form type: " + iJ);
        return false;
    }

    public static a b(int i, n55 n55Var, g4b g4bVar) {
        a aVarA = a.a(n55Var, g4bVar);
        while (true) {
            int i2 = aVarA.a;
            if (i2 == i) {
                return aVarA;
            }
            g7.j(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = aVarA.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            n55Var.n((int) j2);
            aVarA = a.a(n55Var, g4bVar);
        }
    }
}
