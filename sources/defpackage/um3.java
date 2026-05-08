package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class um3 implements m34 {
    @Override // defpackage.m34
    public final w24 a(Context context, dmc dmcVar, String str, boolean z, fuc fucVar, int i, c0f c0fVar, k24 k24Var, x6b x6bVar) {
        context.getClass();
        if (!z) {
            return new zyc();
        }
        try {
            Object objNewInstance = Class.forName("com.facebook.react.devsupport.BridgeDevSupportManager").getConstructor(Context.class, xlc.class, String.class, Boolean.TYPE, fuc.class, i24.class, Integer.TYPE, Map.class, c0f.class, k24.class, x6b.class).newInstance(context, dmcVar, str, Boolean.TRUE, fucVar, null, Integer.valueOf(i), null, c0fVar, k24Var, x6bVar);
            objNewInstance.getClass();
            return (w24) objNewInstance;
        } catch (Exception unused) {
            return new c8b(context);
        }
    }
}
