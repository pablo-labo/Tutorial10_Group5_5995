package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li71;", "Lbrg;", "Lqkd;", "handle", "<init>", "(Lqkd;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i71 extends brg {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final UUID c;
    public WeakReference<ekd> d;

    public i71(qkd qkdVar) {
        Object value;
        qkdVar.getClass();
        ukd ukdVar = qkdVar.b;
        LinkedHashMap linkedHashMap = ukdVar.a;
        LinkedHashMap linkedHashMap2 = ukdVar.d;
        try {
            h4a h4aVar = (h4a) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (h4aVar == null || (value = h4aVar.getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ukdVar.c.remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        UUID uuidRandomUUID = (UUID) value;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            String str = this.b;
            str.getClass();
            if (uuidRandomUUID != null) {
                ArrayList arrayList = vkd.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(uuidRandomUUID)) {
                        }
                    }
                }
                o6.m("Can't put value with type ", uuidRandomUUID.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = vkd.a;
            Object obj = qkdVar.a.get(str);
            g3a g3aVar = obj instanceof g3a ? (g3a) obj : null;
            if (g3aVar != null) {
                g3aVar.j(uuidRandomUUID);
            }
            ukdVar.a(uuidRandomUUID, str);
        }
        this.c = uuidRandomUUID;
    }

    @Override // defpackage.brg
    public final void f() {
        WeakReference<ekd> weakReference = this.d;
        if (weakReference == null) {
            wl7.g("saveableStateHolderRef");
            throw null;
        }
        ekd ekdVar = weakReference.get();
        if (ekdVar != null) {
            ekdVar.c(this.c);
        }
        WeakReference<ekd> weakReference2 = this.d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            wl7.g("saveableStateHolderRef");
            throw null;
        }
    }
}
