package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class ek5 implements wi5<Object> {
    public final /* synthetic */ luc a;

    public ek5(luc lucVar) {
        this.a = lucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wi5
    public final Object a(Object obj, lu2<? super j6g> lu2Var) {
        this.a.element = obj;
        throw new AbortFlowException(this);
    }
}
