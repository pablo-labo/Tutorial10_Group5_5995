package expo.modules.kotlin.sharedobjects;

import defpackage.b49;
import defpackage.d49;
import defpackage.gk0;
import defpackage.mz2;
import defpackage.o39;
import defpackage.ohd;
import defpackage.pt7;
import defpackage.qde;
import defpackage.sy3;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "", "getSharedObjectId", "()I", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedObject {
    public int a;
    public WeakReference<ohd> b;

    public SharedObject(ohd ohdVar) {
        this.a = 0;
        this.b = new WeakReference<>(ohdVar);
    }

    /* JADX INFO: renamed from: getSharedObjectId, reason: from getter */
    private final int getA() {
        return this.a;
    }

    public int G() {
        return 0;
    }

    public final gk0 N() {
        ohd ohdVar = this.b.get();
        if (ohdVar != null) {
            return ohdVar.b.get();
        }
        return null;
    }

    public void P() {
        s();
    }

    @sy3
    public void s() {
    }

    public final void v(String str, Object... objArr) {
        ohd ohdVar;
        SharedObject sharedObjectA;
        str.getClass();
        int i = this.a;
        ohd ohdVar2 = this.b.get();
        if (ohdVar2 != null && (sharedObjectA = qde.a(i, ohdVar2)) != null) {
            b49 b49Var = ohdVar2.g;
            b49Var.getClass();
            synchronized (b49Var) {
                Pair pair = (Pair) ((LinkedHashMap) b49Var.c).get(new qde(sharedObjectA.a));
                javaScriptWeakObject = pair != null ? (JavaScriptWeakObject) pair.e() : null;
            }
        }
        if (javaScriptWeakObject == null || (ohdVar = this.b.get()) == null) {
            return;
        }
        JSIContext jSIContextA = ohdVar.a();
        try {
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(pt7.a(6, obj));
            }
            JNIUtils.emitEvent(javaScriptWeakObject, jSIContextA, str, arrayList.toArray(new Object[0]));
        } catch (Throwable th) {
            d49 d49Var = mz2.a;
            String str2 = "Unable to send event '" + str + "' by shared object of type " + getClass().getSimpleName();
            d49Var.getClass();
            d49Var.a(o39.Error, str2, th);
        }
    }

    public SharedObject() {
        this(null);
    }
}
