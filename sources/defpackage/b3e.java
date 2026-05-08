package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class b3e implements PointerInputEventHandler {
    public final /* synthetic */ udf a;

    public b3e(udf udfVar) {
        this.a = udfVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objA = n59.a(efbVar, this.a, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }
}
