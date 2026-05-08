package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class pab implements gze<oab> {
    public final Context a;
    public final m27 b;
    public final qab c;

    public pab(Context context, fc4 fc4Var) {
        cs3 cs3Var;
        q27 q27Var = q27.p;
        web.h(q27Var, "ImagePipelineFactory was not initialized!");
        this.a = context;
        m27 m27VarE = q27Var.e();
        this.b = m27VarE;
        qab qabVar = new qab();
        this.c = qabVar;
        Resources resources = context.getResources();
        synchronized (bs3.class) {
            try {
                if (bs3.a == null) {
                    bs3.a = new cs3();
                }
                cs3Var = bs3.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        fd0 fd0VarA = q27Var.a();
        nb4 nb4VarA = fd0VarA == null ? null : fd0VarA.a();
        pg8 pg8Var = q27Var.b.v.d ? new pg8() : null;
        if (d5g.b == null) {
            d5g.b = new d5g();
        }
        d5g d5gVar = d5g.b;
        rn9<ot1, l82> rn9Var = m27VarE.f;
        hze hzeVar = fc4Var.a;
        qabVar.a = resources;
        qabVar.b = cs3Var;
        qabVar.c = nb4VarA;
        qabVar.d = pg8Var;
        qabVar.e = d5gVar;
        qabVar.f = rn9Var;
        qabVar.g = hzeVar;
    }

    @Override // defpackage.gze
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oab get() {
        return new oab(this.a, this.c, this.b);
    }
}
