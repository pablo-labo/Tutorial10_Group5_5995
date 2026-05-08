package defpackage;

import defpackage.e69;
import defpackage.fe9;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xae implements ee9<fe9.a> {
    public static final pxc a = new pxc("^ {0,3}(-+|=+) *$");

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        CharSequence charSequenceB;
        Object next;
        aVar2.getClass();
        Iterator<T> it = aVar2.c.iterator();
        while (true) {
            charSequenceB = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ce9) next) instanceof k3b) {
                break;
            }
        }
        k3b k3bVar = (k3b) next;
        zr4 zr4Var = zr4.a;
        if (k3bVar != null) {
            return zr4Var;
        }
        gd9 gd9Var = aVar2.a;
        if (!wl7.b(aVar2.b, gd9Var)) {
            return zr4Var;
        }
        gd9Var.getClass();
        if (aVar.b != hd9.d(gd9Var, aVar.d)) {
            return zr4Var;
        }
        int i = aVar.a + 1;
        List<String> list = e69.this.b;
        String str = i < list.size() ? list.get(i) : null;
        if (str != null) {
            tc2 tc2VarH = gd9Var.h(aVar.d());
            if (hd9.c(tc2VarH, gd9Var)) {
                charSequenceB = hd9.b(tc2VarH, str);
            }
        }
        return (charSequenceB == null || !a.d(charSequenceB)) ? zr4Var : u63.Z(new wae(gd9Var, xpbVar));
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return false;
    }
}
