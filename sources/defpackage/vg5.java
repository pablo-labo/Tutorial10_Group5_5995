package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import defpackage.ah5;
import defpackage.ug5;
import defpackage.wg5;
import defpackage.zxd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vg5 implements m55 {
    public o55 e;
    public zpf f;
    public js9 h;
    public ah5 i;
    public int j;
    public int k;
    public ug5 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final g4b b = new g4b(new byte[32768], 0);
    public final boolean c = false;
    public final wg5.a d = new wg5.a();
    public int g = 0;

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) throws ParserException {
        ah5 ah5Var;
        int i;
        zxd bVar;
        long j;
        long j2;
        boolean zA;
        int i2 = this.g;
        if (i2 == 0) {
            boolean z = !this.c;
            n55Var.f();
            long j3 = n55Var.j();
            js9 js9VarA = xg5.a(n55Var, z);
            n55Var.n((int) (n55Var.j() - j3));
            this.h = js9VarA;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            n55Var.h(0, bArr, bArr.length);
            n55Var.f();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            g4b g4bVar = new g4b(4);
            n55Var.readFully(g4bVar.a, 0, 4);
            if (g4bVar.z() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 6;
        if (i2 == 3) {
            int i6 = 0;
            ah5 ah5Var2 = this.i;
            boolean z2 = false;
            while (!z2) {
                n55Var.f();
                byte[] bArr2 = new byte[i3];
                f4b f4bVar = new f4b(bArr2, i3);
                int i7 = i6;
                n55Var.h(i7, bArr2, i3);
                boolean zF = f4bVar.f();
                int iG = f4bVar.g(i);
                int iG2 = f4bVar.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    n55Var.readFully(bArr3, i7, 38);
                    ah5Var2 = new ah5(bArr3, i3);
                } else {
                    if (ah5Var2 == null) {
                        o6.h();
                        return 0;
                    }
                    js9 js9Var = ah5Var2.l;
                    if (iG == i4) {
                        g4b g4bVar2 = new g4b(iG2);
                        n55Var.readFully(g4bVar2.a, i7, iG2);
                        ah5Var2 = new ah5(ah5Var2.a, ah5Var2.b, ah5Var2.c, ah5Var2.d, ah5Var2.e, ah5Var2.g, ah5Var2.h, ah5Var2.j, xg5.b(g4bVar2), ah5Var2.l);
                    } else {
                        if (iG == i3) {
                            g4b g4bVar3 = new g4b(iG2);
                            n55Var.readFully(g4bVar3.a, 0, iG2);
                            g4bVar3.K(i3);
                            js9 js9VarA2 = rtg.a(Arrays.asList(rtg.b(g4bVar3, false, false).a));
                            if (js9Var != null) {
                                js9VarA2 = js9Var.b(js9VarA2);
                            }
                            ah5Var = new ah5(ah5Var2.a, ah5Var2.b, ah5Var2.c, ah5Var2.d, ah5Var2.e, ah5Var2.g, ah5Var2.h, ah5Var2.j, ah5Var2.k, js9VarA2);
                        } else if (iG == i5) {
                            g4b g4bVar4 = new g4b(iG2);
                            n55Var.readFully(g4bVar4.a, 0, iG2);
                            g4bVar4.K(4);
                            js9 js9Var2 = new js9(e47.n(fab.d(g4bVar4)));
                            if (js9Var != null) {
                                js9Var2 = js9Var.b(js9Var2);
                            }
                            ah5Var = new ah5(ah5Var2.a, ah5Var2.b, ah5Var2.c, ah5Var2.d, ah5Var2.e, ah5Var2.g, ah5Var2.h, ah5Var2.j, ah5Var2.k, js9Var2);
                        } else {
                            n55Var.n(iG2);
                        }
                        ah5Var2 = ah5Var;
                    }
                }
                String str = vjg.a;
                this.i = ah5Var2;
                z2 = zF;
                i3 = 4;
                i4 = 3;
                i = 7;
                i5 = 6;
                i6 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            a aVarC = this.i.c(bArr, this.h);
            zpf zpfVar = this.f;
            a.C0036a c0036aA = aVarC.a();
            c0036aA.l = st9.p("audio/flac");
            t40.n(c0036aA, zpfVar);
            zpf zpfVar2 = this.f;
            this.i.b();
            zpfVar2.getClass();
            this.g = 4;
            return 0;
        }
        long j4 = 0;
        if (i2 == 4) {
            n55Var.f();
            g4b g4bVar5 = new g4b(2);
            n55Var.h(0, g4bVar5.a, 2);
            int iD = g4bVar5.D();
            if ((iD >> 2) != 16382) {
                n55Var.f();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            n55Var.f();
            this.k = iD;
            o55 o55Var = this.e;
            String str2 = vjg.a;
            long position = n55Var.getPosition();
            long length = n55Var.getLength();
            this.i.getClass();
            ah5 ah5Var3 = this.i;
            ah5.a aVar = ah5Var3.k;
            if (aVar != null && aVar.a.length > 0) {
                bVar = new zg5(ah5Var3, position);
                i = 0;
            } else if (length == -1 || ah5Var3.j <= 0) {
                i = 0;
                bVar = new zxd.b(ah5Var3.b());
            } else {
                int i8 = this.k;
                int i9 = ah5Var3.c;
                i73 i73Var = new i73(ah5Var3, i4);
                ug5.a aVar2 = new ug5.a(ah5Var3, i8);
                long jB = ah5Var3.b();
                long j5 = ah5Var3.j;
                int i10 = ah5Var3.d;
                if (i10 > 0) {
                    i = 0;
                    j = ((((long) i10) + ((long) i9)) / 2) + 1;
                } else {
                    i = 0;
                    int i11 = ah5Var3.a;
                    j = 64 + (((((i11 != ah5Var3.b || i11 <= 0) ? 4096L : i11) * ((long) ah5Var3.g)) * ((long) ah5Var3.h)) / 8);
                }
                ug5 ug5Var = new ug5(i73Var, aVar2, jB, j5, position, length, j, Math.max(6, i9));
                this.l = ug5Var;
                bVar = ug5Var.a;
            }
            o55Var.b(bVar);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            bg.h();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        ug5 ug5Var2 = this.l;
        if (ug5Var2 != null && ug5Var2.c != null) {
            return ug5Var2.a(n55Var, dhbVar);
        }
        if (this.n == -1) {
            ah5 ah5Var4 = this.i;
            n55Var.f();
            n55Var.k(1);
            byte[] bArr4 = new byte[1];
            n55Var.h(0, bArr4, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            n55Var.k(2);
            i = z3 ? 7 : 6;
            g4b g4bVar6 = new g4b(i);
            byte[] bArr5 = g4bVar6.a;
            int i12 = 0;
            while (i12 < i) {
                int iL = n55Var.l(i12, bArr5, i - i12);
                if (iL == -1) {
                    break;
                }
                i12 += iL;
            }
            g4bVar6.I(i12);
            n55Var.f();
            try {
                long jE = g4bVar6.E();
                if (!z3) {
                    jE *= (long) ah5Var4.b;
                }
                j4 = jE;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw ParserException.a(null, null);
            }
            this.n = j4;
        } else {
            g4b g4bVar7 = this.b;
            int i13 = g4bVar7.c;
            if (i13 < 32768) {
                int i14 = n55Var.read(g4bVar7.a, i13, 32768 - i13);
                z = i14 == -1;
                if (!z) {
                    g4bVar7.I(i13 + i14);
                } else if (g4bVar7.a() == 0) {
                    long j6 = this.n * 1000000;
                    ah5 ah5Var5 = this.i;
                    String str3 = vjg.a;
                    this.f.a(j6 / ((long) ah5Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i15 = g4bVar7.b;
            int i16 = this.m;
            int i17 = this.j;
            if (i16 < i17) {
                g4bVar7.K(Math.min(i17 - i16, g4bVar7.a()));
            }
            this.i.getClass();
            int i18 = g4bVar7.b;
            while (true) {
                int i19 = g4bVar7.c - 16;
                wg5.a aVar3 = this.d;
                if (i18 <= i19) {
                    g4bVar7.J(i18);
                    if (wg5.a(g4bVar7, this.i, this.k, aVar3)) {
                        g4bVar7.J(i18);
                        j2 = aVar3.a;
                        break;
                    }
                    i18++;
                } else {
                    if (z) {
                        while (true) {
                            int i20 = g4bVar7.c;
                            if (i18 > i20 - this.j) {
                                g4bVar7.J(i20);
                                break;
                            }
                            g4bVar7.J(i18);
                            try {
                                zA = wg5.a(g4bVar7, this.i, this.k, aVar3);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (g4bVar7.b > g4bVar7.c) {
                                zA = false;
                            }
                            if (zA) {
                                g4bVar7.J(i18);
                                j2 = aVar3.a;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        g4bVar7.J(i18);
                    }
                    j2 = -1;
                }
            }
            int i21 = g4bVar7.b - i15;
            g4bVar7.J(i15);
            this.f.f(i21, g4bVar7);
            int i22 = this.m + i21;
            this.m = i22;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                ah5 ah5Var6 = this.i;
                String str4 = vjg.a;
                this.f.a(j7 / ((long) ah5Var6.e), 1, i22, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = g4bVar7.a.length - g4bVar7.c;
            if (g4bVar7.a() < 16 && length2 < 16) {
                int iA = g4bVar7.a();
                byte[] bArr6 = g4bVar7.a;
                System.arraycopy(bArr6, g4bVar7.b, bArr6, 0, iA);
                g4bVar7.J(0);
                g4bVar7.I(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        xg5.a(n55Var, false);
        g4b g4bVar = new g4b(4);
        ((hn3) n55Var).d(g4bVar.a, 0, 4, false);
        return g4bVar.z() == 1716281667;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            ug5 ug5Var = this.l;
            if (ug5Var != null) {
                ug5Var.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.G(0);
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.e = o55Var;
        this.f = o55Var.o(0, 1);
        o55Var.m();
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
