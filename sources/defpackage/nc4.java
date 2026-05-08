package defpackage;

import androidx.compose.runtime.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nc4 {
    public static final dvf<Float> a = new dvf<>(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, (af4) null, 6);

    public static final sc4 a(b bVar) {
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (objV == obj) {
            objV = new bh(2);
            bVar.p(objV);
        }
        Function1 function1 = (Function1) objV;
        Object[] objArr = new Object[0];
        ko2 ko2Var = new ko2(new cj2(3), new rc4(function1, 0));
        boolean zK = bVar.K(function1);
        Object objV2 = bVar.v();
        if (zK || objV2 == obj) {
            objV2 = new xr2(function1, 1);
            bVar.p(objV2);
        }
        return (sc4) ypd.N(objArr, ko2Var, (gu5) objV2, bVar, 0);
    }
}
