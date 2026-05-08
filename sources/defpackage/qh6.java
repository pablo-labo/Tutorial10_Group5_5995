package defpackage;

import androidx.media3.common.ParserException;
import defpackage.m8a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qh6 {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final m8a.k o;

    public qh6(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, m8a.k kVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = kVar;
    }

    public static qh6 a(g4b g4bVar, boolean z, m8a.k kVar) throws ParserException {
        boolean z2;
        m8a.g gVarG;
        int i;
        int i2 = 4;
        try {
            if (z) {
                g4bVar.K(4);
            } else {
                g4bVar.K(21);
            }
            int iX = g4bVar.x() & 3;
            int iX2 = g4bVar.x();
            int i3 = g4bVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iX2) {
                    break;
                }
                g4bVar.K(1);
                int iD = g4bVar.D();
                for (int i7 = 0; i7 < iD; i7++) {
                    int iD2 = g4bVar.D();
                    i6 += iD2 + 4;
                    g4bVar.K(iD2);
                }
                i5++;
            }
            g4bVar.J(i3);
            byte[] bArr = new byte[i6];
            m8a.k kVar2 = kVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iX2) {
                int iX3 = g4bVar.x() & 63;
                int iD3 = g4bVar.D();
                int i20 = i4;
                m8a.k kVarI = kVar2;
                while (i20 < iD3) {
                    boolean z3 = z2;
                    int iD4 = g4bVar.D();
                    int i21 = iX;
                    System.arraycopy(m8a.a, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(g4bVar.a, g4bVar.b, bArr, i22, iD4);
                    if (iX3 == 32 && i20 == 0) {
                        kVarI = m8a.i(i22, bArr, i22 + iD4);
                    } else {
                        if (iX3 == 33 && i20 == 0) {
                            m8a.h hVarH = m8a.h(bArr, i22, i22 + iD4, kVarI);
                            i8 = hVarH.a + 1;
                            i9 = hVarH.g;
                            int i23 = hVarH.h;
                            i11 = hVarH.c + 8;
                            i12 = hVarH.d + 8;
                            int i24 = hVarH.k;
                            i10 = i23;
                            int i25 = hVarH.l;
                            int i26 = hVarH.m;
                            float f2 = hVarH.i;
                            int i27 = hVarH.j;
                            m8a.c cVar = hVarH.b;
                            if (cVar != null) {
                                i = i27;
                                strA = d92.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (iX3 == 39 && i20 == 0 && (gVarG = m8a.g(i22, bArr, i22 + iD4)) != null && kVarI != null) {
                            i4 = 0;
                            i16 = gVarG.a == kVarI.a.get(0).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + iD4;
                    g4bVar.K(iD4);
                    i20++;
                    z2 = z3;
                    iX = i21;
                    i2 = 4;
                }
                i18++;
                kVar2 = kVarI;
                i2 = 4;
            }
            return new qh6(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iX + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, strA, kVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
