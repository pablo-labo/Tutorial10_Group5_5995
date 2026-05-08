package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ite {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            be7.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            be7.a("invalid end value");
        }
        if (i3 < 0) {
            be7.a("invalid maxLines value");
        }
        if (i < 0) {
            be7.a("invalid width value");
        }
        if (i4 < 0) {
            be7.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            fte.a(builderObtain);
        }
        if (i10 >= 33) {
            gte.b(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            hte.a(builderObtain);
        }
        return builderObtain.build();
    }
}
