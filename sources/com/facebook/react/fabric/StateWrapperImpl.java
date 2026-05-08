package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import defpackage.ruc;
import defpackage.s55;
import defpackage.zkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0016\u0010 \u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000f¨\u0006#"}, d2 = {"Lcom/facebook/react/fabric/StateWrapperImpl;", "Lcom/facebook/jni/HybridClassBase;", "Lruc;", "<init>", "()V", "Lj6g;", "initHybrid", "Lcom/facebook/react/bridge/ReadableNativeMap;", "getStateDataImpl", "()Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "getStateMapBufferDataImpl", "()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "", "getStateDataReferenceImpl", "()Ljava/lang/Object;", "Lcom/facebook/react/bridge/NativeMap;", "map", "updateStateImpl", "(Lcom/facebook/react/bridge/NativeMap;)V", "Lcom/facebook/react/bridge/WritableMap;", "updateState", "(Lcom/facebook/react/bridge/WritableMap;)V", "destroyState", "", "toString", "()Ljava/lang/String;", "getStateDataMapBuffer", "stateDataMapBuffer", "getStateData", "stateData", "getStateDataReference", "stateDataReference", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
public final class StateWrapperImpl extends HybridClassBase implements ruc {
    private static final a Companion = new a();
    private static final String TAG = "StateWrapperImpl";

    public static final class a {
    }

    static {
        zkd.M();
    }

    private StateWrapperImpl() {
        initHybrid();
    }

    private final native ReadableNativeMap getStateDataImpl();

    private final native Object getStateDataReferenceImpl();

    private final native ReadableMapBuffer getStateMapBufferDataImpl();

    private final native void initHybrid();

    @Override // defpackage.vse
    public void destroyState() {
        if (isValid()) {
            resetNative();
        }
    }

    public ReadableNativeMap getStateData() {
        if (isValid()) {
            return getStateDataImpl();
        }
        s55.f(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // defpackage.vse
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (isValid()) {
            return getStateMapBufferDataImpl();
        }
        s55.f(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // defpackage.ruc
    public Object getStateDataReference() {
        if (isValid()) {
            return getStateDataReferenceImpl();
        }
        s55.f(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    public String toString() {
        String string;
        if (!isValid()) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        return (stateDataImpl == null || (string = stateDataImpl.toString()) == null) ? "<unexpected null: stateDataImpl>" : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vse
    public void updateState(WritableMap map) {
        map.getClass();
        if (isValid()) {
            updateStateImpl((NativeMap) map);
        } else {
            s55.f(TAG, "Race between StateWrapperImpl destruction and updateState");
        }
    }

    public final native void updateStateImpl(NativeMap map);
}
