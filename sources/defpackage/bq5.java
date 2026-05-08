package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bq5 implements h4d {
    public final ArrayList a;

    public bq5(Set<? extends h4d> set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.tpb
    public final void a(ppb ppbVar, String str, Map<String, String> map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).a(ppbVar, str, map);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.tpb
    public final void b(ppb ppbVar) {
        ppbVar.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).b(ppbVar);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // defpackage.tpb
    public final void c(ppb ppbVar, String str, boolean z) {
        ppbVar.getClass();
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).c(ppbVar, str, z);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.h4d
    public final void d(ppb ppbVar, Throwable th) {
        ppbVar.getClass();
        th.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).d(ppbVar, th);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // defpackage.h4d
    public final void e(ppb ppbVar) {
        ppbVar.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).e(ppbVar);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // defpackage.tpb
    public final void f(ppb ppbVar, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).f(ppbVar, str);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // defpackage.h4d
    public final void g(gbe gbeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).g(gbeVar);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // defpackage.tpb
    public final void h(ppb ppbVar, String str, Throwable th, Map<String, String> map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).h(ppbVar, str, th, map);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // defpackage.h4d
    public final void i(ppb ppbVar) {
        ppbVar.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).i(ppbVar);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // defpackage.tpb
    public final boolean j(ppb ppbVar, String str) {
        ppbVar.getClass();
        str.getClass();
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((h4d) it.next()).j(ppbVar, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tpb
    public final void k(ppb ppbVar, String str) {
        ppbVar.getClass();
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((h4d) it.next()).k(ppbVar, str);
            } catch (Exception e) {
                s55.g("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }
}
