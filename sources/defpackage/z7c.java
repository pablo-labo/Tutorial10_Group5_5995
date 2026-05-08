package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class z7c implements y7c, a8c {
    public final nde a;
    public final nde b;
    public final nde c;
    public final nde d;

    public z7c() {
        eo1 eo1Var = eo1.b;
        this.a = wg2.d(0, 1, eo1Var, 1);
        this.b = wg2.d(0, 1, eo1Var, 1);
        this.c = wg2.d(0, 1, eo1Var, 1);
        this.d = wg2.d(0, 1, eo1Var, 1);
    }

    @Override // defpackage.a8c
    public final void a(gt7 gt7Var, ht7 ht7Var, String str, Function1<? super et7, j6g> function1) {
        this.a.b(new tee(gt7Var, ht7Var, str, function1));
    }

    @Override // defpackage.a8c
    public final void b(gt7 gt7Var, ht7 ht7Var, String str, Function1<? super zs7, j6g> function1) {
        this.b.b(new uee(gt7Var, ht7Var, str, function1));
    }

    @Override // defpackage.a8c
    public final void c(Function1<? super et7, j6g> function1) {
        this.c.b(new q4d(function1));
    }

    @Override // defpackage.y7c
    public final nde d() {
        return this.b;
    }

    @Override // defpackage.y7c
    public final nde e() {
        return this.a;
    }

    @Override // defpackage.y7c
    public final nde f() {
        return this.d;
    }

    @Override // defpackage.a8c
    public final void g(Function1<? super et7, j6g> function1) {
        this.d.b(new m4d(function1));
    }

    @Override // defpackage.y7c
    public final nde h() {
        return this.c;
    }
}
