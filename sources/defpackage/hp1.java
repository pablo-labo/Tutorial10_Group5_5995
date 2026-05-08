package defpackage;

import defpackage.jp1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hp1 implements fp1 {
    public final lp1 b = new lp1();

    @Override // defpackage.fp1
    public final oya a(j29 j29Var, xx9 xx9Var, Iterable iterable, mbb mbbVar, jz jzVar, boolean z) {
        xx9Var.getClass();
        iterable.getClass();
        mbbVar.getClass();
        jzVar.getClass();
        Set<mq5> set = ere.r;
        gp1 gp1Var = new gp1(1, this.b, lp1.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (mq5 mq5Var : set) {
            cp1.m.getClass();
            InputStream inputStream = (InputStream) gp1Var.invoke(cp1.a(mq5Var));
            jp1 jp1VarA = inputStream != null ? jp1.a.a(mq5Var, j29Var, xx9Var, inputStream) : null;
            if (jp1VarA != null) {
                arrayList.add(jp1VarA);
            }
        }
        oya oyaVar = new oya(arrayList);
        cla claVar = new cla(j29Var, xx9Var);
        hzh hzhVar = new hzh(oyaVar);
        cp1 cp1Var = cp1.m;
        g04 g04Var = new g04(j29Var, xx9Var, hzhVar, new se0(xx9Var, claVar, cp1Var), oyaVar, iterable, claVar, jzVar, mbbVar, cp1Var.a, null, new jh2(j29Var), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((jp1) it.next()).L0(g04Var);
        }
        return oyaVar;
    }
}
