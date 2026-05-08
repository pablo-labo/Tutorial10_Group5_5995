package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.s8h;
import defpackage.u7h;
import defpackage.y7h;

/* JADX INFO: loaded from: classes2.dex */
public final class al implements u7h {
    private final y7h a;
    private final y7h b;
    private final y7h c;

    public al(y7h y7hVar, y7h y7hVar2, y7h y7hVar3, y7h y7hVar4) {
        this.a = y7hVar;
        this.b = y7hVar2;
        this.c = y7hVar3;
    }

    @Override // defpackage.y7h
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.a.a(), (s8h) this.b.a(), ((au) this.c).a(), new i());
    }
}
