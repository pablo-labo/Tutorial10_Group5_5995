package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class tcf {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public tcf(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcf)) {
            return false;
        }
        tcf tcfVar = (tcf) obj;
        return wl7.b(this.a, tcfVar.a) && kjf.b(this.b, tcfVar.b) && wl7.b(this.c, tcfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = kjf.c;
        return this.c.hashCode() + ia.d(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) kjf.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
