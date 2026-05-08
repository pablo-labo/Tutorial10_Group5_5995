package defpackage;

import android.os.Bundle;
import defpackage.e47;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vp1 {
    public static qyc a(ru5 ru5Var, List list) {
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            aVar.c(ru5Var.apply(bundle));
        }
        return aVar.f();
    }

    public static <T> ArrayList<Bundle> b(Collection<T> collection, ru5<T, Bundle> ru5Var) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(ru5Var.apply(it.next()));
        }
        return arrayList;
    }
}
