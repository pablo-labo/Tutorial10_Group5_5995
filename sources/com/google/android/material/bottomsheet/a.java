package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.b;
import defpackage.rzg;
import defpackage.tpa;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements tpa {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        b bVar = this.a;
        b.C0150b c0150b = bVar.c0;
        if (c0150b != null) {
            bVar.f.B(c0150b);
        }
        b.C0150b c0150b2 = new b.C0150b(bVar.X, rzgVar);
        bVar.c0 = c0150b2;
        bVar.f.s(c0150b2);
        return rzgVar;
    }
}
