package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zh7 implements kwf {
    public final Set<ui8> a;
    public final d2f b;

    public zh7(Set set) {
        gwf.b.getClass();
        gwf gwfVar = gwf.c;
        gwfVar.getClass();
        yi8.d(lx4.a(xw4.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), gwfVar, this, zr4.a, false);
        this.b = new d2f(new fog(this));
        this.a = set;
    }

    @Override // defpackage.kwf
    public final Collection<ui8> b() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.kwf
    public final v62 d() {
        return null;
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        return zr4.a;
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        throw null;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + z92.W0(this.a, ",", null, null, x32.d, 30) + ']');
    }
}
