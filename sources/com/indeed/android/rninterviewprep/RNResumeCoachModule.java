package com.indeed.android.rninterviewprep;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import defpackage.cr8;
import defpackage.ev2;
import defpackage.fh7;
import defpackage.j6g;
import defpackage.lr5;
import defpackage.lx5;
import defpackage.n60;
import defpackage.nic;
import defpackage.nmc;
import defpackage.oh7;
import defpackage.ot2;
import defpackage.ph1;
import defpackage.qec;
import defpackage.s2g;
import defpackage.tdc;
import defpackage.u63;
import defpackage.w92;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "ResumeCoachModule")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJK\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(¨\u0006+"}, d2 = {"Lcom/indeed/android/rninterviewprep/RNResumeCoachModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/app/Activity;", "activity", "Lqec;", "getRNResumeCoachFragment", "(Landroid/app/Activity;)Lqec;", "Lcom/facebook/react/bridge/ReadableArray;", "array", "", "", "readableArrayToList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Llx5$b;", "builder", "Lj6g;", "addParamsFromMap", "(Lcom/facebook/react/bridge/ReadableMap;Llx5$b;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "checkMicrophonePermission", "(Lcom/facebook/react/bridge/Promise;)V", "requestMicrophonePermission", "closeReactFragment", "commonEventName", "eventType", "eventName", "", "eventVersion", "tags", "logResumeCoachEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "a", "rninterviewprep_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNResumeCoachModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "ResumeCoachModule";
    private final ReactApplicationContext reactContext;

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNResumeCoachModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final void addParamsFromMap(ReadableMap params, lx5.b builder) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = params.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i = b.a[params.getType(strNextKey).ordinal()];
            if (i == 1) {
                builder.a(strNextKey, params.getString(strNextKey));
            } else if (i == 2) {
                builder.b(strNextKey, Long.valueOf((long) params.getDouble(strNextKey)));
            } else if (i == 3) {
                builder.c(strNextKey, Boolean.valueOf(params.getBoolean(strNextKey)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeReactFragment$lambda$2(qec qecVar, Promise promise) {
        qecVar.close();
        promise.resolve(null);
    }

    private final qec getRNResumeCoachFragment(Activity activity) {
        lr5 lr5VarU;
        g gVar = activity instanceof g ? (g) activity : null;
        if (gVar == null || (lr5VarU = gVar.u()) == null) {
            return null;
        }
        List<Fragment> listF = lr5VarU.c.f();
        listF.getClass();
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listF) {
            List<Fragment> listF2 = fragment.getChildFragmentManager().c.f();
            listF2.getClass();
            w92.w0(arrayList, z92.h1(u63.Z(fragment), listF2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof qec) {
                arrayList2.add(obj);
            }
        }
        return (qec) z92.Q0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logResumeCoachEvent$lambda$4(ReadableMap readableMap, RNResumeCoachModule rNResumeCoachModule, lx5.b bVar) {
        bVar.getClass();
        if (readableMap != null) {
            rNResumeCoachModule.addParamsFromMap(readableMap, bVar);
        }
        return j6g.a;
    }

    private final List<String> readableArrayToList(ReadableArray array) {
        if (array == null) {
            return zr4.a;
        }
        oh7 oh7VarH = nic.H(0, array.size());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            int iNextInt = ((fh7) it).nextInt();
            String string = array.getString(iNextInt);
            if (array.getType(iNextInt) != ReadableType.String) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestMicrophonePermission$lambda$1(qec qecVar, Promise promise) {
        tdc tdcVar = new tdc(1, promise);
        qecVar.getClass();
        qecVar.b = tdcVar;
        qecVar.c.a("android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g requestMicrophonePermission$lambda$1$lambda$0(Promise promise, boolean z) {
        promise.resolve(z ? "granted" : "denied");
        return j6g.a;
    }

    @ReactMethod
    public final void checkMicrophonePermission(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        qec rNResumeCoachFragment = getRNResumeCoachFragment(currentActivity);
        if (rNResumeCoachFragment == null) {
            promise.reject("NO_FRAGMENT", "RNResumeCoachFragment not found");
        } else {
            promise.resolve(ot2.a(rNResumeCoachFragment.requireContext(), "android.permission.RECORD_AUDIO") == 0 ? "granted" : rNResumeCoachFragment.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") ? "needed" : "blocked");
        }
    }

    @ReactMethod
    public final void closeReactFragment(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        qec rNResumeCoachFragment = getRNResumeCoachFragment(currentActivity);
        if (rNResumeCoachFragment == null) {
            promise.reject("NO_FRAGMENT", "RNResumeCoachFragment not found");
        } else {
            currentActivity.runOnUiThread(new n60(6, rNResumeCoachFragment, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ResumeCoachModule";
    }

    @ReactMethod
    public final void logResumeCoachEvent(String commonEventName, String eventType, String eventName, double eventVersion, ReadableArray tags, ReadableMap params, Promise promise) {
        commonEventName.getClass();
        eventType.getClass();
        eventName.getClass();
        promise.getClass();
        ((s2g) cr8.p(s2g.class)).a(new lx5(commonEventName, eventType, eventName, (int) eventVersion, readableArrayToList(tags), new ev2(4, params, this)));
        promise.resolve(null);
    }

    @ReactMethod
    public final void requestMicrophonePermission(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        qec rNResumeCoachFragment = getRNResumeCoachFragment(currentActivity);
        if (rNResumeCoachFragment == null) {
            promise.reject("NO_FRAGMENT", "RNResumeCoachFragment not found");
        } else {
            currentActivity.runOnUiThread(new ph1(3, rNResumeCoachFragment, promise));
        }
    }
}
