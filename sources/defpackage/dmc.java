package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class dmc implements xlc, b82 {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(String str, String str2, gu5 gu5Var, gu5 gu5Var2, List list, b bVar, int i) {
        int i2;
        String str3;
        gu5 gu5Var3;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-1829587927);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= cVarH.K(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(R.drawable.ic_idl_benefits_24) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            gu5Var3 = gu5Var;
            i2 |= cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            gu5Var3 = gu5Var;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= cVarH.x(list) ? 131072 : 65536;
        }
        int i3 = 1;
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            List list2 = list;
            mv.c(str3, gu5Var3, Integer.valueOf(R.drawable.ic_idl_benefits_24), !(list2 == null || list2.isEmpty()), null, bh2.c(-499668346, new k0c(i3, str, list, gu5Var2), cVarH), cVarH, ((i2 >> 3) & 14) | 196608 | ((i2 >> 6) & 112) | (i2 & 896), 16);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jtd(str, str2, gu5Var, gu5Var2, list, i);
        }
    }

    public static final void c(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(CoreFeature.DEFAULT_APP_VERSION);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final EventDispatcher d(ReactContext reactContext, int i) {
        reactContext.getClass();
        if (reactContext.isBridgeless()) {
            boolean z = reactContext instanceof mkf;
            Object obj = reactContext;
            if (z) {
                obj = ((mkf) reactContext).a;
            }
            obj.getClass();
            return ((cy4) obj).getEventDispatcher();
        }
        UIManager uIManagerJ = j(reactContext, i, false);
        if (uIManagerJ == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException(p6.c(i, "Unable to find UIManager for UIManagerType ")));
            return null;
        }
        EventDispatcher eventDispatcher = uIManagerJ.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException(p6.c(i, "Cannot get EventDispatcher for UIManagerType ")));
        }
        return eventDispatcher;
    }

    public static final EventDispatcher e(ReactContext reactContext, int i) {
        reactContext.getClass();
        EventDispatcher eventDispatcherD = d(reactContext, msb.e(i));
        if (eventDispatcherD == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException(p6.c(i, "Cannot get EventDispatcher for reactTag ")));
        }
        return eventDispatcherD;
    }

    public static final ReactContext f(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        context.getClass();
        return (ReactContext) context;
    }

    public static final int g(Context context) {
        if (context instanceof mkf) {
            return ((mkf) context).b;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int h(View view) {
        view.getClass();
        if (view instanceof vnc) {
            vnc vncVar = (vnc) view;
            if (vncVar.getUIManagerType() == 2) {
                return vncVar.getRootViewTag();
            }
        } else {
            int id = view.getId();
            if (msb.e(id) != 1) {
                Context context = view.getContext();
                if (!(context instanceof mkf) && (context instanceof ContextWrapper)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                int iG = g(context);
                if (iG == -1) {
                    ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException(bg.d(id, "Fabric View [", "] does not have SurfaceId associated with it")));
                }
                return iG;
            }
        }
        return -1;
    }

    public static final UIManager i(ReactContext reactContext, int i) {
        reactContext.getClass();
        return j(reactContext, i, true);
    }

    public static final UIManager j(ReactContext reactContext, int i, boolean z) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        catalystInstance.getClass();
        try {
            return i == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException(p6.c(i, "Cannot get UIManager for UIManagerType: ")));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static final UIManager k(ReactContext reactContext, int i) {
        reactContext.getClass();
        return j(reactContext, msb.e(i), true);
    }

    public static boolean l() {
        return pyd.h0 && !u63.a0(-1, 0, 1, 2).contains(Integer.valueOf(((kr7) cr8.p(kr7.class)).e("rnhp_parent_test").a)) && ((kr7) cr8.p(kr7.class)).e("rnhp_nav_refresh_tst").a >= 2;
    }

    public static boolean m(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    public static void n(Supplier supplier) {
        new wkf(supplier);
    }

    public static ThreadPoolExecutor o() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new v8a("firebase-iid-executor"));
    }

    @Override // defpackage.b82
    public long getTime() {
        return System.currentTimeMillis();
    }
}
