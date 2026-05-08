package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ks9 implements k71 {
    public final a a;
    public final n63 b;
    public final HashMap c;

    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j71 a(java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ks9.a.a(java.lang.String):j71");
        }
    }

    public ks9(Context context, n63 n63Var) {
        a aVar = new a(context);
        this.c = new HashMap();
        this.a = aVar;
        this.b = n63Var;
    }

    @Override // defpackage.k71
    public final synchronized zsf a(String str) {
        if (this.c.containsKey(str)) {
            return (zsf) this.c.get(str);
        }
        j71 j71VarA = this.a.a(str);
        if (j71VarA == null) {
            return null;
        }
        n63 n63Var = this.b;
        zsf zsfVarCreate = j71VarA.create(new w21(n63Var.a, n63Var.b, n63Var.c, str));
        this.c.put(str, zsfVarCreate);
        return zsfVarCreate;
    }
}
