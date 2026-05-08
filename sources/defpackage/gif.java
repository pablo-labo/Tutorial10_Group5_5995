package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gif extends ba1 {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final a G;
    public final b H;
    public final HashMap I;
    public final r59<String> J;
    public final ArrayList K;
    public final xhf L;
    public final j79 M;
    public final s69 N;
    public final njf O;
    public final ia2 P;
    public final ia2 Q;
    public final di5 R;
    public final di5 S;
    public final yh7 T;
    public final yh7 U;
    public final yh7 V;
    public final yh7 W;

    public class a extends Paint {
    }

    public class b extends Paint {
    }

    public static class c {
        public String a = "";
        public float b = 0.0f;
    }

    public gif(j79 j79Var, hl8 hl8Var) {
        pc0 pc0Var;
        pc0 pc0Var2;
        fc0 fc0Var;
        pc0 pc0Var3;
        fc0 fc0Var2;
        pc0 pc0Var4;
        fc0 fc0Var3;
        qc0 qc0Var;
        fc0 fc0Var4;
        qc0 qc0Var2;
        dc0 dc0Var;
        qc0 qc0Var3;
        dc0 dc0Var2;
        qc0 qc0Var4;
        cc0 cc0Var;
        qc0 qc0Var5;
        cc0 cc0Var2;
        super(j79Var, hl8Var);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.G = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.H = bVar;
        this.I = new HashMap();
        this.J = new r59<>();
        this.K = new ArrayList();
        this.O = njf.b;
        this.M = j79Var;
        this.N = hl8Var.b;
        xhf xhfVar = new xhf((List) hl8Var.q.c);
        this.L = xhfVar;
        xhfVar.a(this);
        f(xhfVar);
        mte mteVar = hl8Var.r;
        if (mteVar != null && (qc0Var5 = (qc0) mteVar.a) != null && (cc0Var2 = qc0Var5.a) != null) {
            z91<?, ?> z91VarT = cc0Var2.t();
            this.P = (ia2) z91VarT;
            z91VarT.a(this);
            f(z91VarT);
        }
        if (mteVar != null && (qc0Var4 = (qc0) mteVar.a) != null && (cc0Var = qc0Var4.b) != null) {
            z91<?, ?> z91VarT2 = cc0Var.t();
            this.Q = (ia2) z91VarT2;
            z91VarT2.a(this);
            f(z91VarT2);
        }
        if (mteVar != null && (qc0Var3 = (qc0) mteVar.a) != null && (dc0Var2 = qc0Var3.c) != null) {
            di5 di5VarT = dc0Var2.t();
            this.R = di5VarT;
            di5VarT.a(this);
            f(di5VarT);
        }
        if (mteVar != null && (qc0Var2 = (qc0) mteVar.a) != null && (dc0Var = qc0Var2.d) != null) {
            di5 di5VarT2 = dc0Var.t();
            this.S = di5VarT2;
            di5VarT2.a(this);
            f(di5VarT2);
        }
        if (mteVar != null && (qc0Var = (qc0) mteVar.a) != null && (fc0Var4 = qc0Var.e) != null) {
            z91<?, ?> z91VarT3 = fc0Var4.t();
            this.T = (yh7) z91VarT3;
            z91VarT3.a(this);
            f(z91VarT3);
        }
        if (mteVar != null && (pc0Var4 = (pc0) mteVar.b) != null && (fc0Var3 = pc0Var4.a) != null) {
            z91<?, ?> z91VarT4 = fc0Var3.t();
            this.U = (yh7) z91VarT4;
            z91VarT4.a(this);
            f(z91VarT4);
        }
        if (mteVar != null && (pc0Var3 = (pc0) mteVar.b) != null && (fc0Var2 = pc0Var3.b) != null) {
            z91<?, ?> z91VarT5 = fc0Var2.t();
            this.V = (yh7) z91VarT5;
            z91VarT5.a(this);
            f(z91VarT5);
        }
        if (mteVar != null && (pc0Var2 = (pc0) mteVar.b) != null && (fc0Var = pc0Var2.c) != null) {
            z91<?, ?> z91VarT6 = fc0Var.t();
            this.W = (yh7) z91VarT6;
            z91VarT6.a(this);
            f(z91VarT6);
        }
        if (mteVar == null || (pc0Var = (pc0) mteVar.b) == null) {
            return;
        }
        this.O = pc0Var.d;
    }

    public static void r(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void s(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.ba1, defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        s69 s69Var = this.N;
        rectF.set(0.0f, 0.0f, s69Var.k.width(), s69Var.k.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0319  */
    @Override // defpackage.ba1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, defpackage.hd4 r34) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.k(android.graphics.Canvas, android.graphics.Matrix, int, hd4):void");
    }

    public final void q(k84 k84Var, int i, int i2) {
        ia2 ia2Var = this.P;
        a aVar = this.G;
        if (ia2Var == null || !u(i2)) {
            aVar.setColor(k84Var.h);
        } else {
            aVar.setColor(ia2Var.e().intValue());
        }
        ia2 ia2Var2 = this.Q;
        b bVar = this.H;
        if (ia2Var2 == null || !u(i2)) {
            bVar.setColor(k84Var.i);
        } else {
            bVar.setColor(ia2Var2.e().intValue());
        }
        z91<Integer, Integer> z91Var = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = z91Var == null ? 100 : z91Var.e().intValue();
        yh7 yh7Var = this.T;
        if (yh7Var != null && u(i2)) {
            iIntValue = yh7Var.e().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(iRound);
        bVar.setAlpha(iRound);
        di5 di5Var = this.R;
        if (di5Var == null || !u(i2)) {
            bVar.setStrokeWidth(ckg.c() * k84Var.j);
        } else {
            bVar.setStrokeWidth(di5Var.e().floatValue());
        }
    }

    public final c t(int i) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new c());
        }
        return (c) arrayList.get(i - 1);
    }

    public final boolean u(int i) {
        yh7 yh7Var;
        int length = this.L.e().a.length();
        yh7 yh7Var2 = this.U;
        if (yh7Var2 == null || (yh7Var = this.V) == null) {
            return true;
        }
        int iMin = Math.min(yh7Var2.e().intValue(), yh7Var.e().intValue());
        int iMax = Math.max(yh7Var2.e().intValue(), yh7Var.e().intValue());
        yh7 yh7Var3 = this.W;
        if (yh7Var3 != null) {
            int iIntValue = yh7Var3.e().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == njf.b) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean v(Canvas canvas, k84 k84Var, int i, float f) {
        PointF pointF = k84Var.l;
        PointF pointF2 = k84Var.m;
        float fC = ckg.c();
        float f2 = (i * k84Var.f * fC) + (pointF == null ? 0.0f : (k84Var.f * fC) + pointF.y);
        if (this.M.g0 && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + k84Var.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = k84Var.d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iOrdinal == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iOrdinal != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List<c> w(String str, float f, kn5 kn5Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                mn5 mn5VarE = this.N.h.e(mn5.a(cCharAt, kn5Var.a, kn5Var.c));
                if (mn5VarE != null) {
                    fMeasureText = (ckg.c() * ((float) mn5VarE.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                c cVarT = t(i);
                if (i3 == i2) {
                    cVarT.a = str.substring(i2, i4).trim();
                    cVarT.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    cVarT.a = str.substring(i2, i3 - 1).trim();
                    cVarT.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            c cVarT2 = t(i);
            cVarT2.a = str.substring(i2);
            cVarT2.b = f4;
        }
        return this.K.subList(0, i);
    }
}
