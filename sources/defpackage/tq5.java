package defpackage;

import androidx.fragment.app.g;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
public final class tq5 {
    public final e a;
    public final pb3 b;
    public boolean c;
    public boolean d = true;

    public tq5(e eVar, pb3 pb3Var) {
        this.a = eVar;
        this.b = pb3Var;
    }

    public final void a() {
        dqa dqaVarR;
        if (this.c || !this.d) {
            return;
        }
        e eVar = this.a;
        g activity = eVar.getActivity();
        if (activity != null && (dqaVarR = activity.r()) != null) {
            dqaVarR.a(eVar, this.b);
        }
        this.c = true;
    }
}
