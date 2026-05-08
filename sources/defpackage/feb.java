package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class feb implements nse {
    public final String a;
    public final c00 b;

    public feb(String str, c00 c00Var) {
        str.getClass();
        this.a = str;
        this.b = c00Var;
    }

    @Override // defpackage.nse
    public final String a() {
        return this.a;
    }

    @Override // defpackage.nse
    public final List<String> b() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List c(qqf qqfVar, cse cseVar) {
        r96 r96Var;
        c00 c00Var = this.b;
        List list = (c00Var == null || (r96Var = (r96) c00Var.a) == null) ? null : (List) r96Var.apply(qqfVar);
        return list == null ? zr4.a : list;
    }

    @Override // defpackage.nse
    public final List<rx4> d(rx4 rx4Var) {
        return null;
    }

    @Override // defpackage.nse
    public final List<String> e() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List<String> f() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final List<String> g() {
        if (this.b == null) {
            return zr4.a;
        }
        List<String> listSingletonList = Collections.singletonList("*");
        listSingletonList.getClass();
        return listSingletonList;
    }

    @Override // defpackage.nse
    public final List<String> h() {
        return zr4.a;
    }

    @Override // defpackage.nse
    public final Map i(qqf qqfVar, cse cseVar) {
        return null;
    }

    @Override // defpackage.nse
    public final cse j(rx4 rx4Var, cse cseVar) {
        rx4Var.getClass();
        return null;
    }

    @Override // defpackage.nse
    public final void k(qqf qqfVar) {
    }

    @Override // defpackage.nse
    public final Boolean l(qqf qqfVar, cse cseVar) {
        return null;
    }
}
