package defpackage;

import com.facebook.imagepipeline.request.a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cq5 implements g4d {
    public final ArrayList a;

    public cq5(Set<g4d> set) {
        this.a = new ArrayList(set.size());
        for (g4d g4dVar : set) {
            if (g4dVar != null) {
                this.a.add(g4dVar);
            }
        }
    }

    public static void l(Exception exc, String str) {
        s55.g("ForwardingRequestListener", str, exc);
    }

    @Override // defpackage.g4d
    public final void a(a aVar, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).a(aVar, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    @Override // defpackage.g4d
    public final void b(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).b(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    @Override // defpackage.g4d
    public final void c(a aVar, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).c(aVar, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    @Override // defpackage.g4d
    public final boolean d(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((g4d) arrayList.get(i)).d(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g4d
    public final void e(String str, String str2, Map<String, String> map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).e(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.g4d
    public final void f(String str, String str2, Throwable th, Map<String, String> map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).f(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    @Override // defpackage.g4d
    public final void g(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).g(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    @Override // defpackage.g4d
    public final void h(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).h(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.g4d
    public final void i(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).i(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    @Override // defpackage.g4d
    public final void j(a aVar, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).j(aVar, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    @Override // defpackage.g4d
    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g4d) arrayList.get(i)).k(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    public cq5(g4d... g4dVarArr) {
        this.a = new ArrayList(g4dVarArr.length);
        for (g4d g4dVar : g4dVarArr) {
            if (g4dVar != null) {
                this.a.add(g4dVar);
            }
        }
    }
}
