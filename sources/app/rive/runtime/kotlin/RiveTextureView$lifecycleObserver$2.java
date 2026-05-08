package app.rive.runtime.kotlin;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.yv8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyv8;", "invoke", "()Lyv8;", "<anonymous>"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0})
public final class RiveTextureView$lifecycleObserver$2 extends mj8 implements gu5<yv8> {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView$lifecycleObserver$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    @Override // defpackage.gu5
    public final yv8 invoke() {
        return this.this$0.createObserver();
    }
}
