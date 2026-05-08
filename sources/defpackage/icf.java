package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class icf extends v1 {
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ v1 c;
    public final /* synthetic */ hcf d;

    public icf(hcf hcfVar, TextPaint textPaint, v1 v1Var) {
        this.d = hcfVar;
        this.b = textPaint;
        this.c = v1Var;
    }

    @Override // defpackage.v1
    public final void k0(int i) {
        this.c.k0(i);
    }

    @Override // defpackage.v1
    public final void l0(Typeface typeface, boolean z) {
        this.d.g(this.b, typeface);
        this.c.l0(typeface, z);
    }
}
