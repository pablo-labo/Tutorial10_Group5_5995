package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import defpackage.oua;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cu4 implements Runnable {
    public static final String c = z39.f("EnqueueRunnable");
    public final a2h a;
    public final uua b;

    public cu4(a2h a2hVar) {
        uua uuaVar = new uua();
        this.a = a2hVar;
        this.b = uuaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.a2h r24) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu4.a(a2h):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        uua uuaVar = this.b;
        a2h a2hVar = this.a;
        try {
            a2hVar.getClass();
            w2h w2hVar = a2hVar.b;
            HashSet hashSet = new HashSet();
            hashSet.addAll(a2hVar.f);
            HashSet hashSetS = a2h.S(a2hVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(a2hVar.f);
                    z = false;
                    break;
                } else if (hashSetS.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + a2hVar + ")");
            }
            WorkDatabase workDatabase = w2hVar.c;
            workDatabase.c();
            try {
                boolean zA = a(a2hVar);
                workDatabase.w();
                if (zA) {
                    rya.a(w2hVar.a, RescheduleReceiver.class, true);
                    iod.a(w2hVar.b, w2hVar.c, w2hVar.e);
                }
                uuaVar.a(oua.a);
            } finally {
                workDatabase.s();
            }
        } catch (Throwable th) {
            uuaVar.a(new oua.a.C0382a(th));
        }
    }
}
