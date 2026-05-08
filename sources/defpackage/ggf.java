package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ggf implements nsd {
    public final /* synthetic */ nsd a;
    public final az3 b;
    public final az3 c;

    public ggf(nsd nsdVar, igf igfVar) {
        this.a = nsdVar;
        this.b = r.c(new i30(igfVar, 17));
        this.c = r.c(new j30(igfVar, 19));
    }

    @Override // defpackage.nsd
    public final Object a(n4a n4aVar, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        return this.a.a(n4aVar, function2, lu2Var);
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.nsd
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final float e(float f) {
        return this.a.e(f);
    }
}
