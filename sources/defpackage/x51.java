package defpackage;

import androidx.media3.common.ParserException;
import defpackage.m8a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x51 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public x51(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static x51 a(g4b g4bVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            g4bVar.K(4);
            int iX = (g4bVar.x() & 3) + 1;
            if (iX == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iX2 = g4bVar.x() & 31;
            for (int i9 = 0; i9 < iX2; i9++) {
                int iD = g4bVar.D();
                int i10 = g4bVar.b;
                g4bVar.K(iD);
                byte[] bArr = g4bVar.a;
                byte[] bArr2 = new byte[iD + 4];
                System.arraycopy(d92.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iD);
                arrayList.add(bArr2);
            }
            int iX3 = g4bVar.x();
            for (int i11 = 0; i11 < iX3; i11++) {
                int iD2 = g4bVar.D();
                int i12 = g4bVar.b;
                g4bVar.K(iD2);
                byte[] bArr3 = g4bVar.a;
                byte[] bArr4 = new byte[iD2 + 4];
                System.arraycopy(d92.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iD2);
                arrayList.add(bArr4);
            }
            if (iX2 > 0) {
                m8a.m mVarJ = m8a.j(4, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i13 = mVarJ.e;
                int i14 = mVarJ.f;
                int i15 = mVarJ.h + 8;
                int i16 = mVarJ.i + 8;
                int i17 = mVarJ.p;
                int i18 = mVarJ.q;
                int i19 = mVarJ.r;
                int i20 = mVarJ.s;
                float f2 = mVarJ.g;
                int i21 = mVarJ.a;
                int i22 = mVarJ.b;
                int i23 = mVarJ.c;
                byte[] bArr5 = d92.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new x51(arrayList, iX, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
