package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.r6;

/* JADX INFO: loaded from: classes2.dex */
final class q implements x {
    private Context a;

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        Context context = this.a;
        if (context != null) {
            return new s(context, null);
        }
        r6.g(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private q() {
        throw null;
    }
}
