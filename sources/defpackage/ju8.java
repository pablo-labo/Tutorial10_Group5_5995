package defpackage;

import android.os.Bundle;
import defpackage.ald;
import defpackage.kv8;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class ju8 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lju8$a;", "Lald$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ald.a {
        @Override // ald.a
        public final void a(dld dldVar) {
            if (!(dldVar instanceof jrg)) {
                r40.g(dldVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                return;
            }
            irg viewModelStore = ((jrg) dldVar).getViewModelStore();
            ald savedStateRegistry = dldVar.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.a;
            for (String str : new HashSet(linkedHashMap.keySet())) {
                str.getClass();
                brg brgVar = (brg) linkedHashMap.get(str);
                if (brgVar != null) {
                    ju8.a(brgVar, savedStateRegistry, dldVar.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final class b implements uv8 {
        public final /* synthetic */ kv8 a;
        public final /* synthetic */ ald b;

        public b(kv8 kv8Var, ald aldVar) {
            this.a = kv8Var;
            this.b = aldVar;
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            if (aVar == kv8.a.ON_START) {
                this.a.c(this);
                this.b.d();
            }
        }
    }

    public static final void a(brg brgVar, ald aldVar, kv8 kv8Var) {
        aldVar.getClass();
        kv8Var.getClass();
        skd skdVar = (skd) brgVar.e("androidx.lifecycle.savedstate.vm.tag");
        if (skdVar == null || skdVar.c) {
            return;
        }
        skdVar.a(kv8Var, aldVar);
        c(kv8Var, aldVar);
    }

    public static final skd b(ald aldVar, kv8 kv8Var, String str, Bundle bundle) {
        qkd qkdVar;
        aldVar.getClass();
        kv8Var.getClass();
        Bundle bundleA = aldVar.a(str);
        if (bundleA != null) {
            bundle = bundleA;
        }
        if (bundle == null) {
            qkdVar = new qkd();
        } else {
            ClassLoader classLoader = qkd.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            hb9 hb9Var = new hb9(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                hb9Var.put(str2, bundle.get(str2));
            }
            qkdVar = new qkd(hb9Var.j());
        }
        skd skdVar = new skd(str, qkdVar);
        skdVar.a(kv8Var, aldVar);
        c(kv8Var, aldVar);
        return skdVar;
    }

    public static void c(kv8 kv8Var, ald aldVar) {
        kv8.b bVarB = kv8Var.b();
        if (bVarB == kv8.b.b || bVarB.compareTo(kv8.b.d) >= 0) {
            aldVar.d();
        } else {
            kv8Var.a(new b(kv8Var, aldVar));
        }
    }
}
