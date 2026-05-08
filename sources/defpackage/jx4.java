package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jx4 implements kwf {
    public final kx4 a;
    public final String[] b;
    public final String c;

    public jx4(kx4 kx4Var, String... strArr) {
        kx4Var.getClass();
        this.a = kx4Var;
        this.b = strArr;
        String strA = mw4.ERROR_TYPE.a();
        String strA2 = kx4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format(strA, Arrays.copyOf(new Object[]{String.format(strA2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.kwf
    public final Collection<ui8> b() {
        return zr4.a;
    }

    @Override // defpackage.kwf
    public final v62 d() {
        lx4.a.getClass();
        return lx4.c;
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
        return (vl3) vl3.f.getValue();
    }

    public final String toString() {
        return this.c;
    }
}
