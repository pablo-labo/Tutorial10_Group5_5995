package defpackage;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 {
    public static final BoringLayout.Metrics a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean b(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
