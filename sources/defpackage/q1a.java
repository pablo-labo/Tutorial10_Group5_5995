package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q1a {
    public final r1a a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public q1a(r1a r1aVar, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.a = r1aVar;
        this.b = i;
        if (iq2.j(j) != 0 || iq2.i(j) != 0) {
            be7.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = r1aVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            g3b g3bVar = (g3b) arrayList2.get(i5);
            k80 k80Var = g3bVar.a;
            int iH = iq2.h(j);
            if (iq2.c(j)) {
                i3 = i5;
                iG = iq2.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = iq2.g(j);
            }
            h80 h80Var = new h80(k80Var, this.b - i6, i2, mq2.b(iH, iG, 5));
            float fD = h80Var.d() + f;
            hif hifVar = h80Var.d;
            int i7 = i6 + hifVar.g;
            arrayList.add(new f3b(h80Var, g3bVar.b, g3bVar.c, i6, i7, f, fD));
            if (!hifVar.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != u63.J(this.a.e)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fD;
            }
            z = true;
            i6 = i7;
            f = fD;
            break;
        }
        z = false;
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = iq2.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            f3b f3bVar = (f3b) arrayList.get(i8);
            List<qtc> list = f3bVar.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                qtc qtcVar = list.get(i9);
                arrayList4.add(qtcVar != null ? f3bVar.a(qtcVar) : null);
            }
            w92.w0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = z92.h1(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(q1a q1aVar, ww1 ww1Var, long j, vbe vbeVar, odf odfVar, ib4 ib4Var) {
        ww1Var.o();
        ArrayList arrayList = q1aVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f3b f3bVar = (f3b) arrayList.get(i);
            f3bVar.a.j(ww1Var, j, vbeVar, odfVar, ib4Var);
            ww1Var.f(0.0f, f3bVar.a.d());
        }
        ww1Var.h();
    }

    public static void j(q1a q1aVar, ww1 ww1Var, sn1 sn1Var, float f, vbe vbeVar, odf odfVar, ib4 ib4Var) {
        ww1Var.o();
        ArrayList arrayList = q1aVar.h;
        if (arrayList.size() <= 1 || (sn1Var instanceof kne)) {
            c0h.w(q1aVar, ww1Var, sn1Var, f, vbeVar, odfVar, ib4Var);
        } else {
            if (!(sn1Var instanceof tbe)) {
                l.g();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fD = 0.0f;
            for (int i = 0; i < size; i++) {
                f3b f3bVar = (f3b) arrayList.get(i);
                fD += f3bVar.a.d();
                fMax = Math.max(fMax, f3bVar.a.h());
            }
            Shader shaderB = ((tbe) sn1Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                h80 h80Var = ((f3b) arrayList.get(i2)).a;
                h80Var.k(ww1Var, new tn1(shaderB), f, vbeVar, odfVar, ib4Var);
                ww1Var.f(0.0f, h80Var.d());
                matrix.setTranslate(0.0f, -h80Var.d());
                shaderB.setLocalMatrix(matrix);
            }
        }
        ww1Var.h();
    }

    public final void a(final long j, final float[] fArr) {
        k(kjf.f(j));
        l(kjf.e(j));
        final juc jucVar = new juc();
        jucVar.element = 0;
        final iuc iucVar = new iuc();
        ak2.p(this.h, j, new Function1() { // from class: o1a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j2;
                h80 h80Var;
                boolean z;
                float fA;
                float fA2;
                f3b f3bVar = (f3b) obj;
                int i = f3bVar.b;
                h80 h80Var2 = f3bVar.a;
                int iE = f3bVar.c;
                long j3 = j;
                int iF = i > kjf.f(j3) ? f3bVar.b : kjf.f(j3);
                if (iE >= kjf.e(j3)) {
                    iE = kjf.e(j3);
                }
                long jC = cr8.c(f3bVar.d(iF), f3bVar.d(iE));
                juc jucVar2 = jucVar;
                int i2 = jucVar2.element;
                hif hifVar = h80Var2.d;
                int iF2 = kjf.f(jC);
                int iE2 = kjf.e(jC);
                Layout layout = hifVar.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    be7.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    be7.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    be7.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    be7.a("endOffset must be smaller or equal to text length");
                }
                int i3 = (iE2 - iF2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i2 < i3) {
                    be7.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                uj6 uj6Var = new uj6(hifVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = hifVar.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = hifVar.g(lineForOffset);
                        float fE = hifVar.e(lineForOffset);
                        j2 = jC;
                        h80Var = h80Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = uj6Var.a(false, iMax, false, false);
                                    z = z3;
                                    fA = uj6Var.a(true, iMax + 1, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = uj6Var.a(false, iMax, false, false);
                                        fA2 = uj6Var.a(true, iMax + 1, true, false);
                                    } else {
                                        fA2 = uj6Var.a(false, iMax, false, true);
                                        fA = uj6Var.a(true, iMax + 1, true, true);
                                    }
                                }
                                fArr2[i2] = fA;
                                fArr2[i2 + 1] = fG;
                                fArr2[i2 + 2] = fA2;
                                fArr2[i2 + 3] = fE;
                                i2 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = uj6Var.a(z2, iMax, z2, true);
                                z = z3;
                                fA2 = uj6Var.a(true, iMax + 1, true, true);
                            }
                            z2 = false;
                            fArr2[i2] = fA;
                            fArr2[i2 + 1] = fG;
                            fArr2[i2 + 2] = fA2;
                            fArr2[i2 + 3] = fE;
                            i2 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        h80Var2 = h80Var;
                        jC = j2;
                    }
                } else {
                    j2 = jC;
                    h80Var = h80Var2;
                }
                int iD = (kjf.d(j2) * 4) + jucVar2.element;
                int i4 = jucVar2.element;
                while (true) {
                    iuc iucVar2 = iucVar;
                    if (i4 >= iD) {
                        jucVar2.element = iD;
                        iucVar2.element = h80Var.d() + iucVar2.element;
                        return j6g.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = iucVar2.element;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        return h80Var.d.e(i - f3bVar.d) + f3bVar.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        int i2 = i - f3bVar.d;
        hif hifVar = h80Var.d;
        if (z) {
            Layout layout = hifVar.f;
            fcf fcfVar = oif.a;
            if (layout.getEllipsisCount(i2) <= 0 || hifVar.b != TextUtils.TruncateAt.END) {
                yl8 yl8VarC = hifVar.c();
                Layout layout2 = yl8VarC.a;
                iF = yl8VarC.f(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = hifVar.f(i2);
        }
        return iF + f3bVar.b;
    }

    public final int d(int i) {
        int length = this.a.a.b.length();
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(i >= length ? u63.J(arrayList) : i < 0 ? 0 : ak2.m(i, arrayList));
        return f3bVar.a.d.f.getLineForOffset(f3bVar.d(i)) + f3bVar.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.o(arrayList, f));
        int i = f3bVar.c - f3bVar.b;
        int i2 = f3bVar.d;
        if (i == 0) {
            return i2;
        }
        h80 h80Var = f3bVar.a;
        float f2 = f - f3bVar.f;
        hif hifVar = h80Var.d;
        return hifVar.f.getLineForVertical(((int) f2) - hifVar.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(i, arrayList));
        h80 h80Var = f3bVar.a;
        return h80Var.d.g(i - f3bVar.d) + f3bVar.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.o(arrayList, fIntBitsToFloat));
        int i2 = f3bVar.c;
        int i3 = f3bVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        h80 h80Var = f3bVar.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - f3bVar.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        hif hifVar = h80Var.d;
        int lineForVertical = hifVar.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - hifVar.h);
        return hifVar.f.getOffsetForHorizontal(lineForVertical, (hifVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(qtc qtcVar, int i, mhf mhfVar) {
        long jB;
        long j;
        float f = qtcVar.b;
        ArrayList arrayList = this.h;
        int iO = ak2.o(arrayList, f);
        float f2 = ((f3b) arrayList.get(iO)).g;
        float f3 = qtcVar.d;
        if (f2 >= f3 || iO == u63.J(arrayList)) {
            f3b f3bVar = (f3b) arrayList.get(iO);
            return f3bVar.b(f3bVar.a.g(f3bVar.c(qtcVar), i, mhfVar), true);
        }
        int iO2 = ak2.o(arrayList, f3);
        long jB2 = kjf.b;
        while (true) {
            jB = kjf.b;
            if (!kjf.b(jB2, jB) || iO > iO2) {
                break;
            }
            f3b f3bVar2 = (f3b) arrayList.get(iO);
            jB2 = f3bVar2.b(f3bVar2.a.g(f3bVar2.c(qtcVar), i, mhfVar), true);
            iO++;
        }
        if (kjf.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = kjf.b;
            if (!kjf.b(jB, j) || iO > iO2) {
                break;
            }
            f3b f3bVar3 = (f3b) arrayList.get(iO2);
            jB = f3bVar3.b(f3bVar3.a.g(f3bVar3.c(qtcVar), i, mhfVar), true);
            iO2--;
        }
        return kjf.b(jB, j) ? jB2 : cr8.c((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        le0 le0Var = this.a.a;
        if (i < 0 || i >= le0Var.b.length()) {
            StringBuilder sbG = o6.g(i, "offset(", ") is out of bounds [0, ");
            sbG.append(le0Var.b.length());
            sbG.append(')');
            be7.a(sbG.toString());
        }
    }

    public final void l(int i) {
        le0 le0Var = this.a.a;
        if (i < 0 || i > le0Var.b.length()) {
            StringBuilder sbG = o6.g(i, "offset(", ") is out of bounds [0, ");
            sbG.append(le0Var.b.length());
            sbG.append(']');
            be7.a(sbG.toString());
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        be7.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
