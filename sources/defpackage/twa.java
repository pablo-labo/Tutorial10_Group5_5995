package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class twa extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ zdf $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ dce $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twa(boolean z, boolean z2, d3a d3aVar, zdf zdfVar, dce dceVar) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = d3aVar;
        this.$colors = zdfVar;
        this.$shape = dceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            owa.a.a(this.$enabled, this.$isError, this.$interactionSource, null, this.$colors, this.$shape, 0.0f, 0.0f, bVar2, 100663296, UiRumDebugListener.DEFAULT_ALPHA);
        }
        return j6g.a;
    }
}
