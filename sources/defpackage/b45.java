package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.adapters.react.ReactAdapterPackage;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b45 implements inc {
    public static final d2f b = new d2f(new vm1(4));
    public final fy9 a;

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Map<String, Integer> map = cy9.a;
            Class<?> cls = ((kya) t2).getClass();
            iwc iwcVar = fwc.a;
            return ak2.i(Integer.valueOf(cy9.a(iwcVar.b(cls).p())), Integer.valueOf(cy9.a(iwcVar.b(((kya) t).getClass()).p())));
        }
    }

    public b45() {
        List list = (List) b.getValue();
        fy9 fy9Var = new fy9();
        fy9Var.b = new ReactAdapterPackage();
        fy9Var.d = null;
        ua9 ua9Var = new ua9();
        ua9Var.a = list;
        fy9Var.a = ua9Var;
        this.a = fy9Var;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return this.a.createNativeModules(reactApplicationContext);
    }

    @Override // defpackage.inc
    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return this.a.createViewManagers(reactApplicationContext);
    }
}
