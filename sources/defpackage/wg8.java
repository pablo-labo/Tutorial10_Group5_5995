package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wg8 implements xg8 {
    public final hne a;
    public yg8 b;
    public fm5 c;

    public wg8(hne hneVar) {
        this.a = hneVar;
    }

    public final yg8 a() {
        yg8 yg8Var = this.b;
        if (yg8Var != null) {
            return yg8Var;
        }
        wl7.g("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        Function1<xg8, j6g> function1;
        hne hneVar;
        if (i == 7) {
            function1 = a().a;
        } else if (i == 2) {
            function1 = a().b;
        } else if (i == 6) {
            function1 = a().c;
        } else if (i == 5) {
            function1 = a().d;
        } else if (i == 3) {
            function1 = a().e;
        } else if (i == 4) {
            function1 = a().f;
        } else {
            if (i != 1 && i != 0) {
                r6.g("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            fm5 fm5Var = this.c;
            if (fm5Var != null) {
                fm5Var.c(1);
                return true;
            }
            wl7.g("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (hneVar = this.a) == null) {
                return false;
            }
            hneVar.c();
            return true;
        }
        fm5 fm5Var2 = this.c;
        if (fm5Var2 != null) {
            fm5Var2.c(2);
            return true;
        }
        wl7.g("focusManager");
        throw null;
    }
}
