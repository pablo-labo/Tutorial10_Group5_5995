package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c0;
import defpackage.vuf;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class qk8 implements jp4 {
    public final String a;
    public final int b;
    public final g4b c;
    public final f4b d;
    public zpf e;
    public String f;
    public a g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public qk8(String str, int i) {
        this.a = str;
        this.b = i;
        g4b g4bVar = new g4b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.c = g4bVar;
        byte[] bArr = g4bVar.a;
        this.d = new f4b(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) throws ParserException {
        int iG;
        boolean zF;
        ka2.r(this.e);
        while (g4bVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    g4b g4bVar2 = this.c;
                    f4b f4bVar = this.d;
                    if (i == 2) {
                        int iX = ((this.k & (-225)) << 8) | g4bVar.x();
                        this.j = iX;
                        if (iX > g4bVar2.a.length) {
                            g4bVar2.G(iX);
                            byte[] bArr = g4bVar2.a;
                            f4bVar.getClass();
                            f4bVar.k(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            bg.h();
                            return;
                        }
                        int iMin = Math.min(g4bVar.a(), this.j - this.i);
                        g4bVar.h(this.i, (byte[]) f4bVar.d, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            f4bVar.m(0);
                            if (f4bVar.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = f4bVar.g(1);
                                int iG3 = iG2 == 1 ? f4bVar.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    f4bVar.g((f4bVar.g(2) + 1) * 8);
                                }
                                if (!f4bVar.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = f4bVar.g(6);
                                int iG4 = f4bVar.g(4);
                                int iG5 = f4bVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = f4bVar.e();
                                    int iB = f4bVar.b();
                                    c0.a aVarB = c0.b(f4bVar, true);
                                    this.v = aVarB.c;
                                    this.s = aVarB.a;
                                    this.u = aVarB.b;
                                    int iB2 = iB - f4bVar.b();
                                    f4bVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    f4bVar.h(iB2, bArr2);
                                    a.C0036a c0036a = new a.C0036a();
                                    c0036a.a = this.f;
                                    c0036a.l = st9.p("video/mp2t");
                                    c0036a.m = st9.p("audio/mp4a-latm");
                                    c0036a.j = this.v;
                                    c0036a.E = this.u;
                                    c0036a.F = this.s;
                                    c0036a.p = Collections.singletonList(bArr2);
                                    c0036a.d = this.a;
                                    c0036a.f = this.b;
                                    a aVar = new a(c0036a);
                                    if (!aVar.equals(this.g)) {
                                        this.g = aVar;
                                        this.t = 1024000000 / ((long) aVar.G);
                                        this.e.d(aVar);
                                    }
                                } else {
                                    int iB3 = f4bVar.b();
                                    c0.a aVarB2 = c0.b(f4bVar, true);
                                    this.v = aVarB2.c;
                                    this.s = aVarB2.a;
                                    this.u = aVarB2.b;
                                    f4bVar.o(f4bVar.g((f4bVar.g(2) + 1) * 8) - (iB3 - f4bVar.b()));
                                }
                                int iG6 = f4bVar.g(3);
                                this.p = iG6;
                                if (iG6 == 0) {
                                    f4bVar.o(8);
                                } else if (iG6 == 1) {
                                    f4bVar.o(9);
                                } else if (iG6 == 3 || iG6 == 4 || iG6 == 5) {
                                    f4bVar.o(6);
                                } else {
                                    if (iG6 != 6 && iG6 != 7) {
                                        bg.h();
                                        return;
                                    }
                                    f4bVar.o(1);
                                }
                                boolean zF2 = f4bVar.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = f4bVar.g((f4bVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = f4bVar.f();
                                            this.r = (this.r << 8) + ((long) f4bVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (f4bVar.f()) {
                                    f4bVar.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = f4bVar.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = f4bVar.e();
                            if ((iE2 & 7) == 0) {
                                g4bVar2.J(iE2 >> 3);
                            } else {
                                f4bVar.h(i3 * 8, g4bVar2.a);
                                g4bVar2.J(0);
                            }
                            this.e.f(i3, g4bVar2);
                            ka2.q(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                f4bVar.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iX2 = g4bVar.x();
                    if ((iX2 & 224) == 224) {
                        this.k = iX2;
                        this.h = 2;
                    } else if (iX2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (g4bVar.x() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.e = o55Var.o(cVar.d, 1);
        cVar.b();
        this.f = cVar.e;
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.l = j;
    }
}
