package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.r6;

/* JADX INFO: loaded from: classes2.dex */
final class u implements av {
    private Context a;

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        Context context = this.a;
        if (context != null) {
            return new w(context, null);
        }
        r6.g(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private u() {
        throw null;
    }
}
