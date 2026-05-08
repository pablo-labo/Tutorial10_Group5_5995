package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rkf {
    public static final ux0 a = new ux0("NO_THREAD_ELEMENTS", 4);
    public static final fn0 b;
    public static final ih2 c;
    public static final mj2 d;

    static {
        int i = 15;
        byte b2 = 0;
        b = new fn0(i, b2);
        c = new ih2(i);
        d = new mj2(14, b2);
    }

    public static final void a(v03 v03Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof blf)) {
            Object objJ1 = v03Var.j1(null, c);
            objJ1.getClass();
            ((qkf) objJ1).k0(obj);
            return;
        }
        blf blfVar = (blf) obj;
        qkf<Object>[] qkfVarArr = blfVar.c;
        int length = qkfVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            qkf<Object> qkfVar = qkfVarArr[length];
            qkfVar.getClass();
            qkfVar.k0(blfVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(v03 v03Var) {
        Object objJ1 = v03Var.j1(0, b);
        objJ1.getClass();
        return objJ1;
    }

    public static final Object c(v03 v03Var, Object obj) {
        if (obj == null) {
            obj = b(v03Var);
        }
        return obj == 0 ? a : obj instanceof Integer ? v03Var.j1(new blf(((Number) obj).intValue(), v03Var), d) : ((qkf) obj).P0();
    }
}
