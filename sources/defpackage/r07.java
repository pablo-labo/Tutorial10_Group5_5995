package defpackage;

import android.graphics.Bitmap;
import defpackage.wna;

/* JADX INFO: loaded from: classes2.dex */
public final class r07 {
    public static final r07 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    static {
        s07 s07Var = new s07();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        s07Var.a = config;
        s07Var.b = config;
        c = new r07(s07Var);
    }

    public r07(s07 s07Var) {
        this.a = s07Var.a;
        this.b = s07Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r07.class != obj.getClass()) {
            return false;
        }
        r07 r07Var = (r07) obj;
        return this.a == r07Var.a && this.b == r07Var.b;
    }

    public final int hashCode() {
        int iOrdinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        wna.a aVarB = wna.b(this);
        aVarB.b(String.valueOf(100), "minDecodeIntervalMs");
        aVarB.b(String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        aVarB.a("decodePreviewFrame", false);
        aVarB.a("useLastFrameForPreview", false);
        aVarB.a("useEncodedImageForPreview", false);
        aVarB.a("decodeAllFrames", false);
        aVarB.a("forceStaticImage", false);
        aVarB.b(this.a.name(), "bitmapConfigName");
        aVarB.b(this.b.name(), "animatedBitmapConfigName");
        aVarB.b(null, "customImageDecoder");
        aVarB.b(null, "bitmapTransformation");
        aVarB.b(null, "colorSpace");
        return l6.i(sb, aVarB.toString(), "}");
    }
}
