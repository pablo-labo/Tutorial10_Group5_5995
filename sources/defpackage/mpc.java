package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mpc extends rjc {
    public static final TextPaint R0 = new TextPaint(1);
    public SpannableStringBuilder P0;
    public boolean Q0;

    public mpc(ppc ppcVar) {
        super(ppcVar);
        x65 x65Var = new x65(this);
        vk3 vk3Var = new vk3(this, 7);
        this.j0.Y(x65Var);
        this.j0.y(vk3Var);
    }

    @Override // defpackage.loc, defpackage.koc
    public final void I(iaa iaaVar) {
        iaaVar.getClass();
        this.P0 = n0(this, null, true, iaaVar);
        b0();
    }

    @Override // defpackage.loc
    public final void b0() {
        super.b0();
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // defpackage.loc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(defpackage.e4g r13) {
        /*
            r12 = this;
            r13.getClass()
            android.text.SpannableStringBuilder r1 = r12.P0
            if (r1 != 0) goto L8
            return
        L8:
            npc r0 = new npc
            boolean r3 = r12.N0
            r2 = 4
            float r4 = r12.X(r2)
            r2 = 1
            float r5 = r12.X(r2)
            r2 = 5
            float r6 = r12.X(r2)
            r7 = 3
            r8 = r7
            float r7 = r12.X(r8)
            int r9 = r12.x0
            com.facebook.yoga.a r10 = r12.j0
            e6h r10 = r10.g()
            e6h r11 = defpackage.e6h.RTL
            if (r10 != r11) goto L34
            if (r9 == r8) goto L32
            if (r9 == r2) goto L35
            goto L34
        L32:
            r8 = r2
            goto L35
        L34:
            r8 = r9
        L35:
            int r9 = r12.y0
            int r10 = r12.z0
            r2 = -1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r12 = r12.a
            java.util.ArrayList<e4g$r> r1 = r13.h
            e4g$u r2 = new e4g$u
            r2.<init>(r12, r0)
            r1.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpc.c0(e4g):void");
    }

    public final Layout o0(SpannableStringBuilder spannableStringBuilder, float f, m6h m6hVar) {
        float fA = this.p0.a();
        TextPaint textPaint = R0;
        textPaint.setTextSize(fA);
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableStringBuilder, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannableStringBuilder, textPaint) : Float.NaN;
        boolean z = m6hVar == m6h.UNDEFINED || f < 0.0f;
        int i = this.x0;
        if (this.j0.g() == e6h.RTL) {
            if (i == 3) {
                i = 5;
            } else if (i == 5) {
                i = 3;
            }
        }
        Layout.Alignment alignment = i != 1 ? (i == 3 || i != 5) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        if (metricsIsBoring == null && (z || (!dmc.m(desiredWidth) && desiredWidth <= f))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.G0).setBreakStrategy(this.y0).setHyphenationFrequency(0);
            hyphenationFrequency.getClass();
            hyphenationFrequency.setJustificationMode(this.z0);
            if (Build.VERSION.SDK_INT >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            StaticLayout staticLayoutBuild = hyphenationFrequency.build();
            staticLayoutBuild.getClass();
            return staticLayoutBuild;
        }
        if (metricsIsBoring != null && (z || metricsIsBoring.width <= f)) {
            BoringLayout boringLayoutMake = BoringLayout.make(spannableStringBuilder, textPaint, (int) Math.max(metricsIsBoring.width, 0.0d), alignment, 1.0f, 0.0f, metricsIsBoring, this.G0);
            boringLayoutMake.getClass();
            return boringLayoutMake;
        }
        Layout.Alignment alignment2 = alignment;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 29) {
            f = (float) Math.ceil(f);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.G0).setBreakStrategy(this.y0).setHyphenationFrequency(0);
        hyphenationFrequency2.getClass();
        hyphenationFrequency2.setJustificationMode(this.z0);
        if (i2 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild2 = hyphenationFrequency2.build();
        staticLayoutBuild2.getClass();
        return staticLayoutBuild2;
    }

    @snc(name = "onTextLayout")
    public final void setShouldNotifyOnTextLayout(boolean z) {
        this.Q0 = z;
    }

    @Override // defpackage.loc, defpackage.koc
    public final ArrayList z() {
        HashMap map = this.O0;
        if (map != null && !map.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder = this.P0;
            if (spannableStringBuilder != null) {
                qhf[] qhfVarArr = (qhf[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qhf.class);
                ArrayList arrayList = new ArrayList();
                ct0 ct0VarQ = web.q(qhfVarArr);
                while (ct0VarQ.hasNext()) {
                    qhf qhfVar = (qhf) ct0VarQ.next();
                    HashMap map2 = this.O0;
                    koc kocVar = map2 != null ? (koc) map2.get(Integer.valueOf(qhfVar.a)) : null;
                    if (kocVar == null) {
                        r6.g("Child is null");
                        return null;
                    }
                    kocVar.D();
                    arrayList.add(kocVar);
                }
                return arrayList;
            }
            r6.g("Spannable element has not been prepared in onBeforeLayout");
        }
        return null;
    }

    public mpc() {
        this(null);
    }
}
