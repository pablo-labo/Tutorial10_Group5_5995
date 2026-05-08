package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewManager;
import defpackage.c0h;
import defpackage.cj1;
import defpackage.dmc;
import defpackage.fkc;
import defpackage.ie7;
import defpackage.lc9;
import defpackage.m6;
import defpackage.mkf;
import defpackage.msb;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.o49;
import defpackage.ou8;
import defpackage.pu8;
import defpackage.qeb;
import defpackage.qg6;
import defpackage.s55;
import defpackage.snc;
import defpackage.sy3;
import defpackage.tnc;
import defpackage.tpc;
import defpackage.v71;
import defpackage.zi1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010%\n\u0002\b\u0010\b\u0017\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0010J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b \u0010\u001cJ'\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b$\u0010%J'\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b$\u0010(J!\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010)H\u0017¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\"H\u0017¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010)H\u0017¢\u0006\u0004\b1\u0010,J!\u00104\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u000102H\u0017¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u000102H\u0017¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u00108\u001a\u00020\rH\u0017¢\u0006\u0004\b9\u0010\u0010J'\u0010;\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00192\u0006\u0010:\u001a\u00020&H\u0017¢\u0006\u0004\b;\u0010(J)\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\rH\u0017¢\u0006\u0004\b@\u0010\u0010J\u001f\u0010B\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\rH\u0017¢\u0006\u0004\bB\u0010\u0010J\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\rH\u0017¢\u0006\u0004\bD\u0010\u0010J!\u0010F\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010)H\u0017¢\u0006\u0004\bF\u0010,J\u001f\u0010H\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010G\u001a\u00020)H\u0017¢\u0006\u0004\bH\u0010,J\u001f\u0010J\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010I\u001a\u00020&H\u0016¢\u0006\u0004\bJ\u0010KJ+\u0010N\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010\u00112\b\u0010M\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020)H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0005H\u0016¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00190UH\u0016¢\u0006\u0004\bV\u0010WJ)\u0010[\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00192\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b[\u0010\\J)\u0010[\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020)2\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b[\u0010]J\u001b\u0010_\u001a\u00020\u0019*\u0002022\u0006\u0010^\u001a\u00020)H\u0002¢\u0006\u0004\b_\u0010`J!\u0010a\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\ba\u0010\u0014J!\u0010b\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bb\u0010\u0014¨\u0006e"}, d2 = {"Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Ltpc;", "<init>", "()V", "Lmkf;", "reactContext", "view", "prepareToRecycleView", "(Lmkf;Ltpc;)Ltpc;", "Lj6g;", "onDropViewInstance", "(Ltpc;)V", "", "accessible", "setAccessible", "(Ltpc;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "nativeIds", "setAccessibilityOrder", "(Ltpc;Lcom/facebook/react/bridge/ReadableArray;)V", "hasTVPreferredFocus", "setTVPreferredFocus", "backgroundImage", "setBackgroundImage", "", RumEventMeta.VIEW_ID_KEY, "nextFocusDown", "(Ltpc;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "Lcom/facebook/react/bridge/Dynamic;", "rawBorderRadius", "setBorderRadius", "(Ltpc;ILcom/facebook/react/bridge/Dynamic;)V", "", "borderRadius", "(Ltpc;IF)V", "", "borderStyle", "setBorderStyle", "(Ltpc;Ljava/lang/String;)V", "hitSlop", "setHitSlop", "(Ltpc;Lcom/facebook/react/bridge/Dynamic;)V", "pointerEventsStr", "setPointerEvents", "Lcom/facebook/react/bridge/ReadableMap;", "background", "setNativeBackground", "(Ltpc;Lcom/facebook/react/bridge/ReadableMap;)V", "foreground", "setNativeForeground", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", "width", "setBorderWidth", "color", "setBorderColor", "(Ltpc;ILjava/lang/Integer;)V", "collapsable", "setCollapsable", "collapsableChildren", "setCollapsableChildren", "focusable", "setFocusable", "overflow", "setOverflow", "backfaceVisibility", "setBackfaceVisibility", "opacity", "setOpacity", "(Ltpc;F)V", "transforms", "transformOrigin", "setTransformProperty", "(Ltpc;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Ltpc;", "", "getCommandsMap", "()Ljava/util/Map;", "root", "commandId", "args", "receiveCommand", "(Ltpc;ILcom/facebook/react/bridge/ReadableArray;)V", "(Ltpc;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "key", "px", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)I", "handleSetPressed", "handleHotspotUpdate", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactViewManager extends ReactClippingViewManager<tpc> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public ReactViewManager() {
        if (ie7.g0.enableViewRecyclingForView()) {
            setupViewRecycling();
        }
    }

    private final void handleHotspotUpdate(tpc root, ReadableArray args) {
        if (args == null || args.size() != 2) {
            m6.m("Illegal number of arguments for 'updateHotspot' command");
        } else {
            root.drawableHotspotChanged(nn2.G((float) args.getDouble(0)), nn2.G((float) args.getDouble(1)));
        }
    }

    private final void handleSetPressed(tpc root, ReadableArray args) {
        if (args == null || args.size() != 1) {
            m6.m("Illegal number of arguments for 'setPressed' command");
        } else {
            root.setPressed(args.getBoolean(0));
        }
    }

    private final int px(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return (int) nn2.G((float) readableMap.getDouble(str));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFocusable$lambda$2(tpc tpcVar, View view) {
        Context context = tpcVar.getContext();
        context.getClass();
        EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, tpcVar.getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new qg6(dmc.g(tpcVar.getContext()), tpcVar.getId(), 1));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public tpc createViewInstance(mkf context) {
        context.getClass();
        return new tpc(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return lc9.b0(new Pair(HOTSPOT_UPDATE_KEY, 1), new Pair("setPressed", 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @snc(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusDownId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusForwardId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusLeftId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusRightId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusUpId(viewId);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(tpc view) {
        view.getClass();
        super.onDropViewInstance(view);
        view.cleanUpAxOrderListener();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public tpc prepareToRecycleView(mkf reactContext, tpc view) {
        reactContext.getClass();
        view.getClass();
        view.setRemoveClippedSubviews(false);
        tpc tpcVar = (tpc) super.prepareToRecycleView(reactContext, view);
        if (tpcVar != null) {
            tpcVar.recycleView$ReactAndroid_release();
        }
        return tpcVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(tpc root, String commandId, ReadableArray args) {
        root.getClass();
        commandId.getClass();
        if (commandId.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(root, args);
        } else if (commandId.equals("setPressed")) {
            handleSetPressed(root, args);
        }
    }

    @snc(name = "experimental_accessibilityOrder")
    public void setAccessibilityOrder(tpc view, ReadableArray nativeIds) {
        view.getClass();
        if (ie7.g0.enableAccessibilityOrder()) {
            int childCount = view.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = view.getChildAt(i);
                childAt.getClass();
                c0h.p(childAt);
            }
            if (nativeIds == null) {
                view.setAxOrderList(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = nativeIds.size();
            for (int i2 = 0; i2 < size; i2++) {
                String string = nativeIds.getString(i2);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            view.setAxOrderList(arrayList);
        }
    }

    @snc(name = "accessible")
    public void setAccessible(tpc view, boolean accessible) {
        view.getClass();
        view.setFocusable(accessible);
    }

    @snc(name = "backfaceVisibility")
    public void setBackfaceVisibility(tpc view, String backfaceVisibility) {
        view.getClass();
        backfaceVisibility.getClass();
        view.setBackfaceVisibility(backfaceVisibility);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    @defpackage.snc(customType = "BackgroundImage", name = "experimental_backgroundImage")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBackgroundImage(defpackage.tpc r18, com.facebook.react.bridge.ReadableArray r19) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewManager.setBackgroundImage(tpc, com.facebook.react.bridge.ReadableArray):void");
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(tpc view, int index, Integer color) {
        view.getClass();
        int i = SPACING_TYPES[index];
        o49.a.getClass();
        v71.l(view, o49.f.a(i), color);
    }

    @tnc(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(tpc view, int index, Dynamic rawBorderRadius) {
        view.getClass();
        rawBorderRadius.getClass();
        ou8 ou8VarA = ou8.a.a(rawBorderRadius);
        if (msb.e(view.getId()) != 2 && ou8VarA != null && ou8VarA.b == pu8.b) {
            ou8VarA = null;
        }
        v71.m(view, zi1.values()[index], ou8VarA);
    }

    @snc(name = "borderStyle")
    public void setBorderStyle(tpc view, String borderStyle) {
        cj1 cj1VarA;
        view.getClass();
        if (borderStyle == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(borderStyle);
        }
        v71.n(view, cj1VarA);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(tpc view, int index, float width) {
        view.getClass();
        v71.o(view, o49.values()[index], Float.valueOf(width));
    }

    @snc(name = "collapsable")
    public void setCollapsable(tpc view, boolean collapsable) {
        view.getClass();
    }

    @snc(name = "collapsableChildren")
    public void setCollapsableChildren(tpc view, boolean collapsableChildren) {
        view.getClass();
    }

    @snc(name = "focusable")
    public void setFocusable(final tpc view, boolean focusable) {
        view.getClass();
        if (focusable) {
            view.setOnClickListener(new View.OnClickListener() { // from class: upc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReactViewManager.setFocusable$lambda$2(view, view2);
                }
            });
            view.setFocusable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @snc(name = "hitSlop")
    public void setHitSlop(tpc view, Dynamic hitSlop) {
        view.getClass();
        hitSlop.getClass();
        int i = b.a[hitSlop.getType().ordinal()];
        if (i == 1) {
            ReadableMap readableMapAsMap = hitSlop.asMap();
            if (readableMapAsMap == null) {
                view.setHitSlopRect(null);
                return;
            } else {
                view.setHitSlopRect(new Rect(px(readableMapAsMap, GesturesListener.SCROLL_DIRECTION_LEFT), px(readableMapAsMap, "top"), px(readableMapAsMap, GesturesListener.SCROLL_DIRECTION_RIGHT), px(readableMapAsMap, "bottom")));
                return;
            }
        }
        if (i == 2) {
            int iG = (int) nn2.G((float) hitSlop.asDouble());
            view.setHitSlopRect(new Rect(iG, iG, iG, iG));
        } else {
            if (i == 3) {
                view.setHitSlopRect(null);
                return;
            }
            s55.n("ReactNative", "Invalid type for 'hitSlop' value " + hitSlop.getType());
            view.setHitSlopRect(null);
        }
    }

    @snc(name = "nativeBackgroundAndroid")
    public void setNativeBackground(tpc view, ReadableMap background) {
        Drawable drawableA;
        view.getClass();
        if (background != null) {
            Context context = view.getContext();
            context.getClass();
            drawableA = fkc.a(context, background);
        } else {
            drawableA = null;
        }
        v71.q(view, drawableA);
    }

    @snc(name = "nativeForegroundAndroid")
    public void setNativeForeground(tpc view, ReadableMap foreground) {
        Drawable drawableA;
        view.getClass();
        if (foreground != null) {
            Context context = view.getContext();
            context.getClass();
            drawableA = fkc.a(context, foreground);
        } else {
            drawableA = null;
        }
        view.setForeground(drawableA);
    }

    @snc(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(tpc view, boolean needsOffscreenAlphaCompositing) {
        view.getClass();
        view.setNeedsOffscreenAlphaCompositing(needsOffscreenAlphaCompositing);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(tpc view, float opacity) {
        view.getClass();
        view.setOpacityIfPossible(opacity);
    }

    @snc(name = "overflow")
    public void setOverflow(tpc view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @snc(name = "pointerEvents")
    public void setPointerEvents(tpc view, String pointerEventsStr) {
        view.getClass();
        qeb.a.getClass();
        view.setPointerEvents(qeb.a.c(pointerEventsStr));
    }

    @snc(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(tpc view, boolean hasTVPreferredFocus) {
        view.getClass();
        if (hasTVPreferredFocus) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(tpc view, ReadableArray transforms, ReadableArray transformOrigin) {
        view.getClass();
        super.setTransformProperty(view, transforms, transformOrigin);
        view.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @sy3
    public void receiveCommand(tpc root, int commandId, ReadableArray args) {
        root.getClass();
        if (commandId == 1) {
            handleHotspotUpdate(root, args);
        } else {
            if (commandId != 2) {
                return;
            }
            handleSetPressed(root, args);
        }
    }

    @sy3
    public void setBorderRadius(tpc view, int index, float borderRadius) {
        view.getClass();
        setBorderRadius(view, index, new DynamicFromObject(Float.valueOf(borderRadius)));
    }
}
