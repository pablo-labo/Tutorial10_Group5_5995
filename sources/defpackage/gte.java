package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class gte {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
