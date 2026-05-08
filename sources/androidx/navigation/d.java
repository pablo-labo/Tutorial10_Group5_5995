package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import defpackage.ald;
import defpackage.aw8;
import defpackage.bld;
import defpackage.brg;
import defpackage.c4;
import defpackage.cld;
import defpackage.d2f;
import defpackage.dld;
import defpackage.eld;
import defpackage.fwc;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hg6;
import defpackage.hr;
import defpackage.hrg;
import defpackage.irg;
import defpackage.jrg;
import defpackage.kv8;
import defpackage.l5;
import defpackage.lca;
import defpackage.mj8;
import defpackage.p63;
import defpackage.qkd;
import defpackage.r6;
import defpackage.u2a;
import defpackage.wkd;
import defpackage.wl7;
import defpackage.yd8;
import defpackage.zv8;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class d implements zv8, jrg, hg6, dld {
    public final Bundle V;
    public final aw8 W = new aw8(this, true);
    public final bld X = new bld(new cld(this, new hr(this, 13)));
    public boolean Y;
    public kv8.b Z;
    public final Context a;
    public final eld a0;
    public k b;
    public final Bundle c;
    public kv8.b d;
    public final lca e;
    public final String f;

    public static final class a {
        public static d a(Context context, k kVar, Bundle bundle, kv8.b bVar, lca lcaVar) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            kVar.getClass();
            bVar.getClass();
            return new d(context, kVar, bundle, bVar, lcaVar, string, null);
        }
    }

    public static final class b extends c4 {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/d$c;", "Lbrg;", "Lqkd;", "handle", "<init>", "(Lqkd;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends brg {
        public final qkd b;

        public c(qkd qkdVar) {
            qkdVar.getClass();
            this.b = qkdVar;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.d$d, reason: collision with other inner class name */
    public static final class C0069d extends mj8 implements gu5<eld> {
        public C0069d() {
            super(0);
        }

        @Override // defpackage.gu5
        public final eld invoke() {
            Context context = d.this.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            d dVar = d.this;
            return new eld(application, dVar, dVar.a());
        }
    }

    public static final class e extends mj8 implements gu5<qkd> {
        public e() {
            super(0);
        }

        @Override // defpackage.gu5
        public final qkd invoke() {
            d dVar = d.this;
            boolean z = dVar.Y;
            aw8 aw8Var = dVar.W;
            if (!z) {
                r6.g("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                return null;
            }
            if (aw8Var.d == kv8.b.a) {
                r6.g("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                return null;
            }
            b bVar = new b();
            bVar.a = dVar.X.b;
            bVar.b = aw8Var;
            irg viewModelStore = dVar.getViewModelStore();
            p63 defaultViewModelCreationExtras = dVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            hrg hrgVar = new hrg(viewModelStore, bVar, defaultViewModelCreationExtras);
            yd8 yd8VarB = fwc.a.b(c.class);
            String strP = yd8VarB.p();
            if (strP != null) {
                return ((c) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP))).b;
            }
            l5.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
    }

    public d(Context context, k kVar, Bundle bundle, kv8.b bVar, lca lcaVar, String str, Bundle bundle2) {
        this.a = context;
        this.b = kVar;
        this.c = bundle;
        this.d = bVar;
        this.e = lcaVar;
        this.f = str;
        this.V = bundle2;
        d2f d2fVar = new d2f(new C0069d());
        new d2f(new e());
        this.Z = kv8.b.b;
        this.a0 = (eld) d2fVar.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b() {
        if (!this.Y) {
            bld bldVar = this.X;
            bldVar.a.a();
            this.Y = true;
            if (this.e != null) {
                wkd.b(this);
            }
            bldVar.a(this.V);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.Z.ordinal();
        aw8 aw8Var = this.W;
        if (iOrdinal < iOrdinal2) {
            aw8Var.h(this.d);
        } else {
            aw8Var.h(this.Z);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            Bundle bundle = dVar.c;
            if (wl7.b(this.f, dVar.f) && wl7.b(this.b, dVar.b) && wl7.b(this.W, dVar.W) && wl7.b(this.X.b, dVar.X.b)) {
                Bundle bundle2 = this.c;
                if (wl7.b(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!wl7.b(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hg6
    public final p63 getDefaultViewModelCreationExtras() {
        u2a u2aVar = new u2a((Object) null);
        Context context = this.a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = u2aVar.a;
        if (application != null) {
            linkedHashMap.put(grg.a.d, application);
        }
        linkedHashMap.put(wkd.a, this);
        linkedHashMap.put(wkd.b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            linkedHashMap.put(wkd.c, bundleA);
        }
        return u2aVar;
    }

    @Override // defpackage.hg6
    public final grg.c getDefaultViewModelProviderFactory() {
        return this.a0;
    }

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        return this.W;
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        return this.X.b;
    }

    @Override // defpackage.jrg
    public final irg getViewModelStore() {
        if (!this.Y) {
            r6.g("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.W.d == kv8.b.a) {
            r6.g("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        lca lcaVar = this.e;
        if (lcaVar != null) {
            return lcaVar.a(this.f);
        }
        r6.g("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        return null;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.X.b.hashCode() + ((this.W.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d.class.getSimpleName());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
