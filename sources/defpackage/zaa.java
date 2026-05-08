package defpackage;

import defpackage.grg;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzaa;", "Lbrg;", "Llca;", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zaa extends brg implements lca {
    public static final a c = new a();
    public final LinkedHashMap b = new LinkedHashMap();

    public static final class a implements grg.c {
        @Override // grg.c
        public final <T extends brg> T c(Class<T> cls) {
            return new zaa();
        }
    }

    @Override // defpackage.lca
    public final irg a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.b;
        irg irgVar = (irg) linkedHashMap.get(str);
        if (irgVar != null) {
            return irgVar;
        }
        irg irgVar2 = new irg();
        linkedHashMap.put(str, irgVar2);
        return irgVar2;
    }

    @Override // defpackage.brg
    public final void f() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((irg) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
