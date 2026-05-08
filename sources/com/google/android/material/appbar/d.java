package com.google.android.material.appbar;

import android.view.View;
import defpackage.v6;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements v6 {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public d(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.v6
    public final boolean a(View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}
