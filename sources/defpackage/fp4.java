package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Either;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class fp4<FirstType, SecondType> extends kka<Either<FirstType, SecondType>> {
    public final zf8 a;
    public final zf8 b;
    public final owf<?> c;
    public final owf<?> d;
    public final ExpectedType e;
    public final ExpectedType f;

    public fp4(fxf fxfVar, zf8 zf8Var) {
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
        owf<?> owfVarA = fxfVar.a(zf8Var2);
        this.c = owfVarA;
        owf<?> owfVarA2 = fxfVar.a(zf8Var3);
        this.d = owfVarA2;
        this.e = owfVarA.c();
        this.f = owfVarA2.c();
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return ExpectedType.a.b(this.e, this.f);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) {
        List listA0 = u63.a0(this.a, this.b);
        return new Either(obj, new ArrayList(u63.h(obj, gk0Var, u63.a0(new Pair(this.e, this.c), new Pair(this.f, this.d)), listA0)), listA0);
    }
}
