package defpackage;

import com.facebook.react.module.model.ReactModuleInfo;
import com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gcc implements omc {
    public final /* synthetic */ int a;

    @Override // defpackage.omc
    public final Map a() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                map.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, false, true));
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, false, true));
                return map2;
        }
    }
}
