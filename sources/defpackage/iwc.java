package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class iwc {
    public ve8 a(pv5 pv5Var) {
        return pv5Var;
    }

    public yd8 b(Class cls) {
        return new h62(cls);
    }

    public re8 c(Class cls) {
        return new vya(cls);
    }

    public ef8 d(t3a t3aVar) {
        return t3aVar;
    }

    public gf8 e(v3a v3aVar) {
        return v3aVar;
    }

    public rf8 f(i4c i4cVar) {
        return i4cVar;
    }

    public tf8 g(k4c k4cVar) {
        return k4cVar;
    }

    public vf8 h(m4c m4cVar) {
        return m4cVar;
    }

    public String i(fv5 fv5Var) {
        String string = fv5Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(mj8 mj8Var) {
        return i(mj8Var);
    }

    public zf8 k(yd8 yd8Var, List list, boolean z) {
        return new zxf(yd8Var, list, z);
    }
}
