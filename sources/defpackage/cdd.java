package defpackage;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.Patterns;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.le0;
import defpackage.rx8;
import java.util.ArrayList;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class cdd {
    public static final void a(final String str, final boolean z, final tjf tjfVar, final long j, final long j2, b bVar, final int i) {
        c cVar;
        SpannableString spannableStringValueOf;
        int i2;
        str.getClass();
        c cVarH = bVar.h(-229140891);
        int i3 = i | (cVarH.K(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= cVarH.a(z) ? 32 : 16;
        }
        long j3 = j;
        int i4 = i3 | (cVarH.K(tjfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.e(j3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int i5 = 0;
        int i6 = 1;
        if (cVarH.o(i4 & 1, (i4 & 1171) != 1170)) {
            mhg mhgVar = (mhg) cVarH.M(um2.r);
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 7168) == 2048);
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                if (z) {
                    Spanned spannedFromHtml = Html.fromHtml(str, 63);
                    spannedFromHtml.getClass();
                    spannableStringValueOf = SpannableString.valueOf(zve.s0(spannedFromHtml));
                } else {
                    spannableStringValueOf = SpannableString.valueOf(zve.s0(new le0(str)));
                }
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(spannableStringValueOf.toString());
                Object[] spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), StyleSpan.class);
                spans.getClass();
                int length = spans.length;
                while (i5 < length) {
                    StyleSpan styleSpan = (StyleSpan) spans[i5];
                    int spanStart = spannableStringValueOf.getSpanStart(styleSpan);
                    int spanEnd = spannableStringValueOf.getSpanEnd(styleSpan);
                    int style = styleSpan.getStyle();
                    arrayList.add(new le0.b.a(spanStart, spanEnd, 8, style != i6 ? style != 2 ? style != 3 ? new foe(0L, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65535) : new foe(0L, 0L, to5.d0, new mo5(1), (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65523) : new foe(0L, 0L, (to5) null, new mo5(1), (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65527) : new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531), null));
                    i5++;
                    i6 = 1;
                }
                if (z || ((kr7) cr8.p(kr7.class)).e("droid_enable_link_text_guard").a == 1) {
                    Matcher matcher = Patterns.WEB_URL.matcher(spannableStringValueOf);
                    while (matcher.find()) {
                        int iStart = matcher.start();
                        int iEnd = matcher.end();
                        Object[] spans2 = spannableStringValueOf.getSpans(iStart, iEnd, URLSpan.class);
                        spans2.getClass();
                        if (spans2.length == 0) {
                            spannableStringValueOf.setSpan(new URLSpan(matcher.group()), iStart, iEnd, 17);
                        }
                    }
                    int i7 = 0;
                    Object[] spans3 = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class);
                    spans3.getClass();
                    int length2 = spans3.length;
                    int i8 = 0;
                    while (i8 < length2) {
                        URLSpan uRLSpan = (URLSpan) spans3[i8];
                        int spanStart2 = spannableStringValueOf.getSpanStart(uRLSpan);
                        int spanEnd2 = spannableStringValueOf.getSpanEnd(uRLSpan);
                        final String url = uRLSpan.getURL();
                        final mhg mhgVar2 = mhgVar;
                        foe foeVar = new foe(j3, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438);
                        url.getClass();
                        arrayList.add(new le0.b.a(spanStart2, spanEnd2, 8, new rx8.b(url, new rif(foeVar, foeVar, foeVar, foeVar), new tx8() { // from class: add
                            @Override // defpackage.tx8
                            public final void a(rx8 rx8Var) {
                                mhg mhgVar3 = mhgVar2;
                                String str2 = url;
                                rx8Var.getClass();
                                try {
                                    mhgVar3.a(str2);
                                } catch (Exception unused) {
                                }
                            }
                        }), null));
                        i8++;
                        j3 = j;
                        mhgVar = mhgVar2;
                        sb = sb;
                        length2 = length2;
                        i7 = i7;
                    }
                    i2 = i7;
                } else {
                    i2 = 0;
                }
                StringBuilder sb2 = sb;
                String string = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i9 = i2; i9 < size; i9++) {
                    arrayList2.add(((le0.b.a) arrayList.get(i9)).a(sb2.length()));
                }
                objV = new le0(string, arrayList2);
                cVarH.p(objV);
            }
            cVar = cVarH;
            fif.c((le0) objV, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, tjfVar, cVar, (i4 >> 3) & 896, (i4 << 15) & 29360128, 131066);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: bdd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cdd.a(str, z, tjfVar, j, j2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
