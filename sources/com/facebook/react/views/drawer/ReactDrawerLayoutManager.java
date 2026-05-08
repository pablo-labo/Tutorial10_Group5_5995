package com.facebook.react.views.drawer;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.bg;
import defpackage.dmc;
import defpackage.epg;
import defpackage.f70;
import defpackage.g70;
import defpackage.gkc;
import defpackage.hkc;
import defpackage.kc9;
import defpackage.lc4;
import defpackage.lc9;
import defpackage.m6;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.pc4;
import defpackage.qc4;
import defpackage.r6;
import defpackage.s55;
import defpackage.snc;
import defpackage.sqg;
import defpackage.sy3;
import defpackage.tc4;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactDrawerLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ!\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010 J!\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\"\u0010\u0014J!\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0,H\u0016¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010/\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002040,H\u0016¢\u0006\u0004\b5\u0010.J\u001b\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002040,H\u0016¢\u0006\u0004\b6\u0010.J'\u0010;\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020#H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lhkc;", "Lg70;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "view", "Lj6g;", "addEventEmitters", "(Lmkf;Lhkc;)V", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lhkc;", "value", "setDrawerPosition", "(Lhkc;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Dynamic;", "drawerPosition", "(Lhkc;Lcom/facebook/react/bridge/Dynamic;)V", "", "width", "setDrawerWidth", "(Lhkc;F)V", "(Lhkc;Ljava/lang/Float;)V", "drawerLockMode", "setDrawerLockMode", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "(Lhkc;)V", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "setKeyboardDismissMode", "", "setDrawerBackgroundColor", "(Lhkc;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "elevation", "setElevation", "", "needsCustomLayoutForChildren", "()Z", "", "getCommandsMap", "()Ljava/util/Map;", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lhkc;ILcom/facebook/react/bridge/ReadableArray;)V", "", "getExportedViewConstants", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "index", "addView", "(Lhkc;Landroid/view/View;I)V", "Lsqg;", "getDelegate", "()Lsqg;", "setDrawerPositionInternal", "delegate", "Lsqg;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDrawerLayoutManager extends ViewGroupManager<hkc> implements g70<hkc> {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final sqg<hkc> delegate;

    public static final class b implements DrawerLayout.d {
        public final DrawerLayout a;
        public final EventDispatcher b;

        public b(hkc hkcVar, EventDispatcher eventDispatcher) {
            hkcVar.getClass();
            this.a = hkcVar;
            this.b = eventDispatcher;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void a(View view) {
            view.getClass();
            DrawerLayout drawerLayout = this.a;
            this.b.a(new pc4(dmc.h(drawerLayout), drawerLayout.getId(), 0));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void b(View view) {
            view.getClass();
            DrawerLayout drawerLayout = this.a;
            this.b.a(new lc4(dmc.h(drawerLayout), drawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void c(int i) {
            DrawerLayout drawerLayout = this.a;
            this.b.a(new tc4(dmc.h(drawerLayout), drawerLayout.getId(), i));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void d(View view, float f) {
            view.getClass();
            DrawerLayout drawerLayout = this.a;
            this.b.a(new qc4(dmc.h(drawerLayout), f, drawerLayout.getId()));
        }
    }

    public ReactDrawerLayoutManager() {
        super(null, 1, null);
        this.delegate = new f70(this, 0);
    }

    private final void setDrawerPositionInternal(hkc view, String drawerPosition) {
        if (wl7.b(drawerPosition, GesturesListener.SCROLL_DIRECTION_LEFT)) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (wl7.b(drawerPosition, GesturesListener.SCROLL_DIRECTION_RIGHT)) {
            view.setDrawerPosition$ReactAndroid_release(8388613);
            return;
        }
        s55.n("ReactNative", "drawerPosition must be 'left' or 'right', received" + drawerPosition);
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, hkc view) {
        reactContext.getClass();
        view.getClass();
        EventDispatcher eventDispatcherE = dmc.e(reactContext, view.getId());
        if (eventDispatcherE == null) {
            return;
        }
        b bVar = new b(view, eventDispatcherE);
        if (view.k0 == null) {
            view.k0 = new ArrayList();
        }
        view.k0.add(bVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(hkc parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (getChildCount(parent) >= 2) {
            m6.m("The Drawer cannot have more than two children");
        } else if (index != 0 && index != 1) {
            m6.m(bg.d(index, "The only valid indices for drawer's child are 0 or 1. Got ", " instead."));
        } else {
            parent.addView(child, index);
            parent.s();
        }
    }

    @Override // defpackage.g70
    public void closeDrawer(hkc view) {
        view.getClass();
        view.q();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public hkc createViewInstance(mkf context) {
        context.getClass();
        hkc hkcVar = new hkc(context);
        hkcVar.x0 = 8388611;
        hkcVar.y0 = -1;
        epg.o(hkcVar, new gkc());
        return hkcVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return lc9.a0(new Pair(COMMAND_OPEN_DRAWER, 1), new Pair(COMMAND_CLOSE_DRAWER, 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<hkc> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topDrawerSlide", kc9.W(new Pair("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put("topDrawerOpen", kc9.W(new Pair("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put("topDrawerClose", kc9.W(new Pair("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put("topDrawerStateChanged", kc9.W(new Pair("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return kc9.W(new Pair(DRAWER_POSITION, lc9.a0(new Pair(DRAWER_POSITION_LEFT, 8388611), new Pair(DRAWER_POSITION_RIGHT, 8388613))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // defpackage.g70
    public void openDrawer(hkc view) {
        view.getClass();
        view.r();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @sy3
    public void receiveCommand(hkc view, int commandId, ReadableArray args) {
        view.getClass();
        if (commandId == 1) {
            view.r();
        } else {
            if (commandId != 2) {
                return;
            }
            view.q();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r4.equals("unlocked") != false) goto L25;
     */
    @Override // defpackage.g70
    @defpackage.snc(name = "drawerLockMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDrawerLockMode(defpackage.hkc r3, java.lang.String r4) {
        /*
            r2 = this;
            r3.getClass()
            r2 = 0
            if (r4 == 0) goto L4d
            int r0 = r4.hashCode()
            r1 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r0 == r1) goto L31
            r1 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r0 == r1) goto L28
            r1 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r0 == r1) goto L1a
            goto L39
        L1a:
            java.lang.String r0 = "locked-open"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L23
            goto L39
        L23:
            r2 = 2
            r3.setDrawerLockMode(r2)
            return
        L28:
            java.lang.String r0 = "unlocked"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            goto L4d
        L31:
            java.lang.String r0 = "locked-closed"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L48
        L39:
            java.lang.String r0 = "Unknown drawerLockMode "
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "ReactNative"
            defpackage.s55.n(r0, r4)
            r3.setDrawerLockMode(r2)
            return
        L48:
            r2 = 1
            r3.setDrawerLockMode(r2)
            return
        L4d:
            r3.setDrawerLockMode(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(hkc, java.lang.String):void");
    }

    @snc(name = "drawerPosition")
    public final void setDrawerPosition(hkc view, Dynamic drawerPosition) {
        view.getClass();
        drawerPosition.getClass();
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() == ReadableType.Number) {
            int iAsInt = drawerPosition.asInt();
            if (8388611 == iAsInt || 8388613 == iAsInt) {
                view.setDrawerPosition$ReactAndroid_release(iAsInt);
                return;
            }
            s55.n("ReactNative", "Unknown drawerPosition " + iAsInt);
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() != ReadableType.String) {
            s55.n("ReactNative", "drawerPosition must be a string or int");
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        String strAsString = drawerPosition.asString();
        if (strAsString != null) {
            setDrawerPositionInternal(view, strAsString);
        } else {
            r6.g("Required value was null.");
        }
    }

    @snc(defaultFloat = Float.NaN, name = "drawerWidth")
    public final void setDrawerWidth(hkc view, float width) {
        view.getClass();
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(width) ? -1 : Math.round(nn2.G(width)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(hkc view, float elevation) {
        view.getClass();
        view.setDrawerElevation(nn2.G(elevation));
    }

    @Override // defpackage.g70
    @snc(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(hkc view, Integer value) {
        view.getClass();
    }

    @Override // defpackage.g70
    @snc(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(hkc view, String value) {
        view.getClass();
    }

    @Override // defpackage.g70
    @snc(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(hkc view, Integer value) {
        view.getClass();
    }

    @Override // defpackage.g70
    public void setDrawerWidth(hkc view, Float width) {
        view.getClass();
        view.setDrawerWidth$ReactAndroid_release(width != null ? Math.round(nn2.G(width.floatValue())) : -1);
    }

    @Override // defpackage.g70
    public void setDrawerPosition(hkc view, String value) {
        view.getClass();
        if (value == null) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(view, value);
        }
    }
}
