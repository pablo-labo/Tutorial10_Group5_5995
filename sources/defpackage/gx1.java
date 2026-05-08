package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 {
    public static final gx1 g = new gx1(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public gx1(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static gx1 a(CaptioningManager.CaptionStyle captionStyle) {
        return new gx1(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : -1, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : -16777216, captionStyle.hasWindowColor() ? captionStyle.windowColor : 0, captionStyle.hasEdgeType() ? captionStyle.edgeType : 0, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : -1, captionStyle.getTypeface());
    }
}
