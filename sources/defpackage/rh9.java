package defpackage;

import android.os.Trace;
import androidx.media3.session.z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import defpackage.gdb;
import defpackage.lz8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh9 implements lz8.a, UIConstantsProviderBinding.ConstantsProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ rh9(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
    public NativeMap getConstants() {
        ReactInstance reactInstance = (ReactInstance) this.b;
        HashMap map = (HashMap) this.c;
        ReactInstance.b bVar = ReactInstance.h;
        ReactInstance.a aVar = reactInstance.d;
        ArrayList arrayList = new ArrayList(((HashMap) aVar.c()).values());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        i3f i3fVar = new i3f("CreateUIManagerConstants");
        i3fVar.S(Boolean.FALSE, "Lazy");
        i3fVar.T();
        try {
            LinkedHashMap linkedHashMapB = n0g.b(arrayList, null, map);
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            HashSet hashSetD = aVar.d();
            if (!hashSetD.isEmpty()) {
                linkedHashMapB.put("ViewManagerNames", new ArrayList(hashSetD));
                linkedHashMapB.put("LazyViewManagersEnabled", Boolean.TRUE);
            }
            WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(linkedHashMapB);
            writableNativeMapMakeNativeMap.getClass();
            return writableNativeMapMakeNativeMap;
        } catch (Throwable th) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            throw th;
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Serializable serializable = this.c;
        z zVar = (z) this.b;
        Integer num = (Integer) serializable;
        gdb.c cVar = (gdb.c) obj;
        switch (i) {
            case 0:
                cVar.j0(zVar.j, num.intValue());
                break;
            default:
                cVar.V(num.intValue(), zVar.t);
                break;
        }
    }
}
