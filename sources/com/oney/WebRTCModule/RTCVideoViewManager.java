package com.oney.WebRTCModule;

import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.mkf;
import defpackage.snc;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RTCVideoViewManager extends SimpleViewManager<g> {
    private static final String REACT_CLASS = "RTCVideoView";

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(mkf mkfVar) {
        return new g(mkfVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("registrationName", "onDimensionsChange");
        map.put("onDimensionsChange", map2);
        return map;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @snc(name = "mirror")
    public void setMirror(g gVar, boolean z) {
        gVar.setMirror(z);
    }

    @snc(name = "objectFit")
    public void setObjectFit(g gVar, String str) {
        gVar.setObjectFit(str);
    }

    @snc(name = "onDimensionsChange")
    public void setOnDimensionsChange(g gVar, boolean z) {
        gVar.setOnDimensionsChange(z);
    }

    @snc(name = "streamURL")
    public void setStreamURL(g gVar, String str) {
        gVar.setStreamURL(str);
    }

    @snc(name = "zOrder")
    public void setZOrder(g gVar, int i) {
        gVar.setZOrder(i);
    }
}
