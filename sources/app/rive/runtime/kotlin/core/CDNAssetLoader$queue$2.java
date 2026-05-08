package app.rive.runtime.kotlin.core;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.itg;
import defpackage.mj8;
import defpackage.o4d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo4d;", "invoke", "()Lo4d;", "<anonymous>"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0})
public final class CDNAssetLoader$queue$2 extends mj8 implements gu5<o4d> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNAssetLoader$queue$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.gu5
    public final o4d invoke() {
        return itg.a(this.$context);
    }
}
