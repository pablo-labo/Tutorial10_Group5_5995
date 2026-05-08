package com.reactnativemenu;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.ReactClippingViewManager;
import defpackage.dmc;
import defpackage.fkc;
import defpackage.gb9;
import defpackage.nn2;
import defpackage.ro9;
import defpackage.snc;
import defpackage.tnc;
import defpackage.tpc;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b&\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b#\u0010!J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010!J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010!J'\u0010)\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\n\b\u0001\u00102\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b3\u00101J#\u00105\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\n\b\u0001\u00104\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b5\u00101J\u001f\u00107\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u000eH\u0007¢\u0006\u0004\b7\u0010\u001dJ'\u00109\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\u0006\u00108\u001a\u00020'H\u0007¢\u0006\u0004\b9\u0010*J)\u0010;\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b>\u0010-J\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u0005H\u0007¢\u0006\u0004\b@\u0010-J!\u0010B\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\u0006\u0010A\u001a\u00020'H\u0016¢\u0006\u0004\bB\u0010CJ%\u0010E\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bE\u0010\rJ\u001d\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014H\u0016¢\u0006\u0004\bF\u0010\u0017J)\u0010J\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/reactnativemenu/MenuViewManagerBase;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lro9;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "view", "Lcom/facebook/react/bridge/ReadableArray;", SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lj6g;", "setActions", "(Lro9;Lcom/facebook/react/bridge/ReadableArray;)V", "", "isAnchoredToRight", "setIsAnchoredToRight", "(Lro9;Z)V", "isOnLongPress", "setIsOnLongPress", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "accessible", "setAccessible", "Ltpc;", "hasTVPreferredFocus", "setTVPreferredFocus", "(Ltpc;Z)V", "", RumEventMeta.VIEW_ID_KEY, "nextFocusDown", "(Ltpc;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "", "borderRadius", "setBorderRadius", "(Ltpc;IF)V", "borderStyle", "setBorderStyle", "(Ltpc;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "hitSlop", "setHitSlop", "(Ltpc;Lcom/facebook/react/bridge/ReadableMap;)V", "bg", "setNativeBackground", "fg", "setNativeForeground", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", "width", "setBorderWidth", "color", "setBorderColor", "(Ltpc;ILjava/lang/Integer;)V", "overflow", "setOverflow", "backfaceVisibility", "setBackfaceVisibility", "opacity", "setOpacity", "(Lro9;F)V", "matrix", "setTransform", "getCommandsMap", "root", "commandId", "args", "receiveCommand", "(Lro9;ILcom/facebook/react/bridge/ReadableArray;)V", "Companion", "a", "react-native-menu_menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MenuViewManagerBase extends ReactClippingViewManager<ro9> {
    private static final int COMMAND_SHOW = 1;
    private static final Integer[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return gb9.a("show", Integer.valueOf(COMMAND_SHOW));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return gb9.b("onPressAction", gb9.a("registrationName", "onPressAction"), "onCloseMenu", gb9.a("registrationName", "onCloseMenu"), "onOpenMenu", gb9.a("registrationName", "onOpenMenu"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MenuView";
    }

    @snc(defaultInt = -1, name = "nextFocusDown")
    public final void nextFocusDown(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusDownId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusForward")
    public final void nextFocusForward(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusForwardId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusLeft")
    public final void nextFocusLeft(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusLeftId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusRight")
    public final void nextFocusRight(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusRightId(viewId);
    }

    @snc(defaultInt = -1, name = "nextFocusUp")
    public final void nextFocusUp(tpc view, int viewId) {
        view.getClass();
        view.setNextFocusUpId(viewId);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ro9 root, int commandId, ReadableArray args) {
        root.getClass();
        if (commandId == COMMAND_SHOW) {
            root.h();
        }
    }

    @snc(name = "accessible")
    public final void setAccessible(ro9 view, boolean accessible) {
        view.getClass();
        view.setFocusable(accessible);
    }

    @snc(name = SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY)
    public final void setActions(ro9 view, ReadableArray actions) {
        view.getClass();
        actions.getClass();
        view.setActions(actions);
    }

    @snc(name = "backfaceVisibility")
    public final void setBackfaceVisibility(tpc view, String backfaceVisibility) {
        view.getClass();
        backfaceVisibility.getClass();
        view.setBackfaceVisibility(backfaceVisibility);
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public abstract void setBorderColor(tpc view, int index, Integer color);

    @tnc(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public final void setBorderRadius(tpc view, int index, float borderRadius) {
        view.getClass();
        if (!dmc.m(borderRadius) && borderRadius < 0.0f) {
            borderRadius = Float.NaN;
        }
        if (!dmc.m(borderRadius)) {
            borderRadius = nn2.G(borderRadius);
        }
        if (index == 0) {
            view.setBorderRadius(borderRadius);
        } else {
            view.setBorderRadius(borderRadius, index - 1);
        }
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle(tpc view, String borderStyle) {
        view.getClass();
        view.setBorderStyle(borderStyle);
    }

    @tnc(names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public final void setBorderWidth(tpc view, int index, float width) {
        view.getClass();
        if (!dmc.m(width) && width < 0.0f) {
            width = Float.NaN;
        }
        if (!dmc.m(width)) {
            width = nn2.G(width);
        }
        view.setBorderWidth(SPACING_TYPES[index].intValue(), width);
    }

    @snc(name = "hitSlop")
    public final void setHitSlop(tpc view, ReadableMap hitSlop) {
        view.getClass();
        if (hitSlop == null) {
            view.setHitSlopRect(null);
        } else {
            view.setHitSlopRect(new Rect(hitSlop.hasKey(GesturesListener.SCROLL_DIRECTION_LEFT) ? (int) nn2.G((float) hitSlop.getDouble(GesturesListener.SCROLL_DIRECTION_LEFT)) : 0, hitSlop.hasKey("top") ? (int) nn2.G((float) hitSlop.getDouble("top")) : 0, hitSlop.hasKey(GesturesListener.SCROLL_DIRECTION_RIGHT) ? (int) nn2.G((float) hitSlop.getDouble(GesturesListener.SCROLL_DIRECTION_RIGHT)) : 0, hitSlop.hasKey("bottom") ? (int) nn2.G((float) hitSlop.getDouble("bottom")) : 0));
        }
    }

    @snc(defaultBoolean = false, name = "isAnchoredToRight")
    public final void setIsAnchoredToRight(ro9 view, boolean isAnchoredToRight) {
        view.getClass();
        view.setIsAnchoredToRight(isAnchoredToRight);
    }

    @snc(defaultBoolean = false, name = "shouldOpenOnLongPress")
    public final void setIsOnLongPress(ro9 view, boolean isOnLongPress) {
        view.getClass();
        view.setIsOpenOnLongPress(isOnLongPress);
    }

    @snc(name = "nativeBackgroundAndroid")
    public final void setNativeBackground(tpc view, ReadableMap bg) {
        Drawable drawableA;
        view.getClass();
        if (bg == null) {
            drawableA = null;
        } else {
            Context context = view.getContext();
            context.getClass();
            drawableA = fkc.a(context, bg);
        }
        view.setTranslucentBackgroundDrawable(drawableA);
    }

    @TargetApi(23)
    @snc(name = "nativeForegroundAndroid")
    public final void setNativeForeground(tpc view, ReadableMap fg) {
        Drawable drawableA;
        view.getClass();
        if (fg == null) {
            drawableA = null;
        } else {
            Context context = view.getContext();
            context.getClass();
            drawableA = fkc.a(context, fg);
        }
        view.setForeground(drawableA);
    }

    @snc(name = "needsOffscreenAlphaCompositing")
    public final void setNeedsOffscreenAlphaCompositing(tpc view, boolean needsOffscreenAlphaCompositing) {
        view.getClass();
        view.setNeedsOffscreenAlphaCompositing(needsOffscreenAlphaCompositing);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(ro9 view, float opacity) {
        view.getClass();
        view.setOpacityIfPossible(opacity);
    }

    @snc(name = "overflow")
    public final void setOverflow(tpc view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @snc(name = "hasTVPreferredFocus")
    public final void setTVPreferredFocus(tpc view, boolean hasTVPreferredFocus) {
        view.getClass();
        if (hasTVPreferredFocus) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(ro9 view, ReadableArray matrix) {
        view.getClass();
        super.setTransform(view, matrix);
        view.setBackfaceVisibilityDependantOpacity();
    }
}
