package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.ald;
import defpackage.aw8;
import defpackage.bld;
import defpackage.cld;
import defpackage.dld;
import defpackage.dq2;
import defpackage.eld;
import defpackage.grg;
import defpackage.hg6;
import defpackage.hr;
import defpackage.irg;
import defpackage.jrg;
import defpackage.kv8;
import defpackage.p63;
import defpackage.u2a;
import defpackage.wkd;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p implements hg6, dld, jrg {
    public final Fragment a;
    public final irg b;
    public final dq2 c;
    public grg.c d;
    public aw8 e = null;
    public bld f = null;

    public p(Fragment fragment, irg irgVar, dq2 dq2Var) {
        this.a = fragment;
        this.b = irgVar;
        this.c = dq2Var;
    }

    public final void a(kv8.a aVar) {
        this.e.f(aVar);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new aw8(this, true);
            cld cldVar = new cld(this, new hr(this, 13));
            this.f = new bld(cldVar);
            cldVar.a();
            this.c.run();
        }
    }

    @Override // defpackage.hg6
    public final p63 getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        u2a u2aVar = new u2a((Object) null);
        LinkedHashMap linkedHashMap = u2aVar.a;
        if (application != null) {
            linkedHashMap.put(grg.a.d, application);
        }
        linkedHashMap.put(wkd.a, fragment);
        linkedHashMap.put(wkd.b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(wkd.c, fragment.getArguments());
        }
        return u2aVar;
    }

    @Override // defpackage.hg6
    public final grg.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        grg.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new eld(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        b();
        return this.f.b;
    }

    @Override // defpackage.jrg
    public final irg getViewModelStore() {
        b();
        return this.b;
    }
}
