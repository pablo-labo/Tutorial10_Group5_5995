package com.facebook.react.defaults;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.f84;
import defpackage.inc;
import defpackage.jq3;
import defpackage.pnc;
import defpackage.w92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lpnc;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "Linc;", "packages", "", "cxxReactPackages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Companion", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultTurboModuleManagerDelegate extends pnc {
    private static final b Companion = new b();

    public static final class a extends pnc.a {
        public final ArrayList b = new ArrayList();

        @Override // pnc.a
        public final DefaultTurboModuleManagerDelegate a(ReactApplicationContext reactApplicationContext, List list) {
            reactApplicationContext.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                w92.w0(arrayList, (Iterable) ((Function1) it.next()).invoke(reactApplicationContext));
            }
            return new DefaultTurboModuleManagerDelegate(reactApplicationContext, list, arrayList, null);
        }
    }

    public static final class b {
        @f84
        public final HybridData initHybrid(List<Object> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }
    }

    static {
        jq3.a();
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends inc> list, List<Object> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }

    @f84
    public static final native HybridData initHybrid(List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }
}
