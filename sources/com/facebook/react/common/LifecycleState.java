package com.facebook.react.common;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/react/common/LifecycleState;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifecycleState {
    public static final LifecycleState a;
    public static final LifecycleState b;
    public static final LifecycleState c;
    public static final /* synthetic */ LifecycleState[] d;

    static {
        LifecycleState lifecycleState = new LifecycleState("BEFORE_CREATE", 0);
        a = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("BEFORE_RESUME", 1);
        b = lifecycleState2;
        LifecycleState lifecycleState3 = new LifecycleState("RESUMED", 2);
        c = lifecycleState3;
        d = new LifecycleState[]{lifecycleState, lifecycleState2, lifecycleState3};
    }

    public LifecycleState() {
        throw null;
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) d.clone();
    }
}
