package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import defpackage.gy4;
import defpackage.n8b;
import defpackage.q0g;
import defpackage.ui7;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ReactAdapterPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, defpackage.kya
    public final List<ui7> e(Context context) {
        ReactContext reactContext = (ReactContext) context;
        q0g q0gVar = new q0g();
        q0gVar.b = new WeakHashMap();
        new WeakHashMap();
        q0gVar.a = reactContext;
        gy4 gy4Var = new gy4();
        gy4Var.a = reactContext;
        return Arrays.asList(q0gVar, gy4Var, new n8b(reactContext));
    }
}
