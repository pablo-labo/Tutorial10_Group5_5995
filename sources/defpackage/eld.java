package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import defpackage.grg;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class eld extends grg.e implements grg.c {
    public final Application a;
    public final grg.a b;
    public final Bundle c;
    public final kv8 d;
    public final ald e;

    @SuppressLint({"LambdaLast"})
    public eld(Application application, dld dldVar, Bundle bundle) {
        grg.a aVar;
        dldVar.getClass();
        this.e = dldVar.getSavedStateRegistry();
        this.d = dldVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (grg.a.c == null) {
                grg.a.c = new grg.a(application);
            }
            aVar = grg.a.c;
            aVar.getClass();
        } else {
            aVar = new grg.a(null);
        }
        this.b = aVar;
    }

    @Override // grg.c
    public final brg a(Class cls, u2a u2aVar) {
        LinkedHashMap linkedHashMap = u2aVar.a;
        String str = (String) linkedHashMap.get(grg.b);
        if (str == null) {
            r6.g("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(wkd.a) == null || linkedHashMap.get(wkd.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            r6.g("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(grg.a.d);
        boolean zIsAssignableFrom = sb0.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? fld.a(cls, fld.b) : fld.a(cls, fld.a);
        return constructorA == null ? this.b.a(cls, u2aVar) : (!zIsAssignableFrom || application == null) ? fld.b(cls, constructorA, wkd.a(u2aVar)) : fld.b(cls, constructorA, application, wkd.a(u2aVar));
    }

    @Override // grg.c
    public final brg b(yd8 yd8Var, u2a u2aVar) {
        yd8Var.getClass();
        return a(jh2.p(yd8Var), u2aVar);
    }

    @Override // grg.c
    public final <T extends brg> T c(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(cls, canonicalName);
        }
        l5.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // grg.e
    public final void d(brg brgVar) {
        kv8 kv8Var = this.d;
        if (kv8Var != null) {
            ald aldVar = this.e;
            aldVar.getClass();
            ju8.a(brgVar, aldVar, kv8Var);
        }
    }

    public final brg e(Class cls, String str) {
        kv8 kv8Var = this.d;
        if (kv8Var == null) {
            b0.u("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = sb0.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? fld.a(cls, fld.b) : fld.a(cls, fld.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.c(cls);
            }
            if (grg.d.a == null) {
                grg.d.a = new grg.d();
            }
            grg.d.a.getClass();
            return u63.t(cls);
        }
        ald aldVar = this.e;
        aldVar.getClass();
        skd skdVarB = ju8.b(aldVar, kv8Var, str, this.c);
        qkd qkdVar = skdVarB.b;
        brg brgVarB = (!zIsAssignableFrom || application == null) ? fld.b(cls, constructorA, qkdVar) : fld.b(cls, constructorA, application, qkdVar);
        brgVarB.b("androidx.lifecycle.savedstate.vm.tag", skdVarB);
        return brgVarB;
    }

    public eld() {
        this.b = new grg.a(null);
    }
}
