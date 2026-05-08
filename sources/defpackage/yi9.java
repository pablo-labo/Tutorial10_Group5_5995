package defpackage;

import androidx.media3.session.l;
import defpackage.b39;
import defpackage.c2f;
import defpackage.gdb;
import defpackage.lz8;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yi9 implements lz8.a, c2f.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ yi9(Serializable serializable, Object obj) {
        this.a = obj;
        this.b = serializable;
    }

    @Override // c2f.a
    public Object b() {
        ihg ihgVar = (ihg) this.a;
        Iterator it = ((HashMap) this.b).entrySet().iterator();
        while (it.hasNext()) {
            ihgVar.i.s(((Integer) r1.getValue()).intValue(), b39.a.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        l.c cVar = (l.c) this.a;
        Integer num = (Integer) this.b;
        ((gdb.c) obj).X(num.intValue(), cVar.a.s());
    }
}
