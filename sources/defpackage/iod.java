package defpackage;

import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iod {
    public static final String a = z39.f("Schedulers");

    public static void a(a aVar, WorkDatabase workDatabase, List<god> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        s3h s3hVarD = workDatabase.D();
        workDatabase.c();
        try {
            ArrayList arrayListP = s3hVarD.p(aVar.h);
            ArrayList arrayListN = s3hVarD.n();
            if (arrayListP.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListP.iterator();
                while (it.hasNext()) {
                    s3hVarD.c(jCurrentTimeMillis, ((r3h) it.next()).a);
                }
            }
            workDatabase.w();
            workDatabase.s();
            if (arrayListP.size() > 0) {
                r3h[] r3hVarArr = (r3h[]) arrayListP.toArray(new r3h[arrayListP.size()]);
                for (god godVar : list) {
                    if (godVar.e()) {
                        godVar.d(r3hVarArr);
                    }
                }
            }
            if (arrayListN.size() > 0) {
                r3h[] r3hVarArr2 = (r3h[]) arrayListN.toArray(new r3h[arrayListN.size()]);
                for (god godVar2 : list) {
                    if (!godVar2.e()) {
                        godVar2.d(r3hVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.s();
            throw th;
        }
    }
}
