package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mif {
    public final kif a;
    public final q1a b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public mif(kif kifVar, q1a q1aVar, long j) {
        this.a = kifVar;
        this.b = q1aVar;
        this.c = j;
        ArrayList arrayList = q1aVar.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((f3b) arrayList.get(0)).a.c();
        if (!arrayList.isEmpty()) {
            f3b f3bVar = (f3b) z92.Y0(arrayList);
            f = f3bVar.a.f() + f3bVar.f;
        }
        this.e = f;
        this.f = q1aVar.g;
    }

    public final b5d a(int i) {
        q1a q1aVar = this.b;
        q1aVar.l(i);
        int length = q1aVar.a.a.b.length();
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(i == length ? u63.J(arrayList) : ak2.m(i, arrayList));
        return f3bVar.a.b(f3bVar.d(i));
    }

    public final qtc b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        q1a q1aVar = this.b;
        q1aVar.k(i);
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.m(i, arrayList));
        h80 h80Var = f3bVar.a;
        int iD = f3bVar.d(i);
        CharSequence charSequence = h80Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbG = o6.g(iD, "offset(", ") is out of bounds [0,");
            sbG.append(charSequence.length());
            sbG.append(')');
            be7.a(sbG.toString());
        }
        hif hifVar = h80Var.d;
        Layout layout = hifVar.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = hifVar.g(lineForOffset);
        float fE = hifVar.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = hifVar.i(iD, false);
                fH2 = hifVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = hifVar.h(iD, false);
                fH2 = hifVar.h(iD + 1, true);
            } else {
                fI = hifVar.i(iD, false);
                fI2 = hifVar.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = hifVar.h(iD, false);
            fI2 = hifVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return f3bVar.a(new qtc(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final qtc c(int i) {
        q1a q1aVar = this.b;
        q1aVar.l(i);
        int length = q1aVar.a.a.b.length();
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(i == length ? u63.J(arrayList) : ak2.m(i, arrayList));
        h80 h80Var = f3bVar.a;
        int iD = f3bVar.d(i);
        CharSequence charSequence = h80Var.e;
        hif hifVar = h80Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbG = o6.g(iD, "offset(", ") is out of bounds [0,");
            sbG.append(charSequence.length());
            sbG.append(']');
            be7.a(sbG.toString());
        }
        float fH = hifVar.h(iD, false);
        int lineForOffset = hifVar.f.getLineForOffset(iD);
        return f3bVar.a(new qtc(fH, hifVar.g(lineForOffset), fH, hifVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        q1a q1aVar = this.b;
        return f < q1aVar.d || q1aVar.c || ((float) ((int) (j & 4294967295L))) < q1aVar.e;
    }

    public final float e(int i) {
        q1a q1aVar = this.b;
        q1aVar.m(i);
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        int i2 = i - f3bVar.d;
        hif hifVar = h80Var.d;
        return hifVar.f.getLineLeft(i2) + (i2 == hifVar.g + (-1) ? hifVar.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mif) {
            mif mifVar = (mif) obj;
            if (wl7.b(this.a, mifVar.a) && this.b == mifVar.b && th7.b(this.c, mifVar.c) && this.d == mifVar.d && this.e == mifVar.e && wl7.b(this.f, mifVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        q1a q1aVar = this.b;
        q1aVar.m(i);
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        int i2 = i - f3bVar.d;
        hif hifVar = h80Var.d;
        return hifVar.f.getLineRight(i2) + (i2 == hifVar.g + (-1) ? hifVar.k : 0.0f);
    }

    public final int g(int i) {
        q1a q1aVar = this.b;
        q1aVar.m(i);
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        return h80Var.d.f.getLineStart(i - f3bVar.d) + f3bVar.b;
    }

    public final b5d h(int i) {
        q1a q1aVar = this.b;
        q1aVar.l(i);
        int length = q1aVar.a.a.b.length();
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(i == length ? u63.J(arrayList) : ak2.m(i, arrayList));
        h80 h80Var = f3bVar.a;
        int iD = f3bVar.d(i);
        hif hifVar = h80Var.d;
        return hifVar.f.getParagraphDirection(hifVar.f.getLineForOffset(iD)) == 1 ? b5d.a : b5d.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + k6.c(k6.c(ia.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31), this.e, 31);
    }

    public final m80 i(final int i, final int i2) {
        q1a q1aVar = this.b;
        le0 le0Var = q1aVar.a.a;
        if (i < 0 || i > i2 || i2 > le0Var.b.length()) {
            StringBuilder sbF = uz.f("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbF.append(le0Var.b.length());
            sbF.append("), or start > end!");
            be7.a(sbF.toString());
        }
        if (i == i2) {
            return p80.a();
        }
        final m80 m80VarA = p80.a();
        ak2.p(q1aVar.h, cr8.c(i, i2), new Function1() { // from class: p1a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f3b f3bVar = (f3b) obj;
                h80 h80Var = f3bVar.a;
                int iD = f3bVar.d(i);
                int iD2 = f3bVar.d(i2);
                CharSequence charSequence = h80Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbF2 = uz.f("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbF2.append(charSequence.length());
                    sbF2.append("], or start > end!");
                    be7.a(sbF2.toString());
                }
                Path path = new Path();
                hif hifVar = h80Var.d;
                hifVar.f.getSelectionPath(iD, iD2, path);
                int i3 = hifVar.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3bVar.f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                m80VarA.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                return j6g.a;
            }
        });
        return m80VarA;
    }

    public final long j(int i) {
        int i2;
        int iH;
        int iH2;
        q1a q1aVar = this.b;
        q1aVar.l(i);
        int length = q1aVar.a.a.b.length();
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(i == length ? u63.J(arrayList) : ak2.m(i, arrayList));
        h80 h80Var = f3bVar.a;
        int iD = f3bVar.d(i);
        e1h e1hVarJ = h80Var.d.j();
        if (e1hVarJ.g(e1hVarJ.i(iD))) {
            e1hVarJ.a(iD);
            i2 = iD;
            while (i2 != -1 && (!e1hVarJ.g(i2) || e1hVarJ.c(i2))) {
                i2 = e1hVarJ.i(i2);
            }
        } else {
            e1hVarJ.a(iD);
            i2 = e1hVarJ.f(iD) ? (!e1hVarJ.d(iD) || e1hVarJ.b(iD)) ? e1hVarJ.i(iD) : iD : e1hVarJ.b(iD) ? e1hVarJ.i(iD) : -1;
        }
        if (i2 == -1) {
            i2 = iD;
        }
        if (e1hVarJ.c(e1hVarJ.h(iD))) {
            e1hVarJ.a(iD);
            iH = iD;
            while (iH != -1 && (e1hVarJ.g(iH) || !e1hVarJ.c(iH))) {
                iH = e1hVarJ.h(iH);
            }
        } else {
            e1hVarJ.a(iD);
            if (e1hVarJ.b(iD)) {
                if (!e1hVarJ.d(iD) || e1hVarJ.f(iD)) {
                    iH2 = e1hVarJ.h(iD);
                    iH = iH2;
                } else {
                    iH = iD;
                }
            } else if (e1hVarJ.f(iD)) {
                iH2 = e1hVarJ.h(iD);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            iD = iH;
        }
        return f3bVar.b(cr8.c(i2, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) th7.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
