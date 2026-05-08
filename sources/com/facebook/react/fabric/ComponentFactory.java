package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import defpackage.zkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/facebook/react/fabric/ComponentFactory;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentFactory {
    private static final a Companion = new a();
    private final HybridData mHybridData;

    public static final class a {
    }

    static {
        zkd.M();
    }

    public ComponentFactory() {
        Companion.getClass();
        this.mHybridData = initHybrid();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();
}
