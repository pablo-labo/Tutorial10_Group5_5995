package expo.modules.adapters.react;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import defpackage.t92;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 ¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/adapters/react/FabricComponentsRegistry;", "", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "", "componentNames", "Lj6g;", "registerComponentsRegistry", "([Ljava/lang/String;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FabricComponentsRegistry {
    private final HybridData mHybridData;

    static {
        SoLoader.l("expo-modules-core");
    }

    public FabricComponentsRegistry(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ViewManager) it.next()).getName());
        }
        this.mHybridData = initHybrid();
        registerComponentsRegistry((String[]) arrayList2.toArray(new String[0]));
    }

    private final native HybridData initHybrid();

    private final native void registerComponentsRegistry(String[] componentNames);

    public final void finalize() {
        this.mHybridData.resetNative();
    }
}
