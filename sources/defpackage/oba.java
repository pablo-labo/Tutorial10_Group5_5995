package defpackage;

import androidx.navigation.d;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oba implements l74 {
    public final /* synthetic */ ese a;
    public final /* synthetic */ uk2 b;

    public oba(ese eseVar, uk2 uk2Var) {
        this.a = eseVar;
        this.b = uk2Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        Iterator it = ((List) this.a.getValue()).iterator();
        while (it.hasNext()) {
            this.b.b().b((d) it.next());
        }
    }
}
