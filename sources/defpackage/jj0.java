package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public class a extends oie {
        public a() {
        }

        @Override // defpackage.oie, defpackage.rrg
        public final void b() {
            jj0.this.a.k0.setVisibility(0);
        }

        @Override // defpackage.rrg
        public final void c() {
            AppCompatDelegateImpl appCompatDelegateImpl = jj0.this.a;
            appCompatDelegateImpl.k0.setAlpha(1.0f);
            appCompatDelegateImpl.n0.d(null);
            appCompatDelegateImpl.n0 = null;
        }
    }

    public jj0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.l0.showAtLocation(appCompatDelegateImpl.k0, 55, 0, 0);
        prg prgVar = appCompatDelegateImpl.n0;
        if (prgVar != null) {
            prgVar.b();
        }
        if (!appCompatDelegateImpl.p0 || (viewGroup = appCompatDelegateImpl.q0) == null || !viewGroup.isLaidOut()) {
            appCompatDelegateImpl.k0.setAlpha(1.0f);
            appCompatDelegateImpl.k0.setVisibility(0);
            return;
        }
        appCompatDelegateImpl.k0.setAlpha(0.0f);
        prg prgVarA = epg.a(appCompatDelegateImpl.k0);
        prgVarA.a(1.0f);
        appCompatDelegateImpl.n0 = prgVarA;
        prgVarA.d(new a());
    }
}
