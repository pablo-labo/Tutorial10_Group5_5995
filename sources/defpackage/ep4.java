package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfThree;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ep4<FirstType, SecondType, ThirdType> extends kka<EitherOfThree<FirstType, SecondType, ThirdType>> {
    public final zf8 a;
    public final zf8 b;
    public final zf8 c;
    public final owf<?> d;
    public final owf<?> e;
    public final owf<?> f;
    public final ExpectedType g;
    public final ExpectedType h;
    public final ExpectedType i;

    public ep4(fxf fxfVar, zf8 zf8Var) {
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
        owf<?> owfVarA = fxfVar.a(zf8Var2);
        this.d = owfVarA;
        owf<?> owfVarA2 = fxfVar.a(zf8Var3);
        this.e = owfVarA2;
        owf<?> owfVarA3 = fxfVar.a(zf8Var4);
        this.f = owfVarA3;
        this.g = owfVarA.c();
        this.h = owfVarA2.c();
        this.i = owfVarA3.c();
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return ExpectedType.a.b(this.g, this.h, this.i);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) {
        List listA0 = u63.a0(this.a, this.b, this.c);
        return new EitherOfThree(obj, new ArrayList(u63.h(obj, gk0Var, u63.a0(new Pair(this.g, this.d), new Pair(this.h, this.e), new Pair(this.i, this.f)), listA0)), listA0);
    }
}
