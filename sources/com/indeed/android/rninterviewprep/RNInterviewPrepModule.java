package com.indeed.android.rninterviewprep;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule;
import defpackage.cr8;
import defpackage.fh7;
import defpackage.idc;
import defpackage.ir;
import defpackage.j6g;
import defpackage.lr5;
import defpackage.lx5;
import defpackage.my0;
import defpackage.nic;
import defpackage.nmc;
import defpackage.ny0;
import defpackage.oh7;
import defpackage.ot2;
import defpackage.s2g;
import defpackage.u63;
import defpackage.w34;
import defpackage.w92;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseInterviewPrepModule.MODULE_NAME)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\"\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b'\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(¨\u0006)"}, d2 = {"Lcom/indeed/android/rninterviewprep/RNInterviewPrepModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseInterviewPrepModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/app/Activity;", "activity", "Lidc;", "findInterviewPrepFragment", "(Landroid/app/Activity;)Lidc;", "Lcom/facebook/react/bridge/ReadableArray;", "array", "", "", "readableArrayToList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Llx5$b;", "builder", "Lj6g;", "addParamsFromMap", "(Lcom/facebook/react/bridge/ReadableMap;Llx5$b;)V", "getName", "()Ljava/lang/String;", "commonEventName", "eventType", "eventName", "", "eventVersion", "tags", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "logInterviewPrepEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "checkMicrophonePermission", "(Lcom/facebook/react/bridge/Promise;)V", "requestMicrophonePermission", "closeReactFragment", "Lcom/facebook/react/bridge/ReactApplicationContext;", "rninterviewprep_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNInterviewPrepModule extends IndeedRNBridgeBaseInterviewPrepModule {
    private final ReactApplicationContext reactContext;

    public static final /* synthetic */ class a {
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
    public RNInterviewPrepModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final void addParamsFromMap(ReadableMap params, lx5.b builder) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = params.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i = a.a[params.getType(strNextKey).ordinal()];
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
    public static final void closeReactFragment$lambda$4(idc idcVar, Promise promise) {
        idcVar.close();
        promise.resolve(null);
    }

    private final idc findInterviewPrepFragment(Activity activity) {
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
            if (obj instanceof idc) {
                arrayList2.add(obj);
            }
        }
        return (idc) z92.Q0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logInterviewPrepEvent$lambda$1(ReadableMap readableMap, RNInterviewPrepModule rNInterviewPrepModule, lx5.b bVar) {
        bVar.getClass();
        if (readableMap != null) {
            rNInterviewPrepModule.addParamsFromMap(readableMap, bVar);
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
    public static final void requestMicrophonePermission$lambda$3(idc idcVar, Promise promise) {
        ir irVar = new ir(promise, 12);
        idcVar.getClass();
        idcVar.b = irVar;
        idcVar.c.a("android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g requestMicrophonePermission$lambda$3$lambda$2(Promise promise, boolean z) {
        promise.resolve(z ? "granted" : "denied");
        return j6g.a;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule
    @ReactMethod
    public void checkMicrophonePermission(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        idc idcVarFindInterviewPrepFragment = findInterviewPrepFragment(currentActivity);
        if (idcVarFindInterviewPrepFragment == null) {
            promise.reject("NO_FRAGMENT", "Interview Prep RN fragment not found");
        } else {
            promise.resolve(ot2.a(idcVarFindInterviewPrepFragment.requireContext(), "android.permission.RECORD_AUDIO") == 0 ? "granted" : idcVarFindInterviewPrepFragment.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") ? "needed" : "blocked");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule
    @ReactMethod
    public void closeReactFragment(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        idc idcVarFindInterviewPrepFragment = findInterviewPrepFragment(currentActivity);
        if (idcVarFindInterviewPrepFragment == null) {
            promise.reject("NO_FRAGMENT", "Interview Prep RN fragment not found");
        } else {
            currentActivity.runOnUiThread(new my0(4, idcVarFindInterviewPrepFragment, promise));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return IndeedRNBridgeBaseInterviewPrepModule.MODULE_NAME;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule
    @ReactMethod
    public void logInterviewPrepEvent(String commonEventName, String eventType, String eventName, double eventVersion, ReadableArray tags, ReadableMap params, Promise promise) {
        commonEventName.getClass();
        eventType.getClass();
        eventName.getClass();
        promise.getClass();
        ((s2g) cr8.p(s2g.class)).a(new lx5(commonEventName, eventType, eventName, (int) eventVersion, readableArrayToList(tags), new w34(8, params, this)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseInterviewPrepModule
    @ReactMethod
    public void requestMicrophonePermission(Promise promise) {
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "No activity attached");
            return;
        }
        idc idcVarFindInterviewPrepFragment = findInterviewPrepFragment(currentActivity);
        if (idcVarFindInterviewPrepFragment == null) {
            promise.reject("NO_FRAGMENT", "Interview Prep RN fragment not found");
        } else {
            currentActivity.runOnUiThread(new ny0(2, idcVarFindInterviewPrepFragment, promise));
        }
    }
}
