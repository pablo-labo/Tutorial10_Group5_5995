package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bt2 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public final void a(Object obj, String str) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }
}
