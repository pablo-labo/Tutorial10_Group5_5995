package defpackage;

import android.util.Log;
import android.util.Pair;
import defpackage.mhh;
import defpackage.wl0;

/* JADX INFO: loaded from: classes2.dex */
public final class imh extends mhh.a {
    public final /* synthetic */ wl0.a e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imh(mhh mhhVar, wl0.a aVar) {
        super(true);
        this.f = mhhVar;
        this.e = aVar;
    }

    @Override // mhh.a
    public final void a() {
        int i = 0;
        while (true) {
            mhh mhhVar = this.f;
            int size = mhhVar.c.size();
            wl0.a aVar = this.e;
            if (i >= size) {
                mhh.c cVar = new mhh.c(aVar);
                mhhVar.c.add(new Pair(aVar, cVar));
                mhhVar.f.registerOnMeasurementEventListener(cVar);
                return;
            } else {
                if (aVar.equals(((Pair) mhhVar.c.get(i)).first)) {
                    Log.w("FA", "OnEventListener already registered.");
                    return;
                }
                i++;
            }
        }
    }
}
