package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class uc6 extends v1 {
    public final CharSequence b;
    public final TextPaint c;

    public uc6(CharSequence charSequence, TextPaint textPaint) {
        this.b = charSequence;
        this.c = textPaint;
    }

    @Override // defpackage.v1
    public final int j0(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.v1
    public final int m0(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
