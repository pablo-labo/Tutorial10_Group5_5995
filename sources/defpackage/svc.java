package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class svc extends mvc implements nv7 {
    public final mq5 a;

    public svc(mq5 mq5Var) {
        mq5Var.getClass();
        this.a = mq5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof svc) {
            return wl7.b(this.a, ((svc) obj).a);
        }
        return false;
    }

    @Override // defpackage.ku7
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return zr4.a;
    }

    @Override // defpackage.nv7
    public final mq5 h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nv7
    public final void n(Function1 function1) {
    }

    @Override // defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        mq5Var.getClass();
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(svc.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
