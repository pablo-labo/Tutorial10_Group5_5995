package defpackage;

import androidx.work.impl.WorkDatabase;
import defpackage.oua;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class lw1 implements Runnable {
    public final uua a = new uua();

    public static void a(w2h w2hVar, String str) {
        t4h t4hVar;
        boolean z;
        WorkDatabase workDatabase = w2hVar.c;
        s3h s3hVarD = workDatabase.D();
        oy3 oy3VarY = workDatabase.y();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s2h s2hVarH = s3hVarD.h(str2);
            if (s2hVarH != s2h.c && s2hVarH != s2h.d) {
                s3hVarD.e(s2h.f, str2);
            }
            linkedList.addAll(oy3VarY.b(str2));
        }
        kob kobVar = w2hVar.f;
        synchronized (kobVar.a0) {
            try {
                z39.d().a(kob.b0, "Processor cancelling " + str);
                kobVar.Y.add(str);
                t4hVar = (t4h) kobVar.f.remove(str);
                z = t4hVar != null;
                if (t4hVar == null) {
                    t4hVar = (t4h) kobVar.V.remove(str);
                }
                if (t4hVar != null) {
                    kobVar.W.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kob.c(t4hVar, str);
        if (z) {
            kobVar.i();
        }
        Iterator<god> it = w2hVar.e.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        uua uuaVar = this.a;
        try {
            b();
            uuaVar.a(oua.a);
        } catch (Throwable th) {
            uuaVar.a(new oua.a.C0382a(th));
        }
    }
}
