package defpackage;

import defpackage.ua5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vx9 extends ina {
    public final sx9 k;
    public String l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public Function2 o;
    public final ArrayList p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx9(sx9 sx9Var, int i) {
        super(null);
        sx9Var = (i & 1) != 0 ? null : sx9Var;
        this.k = sx9Var;
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.p = new ArrayList();
    }

    public final void i(String str) {
        this.l = str;
    }

    public final void j(ua5.a aVar) {
        this.o = aVar;
    }

    public final wx9 k() {
        String str;
        String simpleName = this.l;
        if (simpleName != null) {
            str = simpleName;
        } else {
            sx9 sx9Var = this.k;
            if (sx9Var != null) {
                simpleName = sx9Var.getClass().getSimpleName();
                str = simpleName;
            } else {
                str = null;
            }
        }
        if (str == null) {
            l5.q("Required value was null.");
            return null;
        }
        return new wx9(str, c(), this.m, this.n, this.o, this.p);
    }

    public final ArrayList l() {
        return this.p;
    }

    public final LinkedHashMap m() {
        return this.n;
    }

    public final sx9 n() {
        return this.k;
    }

    public final void o(rqg rqgVar) {
        String str = rqgVar.a;
        LinkedHashMap linkedHashMap = this.m;
        if (str != null) {
            if (linkedHashMap.containsKey(str)) {
                h5.k(l5.m("The module definition defines more than one view with name ", str, "."));
                return;
            }
            linkedHashMap.put(str, rqgVar);
        }
        if (linkedHashMap.containsKey("DEFAULT_MODULE_VIEW")) {
            return;
        }
        linkedHashMap.put("DEFAULT_MODULE_VIEW", rqgVar);
    }

    public vx9(sx9 sx9Var) {
        this(sx9Var, 2);
    }
}
