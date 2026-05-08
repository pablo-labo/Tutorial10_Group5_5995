package defpackage;

import defpackage.ki1;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mi1 {
    @sy3
    public static final boolean a(ki1.b bVar, li1 li1Var) {
        bVar.getClass();
        if (bVar.equals(ki1.f.a)) {
            return true;
        }
        if (bVar.equals(ki1.c.a)) {
            return false;
        }
        return ((Boolean) li1Var.invoke(bVar.a)).booleanValue();
    }

    public static final boolean b(ki1.b bVar, Set set, String str, Set set2) {
        return a(bVar, new li1(set, set2, null, str, 0));
    }

    public static final ki1.b c(String... strArr) {
        return new ki1.b(new a71(ut0.I0(strArr)));
    }
}
