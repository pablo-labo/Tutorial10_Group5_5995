package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import defpackage.maf;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class alc implements ku2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ReactHostImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ vu5 d;

    public /* synthetic */ alc(fi6 fi6Var, ReactHostImpl reactHostImpl, String str) {
        this.b = reactHostImpl;
        this.d = fi6Var;
        this.c = str;
    }

    @Override // defpackage.ku2
    public final Object a(maf mafVar) {
        boolean z;
        int i = this.a;
        vu5 vu5Var = this.d;
        String str = this.c;
        ReactHostImpl reactHostImpl = this.b;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar.getClass();
                reactHostImpl.t("getOrCreateDestroyTask()", "Starting React Native destruction");
                ReactInstance reactInstance = (ReactInstance) ((fi6) vu5Var).invoke(mafVar, "1: Starting destroy");
                reactHostImpl.x(reactInstance);
                if (reactHostImpl.g) {
                    reactHostImpl.t("getOrCreateDestroyTask()", "DevSupportManager cleanup");
                    reactHostImpl.h.e();
                }
                zm1 zm1VarB = reactHostImpl.m.b();
                if (zm1VarB == null) {
                    reactHostImpl.u("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: ".concat(str), null);
                }
                reactHostImpl.t("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
                reactHostImpl.q.r(zm1VarB);
                maf<Void> mafVar2 = maf.g;
                return maf.a.d(reactInstance);
            default:
                Function1 function1 = (Function1) vu5Var;
                AtomicInteger atomicInteger2 = ReactHostImpl.A;
                mafVar.getClass();
                ReactInstance reactInstance2 = (ReactInstance) mafVar.d();
                if (reactInstance2 == null) {
                    reactHostImpl.u(l5.m("callWithExistingReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null);
                    z = false;
                } else {
                    function1.invoke(reactInstance2);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ alc(ReactHostImpl reactHostImpl, String str, Function1 function1) {
        this.b = reactHostImpl;
        this.c = str;
        this.d = function1;
    }
}
