package androidx.compose.ui.graphics;

import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.cd6;
import defpackage.dce;
import defpackage.dd6;
import defpackage.j6g;
import defpackage.mrf;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final e a(e eVar, Function1<? super cd6, j6g> function1) {
        return eVar.o(new BlockGraphicsLayerElement(function1));
    }

    public static e b(e eVar, float f, float f2, float f3, float f4, dce dceVar, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = mrf.b;
        dce dceVar2 = (i & 2048) != 0 ? ytc.a : dceVar;
        long j2 = dd6.a;
        return eVar.o(new GraphicsLayerElement(f5, f6, f7, 0.0f, 0.0f, f8, 0.0f, j, dceVar2, false, j2, j2));
    }

    public static e c(e eVar, float f, float f2, float f3, float f4, float f5, float f6, dce dceVar, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 16) != 0 ? 0.0f : f5;
        float f12 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0.0f : f6;
        long j = mrf.b;
        dce dceVar2 = (i & 2048) != 0 ? ytc.a : dceVar;
        boolean z = (i & 4096) == 0;
        long j2 = dd6.a;
        return eVar.o(new GraphicsLayerElement(f7, f8, f9, f10, f11, 0.0f, f12, j, dceVar2, z, j2, j2));
    }
}
