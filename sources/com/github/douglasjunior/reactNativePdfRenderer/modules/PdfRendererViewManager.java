package com.github.douglasjunior.reactNativePdfRenderer.modules;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.github.douglasjunior.reactNativePdfRenderer.modules.c;
import defpackage.cg2;
import defpackage.dmc;
import defpackage.l7b;
import defpackage.m7b;
import defpackage.mkf;
import defpackage.n7b;
import defpackage.nmc;
import defpackage.ox4;
import defpackage.snc;
import defpackage.yqg;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import l7b.a;
import l7b.b;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "RNPdfRendererView")
public class PdfRendererViewManager extends SimpleViewManager<c> implements yqg, c.d {
    private final ReactApplicationContext mReactApplicationContext;

    public PdfRendererViewManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError, reason: merged with bridge method [inline-methods] */
    public void lambda$setParams$0(c cVar) {
        sendEvent(cVar, new n7b(dmc.g(this.mReactApplicationContext), cVar.getId()));
    }

    private void sendEvent(c cVar, ox4<?> ox4Var) {
        EventDispatcher eventDispatcherE = dmc.e(this.mReactApplicationContext, cVar.getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(ox4Var);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(mkf mkfVar) {
        return new c(this.mReactApplicationContext, this);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        l7b l7bVar = new l7b();
        l7bVar.put("onPageChange", l7bVar.new a());
        l7bVar.put("onError", l7bVar.new b());
        return l7bVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPdfRendererView";
    }

    @Override // com.github.douglasjunior.reactNativePdfRenderer.modules.c.d
    public void onPageChange(c cVar, int i, int i2) {
        sendEvent(cVar, new m7b(dmc.g(this.mReactApplicationContext), cVar.getId(), i, i2));
    }

    @snc(name = "params")
    public void setParams(final c cVar, ReadableMap readableMap) {
        final cg2 cg2Var = new cg2(2, this, cVar);
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("source");
        final boolean z = readableMap.hasKey("singlePage") && readableMap.getBoolean("singlePage");
        final float fFloatValue = readableMap.hasKey("maxZoom") ? Double.valueOf(readableMap.getDouble("maxZoom")).floatValue() : 5.0f;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        final File file = new File(string.replace("file://", ""));
        cVar.post(new Runnable() { // from class: k7b
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                boolean z2 = z;
                float f = fFloatValue;
                File file2 = file;
                try {
                    cVar2.setSinglePage(z2);
                    cVar2.setMaxZoom(f);
                    cVar2.setOverScrollMode(z2 ? 2 : 1);
                    cVar2.o0(file2);
                    cVar2.G1 = false;
                    cVar2.requestLayout();
                } catch (IOException unused) {
                    cg2Var.run();
                }
            }
        });
    }

    @snc(name = "distanceBetweenPages")
    public void setDistanceBetweenPages(c cVar, float f) {
        cVar.setDistanceBetweenPages(f);
    }

    @snc(name = "maxPageResolution")
    public void setMaxPageResolution(c cVar, float f) {
        cVar.setMaxPageResolution(f);
    }
}
