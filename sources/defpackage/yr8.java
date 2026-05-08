package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yr8 extends b<wr8> implements ls8 {
    public final f3a a = new f3a();

    public yr8(Function1<? super ls8, j6g> function1) {
        function1.invoke(this);
    }

    @Override // defpackage.ls8
    public final void b(Object obj, ah2 ah2Var) {
        this.a.a(1, new wr8(obj != null ? new yh(obj, 8) : null, new tr(9), new ah2(-857469575, new xr8(ah2Var), true)));
    }

    @Override // defpackage.ls8
    public final void c(int i, Function1 function1, Function1 function12, ah2 ah2Var) {
        this.a.a(i, new wr8(function1, function12, ah2Var));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final f3a f() {
        return this.a;
    }
}
