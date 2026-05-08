package defpackage;

import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.i0;

/* JADX INFO: loaded from: classes.dex */
public final class vtc implements utc {
    public final String a;
    public final i0 b = new i0(null);
    public final e c = new e(null);
    public final i0 d = new i0(null);
    public final e e = new e(null);

    public vtc(String str) {
        this.a = str;
    }

    @Override // defpackage.utc
    public final i0 a() {
        return this.b;
    }

    @Override // defpackage.utc
    public final e b() {
        return this.c;
    }

    @Override // defpackage.utc
    public final e c() {
        return this.e;
    }

    @Override // defpackage.utc
    public final i0 d() {
        return this.d;
    }

    public final String toString() {
        return ja.f(')', "RectRulers(", this.a);
    }
}
