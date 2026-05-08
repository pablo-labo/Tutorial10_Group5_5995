package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class y0e implements PointerInputEventHandler {
    public final /* synthetic */ fm5 a;

    public y0e(fm5 fm5Var) {
        this.a = fm5Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objE = i8f.e(efbVar, new vx0(this.a, 10), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
