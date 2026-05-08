package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.b;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import defpackage.zjf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lif {
    public static final lif a = new lif();
    public static final d b = new d();
    public static final ConcurrentHashMap<Integer, Spannable> c = new ConcurrentHashMap<>();

    public static final class a {
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
    }

    public static final class b {
        public final qcf a;
        public final int b;
        public final int c;
        public final boolean d;
        public final double e;
        public final double f;

        public b(qcf qcfVar, int i, int i2, boolean z, double d, double d2) {
            this.a = qcfVar;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = d;
            this.f = d2;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[m6h.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class d extends ThreadLocal<TextPaint> {
        @Override // java.lang.ThreadLocal
        public final TextPaint initialValue() {
            return new TextPaint(1);
        }
    }

    public static final void a(Spannable spannable, float f, float f2, m6h m6hVar, float f3, int i, boolean z, int i2, int i3, Layout.Alignment alignment, int i4, TextPaint textPaint) {
        Spannable spannable2 = spannable;
        TextPaint textPaint2 = textPaint;
        alignment.getClass();
        textPaint2.getClass();
        lif lifVar = a;
        lifVar.getClass();
        BoringLayout.Metrics metricsJ = j(spannable2, textPaint2);
        m6h m6hVar2 = m6h.EXACTLY;
        Layout layoutD = d(spannable2, metricsJ, f, m6hVar2, z, i2, i3, alignment, i4, null, -1, textPaint2);
        int iG = (int) (Float.isNaN(f3) ? nn2.G(4.0f) : f3);
        int i5 = 0;
        Class<ReactAbsoluteSizeSpan> cls = ReactAbsoluteSizeSpan.class;
        ct0 ct0VarQ = web.q((ReactAbsoluteSizeSpan[]) spannable2.getSpans(0, spannable2.length(), cls));
        int iMax = iG;
        while (ct0VarQ.hasNext()) {
            iMax = Math.max(iMax, ((ReactAbsoluteSizeSpan) ct0VarQ.next()).getSize());
        }
        int i6 = iMax;
        while (i6 > iG) {
            if ((i == -1 || i == 0 || layoutD.getLineCount() <= i) && ((m6hVar == m6h.UNDEFINED || layoutD.getHeight() <= f2) && (spannable2.length() != 1 || layoutD.getLineWidth(i5) <= f))) {
                return;
            }
            int iMax2 = i6 - Math.max(1, (int) nn2.G(1.0f));
            float f4 = iMax2 / iMax;
            textPaint2.setTextSize(Math.max((int) (textPaint2.getTextSize() * f4), iG));
            ct0 ct0VarQ2 = web.q((ReactAbsoluteSizeSpan[]) spannable2.getSpans(i5, spannable2.length(), cls));
            while (ct0VarQ2.hasNext()) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) ct0VarQ2.next();
                spannable2.setSpan(new ReactAbsoluteSizeSpan(Math.max((int) (reactAbsoluteSizeSpan.getSize() * f4), iG)), spannable2.getSpanStart(reactAbsoluteSizeSpan), spannable2.getSpanEnd(reactAbsoluteSizeSpan), spannable2.getSpanFlags(reactAbsoluteSizeSpan));
                spannable2.removeSpan(reactAbsoluteSizeSpan);
                metricsJ = metricsJ;
                iMax2 = iMax2;
            }
            BoringLayout.Metrics metrics = metricsJ;
            int i7 = iMax2;
            if (metrics != null) {
                lifVar.getClass();
                metricsJ = j(spannable2, textPaint2);
            } else {
                metricsJ = metrics;
            }
            lifVar.getClass();
            layoutD = d(spannable2, metricsJ, f, m6hVar2, z, i2, i3, alignment, i4, null, -1, textPaint2);
            spannable2 = spannable;
            textPaint2 = textPaint;
            iMax = iMax;
            cls = cls;
            i6 = i7;
            i5 = 0;
        }
    }

    public static float b(Layout layout, float f, m6h m6hVar, int i) {
        if (m6hVar != m6h.EXACTLY) {
            float lineBottom = layout.getLineBottom(i - 1);
            if (m6hVar != m6h.AT_MOST || lineBottom <= f) {
                return lineBottom;
            }
        }
        return f;
    }

    public static int c(Layout layout, int i) {
        return (i == -1 || i == 0) ? layout.getLineCount() : Math.min(i, layout.getLineCount());
    }

    public static Layout d(Spannable spannable, BoringLayout.Metrics metrics, float f, m6h m6hVar, boolean z, int i, int i2, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, TextPaint textPaint) {
        if (metrics != null && (m6hVar == m6h.UNDEFINED || metrics.width <= ((float) Math.floor(f)))) {
            BoringLayout boringLayoutMake = BoringLayout.make(spannable, textPaint, m6hVar == m6h.EXACTLY ? (int) Math.floor(f) : metrics.width, alignment, 1.0f, 0.0f, metrics, z);
            boringLayoutMake.getClass();
            return boringLayoutMake;
        }
        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(spannable, textPaint));
        int iOrdinal = m6hVar.ordinal();
        if (iOrdinal == 1) {
            iCeil = (int) Math.floor(f);
        } else if (iOrdinal == 2) {
            iCeil = Math.min(iCeil, (int) Math.floor(f));
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, iCeil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2);
        hyphenationFrequency.getClass();
        if (i4 != -1 && i4 != 0) {
            hyphenationFrequency.setEllipsize(truncateAt).setMaxLines(i4);
        }
        hyphenationFrequency.setJustificationMode(i3);
        if (Build.VERSION.SDK_INT >= 28) {
            hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild = hyphenationFrequency.build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }

    public static Layout e(Spannable spannable, TextPaint textPaint, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f, m6h m6hVar, float f2, m6h m6hVar2) {
        BoringLayout.Metrics metricsJ = j(spannable, textPaint);
        String string = aVar2.getString(2);
        int i = !string.equals("balanced") ? !string.equals("simple") ? 1 : 0 : 2;
        boolean z = aVar2.h1(4) ? aVar2.getBoolean(4) : true;
        String string2 = aVar2.getString(5);
        int i2 = !string2.equals(Fonts.Font.STYLE_NORMAL) ? !string2.equals("none") ? 2 : 0 : 1;
        boolean z2 = aVar2.h1(3) ? aVar2.getBoolean(3) : false;
        int i3 = aVar2.h1(0) ? aVar2.getInt(0) : -1;
        TextUtils.TruncateAt truncateAt = null;
        if (aVar2.h1(1)) {
            switch (aVar2.getString(1)) {
                case "middle":
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                    break;
                case "head":
                    truncateAt = TextUtils.TruncateAt.START;
                    break;
                case "tail":
                    truncateAt = TextUtils.TruncateAt.END;
                    break;
            }
        }
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        String strI = i(aVar);
        Layout.Alignment alignmentH = h(aVar, spannable, strI);
        int i4 = (strI == null || !strI.equals("justified")) ? 0 : 1;
        if (z2) {
            int i5 = i4;
            int i6 = i3;
            a(spannable, f, f2, m6hVar2, aVar2.h1(6) ? (float) aVar2.getDouble(6) : Float.NaN, i6, z, i, i2, alignmentH, i5, textPaint);
            i3 = i6;
            i4 = i5;
        }
        return d(spannable, metricsJ, f, m6hVar, z, i, i2, alignmentH, i4, truncateAt2, i3, textPaint);
    }

    public static Layout f(Context context, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f, m6h m6hVar, float f2, m6h m6hVar2, ppc ppcVar) {
        Spannable spannable;
        m6h m6hVar3;
        float f3;
        m6h m6hVar4;
        float f4;
        ReadableMapBuffer readableMapBuffer3;
        ReadableMapBuffer readableMapBuffer4;
        TextPaint textPaint;
        Spannable spannableG = g(context, readableMapBuffer, ppcVar);
        if (readableMapBuffer.h1(3)) {
            textPaint = ((jpc[]) spannableG.getSpans(0, 0, jpc.class))[0].a;
            spannable = spannableG;
            m6hVar3 = m6hVar2;
            f3 = f2;
            m6hVar4 = m6hVar;
            f4 = f;
            readableMapBuffer3 = readableMapBuffer2;
            readableMapBuffer4 = readableMapBuffer;
        } else {
            qcf qcfVarA = qcf.a(readableMapBuffer.j0(4));
            TextPaint textPaint2 = b.get();
            if (textPaint2 == null) {
                r6.g("Required value was null.");
                return null;
            }
            TextPaint textPaint3 = textPaint2;
            textPaint3.setTypeface(null);
            textPaint3.setTextSize(12.0f);
            textPaint3.setFakeBoldText(false);
            textPaint3.setTextSkewX(0.0f);
            m(textPaint3, qcfVarA, context);
            spannable = spannableG;
            m6hVar3 = m6hVar2;
            f3 = f2;
            m6hVar4 = m6hVar;
            f4 = f;
            readableMapBuffer3 = readableMapBuffer2;
            readableMapBuffer4 = readableMapBuffer;
            textPaint = textPaint3;
        }
        return e(spannable, textPaint, readableMapBuffer4, readableMapBuffer3, f4, m6hVar4, f3, m6hVar3);
    }

    public static Spannable g(Context context, com.facebook.react.common.mapbuffer.a aVar, ppc ppcVar) {
        int i;
        com.facebook.react.common.mapbuffer.a aVar2;
        zjf.a aVar3;
        int i2;
        context.getClass();
        aVar.getClass();
        int i3 = 3;
        if (aVar.h1(3)) {
            Spannable spannable = c.get(Integer.valueOf(aVar.getInt(3)));
            if (spannable != null) {
                return spannable;
            }
            r6.g("Required value was null.");
            return null;
        }
        boolean zEnableAndroidTextMeasurementOptimizations = ie7.g0.enableAndroidTextMeasurementOptimizations();
        zjf.a aVar4 = zjf.a;
        b.c cVar = b.c.d;
        b.d dVar = b.d.a;
        int i4 = 5;
        int i5 = 0;
        int i6 = 1;
        int i7 = 2;
        if (zEnableAndroidTextMeasurementOptimizations) {
            com.facebook.react.common.mapbuffer.a aVarJ0 = aVar.j0(2);
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(aVarJ0.getC());
            int c2 = aVarJ0.getC();
            int i8 = 0;
            while (i8 < c2) {
                com.facebook.react.common.mapbuffer.a aVarJ02 = aVarJ0.j0(i8);
                qcf qcfVarA = qcf.a(aVarJ02.j0(i4));
                String string = aVarJ02.getString(i5);
                zjf zjfVar = qcfVarA.m;
                aVar4.getClass();
                String strA = zjf.a.a(string, zjfVar);
                sb.append(strA);
                int length = strA.length();
                int i9 = aVarJ02.h1(1) ? aVarJ02.getInt(1) : -1;
                boolean z = aVarJ02.h1(2) && aVarJ02.getBoolean(2);
                double d2 = Double.NaN;
                double d3 = aVarJ02.h1(i3) ? aVarJ02.getDouble(i3) : Double.NaN;
                if (aVarJ02.h1(4)) {
                    d2 = aVarJ02.getDouble(4);
                }
                arrayList.add(new b(qcfVarA, length, i9, z, d3, d2));
                i8++;
                i3 = 3;
                i4 = 5;
                i5 = 0;
            }
            SpannableString spannableString = new SpannableString(sb);
            Iterator it = arrayList.iterator();
            it.getClass();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                b bVar = (b) next;
                int i11 = bVar.c;
                qcf qcfVar = bVar.a;
                int i12 = bVar.b + i10;
                int i13 = i10 == 0 ? 18 : 34;
                if (bVar.d) {
                    spannableString.setSpan(new qhf(i11, (int) nn2.H((float) bVar.e, Float.NaN), (int) nn2.H((float) bVar.f, Float.NaN)), i10, i12, i13);
                } else {
                    b.d dVar2 = qcfVar.u;
                    if (dVar2 == null ? qcfVar.t == cVar : dVar2 == dVar) {
                        spannableString.setSpan(new vjc(i11), i10, i12, i13);
                    }
                    if (qcfVar.b) {
                        spannableString.setSpan(new ReactForegroundColorSpan(qcfVar.e), i10, i12, i13);
                    }
                    if (qcfVar.f) {
                        spannableString.setSpan(new ReactBackgroundColorSpan(qcfVar.g), i10, i12, i13);
                    }
                    if (!Float.isNaN(qcfVar.h)) {
                        spannableString.setSpan(new fnc(qcfVar.h), i10, i12, i13);
                    }
                    if (!Float.isNaN(qcfVar.e())) {
                        spannableString.setSpan(new sa3(qcfVar.e()), i10, i12, i13);
                    }
                    spannableString.setSpan(new ReactAbsoluteSizeSpan(qcfVar.i), i10, i12, i13);
                    if (qcfVar.v != -1 || qcfVar.w != -1 || qcfVar.x != null) {
                        int i14 = qcfVar.v;
                        int i15 = qcfVar.w;
                        String str = qcfVar.y;
                        String str2 = qcfVar.x;
                        AssetManager assets = context.getAssets();
                        assets.getClass();
                        spannableString.setSpan(new sb3(i14, i15, str, str2, assets), i10, i12, i13);
                    }
                    if (qcfVar.r) {
                        spannableString.setSpan(new ReactUnderlineSpan(), i10, i12, i13);
                    }
                    if (qcfVar.s) {
                        spannableString.setSpan(new ReactStrikethroughSpan(), i10, i12, i13);
                    }
                    if ((qcfVar.n != 0.0f || qcfVar.o != 0.0f || qcfVar.p != 0.0f) && Color.alpha(qcfVar.q) != 0) {
                        spannableString.setSpan(new bce(qcfVar.n, qcfVar.o, qcfVar.p, qcfVar.q), i10, i12, i13);
                    }
                    if (!Float.isNaN(qcfVar.b())) {
                        spannableString.setSpan(new ta3(qcfVar.b()), i10, i12, i13);
                    }
                    spannableString.setSpan(new xoc(i11), i10, i12, i13);
                }
                i10 = i12;
            }
            if (ppcVar != null) {
                ppcVar.onPostProcessSpannable(spannableString);
            }
            return spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        com.facebook.react.common.mapbuffer.a aVarJ03 = aVar.j0(2);
        int c3 = aVarJ03.getC();
        int i16 = 0;
        while (i16 < c3) {
            com.facebook.react.common.mapbuffer.a aVarJ04 = aVarJ03.j0(i16);
            int length2 = spannableStringBuilder.length();
            qcf qcfVarA2 = qcf.a(aVarJ04.j0(5));
            String string2 = aVarJ04.getString(0);
            zjf zjfVar2 = qcfVarA2.m;
            aVar4.getClass();
            spannableStringBuilder.append((CharSequence) zjf.a.a(string2, zjfVar2));
            int length3 = spannableStringBuilder.length();
            int i17 = aVarJ04.h1(i6) ? aVarJ04.getInt(i6) : -1;
            if (aVarJ04.h1(i7) && aVarJ04.getBoolean(i7)) {
                i = i6;
                arrayList2.add(new tae(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new qhf(i17, (int) nn2.H((float) aVarJ04.getDouble(3), Float.NaN), (int) nn2.H((float) aVarJ04.getDouble(4), Float.NaN))));
                aVar2 = aVarJ03;
                aVar3 = aVar4;
                i2 = c3;
            } else {
                i = i6;
                if (length3 >= length2) {
                    b.d dVar3 = qcfVarA2.u;
                    if (dVar3 == null ? qcfVarA2.t == cVar : dVar3 == dVar) {
                        arrayList2.add(new tae(length2, length3, new vjc(i17)));
                    }
                    if (qcfVarA2.b) {
                        arrayList2.add(new tae(length2, length3, new ReactForegroundColorSpan(qcfVarA2.e)));
                    }
                    if (qcfVarA2.f) {
                        arrayList2.add(new tae(length2, length3, new ReactBackgroundColorSpan(qcfVarA2.g)));
                    }
                    if (!Float.isNaN(qcfVarA2.h)) {
                        arrayList2.add(new tae(length2, length3, new fnc(qcfVarA2.h)));
                    }
                    if (!Float.isNaN(qcfVarA2.e())) {
                        arrayList2.add(new tae(length2, length3, new sa3(qcfVarA2.e())));
                    }
                    arrayList2.add(new tae(length2, length3, new ReactAbsoluteSizeSpan(qcfVarA2.i)));
                    if (qcfVarA2.v == -1 && qcfVarA2.w == -1 && qcfVarA2.x == null) {
                        aVar2 = aVarJ03;
                    } else {
                        int i18 = qcfVarA2.v;
                        int i19 = qcfVarA2.w;
                        aVar2 = aVarJ03;
                        String str3 = qcfVarA2.y;
                        String str4 = qcfVarA2.x;
                        AssetManager assets2 = context.getAssets();
                        assets2.getClass();
                        arrayList2.add(new tae(length2, length3, new sb3(i18, i19, str3, str4, assets2)));
                    }
                    if (qcfVarA2.r) {
                        arrayList2.add(new tae(length2, length3, new ReactUnderlineSpan()));
                    }
                    if (qcfVarA2.s) {
                        arrayList2.add(new tae(length2, length3, new ReactStrikethroughSpan()));
                    }
                    if ((qcfVarA2.n == 0.0f && qcfVarA2.o == 0.0f && qcfVarA2.p == 0.0f) || Color.alpha(qcfVarA2.q) == 0) {
                        aVar3 = aVar4;
                        i2 = c3;
                    } else {
                        aVar3 = aVar4;
                        i2 = c3;
                        arrayList2.add(new tae(length2, length3, new bce(qcfVarA2.n, qcfVarA2.o, qcfVarA2.p, qcfVarA2.q)));
                    }
                    if (!Float.isNaN(qcfVarA2.b())) {
                        arrayList2.add(new tae(length2, length3, new ta3(qcfVarA2.b())));
                    }
                    arrayList2.add(new tae(length2, length3, new xoc(i17)));
                } else {
                    aVar2 = aVarJ03;
                    aVar3 = aVar4;
                    i2 = c3;
                }
            }
            i16++;
            aVarJ03 = aVar2;
            i6 = i;
            aVar4 = aVar3;
            c3 = i2;
            i7 = 2;
        }
        int size = arrayList2.size();
        for (int i20 = 0; i20 < size; i20++) {
            ((tae) arrayList2.get((arrayList2.size() - i20) - 1)).a(spannableStringBuilder, i20);
        }
        if (ppcVar != null) {
            ppcVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static Layout.Alignment h(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, String str) {
        boolean z = k(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        return str == null ? alignment : str.equals("center") ? Layout.Alignment.ALIGN_CENTER : str.equals(GesturesListener.SCROLL_DIRECTION_RIGHT) ? z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    public static String i(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.h1(2)) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarJ0 = aVar.j0(2);
        if (aVarJ0.getC() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarJ02 = aVarJ0.j0(0).j0(5);
        if (aVarJ02.h1(12)) {
            return aVarJ02.getString(12);
        }
        return null;
    }

    public static BoringLayout.Metrics j(Spannable spannable, TextPaint textPaint) {
        return Build.VERSION.SDK_INT < 33 ? BoringLayout.isBoring(spannable, textPaint) : BoringLayout.isBoring(spannable, textPaint, TextDirectionHeuristics.FIRSTSTRONG_LTR, true, null);
    }

    public static boolean k(com.facebook.react.common.mapbuffer.a aVar) {
        aVar.getClass();
        if (aVar.h1(2)) {
            com.facebook.react.common.mapbuffer.a aVarJ0 = aVar.j0(2);
            if (aVarJ0.getC() != 0) {
                com.facebook.react.common.mapbuffer.a aVarJ02 = aVarJ0.j0(0).j0(5);
                if (aVarJ02.h1(23) && qcf.d(aVarJ02.getString(23)) == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int l(android.text.Layout r9, android.text.Spanned r10, float r11, int r12, int r13, float r14, lif.a r15) {
        /*
            int r0 = r10.length()
            java.lang.Class<qhf> r1 = defpackage.qhf.class
            int r0 = r10.nextSpanTransition(r13, r0, r1)
            java.lang.Object[] r13 = r10.getSpans(r13, r0, r1)
            qhf[] r13 = (defpackage.qhf[]) r13
            int r1 = r13.length
            r2 = 0
            if (r1 != 0) goto L17
            r15.a = r2
            return r0
        L17:
            int r1 = r13.length
            r3 = 1
            if (r1 != r3) goto L1d
            r1 = r3
            goto L1e
        L1d:
            r1 = r2
        L1e:
            defpackage.hh1.l(r1)
            r13 = r13[r2]
            int r1 = r10.getSpanStart(r13)
            int r4 = r9.getLineForOffset(r1)
            int r5 = r9.getEllipsisCount(r4)
            if (r5 <= 0) goto L33
            r5 = r3
            goto L34
        L33:
            r5 = r2
        L34:
            if (r4 > r12) goto Laa
            if (r5 == 0) goto L45
            int r12 = r9.getLineStart(r4)
            int r5 = r9.getEllipsisStart(r4)
            int r5 = r5 + r12
            if (r1 < r5) goto L45
            goto Laa
        L45:
            int r12 = r13.b
            float r12 = (float) r12
            int r5 = r13.c
            float r5 = (float) r5
            boolean r6 = r9.isRtlCharAt(r1)
            int r7 = r9.getParagraphDirection(r4)
            r8 = -1
            if (r7 != r8) goto L57
            r2 = r3
        L57:
            int r7 = r10.length()
            int r7 = r7 - r3
            if (r1 != r7) goto L85
            int r1 = r10.length()
            if (r1 <= 0) goto L76
            int r1 = r9.getLineEnd(r4)
            int r1 = r1 - r3
            char r10 = r10.charAt(r1)
            r1 = 10
            if (r10 != r1) goto L76
            float r10 = r9.getLineMax(r4)
            goto L7a
        L76:
            float r10 = r9.getLineWidth(r4)
        L7a:
            if (r2 == 0) goto L7e
            float r11 = r11 - r10
            goto L9f
        L7e:
            float r10 = r9.getLineRight(r4)
            float r11 = r10 - r12
            goto L9f
        L85:
            if (r2 != r6) goto L8c
            float r10 = r9.getPrimaryHorizontal(r1)
            goto L90
        L8c:
            float r10 = r9.getSecondaryHorizontal(r1)
        L90:
            if (r2 == 0) goto L9b
            if (r6 != 0) goto L9b
            float r1 = r9.getLineRight(r4)
            float r1 = r1 - r10
            float r11 = r11 - r1
            goto L9c
        L9b:
            r11 = r10
        L9c:
            if (r6 == 0) goto L9f
            float r11 = r11 - r12
        L9f:
            int r9 = r9.getLineBaseline(r4)
            float r9 = (float) r9
            float r9 = r9 - r5
            r15.b = r9
            r15.c = r11
            goto Lb0
        Laa:
            r9 = 2143289344(0x7fc00000, float:NaN)
            r15.b = r9
            r15.c = r9
        Lb0:
            float r9 = r15.b
            float r9 = r9 + r14
            r15.b = r9
            r15.a = r3
            int r9 = r13.b
            float r9 = (float) r9
            r15.d = r9
            int r9 = r13.c
            float r9 = (float) r9
            r15.e = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lif.l(android.text.Layout, android.text.Spanned, float, int, int, float, lif$a):int");
    }

    public static void m(TextPaint textPaint, qcf qcfVar, Context context) {
        int i = qcfVar.i;
        if (i != -1) {
            textPaint.setTextSize(i);
        }
        int i2 = qcfVar.v;
        if (i2 == -1 && qcfVar.w == -1 && qcfVar.x == null) {
            return;
        }
        int i3 = qcfVar.w;
        String str = qcfVar.x;
        AssetManager assets = context.getAssets();
        assets.getClass();
        Typeface typefaceA = qpc.a(null, i2, i3, str, assets);
        textPaint.setTypeface(typefaceA);
        int i4 = qcfVar.v;
        if (i4 == -1 || i4 == typefaceA.getStyle()) {
            return;
        }
        int i5 = qcfVar.v & (~typefaceA.getStyle());
        textPaint.setFakeBoldText((i5 & 1) != 0);
        textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
    }
}
