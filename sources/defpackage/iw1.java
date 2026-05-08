package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class iw1 extends lw1 {
    public final /* synthetic */ w2h b;
    public final /* synthetic */ UUID c;

    public iw1(w2h w2hVar, UUID uuid) {
        this.b = w2hVar;
        this.c = uuid;
    }

    @Override // defpackage.lw1
    public final void b() throws Throwable {
        w2h w2hVar = this.b;
        WorkDatabase workDatabase = w2hVar.c;
        workDatabase.c();
        try {
            lw1.a(w2hVar, this.c.toString());
            workDatabase.w();
            workDatabase.s();
            iod.a(w2hVar.b, w2hVar.c, w2hVar.e);
        } catch (Throwable th) {
            workDatabase.s();
            throw th;
        }
    }
}
