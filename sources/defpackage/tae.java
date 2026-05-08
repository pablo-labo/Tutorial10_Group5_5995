package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class tae {
    public final int a;
    public final int b;
    public final moc c;

    public tae(int i, int i2, moc mocVar) {
        mocVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = mocVar;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        if (i < 0) {
            r6.g("Check failed.");
            return;
        }
        int i2 = this.a;
        int i3 = i2 == 0 ? 18 : 34;
        int i4 = 255 - i;
        if (i4 < 0) {
            s55.n("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        spannableStringBuilder.setSpan(this.c, i2, this.b, ((Math.max(i4, 0) << 16) & 16711680) | (i3 & (-16711681)));
    }
}
