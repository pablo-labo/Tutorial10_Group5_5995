package defpackage;

import defpackage.ok0;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pk0 extends lk0<Object, Object> {
    public final /* synthetic */ ik0<Object, Object> a;
    public final /* synthetic */ ok0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jk0<Object, Object> d;

    public pk0(ik0<Object, Object> ik0Var, ok0 ok0Var, String str, jk0<Object, Object> jk0Var) {
        this.a = ik0Var;
        this.b = ok0Var;
        this.c = str;
        this.d = jk0Var;
    }

    @Override // defpackage.lk0
    public final void b(Serializable serializable, kk0 kk0Var) throws Exception {
        serializable.getClass();
        ok0 ok0Var = this.b;
        HashMap map = ok0Var.d;
        String str = this.c;
        Integer num = (Integer) map.get(str);
        ik0<Object, Object> ik0Var = this.a;
        if (num == null) {
            uz.h("Attempting to launch an unregistered ActivityResultLauncher with contract ", ik0Var, " and input ", serializable, ". You must ensure the ActivityResultLauncher is registered before calling launch()");
            return;
        }
        int iIntValue = num.intValue();
        ok0Var.g.put(str, new ok0.a(this.d, kk0Var, ik0Var));
        ok0Var.h.put(str, serializable);
        ok0Var.f.add(str);
        try {
            ok0Var.d(iIntValue, ik0Var, serializable);
        } catch (Exception e) {
            ok0Var.f.remove(str);
            throw e;
        }
    }
}
