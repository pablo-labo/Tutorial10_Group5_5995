package defpackage;

import defpackage.i6b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y5b {
    public final ArrayList<i6b> a = new ArrayList<>(32);

    public final void a() {
        this.a.add(i6b.b.c);
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new i6b.k(f, f2, f3, f4, f5, f6));
    }

    public final void c(float f) {
        this.a.add(new i6b.l(f));
    }

    public final void d(float f, float f2) {
        this.a.add(new i6b.e(f, f2));
    }

    public final void e(float f, float f2) {
        this.a.add(new i6b.m(f, f2));
    }

    public final void f(float f, float f2) {
        this.a.add(new i6b.f(f, f2));
    }

    public final void g(float f, float f2, float f3, float f4) {
        this.a.add(new i6b.p(f, f2, f3, f4));
    }
}
