package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vqg implements ComponentCallbacks2 {
    public final LinkedHashMap a;
    public final wqg b;

    public vqg(List<? extends ViewManager> list) {
        list.getClass();
        List<? extends ViewManager> list2 = list;
        int iV = kc9.V(t92.r0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj : list2) {
            linkedHashMap.put(((ViewManager) obj).getName(), obj);
        }
        this.a = new LinkedHashMap(linkedHashMap);
        this.b = null;
    }

    public final synchronized ViewManager<?, ?> a(String str) {
        try {
            str.getClass();
            ViewManager<?, ?> viewManager = (ViewManager) this.a.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String strConcat = "RCT".concat(str);
            ViewManager<?, ?> viewManager2 = (ViewManager) this.a.get(strConcat);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.b == null) {
                throw new IllegalViewOperationException("No ViewManager found for class ".concat(str));
            }
            ViewManager<?, ?> viewManagerB = b(str);
            if (viewManagerB != null) {
                return viewManagerB;
            }
            ViewManager<?, ?> viewManagerB2 = b(strConcat);
            if (viewManagerB2 != null) {
                return viewManagerB2;
            }
            throw new IllegalViewOperationException("Can't find ViewManager '" + str + "' nor '" + strConcat + "' in ViewManagerRegistry, existing names are: " + this.b.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ViewManager<?, ?> b(String str) {
        wqg wqgVar = this.b;
        ViewManager<?, ?> viewManagerB = wqgVar != null ? wqgVar.b(str) : null;
        if (viewManagerB != null) {
            this.a.put(str, viewManagerB);
        }
        return viewManagerB;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
        }
        dd ddVar = new dd(arrayList, 21);
        if (UiThreadUtil.isOnUiThread()) {
            ddVar.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new h50(ddVar, 6));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    @sy3
    public final void onLowMemory() {
        onTrimMemory(40);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
        }
        z0 z0Var = new z0(arrayList, 26);
        if (UiThreadUtil.isOnUiThread()) {
            z0Var.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new dq2(z0Var, 5));
        }
    }

    public vqg(wqg wqgVar) {
        wqgVar.getClass();
        this.a = new LinkedHashMap();
        this.b = wqgVar;
    }
}
