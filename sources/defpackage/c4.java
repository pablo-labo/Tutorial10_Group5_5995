package defpackage;

import androidx.navigation.d;
import defpackage.grg;

/* JADX INFO: loaded from: classes.dex */
@sy3
public abstract class c4 extends grg.e implements grg.c {
    public ald a;
    public kv8 b;

    @Override // grg.c
    public final brg a(Class cls, u2a u2aVar) {
        String str = (String) u2aVar.a.get(grg.b);
        if (str == null) {
            r6.g("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        ald aldVar = this.a;
        if (aldVar == null) {
            return new d.c(wkd.a(u2aVar));
        }
        aldVar.getClass();
        kv8 kv8Var = this.b;
        kv8Var.getClass();
        skd skdVarB = ju8.b(aldVar, kv8Var, str, null);
        d.c cVar = new d.c(skdVarB.b);
        cVar.b("androidx.lifecycle.savedstate.vm.tag", skdVarB);
        return cVar;
    }

    @Override // grg.c
    public final <T extends brg> T c(Class<T> cls) {
        kv8 kv8Var = this.b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
        if (kv8Var == null) {
            b0.u("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        ald aldVar = this.a;
        aldVar.getClass();
        kv8Var.getClass();
        skd skdVarB = ju8.b(aldVar, kv8Var, canonicalName, null);
        d.c cVar = new d.c(skdVarB.b);
        cVar.b("androidx.lifecycle.savedstate.vm.tag", skdVarB);
        return cVar;
    }

    @Override // grg.e
    public final void d(brg brgVar) {
        ald aldVar = this.a;
        if (aldVar != null) {
            kv8 kv8Var = this.b;
            kv8Var.getClass();
            ju8.a(brgVar, aldVar, kv8Var);
        }
    }
}
