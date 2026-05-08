package defpackage;

import android.os.Bundle;
import android.os.Trace;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl9 implements x.e, UIConstantsProviderBinding.ConstantsForViewManagerProvider {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Cloneable b;

    public /* synthetic */ hl9(Object obj, Cloneable cloneable) {
        this.a = obj;
        this.b = cloneable;
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.o(dVar, (v8e) this.a, (Bundle) this.b);
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
    public NativeMap getConstantsForViewManager(String str) {
        ReactInstance reactInstance = (ReactInstance) this.a;
        HashMap map = (HashMap) this.b;
        ReactInstance.b bVar = ReactInstance.h;
        str.getClass();
        ViewManager<?, ?> viewManagerB = reactInstance.d.b(str);
        if (viewManagerB == null) {
            return null;
        }
        i3f i3fVar = new i3f("ReactInstance.getConstantsForViewManager");
        String name = viewManagerB.getName();
        name.getClass();
        i3fVar.S(name, "ViewManager");
        i3fVar.S(Boolean.TRUE, "Lazy");
        i3fVar.T();
        try {
            WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(n0g.c(viewManagerB, null, map));
            writableNativeMapMakeNativeMap.getClass();
            return writableNativeMapMakeNativeMap;
        } finally {
            new h3f(11);
            Trace.endSection();
        }
    }
}
