package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.image.a;
import com.horcrux.svg.events.SvgLoadEvent;
import defpackage.a2;
import defpackage.b37;
import defpackage.ft5;
import defpackage.kc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.o49;
import defpackage.ou8;
import defpackage.pu8;
import defpackage.s55;
import defpackage.snc;
import defpackage.sy3;
import defpackage.tjc;
import defpackage.tnc;
import defpackage.u96;
import defpackage.v71;
import defpackage.zi1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bM\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/b;", "La2;", "draweeControllerBuilder", "Lu96;", "globalImageLoadListener", "Ltjc;", "callerContextFactory", "<init>", "(La2;Lu96;Ltjc;)V", "", "callerContext", "(La2;Ljava/lang/Object;)V", "(La2;Lu96;Ljava/lang/Object;)V", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/image/b;", "", "getName", "()Ljava/lang/String;", "view", "", "accessible", "Lj6g;", "setAccessible", "(Lcom/facebook/react/views/image/b;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/b;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", "", "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/b;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/b;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", "", "borderColor", "setBorderColor", "(Lcom/facebook/react/views/image/b;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/image/b;IF)V", "resizeMode", "setResizeMode", "resizeMethod", "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/b;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/b;Lcom/facebook/react/bridge/ReadableMap;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/b;)V", "La2;", "Lu96;", "Ltjc;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<b> {
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final tjc callerContextFactory;
    private final a2<?, ?, ?, ?> draweeControllerBuilder;
    private final u96 globalImageLoadListener;

    public /* synthetic */ ReactImageManager(a2 a2Var, u96 u96Var, tjc tjcVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((a2<?, ?, ?, ?>) ((i & 1) != 0 ? null : a2Var), (i & 2) != 0 ? null : u96Var, (i & 4) != 0 ? null : tjcVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(mkf context) {
        context.getClass();
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        a2 a2Var = this.draweeControllerBuilder;
        if (a2Var == null) {
            a2Var = ft5.a.get();
        }
        return new b(context, a2Var, obj);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put(a.C0139a.a(4), kc9.W(new Pair(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(a.C0139a.a(5), kc9.W(new Pair(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(SvgLoadEvent.EVENT_NAME, kc9.W(new Pair(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put("topError", kc9.W(new Pair(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put("topLoadEnd", kc9.W(new Pair(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.d();
    }

    @snc(name = "accessible")
    public final void setAccessible(b view, boolean accessible) {
        view.getClass();
        view.setFocusable(accessible);
    }

    @snc(name = "blurRadius")
    public final void setBlurRadius(b view, float blurRadius) {
        view.getClass();
        view.setBlurRadius(blurRadius);
    }

    @snc(customType = "Color", name = "borderColor")
    public final void setBorderColor(b view, Integer borderColor) {
        view.getClass();
        v71.l(view, o49.b, borderColor);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(b view, int index, float borderRadius) {
        view.getClass();
        v71.m(view, zi1.values()[index], Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    @snc(name = "borderWidth")
    public final void setBorderWidth(b view, float borderWidth) {
        view.getClass();
        v71.o(view, o49.b, Float.valueOf(borderWidth));
    }

    @snc(name = "defaultSource")
    public final void setDefaultSource(b view, String source) {
        view.getClass();
        view.setDefaultSource(source);
    }

    @snc(name = "fadeDuration")
    public final void setFadeDuration(b view, int durationMs) {
        view.getClass();
        view.setFadeDuration(durationMs);
    }

    @snc(name = "headers")
    public final void setHeaders(b view, ReadableMap headers) {
        view.getClass();
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @snc(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(b view, String analyticTag) {
        view.getClass();
    }

    @snc(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(b view, boolean shouldNotifyLoadEvents) {
        view.getClass();
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @snc(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(b view, String source) {
        view.getClass();
        view.setLoadingIndicatorSource(source);
    }

    @snc(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(b view, Integer overlayColor) {
        view.getClass();
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @snc(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(b view, boolean enabled) {
        view.getClass();
        view.setProgressiveRenderingEnabled(enabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r3.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @defpackage.snc(name = "resizeMethod")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeMethod(com.facebook.react.views.image.b r2, java.lang.String r3) {
        /*
            r1 = this;
            r2.getClass()
            a37 r1 = defpackage.a37.a
            if (r3 == 0) goto L60
            int r0 = r3.hashCode()
            switch(r0) {
                case -934437708: goto L36;
                case 3005871: goto L2d;
                case 3387192: goto L1e;
                case 109250890: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            java.lang.String r0 = "scale"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            goto L3e
        L18:
            a37 r1 = defpackage.a37.c
            r2.setResizeMethod(r1)
            return
        L1e:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto L3e
        L27:
            a37 r1 = defpackage.a37.d
            r2.setResizeMethod(r1)
            return
        L2d:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L60
            goto L3e
        L36:
            java.lang.String r0 = "resize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5a
        L3e:
            r2.setResizeMethod(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid resize method: '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ReactNative"
            defpackage.s55.n(r2, r1)
            return
        L5a:
            a37 r1 = defpackage.a37.b
            r2.setResizeMethod(r1)
            return
        L60:
            r2.setResizeMethod(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.b, java.lang.String):void");
    }

    @snc(name = "resizeMode")
    public final void setResizeMode(b view, String resizeMode) {
        Shader.TileMode tileMode;
        view.getClass();
        view.setScaleType(b37.a(resizeMode));
        if ("contain".equals(resizeMode) || "cover".equals(resizeMode) || "stretch".equals(resizeMode) || "center".equals(resizeMode) || "none".equals(resizeMode)) {
            tileMode = Shader.TileMode.CLAMP;
        } else if ("repeat".equals(resizeMode)) {
            tileMode = Shader.TileMode.REPEAT;
        } else {
            if (resizeMode != null) {
                s55.n("ReactNative", "Invalid resize mode: '" + resizeMode + "'");
            }
            tileMode = Shader.TileMode.CLAMP;
        }
        view.setTileMode(tileMode);
    }

    @snc(name = "resizeMultiplier")
    public final void setResizeMultiplier(b view, float resizeMultiplier) {
        view.getClass();
        if (resizeMultiplier < 0.01f) {
            s55.n("ReactNative", "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @snc(name = "source")
    public final void setSource(b view, ReadableArray sources) {
        view.getClass();
        view.setSource(sources);
    }

    @snc(name = "src")
    public final void setSrc(b view, ReadableArray sources) {
        view.getClass();
        setSource(view, sources);
    }

    @snc(customType = "Color", name = "tintColor")
    public final void setTintColor(b view, Integer tintColor) {
        view.getClass();
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(a2<?, ?, ?, ?> a2Var) {
        this(a2Var, null, null, 6, null);
    }

    public ReactImageManager(a2<?, ?, ?, ?> a2Var, u96 u96Var) {
        this(a2Var, u96Var, null, 4, null);
    }

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    public ReactImageManager(a2<?, ?, ?, ?> a2Var, u96 u96Var, tjc tjcVar) {
        this.draweeControllerBuilder = a2Var;
    }

    @sy3
    public ReactImageManager(a2<?, ?, ?, ?> a2Var, Object obj) {
        this(a2Var, (u96) null, (tjc) null);
        this.callerContext = obj;
    }

    @sy3
    public ReactImageManager(a2<?, ?, ?, ?> a2Var, u96 u96Var, Object obj) {
        this(a2Var, u96Var, (tjc) null);
        this.callerContext = obj;
    }
}
