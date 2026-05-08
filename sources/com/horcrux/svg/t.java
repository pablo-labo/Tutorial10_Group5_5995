package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import defpackage.ajf;
import defpackage.bjf;
import defpackage.cjf;
import defpackage.ia6;
import defpackage.l5;
import defpackage.mkf;
import defpackage.nkc;
import defpackage.okc;
import defpackage.on5;
import defpackage.xif;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class t extends u {
    public Path i0;
    public String j0;
    public xif k0;
    public final ArrayList<String> l0;
    public final ArrayList<Matrix> m0;
    public final AssetManager n0;

    public t(mkf mkfVar) {
        super(mkfVar);
        this.l0 = new ArrayList<>();
        this.m0 = new ArrayList<>();
        this.n0 = this.mContext.getResources().getAssets();
    }

    @Override // com.horcrux.svg.u, com.horcrux.svg.VirtualView
    public final void clearCache() {
        this.i0 = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.u, com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        if (this.j0 == null) {
            clip(canvas, paint);
            g(canvas, paint, f);
            return;
        }
        SVGLength sVGLength = this.f;
        if (sVGLength != null && sVGLength.a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f)) {
                s(canvas, paint);
            }
            if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                s(canvas, paint);
                return;
            }
            return;
        }
        ArrayList<String> arrayList = this.l0;
        int size = arrayList.size();
        if (size > 0) {
            r(paint, j().r);
            for (int i = 0; i < size; i++) {
                String str = arrayList.get(i);
                Matrix matrix = this.m0.get(i);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        h(canvas, paint, f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288 A[PHI: r55
  0x0288: PHI (r55v1 double) = (r55v0 double), (r55v3 double) binds: [B:102:0x025a, B:108:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d9 A[PHI: r9
  0x02d9: PHI (r9v5 double) = (r9v4 double), (r9v21 double) binds: [B:113:0x02ba, B:297:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    @Override // com.horcrux.svg.u, com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path getPath(android.graphics.Canvas r79, android.graphics.Paint r80) {
        /*
            Method dump skipped, instruction units count: 1864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.t.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        Region region;
        if (this.j0 == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.u, com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        this.i0 = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.u
    public final double o(Paint paint) {
        if (!Double.isNaN(this.h0)) {
            return this.h0;
        }
        String str = this.j0;
        double dO = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof u) {
                    dO = ((u) childAt).o(paint) + dO;
                }
            }
            this.h0 = dO;
            return dO;
        }
        if (str.length() == 0) {
            this.h0 = 0.0d;
            return 0.0d;
        }
        on5 on5Var = j().r;
        r(paint, on5Var);
        q(paint, on5Var);
        double dMeasureText = paint.measureText(str);
        this.h0 = dMeasureText;
        return dMeasureText;
    }

    public final void q(Paint paint, on5 on5Var) {
        double d = on5Var.n;
        String str = on5Var.g;
        paint.setLetterSpacing((float) (d / (on5Var.a * ((double) this.mScale))));
        if (d == 0.0d && on5Var.i == bjf.a) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + str);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + str);
        }
        paint.setFontVariationSettings("'wght' " + on5Var.f + on5Var.h);
    }

    public final void r(Paint paint, on5 on5Var) {
        Typeface typefaceA;
        cjf cjfVar = on5Var.e;
        String str = on5Var.h;
        int i = 0;
        boolean z = cjfVar == cjf.Bold || on5Var.f >= 550;
        boolean z2 = on5Var.c == ajf.b;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = on5Var.f;
        String str2 = on5Var.b;
        AssetManager assetManager = this.n0;
        if (str2 == null || str2.length() <= 0) {
            typefaceA = null;
        } else {
            String strM = l5.m("fonts/", str2, ".otf");
            String strM2 = l5.m("fonts/", str2, ".ttf");
            Typeface.Builder builder = new Typeface.Builder(assetManager, strM);
            builder.setFontVariationSettings("'wght' " + i2 + str);
            builder.setWeight(i2);
            builder.setItalic(z2);
            typefaceA = builder.build();
            if (typefaceA == null) {
                Typeface.Builder builder2 = new Typeface.Builder(assetManager, strM2);
                builder2.setFontVariationSettings("'wght' " + i2 + str);
                builder2.setWeight(i2);
                builder2.setItalic(z2);
                typefaceA = builder2.build();
            }
        }
        if (typefaceA == null) {
            try {
                okc okcVar = okc.b;
                if (okcVar == null) {
                    nkc nkcVar = nkc.e;
                    okcVar = new okc();
                    okcVar.a = nkcVar;
                    okc.b = okcVar;
                }
                str2.getClass();
                assetManager.getClass();
                nkc nkcVar2 = (nkc) okcVar.a;
                nkcVar2.getClass();
                typefaceA = nkcVar2.a(str2, new nkc.b(i, -1), assetManager);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceA = Typeface.create(typefaceA, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceA);
        paint.setTextSize((float) (on5Var.a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    public final void s(Canvas canvas, Paint paint) {
        ia6 ia6VarJ = j();
        l();
        on5 on5Var = ia6VarJ.r;
        TextPaint textPaint = new TextPaint(paint);
        r(textPaint, on5Var);
        q(textPaint, on5Var);
        double d = ia6VarJ.q;
        int iOrdinal = on5Var.j.ordinal();
        Layout.Alignment alignment = iOrdinal != 1 ? iOrdinal != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        SpannableString spannableString = new SpannableString(this.j0);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) p.a(this.f, canvas.getWidth(), this.mScale, d)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        int lineAscent = staticLayoutBuild.getLineAscent(0);
        float fC = (float) ia6VarJ.c(0.0d);
        float fD = (float) (ia6VarJ.d() + ((double) lineAscent));
        k();
        canvas.save();
        canvas.translate(fC, fD);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }
}
