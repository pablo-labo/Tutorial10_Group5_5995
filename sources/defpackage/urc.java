package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class urc implements axe, ml1 {
    public final ml1 a;
    public final kv0 b;
    public final c20 c;
    public final ft2 d;

    public urc(ml1 ml1Var, kv0 kv0Var, c20 c20Var, ft2 ft2Var) {
        this.a = ml1Var;
        this.b = kv0Var;
        this.c = c20Var;
        this.d = ft2Var;
    }

    @Override // defpackage.axe
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.axe
    public final kv0 b() {
        return this.b;
    }

    @Override // defpackage.axe
    public final ft2 d() {
        return this.d;
    }

    @Override // defpackage.axe
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof urc) {
            urc urcVar = (urc) obj;
            if (wl7.b(this.a, urcVar.a) && this.b == urcVar.b && wl7.b(this.c, urcVar.c) && wl7.b(this.d, urcVar.d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.axe
    public final ga2 g() {
        return null;
    }

    @Override // defpackage.axe
    public final String getContentDescription() {
        return null;
    }

    @Override // defpackage.ml1
    public final e h(e eVar, af1 af1Var) {
        return this.a.h(eVar, af1Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k6.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 1.0f, 961);
    }

    @Override // defpackage.axe
    public final c20 i() {
        return this.c;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=null, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
