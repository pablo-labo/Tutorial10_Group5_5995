package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class jpc implements moc {
    public final TextPaint a;

    public jpc(TextPaint textPaint) {
        this.a = textPaint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpc) && this.a.equals(((jpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReactTextPaintHolderSpan(textPaint=" + this.a + ")";
    }
}
