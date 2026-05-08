package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends lw1 {
    public final /* synthetic */ w2h b;
    public final /* synthetic */ String c;

    public jw1(w2h w2hVar, String str) {
        this.b = w2hVar;
        this.c = str;
    }

    @Override // defpackage.lw1
    public final void b() throws Throwable {
        w2h w2hVar = this.b;
        WorkDatabase workDatabase = w2hVar.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.D().k(this.c).iterator();
            while (it.hasNext()) {
                lw1.a(w2hVar, (String) it.next());
            }
            workDatabase.w();
            workDatabase.s();
            iod.a(w2hVar.b, w2hVar.c, w2hVar.e);
        } catch (Throwable th) {
            workDatabase.s();
            throw th;
        }
    }
}
