package com.rivereactnative;

import android.view.View;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.RiveException;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import defpackage.anc;
import defpackage.dmc;
import defpackage.nz4;
import defpackage.o72;
import defpackage.pv6;
import defpackage.zd1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/rivereactnative/RiveReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "T", "", "node", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function1;", "Lcom/rivereactnative/j;", "stateGetter", "Lj6g;", "handleState", "(ILcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;)V", "", "getName", "()Ljava/lang/String;", "inputName", "getBooleanState", "(ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getNumberState", "path", "getBooleanStateAtPath", "(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getNumberStateAtPath", "type", "addListener", "(Ljava/lang/String;)V", "removeListeners", "(Ljava/lang/Integer;)V", "rive-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiveReactNativeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveReactNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean getBooleanState$lambda$0(String str, j jVar) {
        RiveFileController controller;
        List<StateMachineInstance> stateMachines;
        jVar.getClass();
        str.getClass();
        try {
            anc ancVar = jVar.b;
            StateMachineInstance stateMachineInstance = (ancVar == null || (controller = ancVar.getController()) == null || (stateMachines = controller.getStateMachines()) == null) ? null : stateMachines.get(0);
            SMIInput sMIInputInput = stateMachineInstance != null ? stateMachineInstance.input(str) : null;
            if (sMIInputInput instanceof SMIBoolean) {
                return Boolean.valueOf(((SMIBoolean) sMIInputInput).getValue());
            }
            return null;
        } catch (RiveException e) {
            jVar.f(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean getBooleanStateAtPath$lambda$2(String str, String str2, j jVar) {
        RiveFileController controller;
        jVar.getClass();
        str.getClass();
        str2.getClass();
        try {
            anc ancVar = jVar.b;
            Artboard activeArtboard = (ancVar == null || (controller = ancVar.getController()) == null) ? null : controller.getActiveArtboard();
            SMIInput sMIInputInput = activeArtboard != null ? activeArtboard.input(str, str2) : null;
            if (sMIInputInput instanceof SMIBoolean) {
                return Boolean.valueOf(((SMIBoolean) sMIInputInput).getValue());
            }
            return null;
        } catch (RiveException e) {
            jVar.f(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float getNumberState$lambda$1(String str, j jVar) {
        RiveFileController controller;
        List<StateMachineInstance> stateMachines;
        jVar.getClass();
        str.getClass();
        try {
            anc ancVar = jVar.b;
            StateMachineInstance stateMachineInstance = (ancVar == null || (controller = ancVar.getController()) == null || (stateMachines = controller.getStateMachines()) == null) ? null : stateMachines.get(0);
            SMIInput sMIInputInput = stateMachineInstance != null ? stateMachineInstance.input(str) : null;
            if (sMIInputInput instanceof SMINumber) {
                return Float.valueOf(((SMINumber) sMIInputInput).getValue());
            }
            return null;
        } catch (RiveException e) {
            jVar.f(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float getNumberStateAtPath$lambda$3(String str, String str2, j jVar) {
        RiveFileController controller;
        jVar.getClass();
        str.getClass();
        str2.getClass();
        try {
            anc ancVar = jVar.b;
            Artboard activeArtboard = (ancVar == null || (controller = ancVar.getController()) == null) ? null : controller.getActiveArtboard();
            SMIInput sMIInputInput = activeArtboard != null ? activeArtboard.input(str, str2) : null;
            if (sMIInputInput instanceof SMINumber) {
                return Float.valueOf(((SMINumber) sMIInputInput).getValue());
            }
            return null;
        } catch (RiveException e) {
            jVar.f(e);
            return null;
        }
    }

    private final <T> void handleState(int node, Promise promise, Function1<? super j, ? extends T> stateGetter) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        UIManager uIManagerJ = dmc.j(reactApplicationContext, node, true);
        View viewResolveView = uIManagerJ != null ? uIManagerJ.resolveView(node) : null;
        j jVar = viewResolveView instanceof j ? (j) viewResolveView : null;
        if (jVar != null) {
            promise.resolve(stateGetter.invoke(jVar));
        } else {
            promise.reject("VIEW_NOT_FOUND", "Could not find RiveReactNativeView");
        }
    }

    @ReactMethod
    public final void addListener(String type) {
    }

    @ReactMethod
    public final void getBooleanState(int node, String inputName, Promise promise) {
        inputName.getClass();
        promise.getClass();
        handleState(node, promise, new zd1(inputName, 2));
    }

    @ReactMethod
    public final void getBooleanStateAtPath(int node, String inputName, String path, Promise promise) {
        inputName.getClass();
        path.getClass();
        promise.getClass();
        handleState(node, promise, new o72(5, inputName, path));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RiveReactNativeModule";
    }

    @ReactMethod
    public final void getNumberState(int node, String inputName, Promise promise) {
        inputName.getClass();
        promise.getClass();
        handleState(node, promise, new pv6(inputName, 1));
    }

    @ReactMethod
    public final void getNumberStateAtPath(int node, String inputName, String path, Promise promise) {
        inputName.getClass();
        path.getClass();
        promise.getClass();
        handleState(node, promise, new nz4(inputName, path, 3));
    }

    @ReactMethod
    public final void removeListeners(Integer type) {
    }
}
