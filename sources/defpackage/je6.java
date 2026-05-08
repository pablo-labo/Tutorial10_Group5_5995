package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class je6 implements pne {
    public byte a;
    public final uqc b;
    public final Inflater c;
    public final mc7 d;
    public final CRC32 e;

    public je6(pne pneVar) {
        pneVar.getClass();
        uqc uqcVar = new uqc(pneVar);
        this.b = uqcVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new mc7(uqcVar, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbG = h5.g(str, ": actual 0x");
        sbG.append(zve.Z(8, k.e(i2)));
        sbG.append(" != expected 0x");
        sbG.append(zve.Z(8, k.e(i)));
        throw new IOException(sbG.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) throws IOException {
        je6 je6Var = this;
        zn1Var.getClass();
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = je6Var.a;
        CRC32 crc32 = je6Var.e;
        uqc uqcVar = je6Var.b;
        if (b == 0) {
            uqcVar.x0(10L);
            zn1 zn1Var2 = uqcVar.b;
            byte bP = zn1Var2.P(3L);
            boolean z = ((bP >> 1) & 1) == 1;
            if (z) {
                je6Var.h(uqcVar.b, 0L, 10L);
            }
            a(8075, uqcVar.readShort(), "ID1ID2");
            uqcVar.skip(8L);
            if (((bP >> 2) & 1) == 1) {
                uqcVar.x0(2L);
                if (z) {
                    h(uqcVar.b, 0L, 2L);
                }
                long jN0 = zn1Var2.n0() & 65535;
                uqcVar.x0(jN0);
                if (z) {
                    h(uqcVar.b, 0L, jN0);
                }
                uqcVar.skip(jN0);
            }
            if (((bP >> 3) & 1) == 1) {
                long jA = uqcVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    k20.n();
                    return 0L;
                }
                if (z) {
                    h(uqcVar.b, 0L, jA + 1);
                }
                uqcVar.skip(jA + 1);
            }
            if (((bP >> 4) & 1) == 1) {
                long jA2 = uqcVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    k20.n();
                    return 0L;
                }
                if (z) {
                    je6Var = this;
                    je6Var.h(uqcVar.b, 0L, jA2 + 1);
                } else {
                    je6Var = this;
                }
                uqcVar.skip(jA2 + 1);
            } else {
                je6Var = this;
            }
            if (z) {
                a(uqcVar.n0(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            je6Var.a = (byte) 1;
        }
        if (je6Var.a == 1) {
            long j2 = zn1Var.b;
            long jF1 = je6Var.d.f1(zn1Var, j);
            if (jF1 != -1) {
                je6Var.h(zn1Var, j2, jF1);
                return jF1;
            }
            je6Var.a = (byte) 2;
        }
        if (je6Var.a == 2) {
            a(uqcVar.x1(), (int) crc32.getValue(), "CRC");
            a(uqcVar.x1(), (int) je6Var.c.getBytesWritten(), "ISIZE");
            je6Var.a = (byte) 3;
            if (!uqcVar.W0()) {
                r40.h("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.b.a.g();
    }

    public final void h(zn1 zn1Var, long j, long j2) {
        lyd lydVar = zn1Var.a;
        lydVar.getClass();
        while (true) {
            int i = lydVar.c;
            int i2 = lydVar.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            lydVar = lydVar.f;
            lydVar.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) lydVar.b) + j);
            int iMin = (int) Math.min(lydVar.c - i3, j2);
            this.e.update(lydVar.a, i3, iMin);
            j2 -= (long) iMin;
            lydVar = lydVar.f;
            lydVar.getClass();
            j = 0;
        }
    }
}
