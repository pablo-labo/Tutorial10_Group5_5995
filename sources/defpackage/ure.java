package defpackage;

import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ure implements n0d {
    public final Object a;
    public final Object b;

    public ure() {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public boolean a(r2h r2hVar) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = ((LinkedHashMap) this.b).containsKey(r2hVar);
        }
        return zContainsKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    @Override // defpackage.n0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void accept(java.lang.Object r67, java.lang.Object r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ure.accept(java.lang.Object, java.lang.Object):void");
    }

    public tre b(r2h r2hVar) {
        tre treVar;
        synchronized (this.a) {
            treVar = (tre) ((LinkedHashMap) this.b).remove(r2hVar);
        }
        return treVar;
    }

    public List c(String str) {
        List listZ1;
        str.getClass();
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (wl7.b(((r2h) entry.getKey()).a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.b).remove((r2h) it.next());
                }
                listZ1 = z92.z1(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listZ1;
    }

    public tre d(r2h r2hVar) {
        tre treVar;
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                Object treVar2 = linkedHashMap.get(r2hVar);
                if (treVar2 == null) {
                    treVar2 = new tre(r2hVar);
                    linkedHashMap.put(r2hVar, treVar2);
                }
                treVar = (tre) treVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return treVar;
    }

    public /* synthetic */ ure(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        this.a = currentLocationRequest;
        this.b = cancellationToken;
    }
}
