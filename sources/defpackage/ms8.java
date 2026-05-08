package defpackage;

import androidx.compose.runtime.p;

/* JADX INFO: loaded from: classes.dex */
public final class ms8 {
    public final c3a a;
    public final c3a b;
    public boolean c;
    public Object d;
    public final dr8 e;

    public ms8(int i, int i2) {
        this.a = p.a(i);
        this.b = p.a(i2);
        this.e = new dr8(i, 30, 100);
    }

    public final void a(int i, int i2) {
        if (i < 0.0f) {
            de7.a("Index should be non-negative (" + i + ')');
        }
        ((dme) this.a).h(i);
        this.e.i(i);
        ((dme) this.b).h(i2);
    }
}
