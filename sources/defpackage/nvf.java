package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import defpackage.dye;
import defpackage.e47;
import defpackage.n83;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nvf implements dye {
    public final g4b a = new g4b();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public nvf(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        String str = vjg.a;
        this.e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = vjg.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dye
    public final void b(byte[] bArr, int i, int i2, dye.b bVar, wq2<s83> wq2Var) {
        String strV;
        int i3;
        int i4;
        g4b g4bVar = this.a;
        g4bVar.H(i + i2, bArr);
        g4bVar.J(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        ka2.l(g4bVar.a() >= 2);
        int iD = g4bVar.D();
        if (iD == 0) {
            strV = "";
        } else {
            int i8 = g4bVar.b;
            Charset charsetF = g4bVar.F();
            int i9 = iD - (g4bVar.b - i8);
            if (charsetF == null) {
                charsetF = StandardCharsets.UTF_8;
            }
            strV = g4bVar.v(i9, charsetF);
        }
        if (strV.isEmpty()) {
            e47.b bVar2 = e47.b;
            wq2Var.accept(new s83(-9223372036854775807L, -9223372036854775807L, qyc.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strV);
        e(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (g4bVar.a() >= 8) {
            int i10 = g4bVar.b;
            int iJ = g4bVar.j();
            int iJ2 = g4bVar.j();
            if (iJ2 == 1937013100) {
                ka2.l(g4bVar.a() >= i7 ? i5 : i6);
                int iD2 = g4bVar.D();
                int i11 = i6;
                while (i11 < iD2) {
                    ka2.l(g4bVar.a() >= 12 ? i5 : i6);
                    int iD3 = g4bVar.D();
                    int iD4 = g4bVar.D();
                    g4bVar.K(i7);
                    int i12 = i11;
                    int iX = g4bVar.x();
                    g4bVar.K(i5);
                    int iJ3 = g4bVar.j();
                    if (iD4 > spannableStringBuilder.length()) {
                        StringBuilder sbG = o6.g(iD4, "Truncating styl end (", ") to cueText.length() (");
                        sbG.append(spannableStringBuilder.length());
                        sbG.append(").");
                        zkd.T("Tx3gParser", sbG.toString());
                        iD4 = spannableStringBuilder.length();
                    }
                    if (iD3 >= iD4) {
                        zkd.T("Tx3gParser", w40.e("Ignoring styl with start (", iD3, ") >= end (", iD4, ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = iD4;
                        e(spannableStringBuilder, iX, this.c, iD3, i13, 0);
                        d(spannableStringBuilder, iJ3, this.d, iD3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (iJ2 == 1952608120 && this.b) {
                i3 = 2;
                ka2.l(g4bVar.a() >= 2);
                fH = vjg.h(g4bVar.D() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            g4bVar.J(i10 + iJ);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        n83.a aVar = new n83.a();
        aVar.a = spannableStringBuilder;
        aVar.b = null;
        aVar.e = fH;
        aVar.f = 0;
        aVar.g = 0;
        wq2Var.accept(new s83(-9223372036854775807L, -9223372036854775807L, e47.n(aVar.a())));
    }

    @Override // defpackage.dye
    public final int c() {
        return 2;
    }
}
