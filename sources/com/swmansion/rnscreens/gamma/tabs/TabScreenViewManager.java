package com.swmansion.rnscreens.gamma.tabs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import coil3.svg.SvgDecoder;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.b7f;
import defpackage.bg;
import defpackage.e7f;
import defpackage.j6g;
import defpackage.k07;
import defpackage.l;
import defpackage.l5;
import defpackage.lc9;
import defpackage.m17;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.og2;
import defpackage.pe0;
import defpackage.r37;
import defpackage.r6;
import defpackage.snc;
import defpackage.sqg;
import defpackage.t40;
import defpackage.uw4;
import defpackage.vec;
import defpackage.w27;
import defpackage.wec;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z9f;
import defpackage.zh;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = TabScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002PQB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010!J#\u0010&\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010$J#\u0010'\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010!J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010!J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b,\u0010!J!\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010!J!\u0010.\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b.\u0010$J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010*J!\u00100\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b0\u0010\u001fJ!\u00101\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u0010!J!\u00102\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010!J!\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010!J!\u00104\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b4\u0010$J3\u0010<\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001509H\u0002¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u0004\u0018\u0001072\u0006\u00106\u001a\u0002052\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u00106\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lb7f;", "Lwec;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lb7f;", "Lsqg;", "getDelegate", "()Lsqg;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "Lj6g;", "addEventEmitters", "(Lmkf;Lb7f;)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "setStandardAppearance", "(Lb7f;Lcom/facebook/react/bridge/Dynamic;)V", "setScrollEdgeAppearance", "", "setTabBarItemBadgeBackgroundColor", "(Lb7f;Ljava/lang/Integer;)V", "setIconType", "(Lb7f;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setIconImageSource", "(Lb7f;Lcom/facebook/react/bridge/ReadableMap;)V", "setIconSfSymbolName", "setSelectedIconImageSource", "setSelectedIconSfSymbolName", "", "setIsFocused", "(Lb7f;Z)V", "setTabKey", "setBadgeValue", "setTitle", "setSpecialEffects", "setOverrideScrollViewContentInsetAdjustmentBehavior", "setTabBarItemBadgeTextColor", "setIconResourceName", "setOrientation", "setSystemItem", "setIconResource", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$b;", "source", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onLoad", "loadUsingCoil", "(Landroid/content/Context;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$b;Lkotlin/jvm/functions/Function1;)V", "uri", "resolveSource", "(Landroid/content/Context;Ljava/lang/String;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$b;", "delegate", "Lsqg;", "Lm17;", "imageLoader", "Lm17;", "getImageLoader", "()Lm17;", "setImageLoader", "(Lm17;)V", "Lmkf;", "getContext", "()Lmkf;", "setContext", "(Lmkf;)V", "Companion", "b", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabScreenViewManager extends ViewGroupManager<b7f> implements wec<b7f> {
    public static final String REACT_CLASS = "RNSBottomTabsScreen";
    private mkf context;
    private final sqg<b7f> delegate;
    private m17 imageLoader;

    public static abstract class b {

        public static final class a extends b {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return bg.d(this.a, "DrawableRes(resId=", ")");
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.TabScreenViewManager$b$b, reason: collision with other inner class name */
        public static final class C0195b extends b {
            public final String a;

            public C0195b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0195b) && wl7.b(this.a, ((C0195b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l5.m("UriString(uri=", this.a, ")");
            }
        }
    }

    public static final class c implements w27.d {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // w27.d
        public final void a(uw4 uw4Var) {
            Log.e("[RNScreens]", t40.i(this.b, "Error loading image: "), uw4Var.c);
        }

        @Override // w27.d
        public final void onCancel() {
            Log.w("[RNScreens]", "Image loading request cancelled: " + this.a);
        }
    }

    public static final class d implements z9f {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Function1 b;

        public d(Context context, Function1 function1) {
            this.a = context;
            this.b = function1;
        }

        @Override // defpackage.z9f
        public final void a(k07 k07Var) {
        }

        @Override // defpackage.z9f
        public final void c(k07 k07Var) {
            Resources resources = this.a.getResources();
            resources.getClass();
            this.b.invoke(r37.a(k07Var, resources));
        }
    }

    public TabScreenViewManager() {
        super(null, 1, null);
        this.delegate = new vec(this, 0);
    }

    private final void loadUsingCoil(Context context, b source, Function1<? super Drawable, j6g> onLoad) {
        Object objValueOf;
        if (source instanceof b.a) {
            objValueOf = Integer.valueOf(((b.a) source).a);
        } else {
            if (!(source instanceof b.C0195b)) {
                l.g();
                return;
            }
            objValueOf = ((b.C0195b) source).a;
        }
        w27.a aVar = new w27.a(context);
        aVar.c = objValueOf;
        aVar.d = new d(context, onLoad);
        aVar.e = new c(objValueOf, objValueOf);
        w27 w27VarA = aVar.a();
        m17 m17Var = this.imageLoader;
        if (m17Var != null) {
            m17Var.a(w27VarA);
        }
    }

    private final b resolveSource(Context context, String uri) {
        if (!wve.K(uri, "_", false)) {
            return new b.C0195b(uri);
        }
        int identifier = context.getResources().getIdentifier(uri, "drawable", context.getPackageName());
        if (identifier != 0) {
            return new b.a(identifier);
        }
        int identifier2 = context.getResources().getIdentifier(uri, "raw", context.getPackageName());
        if (identifier2 != 0) {
            return new b.a(identifier2);
        }
        Log.e("[RNScreens]", "Resource not found in drawable or raw: ".concat(uri));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g setIconResource$lambda$1(b7f b7fVar, Drawable drawable) {
        drawable.getClass();
        b7fVar.setIcon(drawable);
        return j6g.a;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, b7f view) {
        reactContext.getClass();
        view.getClass();
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            r6.g("[RNScreens] TabScreen must have its tag set when registering event emitters");
            return;
        }
        mkf mkfVar = view.a;
        int id = view.getId();
        mkfVar.getClass();
        view.setEventEmitter$react_native_screens_release(new e7f(mkfVar, id));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b7f createViewInstance(mkf reactContext) {
        reactContext.getClass();
        m17.a aVar = new m17.a(reactContext);
        og2.a aVar2 = new og2.a();
        aVar2.e.add(new zh(new SvgDecoder.Factory(false, false, false, 7, (DefaultConstructorMarker) null), 5));
        j6g j6gVar = j6g.a;
        aVar.c = aVar2.c();
        this.imageLoader = aVar.a();
        this.context = reactContext;
        return new b7f(reactContext);
    }

    public final mkf getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<b7f> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("topWillAppear", lc9.Z(new Pair("registrationName", "onWillAppear"))), new Pair("topDidAppear", lc9.Z(new Pair("registrationName", "onDidAppear"))), new Pair("topWillDisappear", lc9.Z(new Pair("registrationName", "onWillDisappear"))), new Pair("topDidDisappear", lc9.Z(new Pair("registrationName", "onDidDisappear"))));
    }

    public final m17 getImageLoader() {
        return this.imageLoader;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.wec
    @snc(name = "badgeValue")
    public void setBadgeValue(b7f view, String value) {
        view.getClass();
        view.setBadgeValue(value);
    }

    public final void setContext(mkf mkfVar) {
        this.context = mkfVar;
    }

    @Override // defpackage.wec
    @snc(name = "iconResource")
    public void setIconResource(b7f view, ReadableMap value) {
        view.getClass();
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            context.getClass();
            b bVarResolveSource = resolveSource(context, string);
            if (bVarResolveSource != null) {
                loadUsingCoil(context, bVarResolveSource, new pe0(view, 15));
            }
        }
    }

    @Override // defpackage.wec
    @snc(name = "iconResourceName")
    public void setIconResourceName(b7f view, String value) {
        view.getClass();
        view.setIconResourceName(value);
    }

    public final void setImageLoader(m17 m17Var) {
        this.imageLoader = m17Var;
    }

    @Override // defpackage.wec
    @snc(name = "isFocused")
    public void setIsFocused(b7f view, boolean value) {
        view.getClass();
        view.getId();
        view.setFocusedTab(value);
    }

    @Override // defpackage.wec
    public void setScrollEdgeAppearance(b7f view, Dynamic value) {
        view.getClass();
        value.getClass();
    }

    @Override // defpackage.wec
    public void setStandardAppearance(b7f view, Dynamic value) {
        view.getClass();
        value.getClass();
    }

    @Override // defpackage.wec
    @snc(customType = "Color", name = "tabBarItemBadgeBackgroundColor")
    public void setTabBarItemBadgeBackgroundColor(b7f view, Integer value) {
        view.getClass();
        view.setTabBarItemBadgeBackgroundColor(value);
    }

    @Override // defpackage.wec
    @snc(customType = "Color", name = "tabBarItemBadgeTextColor")
    public void setTabBarItemBadgeTextColor(b7f view, Integer value) {
        view.getClass();
        view.setTabBarItemBadgeTextColor(value);
    }

    @Override // defpackage.wec
    @snc(name = "tabKey")
    public void setTabKey(b7f view, String value) {
        view.getClass();
        view.setTabKey(value);
    }

    @Override // defpackage.wec
    @snc(name = "title")
    public void setTitle(b7f view, String value) {
        view.getClass();
        view.setTabTitle(value);
    }

    @Override // defpackage.wec
    public void setIconImageSource(b7f view, ReadableMap value) {
    }

    @Override // defpackage.wec
    public void setIconSfSymbolName(b7f view, String value) {
    }

    @Override // defpackage.wec
    public void setIconType(b7f view, String value) {
    }

    @Override // defpackage.wec
    public void setOrientation(b7f view, String value) {
        view.getClass();
    }

    @Override // defpackage.wec
    public void setOverrideScrollViewContentInsetAdjustmentBehavior(b7f view, boolean value) {
        view.getClass();
    }

    @Override // defpackage.wec
    public void setSelectedIconImageSource(b7f view, ReadableMap value) {
    }

    @Override // defpackage.wec
    public void setSelectedIconSfSymbolName(b7f view, String value) {
    }

    @Override // defpackage.wec
    public void setSpecialEffects(b7f view, ReadableMap value) {
        view.getClass();
    }

    @Override // defpackage.wec
    public void setSystemItem(b7f view, String value) {
        view.getClass();
    }
}
