package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gqf implements uxf {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gqf(mp8 mp8Var, cj3 cj3Var, qw7 qw7Var, int i) {
        mp8Var.getClass();
        qw7Var.getClass();
        this.b = mp8Var;
        this.c = cj3Var;
        this.a = i;
        ArrayList typeParameters = qw7Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = ((mp8) this.b).a.a.d(new l4(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxf
    public rxf a(pw7 pw7Var) {
        pw7Var.getClass();
        wp8 wp8Var = (wp8) ((on9) this.e).invoke(pw7Var);
        return wp8Var != null ? wp8Var : ((mp8) this.b).b.a(pw7Var);
    }

    public boolean b(gqf gqfVar, int i) {
        return gqfVar != null && Objects.equals(((w1d[]) this.b)[i], ((w1d[]) gqfVar.b)[i]) && Objects.equals(((p35[]) this.c)[i], ((p35[]) gqfVar.c)[i]);
    }

    public boolean c(int i) {
        return ((w1d[]) this.b)[i] != null;
    }

    public gqf(w1d[] w1dVarArr, p35[] p35VarArr, wqf wqfVar, Object obj) {
        ka2.l(w1dVarArr.length == p35VarArr.length);
        this.b = w1dVarArr;
        this.c = (p35[]) p35VarArr.clone();
        this.d = wqfVar;
        this.e = obj;
        this.a = w1dVarArr.length;
    }
}
