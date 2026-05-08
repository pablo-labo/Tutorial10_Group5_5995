package com.facebook.react.views.swiperefresh;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.dmc;
import defpackage.ha0;
import defpackage.ia0;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.qwc;
import defpackage.ra6;
import defpackage.snc;
import defpackage.soc;
import defpackage.sqg;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = SwipeRefreshLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020 H\u0007¢\u0006\u0004\b\u001c\u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000eH\u0017¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b/\u0010.J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0014¢\u0006\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lsoc;", "Lia0;", "<init>", "()V", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lsoc;", "", "getName", "()Ljava/lang/String;", "view", "", "enabled", "Lj6g;", "setEnabled", "(Lsoc;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "colors", "setColors", "(Lsoc;Lcom/facebook/react/bridge/ReadableArray;)V", "", "color", "setProgressBackgroundColor", "(Lsoc;Ljava/lang/Integer;)V", "value", "setSize", "(Lsoc;I)V", "size", "(Lsoc;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Dynamic;", "(Lsoc;Lcom/facebook/react/bridge/Dynamic;)V", "refreshing", "setRefreshing", "", "offset", "setProgressViewOffset", "(Lsoc;F)V", "setNativeRefreshing", "addEventEmitters", "(Lmkf;Lsoc;)V", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "Lsqg;", "getDelegate", "()Lsqg;", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SwipeRefreshLayoutManager extends ViewGroupManager<soc> implements ia0<soc> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final sqg<soc> delegate;

    public SwipeRefreshLayoutManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.delegate = new ha0(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(mkf mkfVar, soc socVar) {
        EventDispatcher eventDispatcherE = dmc.e(mkfVar, socVar.getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new qwc(dmc.h(socVar), socVar.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, soc view) {
        reactContext.getClass();
        view.getClass();
        view.setOnRefreshListener(new ra6(reactContext, view));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public soc createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new soc(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<soc> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(lc9.b0(new Pair("topRefresh", lc9.b0(new Pair("registrationName", "onRefresh")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return lc9.b0(new Pair("SIZE", lc9.b0(new Pair("DEFAULT", 1), new Pair("LARGE", 0))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.ia0
    @snc(customType = "ColorArray", name = "colors")
    public void setColors(soc view, ReadableArray colors) {
        view.getClass();
        if (colors == null) {
            view.setColorSchemeColors(new int[0]);
            return;
        }
        int size = colors.size();
        int[] iArr = new int[size];
        int size2 = colors.size();
        for (int i = 0; i < size2; i++) {
            if (colors.getType(i) == ReadableType.Map) {
                ReadableMap map = colors.getMap(i);
                Context context = view.getContext();
                context.getClass();
                iArr[i] = ColorPropConverter.getColor(map, context, 0);
            } else {
                iArr[i] = colors.getInt(i);
            }
        }
        view.setColorSchemeColors(Arrays.copyOf(iArr, size));
    }

    @Override // defpackage.ia0
    @snc(defaultBoolean = true, name = "enabled")
    public void setEnabled(soc view, boolean enabled) {
        view.getClass();
        view.setEnabled(enabled);
    }

    @Override // defpackage.ia0
    public void setNativeRefreshing(soc view, boolean value) {
        view.getClass();
        setRefreshing(view, value);
    }

    @Override // defpackage.ia0
    @snc(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(soc view, Integer color) {
        view.getClass();
        view.setProgressBackgroundColorSchemeColor(color != null ? color.intValue() : 0);
    }

    @Override // defpackage.ia0
    @snc(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(soc view, float offset) {
        view.getClass();
        view.setProgressViewOffset(offset);
    }

    @Override // defpackage.ia0
    @snc(name = "refreshing")
    public void setRefreshing(soc view, boolean refreshing) {
        view.getClass();
        view.setRefreshing(refreshing);
    }

    @snc(name = "size")
    public final void setSize(soc view, Dynamic size) {
        view.getClass();
        size.getClass();
        if (size.isNull()) {
            view.setSize(1);
            return;
        }
        if (size.getType() == ReadableType.Number) {
            view.setSize(size.asInt());
        } else if (size.getType() == ReadableType.String) {
            setSize(view, size.asString());
        } else {
            l5.q("Size must be 'default' or 'large'");
        }
    }

    public final void setSize(soc view, int value) {
        view.getClass();
        view.setSize(value);
    }

    @Override // defpackage.ia0
    public void setSize(soc view, String size) {
        view.getClass();
        if (size != null && !size.equals("default")) {
            if (size.equals("large")) {
                view.setSize(0);
                return;
            } else {
                l5.q("Size must be 'default' or 'large', received: ".concat(size));
                return;
            }
        }
        view.setSize(1);
    }
}
