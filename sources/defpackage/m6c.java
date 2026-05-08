package defpackage;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.k6c;
import defpackage.vuf;
import defpackage.wf1;
import defpackage.zxd;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class m6c implements m55 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public k6c i;
    public o55 j;
    public boolean k;
    public final qmf a = new qmf(0);
    public final g4b c = new g4b(4096);
    public final SparseArray<a> b = new SparseArray<>();
    public final l6c d = new l6c();

    public static final class a {
        public final jp4 a;
        public final qmf b;
        public final f4b c = new f4b(new byte[64], 64);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public a(jp4 jp4Var, qmf qmfVar) {
            this.a = jp4Var;
            this.b = qmfVar;
        }
    }

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        char c;
        int i;
        int i2;
        jp4 ke6Var;
        long j;
        ka2.r(this.j);
        long length = n55Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = -9223372036854775807L;
        l6c l6cVar = this.d;
        if (i3 != 0) {
            c = 3;
            if (!l6cVar.c) {
                qmf qmfVar = l6cVar.a;
                g4b g4bVar = l6cVar.b;
                if (!l6cVar.e) {
                    long length2 = n55Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (n55Var.getPosition() != j3) {
                        dhbVar.a = j3;
                        return 1;
                    }
                    g4bVar.G(iMin);
                    n55Var.f();
                    n55Var.h(0, g4bVar.a, iMin);
                    int i4 = g4bVar.b;
                    int i5 = g4bVar.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (l6c.b(i5, g4bVar.a) == 442) {
                            g4bVar.J(i5 + 4);
                            long jC = l6c.c(g4bVar);
                            if (jC != -9223372036854775807L) {
                                j2 = jC;
                                break;
                            }
                        }
                        i5--;
                    }
                    l6cVar.g = j2;
                    l6cVar.e = true;
                    return 0;
                }
                if (l6cVar.g == -9223372036854775807L) {
                    l6cVar.a(n55Var);
                    return 0;
                }
                if (l6cVar.d) {
                    long j4 = l6cVar.f;
                    if (j4 == -9223372036854775807L) {
                        l6cVar.a(n55Var);
                        return 0;
                    }
                    l6cVar.h = qmfVar.c(l6cVar.g) - qmfVar.b(j4);
                    l6cVar.a(n55Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, n55Var.getLength());
                if (n55Var.getPosition() != 0) {
                    dhbVar.a = 0L;
                    return 1;
                }
                g4bVar.G(iMin2);
                n55Var.f();
                n55Var.h(0, g4bVar.a, iMin2);
                int i6 = g4bVar.b;
                int i7 = g4bVar.c;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    if (l6c.b(i6, g4bVar.a) == 442) {
                        g4bVar.J(i6 + 4);
                        long jC2 = l6c.c(g4bVar);
                        if (jC2 != -9223372036854775807L) {
                            j = jC2;
                            break;
                        }
                    }
                    i6++;
                }
                l6cVar.f = j;
                l6cVar.d = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j5 = l6cVar.h;
            if (j5 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                k6c k6cVar = new k6c(new wf1.b(), new k6c.a(l6cVar.a), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = k6cVar;
                this.j.b(k6cVar.a);
            } else {
                i = i3;
                i2 = 4;
                this.j.b(new zxd.b(j5));
            }
        }
        k6c k6cVar2 = this.i;
        if (k6cVar2 != null && k6cVar2.c != null) {
            return k6cVar2.a(n55Var, dhbVar);
        }
        n55Var.f();
        long j6 = i != 0 ? length - n55Var.j() : -1L;
        if (j6 != -1 && j6 < 4) {
            return -1;
        }
        g4b g4bVar2 = this.c;
        if (!n55Var.d(g4bVar2.a, 0, i2, true)) {
            return -1;
        }
        g4bVar2.J(0);
        int iJ = g4bVar2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            n55Var.h(0, g4bVar2.a, 10);
            g4bVar2.J(9);
            n55Var.n((g4bVar2.x() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            n55Var.h(0, g4bVar2.a, 2);
            g4bVar2.J(0);
            n55Var.n(g4bVar2.D() + 6);
            return 0;
        }
        if (((iJ & (-256)) >> 8) != 1) {
            n55Var.n(1);
            return 0;
        }
        int i8 = iJ & 255;
        SparseArray<a> sparseArray = this.b;
        a aVar = sparseArray.get(i8);
        if (!this.e) {
            if (aVar == null) {
                if (i8 == 189) {
                    ke6Var = new j5("video/mp2p");
                    this.f = true;
                    this.h = n55Var.getPosition();
                } else if ((iJ & 224) == 192) {
                    ke6Var = new b1a(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = n55Var.getPosition();
                } else if ((iJ & 240) == 224) {
                    ke6Var = new ke6(null, "video/mp2p");
                    this.g = true;
                    this.h = n55Var.getPosition();
                } else {
                    ke6Var = null;
                }
                if (ke6Var != null) {
                    ke6Var.e(this.j, new vuf.c(i8, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                    aVar = new a(ke6Var, this.a);
                    sparseArray.put(i8, aVar);
                }
            }
            if (n55Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.m();
            }
        }
        n55Var.h(0, g4bVar2.a, 2);
        g4bVar2.J(0);
        int iD = g4bVar2.D() + 6;
        if (aVar == null) {
            n55Var.n(iD);
            return 0;
        }
        g4bVar2.G(iD);
        n55Var.readFully(g4bVar2.a, 0, iD);
        g4bVar2.J(6);
        jp4 jp4Var = aVar.a;
        f4b f4bVar = aVar.c;
        g4bVar2.h(0, (byte[]) f4bVar.d, 3);
        f4bVar.m(0);
        f4bVar.o(8);
        aVar.d = f4bVar.f();
        aVar.e = f4bVar.f();
        f4bVar.o(6);
        g4bVar2.h(0, (byte[]) f4bVar.d, f4bVar.g(8));
        f4bVar.m(0);
        qmf qmfVar2 = aVar.b;
        aVar.g = 0L;
        if (aVar.d) {
            f4bVar.o(4);
            long jG = ((long) f4bVar.g(3)) << 30;
            f4bVar.o(1);
            long jG2 = jG | ((long) (f4bVar.g(15) << 15));
            f4bVar.o(1);
            long jG3 = jG2 | ((long) f4bVar.g(15));
            f4bVar.o(1);
            if (!aVar.f && aVar.e) {
                f4bVar.o(4);
                long jG4 = ((long) f4bVar.g(3)) << 30;
                f4bVar.o(1);
                long jG5 = jG4 | ((long) (f4bVar.g(15) << 15));
                f4bVar.o(1);
                long jG6 = jG5 | ((long) f4bVar.g(15));
                f4bVar.o(1);
                qmfVar2.b(jG6);
                aVar.f = true;
            }
            aVar.g = qmfVar2.b(jG3);
        }
        jp4Var.f(4, aVar.g);
        jp4Var.a(g4bVar2);
        jp4Var.d(false);
        g4bVar2.I(g4bVar2.a.length);
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        hn3 hn3Var = (hn3) n55Var;
        hn3Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hn3Var.o(bArr[13] & 7, false);
            hn3Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        long j3;
        SparseArray<a> sparseArray = this.b;
        qmf qmfVar = this.a;
        synchronized (qmfVar) {
            j3 = qmfVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = qmfVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            qmfVar.f(j2);
        }
        k6c k6cVar = this.i;
        if (k6cVar != null) {
            k6cVar.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            a aVarValueAt = sparseArray.valueAt(i);
            aVarValueAt.f = false;
            aVarValueAt.a.c();
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.j = o55Var;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
