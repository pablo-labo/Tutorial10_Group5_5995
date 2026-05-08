package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$createEmailOnlyChooserIntent$2", f = "ReportEmailHelper.kt", l = {}, m = "invokeSuspend")
public final class i2d extends c1f implements Function2<e13, lu2<? super Intent>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $emailIntent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2d(Intent intent, Context context, lu2<? super i2d> lu2Var) {
        super(2, lu2Var);
        this.$emailIntent = intent;
        this.$context = context;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i2d(this.$emailIntent, this.$context, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Intent> lu2Var) {
        return ((i2d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$emailIntent.resolveActivity(this.$context.getPackageManager()) == null) {
            return null;
        }
        Stack stack = new Stack();
        List<ResolveInfo> listQueryIntentActivities = this.$context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "info@domain.com", null)), 0);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent(this.$emailIntent);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            stack.add(intent);
        }
        return !stack.isEmpty() ? Intent.createChooser((Intent) stack.remove(0), null).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) stack.toArray(new Intent[0])) : Intent.createChooser(this.$emailIntent, null);
    }
}
