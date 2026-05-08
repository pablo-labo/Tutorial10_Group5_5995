package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ey9 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public volatile boolean d = false;

    public ey9(ArrayList arrayList, List list) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((ui7) it.next());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            eie eieVar = (eie) it2.next();
            this.b.put(eieVar.getName(), eieVar);
        }
    }

    public final void a() {
        ArrayList arrayList = new ArrayList(this.a.values());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            oyc oycVar = (oyc) ((WeakReference) it.next()).get();
            if (oycVar != null) {
                arrayList.add(oycVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((oyc) it2.next()).g(this);
        }
    }

    public final void b(ui7 ui7Var) {
        Iterator<? extends Class> it = ui7Var.f().iterator();
        while (it.hasNext()) {
            this.a.put(it.next(), ui7Var);
        }
    }
}
