package com.indeed.android.rnprofile.bridge;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.ah2;
import defpackage.dyb;
import defpackage.faa;
import defpackage.gb9;
import defpackage.j6g;
import defpackage.jh;
import defpackage.kb8;
import defpackage.mkf;
import defpackage.my1;
import defpackage.snc;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/indeed/android/rnprofile/bridge/NativeTabContentManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lfaa;", "<init>", "()V", "view", "", "height", "Lj6g;", "sendHeightChangeEvent", "(Lfaa;I)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lfaa;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "tabType", "setTabType", "(Lfaa;Ljava/lang/String;)V", "onDropViewInstance", "(Lfaa;)V", "Lmkf;", "Companion", "a", "rnprofile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeTabContentManager extends SimpleViewManager<faa> {
    public static final int $stable = 8;
    public static final String REACT_CLASS = "NativeTabContent";
    private mkf reactContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g createViewInstance$lambda$1$lambda$0(NativeTabContentManager nativeTabContentManager, faa faaVar, int i) {
        nativeTabContentManager.sendHeightChangeEvent(faaVar, i);
        return j6g.a;
    }

    private final void sendHeightChangeEvent(faa view, int height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("height", height);
        mkf mkfVar = this.reactContext;
        if (mkfVar != null) {
            ((RCTEventEmitter) mkfVar.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), "onHeightChange", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public faa createViewInstance(mkf reactContext) {
        reactContext.getClass();
        this.reactContext = reactContext;
        faa faaVar = new faa(reactContext);
        faaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        faaVar.setOnHeightChanged(new kb8(1, this, faaVar));
        return faaVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        map.put("onHeightChange", gb9.a("registrationName", "onHeightChange"));
        return map;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(faa view) {
        view.getClass();
        view.removeAllViews();
        view.a = null;
        super.onDropViewInstance(view);
    }

    @snc(name = "tabType")
    public final void setTabType(faa view, String tabType) {
        view.getClass();
        tabType.getClass();
        int iHashCode = tabType.hashCode();
        if (iHashCode != -1881097171) {
            if (iHashCode != -152145192) {
                if (iHashCode == 408556937 && tabType.equals("PROFILE")) {
                    view.setTabContent(dyb.a);
                    return;
                }
            } else if (tabType.equals("PREFERENCES")) {
                view.setTabContent(dyb.b);
                return;
            }
        } else if (tabType.equals("RESUME")) {
            view.setTabContent(dyb.c);
            return;
        }
        String strConcat = "Unknown tab type: ".concat(tabType);
        view.removeAllViews();
        Context context = view.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        composeView.setContent(new ah2(2136107830, new jh(7, view, strConcat), true));
        view.a = composeView;
        view.addView(composeView);
        view.post(new my1(view, 8));
    }
}
