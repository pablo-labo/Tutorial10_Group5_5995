package com.facebook.react.bridge;

import defpackage.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\u000b2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/CallbackImpl;", "Lcom/facebook/react/bridge/Callback;", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "", "callbackId", "<init>", "(Lcom/facebook/react/bridge/JSInstance;I)V", "", "", "args", "Lj6g;", "invoke", "([Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/JSInstance;", "I", "", "invoked", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CallbackImpl implements Callback {
    private static final Companion Companion = new Companion(null);
    private final int callbackId;
    private boolean invoked;
    private final JSInstance jsInstance;

    public CallbackImpl(JSInstance jSInstance, int i) {
        jSInstance.getClass();
        this.jsInstance = jSInstance;
        this.callbackId = i;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... args) {
        args.getClass();
        if (this.invoked) {
            b0.o("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            return;
        }
        JSInstance jSInstance = this.jsInstance;
        int i = this.callbackId;
        WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(args);
        writableNativeArrayFromJavaArgs.getClass();
        jSInstance.invokeCallback(i, writableNativeArrayFromJavaArgs);
        this.invoked = true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/CallbackImpl$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
