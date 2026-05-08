package defpackage;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends oie {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public kj0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.oie, defpackage.rrg
    public final void b() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.k0.setVisibility(0);
        if (appCompatDelegateImpl.k0.getParent() instanceof View) {
            View view = (View) appCompatDelegateImpl.k0.getParent();
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(view);
        }
    }

    @Override // defpackage.rrg
    public final void c() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.k0.setAlpha(1.0f);
        appCompatDelegateImpl.n0.d(null);
        appCompatDelegateImpl.n0 = null;
    }
}
