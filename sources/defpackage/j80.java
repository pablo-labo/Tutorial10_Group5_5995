package defpackage;

import android.graphics.Typeface;
import defpackage.hzf;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j80 implements xu5 {
    public final /* synthetic */ k80 a;

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        k80 k80Var = this.a;
        hzf hzfVarA = k80Var.e.a((pn5) obj, (to5) obj2, ((mo5) obj3).a, ((no5) obj4).a);
        if (hzfVarA instanceof hzf.b) {
            Object obj5 = ((hzf.b) hzfVarA).a;
            obj5.getClass();
            return (Typeface) obj5;
        }
        us1 us1Var = new us1(hzfVarA, k80Var.j);
        k80Var.j = us1Var;
        Object obj6 = us1Var.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
