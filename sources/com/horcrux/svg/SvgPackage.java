package com.horcrux.svg;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import defpackage.l6;
import defpackage.nmc;
import defpackage.omc;
import defpackage.qa1;
import defpackage.tqg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public class SvgPackage extends qa1 implements tqg {
    private Map<String, ModuleSpec> mViewManagers;

    public class a implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    public class a0 implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    public class b implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    public class b0 implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    public class c implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    public class c0 implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    public class d implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    public class d0 implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    public class e implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    public class f implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    public class g implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    public class h implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    public class i implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    public class j implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    public class k implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    public class l implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeBlendManager();
        }
    }

    public class m implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    public class n implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeCompositeManager();
        }
    }

    public class o implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeFloodManager();
        }
    }

    public class p implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    public class q implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    public class r implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    public class s implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    public class t implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    public class u implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new SvgViewManager();
        }
    }

    public class v implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    public class w implements omc {
        @Override // defpackage.omc
        public final Map<String, ReactModuleInfo> a() {
            HashMap map = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i = 0; i < 2; i++) {
                Class cls = clsArr[i];
                nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
                map.put(nmcVar.name(), new ReactModuleInfo(nmcVar.name(), cls.getName(), nmcVar.canOverrideExistingModule(), nmcVar.needsEagerInit(), nmcVar.isCxxModule(), true));
            }
            return map;
        }
    }

    public class x implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    public class y implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    public class z implements Provider<NativeModule> {
        @Override // javax.inject.Provider
        public final NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap map = new HashMap();
            map.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k()));
            map.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new v()));
            map.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new x()));
            map.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new y()));
            map.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new z()));
            map.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new a0()));
            map.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new b0()));
            map.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new c0()));
            map.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d0()));
            map.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new a()));
            map.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new b()));
            map.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new c()));
            map.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d()));
            map.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e()));
            map.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f()));
            map.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g()));
            map.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h()));
            map.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i()));
            map.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j()));
            map.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l()));
            map.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m()));
            map.put(RenderableViewManager.FeCompositeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n()));
            map.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o()));
            map.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p()));
            map.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q()));
            map.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r()));
            map.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new s()));
            map.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new t()));
            map.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new u()));
            this.mViewManagers = map;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.tqg
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // defpackage.qa1
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (str.equals("RNSVGSvgViewModule")) {
            return new SvgViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public omc getReactModuleInfoProvider() {
        try {
            return (omc) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new w();
        } catch (IllegalAccessException | InstantiationException e2) {
            l6.p("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e2);
            return null;
        }
    }

    @Override // defpackage.tqg
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }

    @Override // defpackage.qa1
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }
}
