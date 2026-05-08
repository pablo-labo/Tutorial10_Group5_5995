package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class cpc {
    public final SpannableStringBuilder a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final CharSequence g;

    public cpc(ikc ikcVar) {
        this.a = new SpannableStringBuilder(ikcVar.getText());
        this.b = ikcVar.getTextSize();
        this.c = ikcVar.getMinLines();
        this.d = ikcVar.getMaxLines();
        this.e = ikcVar.getInputType();
        this.f = ikcVar.getBreakStrategy();
        this.g = ikcVar.getHint();
    }
}
