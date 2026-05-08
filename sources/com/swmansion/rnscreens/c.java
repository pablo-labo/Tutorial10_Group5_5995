package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import defpackage.tpc;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class c extends tpc {
    public a a;

    public interface a {
        void a(int i, int i2);
    }

    public final a getDelegate$react_native_screens_release() {
        return this.a;
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(i2, i4);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.a = aVar;
    }
}
