package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RiveTextureView$activity$2 extends mj8 implements gu5<Activity> {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView$activity$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final Activity invoke() {
        Context context = this.this$0.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = null;
                break;
            }
            if (context instanceof Activity) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        context.getClass();
        return (Activity) context;
    }
}
