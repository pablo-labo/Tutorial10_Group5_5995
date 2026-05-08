package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.b7f;
import defpackage.bk1;
import defpackage.dmc;
import defpackage.f7f;
import defpackage.r20;
import defpackage.s7f;
import defpackage.v7f;
import defpackage.w7f;
import defpackage.z92;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements f.a {
    public final /* synthetic */ bk1 a;

    public a(bk1 bk1Var) {
        this.a = bk1Var;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean l(f fVar, MenuItem menuItem) {
        String tabKey;
        b7f b7fVar;
        NavigationBarView.b bVar = this.a.f;
        if (bVar == null) {
            return false;
        }
        s7f s7fVar = (s7f) ((r20) bVar).b;
        menuItem.getClass();
        menuItem.toString();
        f7f f7fVar = (f7f) z92.R0(menuItem.getItemId(), s7fVar.W);
        if (f7fVar == null || (b7fVar = f7fVar.a) == null || (tabKey = b7fVar.getTabKey()) == null) {
            tabKey = "undefined";
        }
        v7f eventEmitter$react_native_screens_release = s7fVar.getEventEmitter$react_native_screens_release();
        eventEmitter$react_native_screens_release.getClass();
        eventEmitter$react_native_screens_release.c.a(new w7f(dmc.g(eventEmitter$react_native_screens_release.a), eventEmitter$react_native_screens_release.b, tabKey));
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void q(f fVar) {
    }
}
