package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.g;
import defpackage.ald;
import defpackage.aw8;
import defpackage.c9;
import defpackage.co9;
import defpackage.cr5;
import defpackage.dld;
import defpackage.dqa;
import defpackage.hab;
import defpackage.hqa;
import defpackage.iqa;
import defpackage.irg;
import defpackage.jrg;
import defpackage.k9;
import defpackage.kqa;
import defpackage.kv8;
import defpackage.lr5;
import defpackage.mo9;
import defpackage.mra;
import defpackage.sqa;
import defpackage.tr5;
import defpackage.w7;
import defpackage.wqa;
import defpackage.xq5;
import defpackage.y1a;
import defpackage.yq2;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class g extends ComponentActivity implements w7.b {
    public static final /* synthetic */ int o0 = 0;
    public boolean l0;
    public boolean m0;
    public final xq5 j0 = new xq5(new a());
    public final aw8 k0 = new aw8(this, true);
    public boolean n0 = true;

    public class a extends cr5<g> implements iqa, mra, sqa, wqa, jrg, hqa, k9, dld, tr5, co9 {
        public a() {
            super(g.this);
        }

        @Override // defpackage.tr5
        public final void a(FragmentManager fragmentManager, Fragment fragment) {
        }

        @Override // defpackage.co9
        public final void b(mo9 mo9Var) {
            g.this.b(mo9Var);
        }

        @Override // defpackage.wqa
        public final void c(yq2<hab> yq2Var) {
            g.this.c(yq2Var);
        }

        @Override // defpackage.k9
        public final c9 d() {
            return g.this.X;
        }

        @Override // defpackage.wq5
        public final View e(int i) {
            return g.this.findViewById(i);
        }

        @Override // defpackage.iqa
        public final void f(yq2<Configuration> yq2Var) {
            g.this.f(yq2Var);
        }

        @Override // defpackage.sqa
        public final void g(yq2<y1a> yq2Var) {
            g.this.g(yq2Var);
        }

        @Override // defpackage.zv8
        public final kv8 getLifecycle() {
            return g.this.k0;
        }

        @Override // defpackage.dld
        public final ald getSavedStateRegistry() {
            return g.this.d.b;
        }

        @Override // defpackage.jrg
        public final irg getViewModelStore() {
            return g.this.getViewModelStore();
        }

        @Override // defpackage.wq5
        public final boolean h() {
            Window window = g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.sqa
        public final void i(yq2<y1a> yq2Var) {
            g.this.i(yq2Var);
        }

        @Override // defpackage.mra
        public final void j(yq2<Integer> yq2Var) {
            g.this.j(yq2Var);
        }

        @Override // defpackage.mra
        public final void k(yq2<Integer> yq2Var) {
            g.this.k(yq2Var);
        }

        @Override // defpackage.cr5
        public final void l(PrintWriter printWriter, String[] strArr) {
            g.this.dump("  ", null, printWriter, strArr);
        }

        @Override // defpackage.co9
        public final void m(mo9 mo9Var) {
            g.this.m(mo9Var);
        }

        @Override // defpackage.iqa
        public final void n(yq2<Configuration> yq2Var) {
            g.this.n(yq2Var);
        }

        @Override // defpackage.wqa
        public final void o(yq2<hab> yq2Var) {
            g.this.o(yq2Var);
        }

        @Override // defpackage.cr5
        public final g p() {
            return g.this;
        }

        @Override // defpackage.cr5
        public final LayoutInflater q() {
            g gVar = g.this;
            return gVar.getLayoutInflater().cloneInContext(gVar);
        }

        @Override // defpackage.hqa
        public final dqa r() {
            return g.this.r();
        }

        @Override // defpackage.cr5
        public final boolean s(String str) {
            return w7.c(g.this, str);
        }

        @Override // defpackage.cr5
        public final void t() {
            g.this.invalidateOptionsMenu();
        }
    }

    public g() {
        this.d.b.c("android:support:lifecycle", new ald.b() { // from class: pq5
            @Override // ald.b
            public final Bundle a() {
                g gVar;
                int i = g.o0;
                do {
                    gVar = this.a;
                } while (g.v(gVar.u()));
                gVar.k0.f(kv8.a.ON_STOP);
                return new Bundle();
            }
        });
        this.Y.add(new yq2() { // from class: qq5
            @Override // defpackage.yq2
            public final void accept(Object obj) {
                this.a.j0.a();
            }
        });
        this.a0.add(new yq2() { // from class: rq5
            @Override // defpackage.yq2
            public final void accept(Object obj) {
                this.a.j0.a();
            }
        });
        q(new kqa() { // from class: sq5
            @Override // defpackage.kqa
            public final void a(ComponentActivity componentActivity) {
                g.a aVar = this.a.j0.a;
                aVar.d.b(aVar, aVar, null);
            }
        });
    }

    public static boolean v(FragmentManager fragmentManager) {
        boolean zV = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zV |= v(fragment.getChildFragmentManager());
                }
                p pVar = fragment.mViewLifecycleOwner;
                kv8.b bVar = kv8.b.d;
                kv8.b bVar2 = kv8.b.c;
                if (pVar != null) {
                    pVar.b();
                    if (pVar.e.d.compareTo(bVar) >= 0) {
                        fragment.mViewLifecycleOwner.e.h(bVar2);
                        zV = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.compareTo(bVar) >= 0) {
                    fragment.mLifecycleRegistry.h(bVar2);
                    zV = true;
                }
            }
        }
        return zV;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.j0.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k0.f(kv8.a.ON_CREATE);
        lr5 lr5Var = this.j0.a.d;
        lr5Var.G = false;
        lr5Var.H = false;
        lr5Var.N.V = false;
        lr5Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.j0.a.d.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.j0.a.d.k();
        this.k0.f(kv8.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.j0.a.d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.m0 = false;
        this.j0.a.d.t(5);
        this.k0.f(kv8.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.k0.f(kv8.a.ON_RESUME);
        lr5 lr5Var = this.j0.a.d;
        lr5Var.G = false;
        lr5Var.H = false;
        lr5Var.N.V = false;
        lr5Var.t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.j0.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        xq5 xq5Var = this.j0;
        xq5Var.a();
        super.onResume();
        this.m0 = true;
        xq5Var.a.d.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        xq5 xq5Var = this.j0;
        xq5Var.a();
        a aVar = xq5Var.a;
        super.onStart();
        this.n0 = false;
        if (!this.l0) {
            this.l0 = true;
            lr5 lr5Var = aVar.d;
            lr5Var.G = false;
            lr5Var.H = false;
            lr5Var.N.V = false;
            lr5Var.t(4);
        }
        aVar.d.x(true);
        this.k0.f(kv8.a.ON_START);
        lr5 lr5Var2 = aVar.d;
        lr5Var2.G = false;
        lr5Var2.H = false;
        lr5Var2.N.V = false;
        lr5Var2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.j0.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.n0 = true;
        while (v(u())) {
        }
        lr5 lr5Var = this.j0.a.d;
        lr5Var.H = true;
        lr5Var.N.V = true;
        lr5Var.t(4);
        this.k0.f(kv8.a.ON_STOP);
    }

    public final lr5 u() {
        return this.j0.a.d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.j0.a.d.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
