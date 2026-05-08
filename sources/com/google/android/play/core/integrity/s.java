package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.ja;
import defpackage.md2;
import defpackage.t7h;
import defpackage.x7h;

/* JADX INFO: loaded from: classes2.dex */
final class s {
    private final x7h a;
    private final x7h b;
    private final x7h c;
    private final x7h d;
    private final x7h e;

    public s(Context context, r rVar) {
        if (context == null) {
            ja.k("instance cannot be null");
            throw null;
        }
        md2 md2Var = new md2(context);
        this.a = md2Var;
        t7h t7hVarB = t7h.b(ac.a);
        this.b = t7hVarB;
        au auVar = new au(md2Var, l.a);
        this.c = auVar;
        t7h t7hVarB2 = t7h.b(new al(md2Var, t7hVarB, auVar, l.a));
        this.d = t7hVarB2;
        this.e = t7h.b(new ab(t7hVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
