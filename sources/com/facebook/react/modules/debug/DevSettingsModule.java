package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.debug.DevSettingsModule;
import defpackage.l24;
import defpackage.m50;
import defpackage.nmc;
import defpackage.w24;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "DevSettings")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/debug/DevSettingsModule;", "Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lw24;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lw24;)V", "Lj6g;", "reload", "()V", "", "reason", "reloadWithReason", "(Ljava/lang/String;)V", "onFastRefresh", "", "isHotLoadingEnabled", "setHotLoadingEnabled", "(Z)V", "isProfilingEnabled", "setProfilingEnabled", "toggleElementInspector", "title", "addMenuItem", "openDebugger", "enabled", "setIsShakeToShowDevMenuEnabled", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "Lw24;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = "DevSettings";
    private final w24 devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, w24 w24Var) {
        super(reactApplicationContext);
        w24Var.getClass();
        this.devSupportManager = w24Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMenuItem$lambda$2(DevSettingsModule devSettingsModule, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        new ReadableMapBuilder(writableMapCreateMap).put("title", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = devSettingsModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevSettingsModule devSettingsModule) {
        devSettingsModule.devSupportManager.w();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String eventName) {
        eventName.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [v24] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(final String title) {
        title.getClass();
        this.devSupportManager.n(title, new l24() { // from class: v24
            @Override // defpackage.l24
            public final void a() {
                DevSettingsModule.addMenuItem$lambda$2(this.a, title);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
        this.devSupportManager.D();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.devSupportManager.f()) {
            UiThreadUtil.runOnUiThread(new m50(this, 3));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String reason) {
        reason.getClass();
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean isHotLoadingEnabled) {
        this.devSupportManager.g(isHotLoadingEnabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean enabled) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean isProfilingEnabled) {
        this.devSupportManager.x(isProfilingEnabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.devSupportManager.r();
    }
}
