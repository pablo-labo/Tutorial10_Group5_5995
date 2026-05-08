package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nqh extends ContentObserver {
    public final /* synthetic */ jqh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqh(jqh jqhVar) {
        super(null);
        this.a = jqhVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        jqh jqhVar = this.a;
        synchronized (jqhVar.d) {
            jqhVar.e = null;
            hrh.i.incrementAndGet();
        }
        synchronized (jqhVar) {
            try {
                Iterator it = jqhVar.f.iterator();
                while (it.hasNext()) {
                    ((sqh) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
