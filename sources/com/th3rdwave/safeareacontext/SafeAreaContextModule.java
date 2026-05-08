package com.th3rdwave.safeareacontext;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.gf4;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.ptc;
import defpackage.zid;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNCSafeAreaContext")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;", "Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getInitialWindowMetrics", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getTypedExportedConstants", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final String NAME = "RNCSafeAreaContext";

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        View viewFindViewById;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) ((currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView());
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.content)) != null) {
            gf4 gf4VarB = zid.b(viewGroup);
            ptc ptcVarA = zid.a(viewGroup, viewFindViewById);
            if (gf4VarB != null && ptcVarA != null) {
                return lc9.a0(new Pair("insets", lc9.a0(new Pair("top", Float.valueOf(nn2.C(gf4VarB.a))), new Pair(GesturesListener.SCROLL_DIRECTION_RIGHT, Float.valueOf(nn2.C(gf4VarB.b))), new Pair("bottom", Float.valueOf(nn2.C(gf4VarB.c))), new Pair(GesturesListener.SCROLL_DIRECTION_LEFT, Float.valueOf(nn2.C(gf4VarB.d))))), new Pair("frame", lc9.a0(new Pair("x", Float.valueOf(nn2.C(ptcVarA.a))), new Pair("y", Float.valueOf(nn2.C(ptcVarA.b))), new Pair("width", Float.valueOf(nn2.C(ptcVarA.c))), new Pair("height", Float.valueOf(nn2.C(ptcVarA.d))))));
            }
        }
        return null;
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaContext";
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public Map<String, Object> getTypedExportedConstants() {
        return kc9.W(new Pair("initialWindowMetrics", getInitialWindowMetrics()));
    }
}
