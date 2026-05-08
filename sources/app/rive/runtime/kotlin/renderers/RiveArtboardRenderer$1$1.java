package app.rive.runtime.kotlin.renderers;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.qv5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public /* synthetic */ class RiveArtboardRenderer$1$1 extends qv5 implements gu5<j6g> {
    public RiveArtboardRenderer$1$1(Object obj) {
        super(0, obj, RiveArtboardRenderer.class, "start", "start()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RiveArtboardRenderer) this.receiver).start();
    }

    @Override // defpackage.gu5
    public /* bridge */ /* synthetic */ j6g invoke() {
        invoke2();
        return j6g.a;
    }
}
