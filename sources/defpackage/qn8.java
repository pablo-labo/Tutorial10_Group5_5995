package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qn8 extends b<pn8> implements ko8 {
    public static final kh2 c = new kh2(9);
    public final no8 a = new no8(this);
    public final f3a b = new f3a();

    public qn8(Function1<? super ko8, j6g> function1) {
        function1.invoke(this);
    }

    @Override // defpackage.ko8
    public final void a(int i, k4f k4fVar, ah2 ah2Var) {
        this.b.a(i, new pn8(c, k4fVar, ah2Var));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final f3a f() {
        return this.b;
    }
}
