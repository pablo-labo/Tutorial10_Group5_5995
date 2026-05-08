package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.ja;
import defpackage.md2;
import defpackage.t7h;
import defpackage.x7h;

/* JADX INFO: loaded from: classes2.dex */
final class w implements aw {
    private final x7h a;
    private final x7h b;
    private final x7h c;
    private final x7h d;
    private final x7h e;
    private final x7h f;

    public w(Context context, v vVar) {
        if (context == null) {
            ja.k("instance cannot be null");
            throw null;
        }
        md2 md2Var = new md2(context);
        this.a = md2Var;
        t7h t7hVarB = t7h.b(bb.a);
        this.b = t7hVarB;
        au auVar = new au(md2Var, n.a);
        this.c = auVar;
        t7h t7hVarB2 = t7h.b(new bp(md2Var, t7hVarB, auVar, n.a));
        this.d = t7hVarB2;
        t7h t7hVarB3 = t7h.b(new bu(t7hVarB2));
        this.e = t7hVarB3;
        this.f = t7h.b(new ba(t7hVarB2, t7hVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
