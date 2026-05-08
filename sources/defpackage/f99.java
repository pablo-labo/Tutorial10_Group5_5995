package defpackage;

import android.annotation.SuppressLint;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class f99 extends qa1 implements tqg {

    @SuppressLint({"VisibleForTests"})
    public final Map<String, ModuleSpec> a;

    public f99() {
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        this.a = lc9.a0(new Pair(ReactDrawerLayoutManager.REACT_CLASS, companion.viewManagerSpec(new w89())), new Pair(ReactHorizontalScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new e99())), new Pair(ReactHorizontalScrollContainerViewManager.REACT_CLASS, companion.viewManagerSpec(new o89())), new Pair(ReactProgressBarViewManager.REACT_CLASS, companion.viewManagerSpec(new p89())), new Pair(ReactSafeAreaViewManager.REACT_CLASS, companion.viewManagerSpec(new q89())), new Pair(ReactScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new r89(0))), new Pair(ReactSwitchManager.REACT_CLASS, companion.viewManagerSpec(new s89(0))), new Pair(SwipeRefreshLayoutManager.REACT_CLASS, companion.viewManagerSpec(new t89())), new Pair(FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, companion.viewManagerSpec(new u89())), new Pair(ReactImageManager.REACT_CLASS, companion.viewManagerSpec(new v89())), new Pair(ReactModalHostManager.REACT_CLASS, companion.viewManagerSpec(new x89())), new Pair(ReactRawTextManager.REACT_CLASS, companion.viewManagerSpec(new y89())), new Pair(ReactTextInputManager.REACT_CLASS, companion.viewManagerSpec(new z89())), new Pair("RCTText", companion.viewManagerSpec(new a99())), new Pair(ReactViewManager.REACT_CLASS, companion.viewManagerSpec(new b99())), new Pair(ReactVirtualTextViewManager.REACT_CLASS, companion.viewManagerSpec(new c99())), new Pair(ReactUnimplementedViewManager.REACT_CLASS, companion.viewManagerSpec(new d99())));
    }

    @Override // defpackage.tqg
    public final ViewManager<?, ?> createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider<? extends NativeModule> provider;
        str.getClass();
        ModuleSpec moduleSpec = this.a.get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        char c;
        ViewManager reactTextViewManager;
        reactApplicationContext.getClass();
        ReactDrawerLayoutManager reactDrawerLayoutManager = new ReactDrawerLayoutManager();
        ReactHorizontalScrollViewManager reactHorizontalScrollViewManager = new ReactHorizontalScrollViewManager(null, 1, null);
        ReactHorizontalScrollContainerViewManager reactHorizontalScrollContainerViewManager = new ReactHorizontalScrollContainerViewManager();
        ReactProgressBarViewManager reactProgressBarViewManager = new ReactProgressBarViewManager();
        ReactScrollViewManager reactScrollViewManager = new ReactScrollViewManager(null, 1, null);
        ReactSwitchManager reactSwitchManager = new ReactSwitchManager();
        ReactSafeAreaViewManager reactSafeAreaViewManager = new ReactSafeAreaViewManager();
        SwipeRefreshLayoutManager swipeRefreshLayoutManager = new SwipeRefreshLayoutManager();
        FrescoBasedReactTextInlineImageViewManager frescoBasedReactTextInlineImageViewManager = new FrescoBasedReactTextInlineImageViewManager(null, null, 3, null);
        ReactImageManager reactImageManager = new ReactImageManager(null, null, null, 7, null);
        ReactModalHostManager reactModalHostManager = new ReactModalHostManager();
        ReactRawTextManager reactRawTextManager = new ReactRawTextManager();
        ReactTextInputManager reactTextInputManager = new ReactTextInputManager();
        if (ie7.g0.enablePreparedTextLayout()) {
            c = 3;
            reactTextViewManager = new PreparedLayoutTextViewManager(null, 1, null);
        } else {
            c = 3;
            reactTextViewManager = new ReactTextViewManager(null, 1, null);
        }
        ReactViewManager reactViewManager = new ReactViewManager();
        ReactVirtualTextViewManager reactVirtualTextViewManager = new ReactVirtualTextViewManager();
        ReactUnimplementedViewManager reactUnimplementedViewManager = new ReactUnimplementedViewManager();
        ViewManager[] viewManagerArr = new ViewManager[17];
        viewManagerArr[0] = reactDrawerLayoutManager;
        viewManagerArr[1] = reactHorizontalScrollViewManager;
        viewManagerArr[2] = reactHorizontalScrollContainerViewManager;
        viewManagerArr[c] = reactProgressBarViewManager;
        viewManagerArr[4] = reactScrollViewManager;
        viewManagerArr[5] = reactSwitchManager;
        viewManagerArr[6] = reactSafeAreaViewManager;
        viewManagerArr[7] = swipeRefreshLayoutManager;
        viewManagerArr[8] = frescoBasedReactTextInlineImageViewManager;
        viewManagerArr[9] = reactImageManager;
        viewManagerArr[10] = reactModalHostManager;
        viewManagerArr[11] = reactRawTextManager;
        viewManagerArr[12] = reactTextInputManager;
        viewManagerArr[13] = reactTextViewManager;
        viewManagerArr[14] = reactViewManager;
        viewManagerArr[15] = reactVirtualTextViewManager;
        viewManagerArr[16] = reactUnimplementedViewManager;
        return u63.a0(viewManagerArr);
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        if (str.equals("AccessibilityInfo")) {
            return new AccessibilityInfoModule(reactApplicationContext);
        }
        if (str.equals("Appearance")) {
            return new AppearanceModule(reactApplicationContext, null, 2, null);
        }
        if (str.equals("AppState")) {
            return new AppStateModule(reactApplicationContext);
        }
        if (str.equals("BlobModule")) {
            return new BlobModule(reactApplicationContext);
        }
        if (str.equals("DevLoadingView")) {
            return new DevLoadingModule(reactApplicationContext);
        }
        FileReaderModule.INSTANCE.getClass();
        if (str.equals(FileReaderModule.NAME)) {
            return new FileReaderModule(reactApplicationContext);
        }
        if (str.equals("Clipboard")) {
            return new ClipboardModule(reactApplicationContext);
        }
        if (str.equals("DialogManagerAndroid")) {
            return new DialogModule(reactApplicationContext);
        }
        if (str.equals(FrescoModule.NAME)) {
            return new FrescoModule(reactApplicationContext, true, (n27) null);
        }
        if (str.equals("I18nManager")) {
            return new I18nManagerModule(reactApplicationContext);
        }
        if (str.equals("ImageLoader")) {
            return new ImageLoaderModule(reactApplicationContext);
        }
        if (str.equals("ImageStoreManager")) {
            return new ImageStoreManager(reactApplicationContext);
        }
        if (str.equals("IntentAndroid")) {
            return new IntentModule(reactApplicationContext);
        }
        if (str.equals("NativeAnimatedModule")) {
            if (!ie7.g0.cxxNativeAnimatedEnabled()) {
                return new NativeAnimatedModule(reactApplicationContext);
            }
        } else {
            if (str.equals("Networking")) {
                return new NetworkingModule(reactApplicationContext);
            }
            if (str.equals("PermissionsAndroid")) {
                return new PermissionsModule(reactApplicationContext);
            }
            if (str.equals("ShareModule")) {
                return new ShareModule(reactApplicationContext);
            }
            if (str.equals("StatusBarManager")) {
                return new StatusBarModule(reactApplicationContext);
            }
            if (str.equals("SoundManager")) {
                return new SoundManagerModule(reactApplicationContext);
            }
            if (str.equals("ToastAndroid")) {
                return new ToastModule(reactApplicationContext);
            }
            if (str.equals("Vibration")) {
                return new VibrationModule(reactApplicationContext);
            }
            if (str.equals("WebSocketModule")) {
                return new WebSocketModule(reactApplicationContext);
            }
            if (str.equals("ReactDevToolsSettingsManager")) {
                return new ReactDevToolsSettingsManagerModule(reactApplicationContext);
            }
            if (str.equals("ReactDevToolsRuntimeSettingsModule")) {
                return new ReactDevToolsRuntimeSettingsModule(reactApplicationContext);
            }
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        Class[] clsArr = (Class[]) ut0.i0(new Class[]{AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, ie7.g0.cxxNativeAnimatedEnabled() ? null : NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class}).toArray(new Class[0]);
        ArrayList<Class> arrayList = new ArrayList();
        for (Class cls : clsArr) {
            if (cls.isAnnotationPresent(nmc.class)) {
                arrayList.add(cls);
            }
        }
        int iV = kc9.V(t92.r0(arrayList, 10));
        if (iV < 16) {
            iV = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (Class cls2 : arrayList) {
            Annotation annotation = cls2.getAnnotation(nmc.class);
            if (annotation == null) {
                r6.g("Required value was null.");
                return null;
            }
            nmc nmcVar = (nmc) annotation;
            Pair pair = new Pair(nmcVar.name(), new ReactModuleInfo(nmcVar.name(), cls2.getName(), nmcVar.canOverrideExistingModule(), nmcVar.needsEagerInit(), nmcVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls2)));
            linkedHashMap.put(pair.d(), pair.e());
        }
        return new omc() { // from class: n89
            @Override // defpackage.omc
            public final Map a() {
                return linkedHashMap;
            }
        };
    }

    @Override // defpackage.tqg
    public final Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return this.a.keySet();
    }

    @Override // defpackage.qa1
    public final List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return z92.z1(this.a.values());
    }
}
