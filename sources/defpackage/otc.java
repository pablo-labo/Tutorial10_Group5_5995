package defpackage;

import android.os.Bundle;
import defpackage.ald;
import defpackage.kv8;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class otc implements uv8 {
    public final dld a;

    public static final class a implements ald.b {
        public final LinkedHashSet a = new LinkedHashSet();

        public a(ald aldVar) {
            aldVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // ald.b
        public final Bundle a() {
            Bundle bundleA = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            List listZ1 = z92.z1(this.a);
            bundleA.putStringArrayList("classes_to_restore", listZ1 instanceof ArrayList ? (ArrayList) listZ1 : new ArrayList<>(listZ1));
            return bundleA;
        }
    }

    public otc(dld dldVar) {
        this.a = dldVar;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar != kv8.a.ON_CREATE) {
            g7.l("Next event must be ON_CREATE");
            return;
        }
        zv8Var.getLifecycle().c(this);
        dld dldVar = this.a;
        Bundle bundleA = dldVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            r6.g("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, otc.class.getClassLoader()).asSubclass(ald.a.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((ald.a) objNewInstance).a(dldVar);
                    } catch (Exception e) {
                        l6.p(l5.l("Failed to instantiate ", str), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                l6.p(l5.m("Class ", str, " wasn't found"), e3);
                return;
            }
        }
    }
}
