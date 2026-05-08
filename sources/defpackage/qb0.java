package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.runtime.ReactInstance;
import com.github.douglasjunior.reactNativePdfRenderer.modules.c;
import defpackage.wi6;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gu5) obj).invoke();
                break;
            case 1:
                ll3 ll3Var = (ll3) obj;
                if (ll3Var.h0 >= 300000) {
                    og9.this.E1 = true;
                    ll3Var.h0 = 0L;
                }
                break;
            case 2:
                ((y55) obj).b();
                break;
            case 3:
                jq5 jq5Var = (jq5) obj;
                Choreographer choreographer = Choreographer.getInstance();
                jq5Var.b = choreographer;
                if (choreographer != null) {
                    choreographer.postFrameCallback(jq5Var);
                }
                break;
            case 4:
                ((wi6.a) obj).c();
                break;
            case 5:
                ((q79) obj).c();
                break;
            case 6:
                c cVar = (c) obj;
                cVar.onLayout(false, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
                break;
            default:
                ReactInstance.b bVar = ReactInstance.h;
                Trace.beginSection(jpf.g("initializeEagerTurboModules"));
                TurboModuleManager turboModuleManager = ((ReactInstance) obj).b;
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
                Trace.endSection();
                break;
        }
    }
}
