package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfFour;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class dp4<FirstType, SecondType, ThirdType, FourthType> extends kka<EitherOfFour<FirstType, SecondType, ThirdType, FourthType>> {
    public final zf8 a;
    public final zf8 b;
    public final zf8 c;
    public final zf8 d;
    public final owf<?> e;
    public final owf<?> f;
    public final owf<?> g;
    public final owf<?> h;
    public final ExpectedType i;
    public final ExpectedType j;
    public final ExpectedType k;
    public final ExpectedType l;

    public dp4(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        gg8 gg8Var = (gg8) z92.R0(0, zf8Var.g());
        zf8 zf8Var2 = gg8Var != null ? gg8Var.b : null;
        if (zf8Var2 == null) {
            l5.q("Required value was null.");
            throw null;
        }
        this.a = zf8Var2;
        gg8 gg8Var2 = (gg8) z92.R0(1, zf8Var.g());
        zf8 zf8Var3 = gg8Var2 != null ? gg8Var2.b : null;
        if (zf8Var3 == null) {
            l5.q("Required value was null.");
            throw null;
        }
        this.b = zf8Var3;
        gg8 gg8Var3 = (gg8) z92.R0(2, zf8Var.g());
        zf8 zf8Var4 = gg8Var3 != null ? gg8Var3.b : null;
        if (zf8Var4 == null) {
            l5.q("Required value was null.");
            throw null;
        }
        this.c = zf8Var4;
        gg8 gg8Var4 = (gg8) z92.R0(3, zf8Var.g());
        zf8 zf8Var5 = gg8Var4 != null ? gg8Var4.b : null;
        if (zf8Var5 == null) {
            l5.q("Required value was null.");
            throw null;
        }
        this.d = zf8Var5;
        owf<?> owfVarA = fxfVar.a(zf8Var2);
        this.e = owfVarA;
        owf<?> owfVarA2 = fxfVar.a(zf8Var3);
        this.f = owfVarA2;
        owf<?> owfVarA3 = fxfVar.a(zf8Var4);
        this.g = owfVarA3;
        owf<?> owfVarA4 = fxfVar.a(zf8Var5);
        this.h = owfVarA4;
        this.i = owfVarA.c();
        this.j = owfVarA2.c();
        this.k = owfVarA3.c();
        this.l = owfVarA4.c();
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return ExpectedType.a.b(this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) {
        zf8 zf8Var = this.a;
        zf8 zf8Var2 = this.b;
        zf8 zf8Var3 = this.c;
        zf8 zf8Var4 = this.d;
        return new EitherOfFour(obj, new ArrayList(u63.h(obj, gk0Var, u63.a0(new Pair(this.i, this.e), new Pair(this.j, this.f), new Pair(this.k, this.g), new Pair(this.l, this.h)), u63.a0(zf8Var, zf8Var2, zf8Var3, zf8Var4))), u63.a0(zf8Var, zf8Var2, zf8Var3, zf8Var4));
    }
}
