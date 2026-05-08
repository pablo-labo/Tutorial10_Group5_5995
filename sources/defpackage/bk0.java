package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class bk0 implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ Typeface b;
    public final /* synthetic */ int c;

    public bk0(TextView textView, Typeface typeface, int i) {
        this.a = textView;
        this.b = typeface;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setTypeface(this.b, this.c);
    }
}
