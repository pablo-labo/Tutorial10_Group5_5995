package defpackage;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class sx9 {
    public ohd a;
    public final d2f b = new d2f(new le(this, 11));

    public abstract wx9 a();

    public final gk0 b() {
        ohd ohdVar = this.a;
        gk0 gk0Var = ohdVar != null ? ohdVar.b.get() : null;
        if (gk0Var != null) {
            return gk0Var;
        }
        l5.q("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
        return null;
    }

    public final ohd c() {
        ohd ohdVar = this.a;
        if (ohdVar != null) {
            return ohdVar;
        }
        l5.q("The module wasn't created! You can't access the runtime context.");
        return null;
    }

    public final void d(String str, Bundle bundle) {
        ey4 ey4Var = (ey4) this.b.getValue();
        if (ey4Var != null) {
            ey4Var.a(str, bundle);
        }
    }
}
