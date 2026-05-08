package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class zhb implements MountItem {
    public final int a;
    public final int b;
    public final ReadableMap c;
    public final vse d;
    public final boolean e;
    public final String f;

    public zhb(int i, int i2, String str, ReadableMap readableMap, vse vseVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = readableMap;
        this.d = vseVar;
        this.e = z;
        String str2 = z55.a.get(str);
        this.f = str2 != null ? str2 : str;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final void execute(a0a a0aVar) {
        a0aVar.getClass();
        p0f p0fVarA = a0aVar.a(this.a);
        if (p0fVarA == null) {
            s55.f(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.a + "]");
            return;
        }
        String str = this.f;
        int i = this.b;
        ReadableMap readableMap = this.c;
        vse vseVar = this.d;
        boolean z = this.e;
        UiThreadUtil.assertOnUiThread();
        if (!p0fVarA.a && p0fVarA.d(i) == null) {
            p0fVarA.b(str, i, readableMap, vseVar, null, z);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final int getSurfaceId() {
        return this.a;
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("PreAllocateViewMountItem [");
        sb.append(this.b);
        sb.append("] - component: ");
        sb.append(this.f);
        sb.append(" surfaceId: ");
        sb.append(this.a);
        sb.append(" isLayoutable: ");
        sb.append(this.e);
        if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            sb.append(" props: ");
            String str = "<null>";
            ReadableMap readableMap = this.c;
            if (readableMap == null || (string = readableMap.toString()) == null) {
                string = "<null>";
            }
            sb.append(string);
            sb.append(" state: ");
            vse vseVar = this.d;
            if (vseVar != null && (string2 = vseVar.toString()) != null) {
                str = string2;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
