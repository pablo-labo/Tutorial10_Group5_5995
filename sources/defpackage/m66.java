package defpackage;

import android.util.Log;
import com.oney.WebRTCModule.e;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m66 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        HashMap map = lob.a;
        tng tngVarBuild = map.containsKey(str) ? ((ung) map.get(str)).build() : null;
        if (tngVarBuild == null) {
            Log.e(e.g, "no videoFrameProcessor associated with this name: " + obj);
        }
        return tngVarBuild;
    }
}
