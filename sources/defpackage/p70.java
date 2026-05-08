package defpackage;

import android.graphics.Typeface;
import defpackage.g6d;

/* JADX INFO: loaded from: classes.dex */
public final class p70 extends g6d.c {
    public final /* synthetic */ qw1 a;
    public final /* synthetic */ s5d b;

    public p70(qw1 qw1Var, s5d s5dVar) {
        this.a = qw1Var;
        this.b = s5dVar;
    }

    @Override // g6d.c
    public final void b(int i) {
        this.a.g(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // g6d.c
    public final void c(Typeface typeface) {
        this.a.resumeWith(typeface);
    }
}
