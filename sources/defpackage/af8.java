package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class af8 extends ue8 {
    public final zx9<?> c;

    public af8(zx9<?> zx9Var, fy4 fy4Var, WeakReference<ReactApplicationContext> weakReference) {
        super(fy4Var, weakReference);
        this.c = zx9Var;
    }

    @Override // defpackage.ue8, defpackage.fy4
    public final void a(String str, Bundle bundle) throws Exception {
        LinkedHashMap linkedHashMap;
        c(str);
        if (bundle != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str2 : bundle.keySet()) {
                linkedHashMap.put(str2, pt7.a(2, bundle.get(str2)));
            }
        } else {
            linkedHashMap = null;
        }
        d(str, linkedHashMap);
    }

    @Override // defpackage.ue8, defpackage.ey4
    public final void b(String str, Map<?, ?> map) throws Exception {
        str.getClass();
        c(str);
        d(str, qt7.k(map));
    }

    public final void c(String str) {
        String[] strArr;
        r rVar = this.c.b.i;
        if (rVar == null || (strArr = (String[]) rVar.a) == null || !ut0.f0(str, strArr)) {
            h5.k(l5.m("Unsupported event: ", str, "."));
        }
    }

    public final void d(String str, Map<String, ? extends Object> map) throws Exception {
        zx9<?> zx9Var = this.c;
        ohd ohdVarC = zx9Var.a.c();
        JavaScriptModuleObject javaScriptModuleObject = zx9Var.c ? (JavaScriptModuleObject) zx9Var.d.getValue() : null;
        if (javaScriptModuleObject == null) {
            return;
        }
        try {
            JNIUtils.emitEvent(javaScriptModuleObject, ohdVarC.a(), str, map);
        } catch (Exception e) {
            if (javaScriptModuleObject.b()) {
                throw e;
            }
        }
    }
}
