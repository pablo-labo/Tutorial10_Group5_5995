package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aj7 {
    public final r59<yeb> a;
    public final x7 b;
    public boolean c;

    public aj7(r59<yeb> r59Var, x7 x7Var) {
        this.a = r59Var;
        this.b = x7Var;
    }

    public final boolean a(long j) {
        Object obj;
        List list = (List) this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (web.m(((afb) obj).a, j)) {
                break;
            }
            i++;
        }
        afb afbVar = (afb) obj;
        if (afbVar != null) {
            return afbVar.h;
        }
        return false;
    }
}
