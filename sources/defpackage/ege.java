package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ege extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ pw1<j6g> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ege(qw1 qw1Var) {
        super(1);
        this.$cont = qw1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        pw1<j6g> pw1Var = this.$cont;
        j6g j6gVar = j6g.a;
        pw1Var.resumeWith(j6gVar);
        return j6gVar;
    }
}
