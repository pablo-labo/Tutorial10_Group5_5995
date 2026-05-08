package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.other.HiredCelebrationContentKt$HiredCelebrationContent$2$3$1$6$1$1", f = "HiredCelebrationContent.kt", l = {}, m = "invokeSuspend")
public final class ii6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Long $hiredTimestamp;
    final /* synthetic */ g4a<Bitmap> $shareBitmap$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii6(g4a<Bitmap> g4aVar, Context context, Long l, lu2<? super ii6> lu2Var) {
        super(2, lu2Var);
        this.$shareBitmap$delegate = g4aVar;
        this.$context = context;
        this.$hiredTimestamp = l;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ii6(this.$shareBitmap$delegate, this.$context, this.$hiredTimestamp, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ii6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Uri uriB = null;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        Bitmap value = this.$shareBitmap$delegate.getValue();
        if (value != null) {
            Context context = this.$context;
            String str = "New_Job_Celebration" + this.$hiredTimestamp;
            context.getClass();
            try {
                uriB = Build.VERSION.SDK_INT >= 29 ? e37.b(context, value, str) : e37.c(context, value, str);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.c("ImageSaveAndShareUtils", l5.l("Error saving image: ", e.getMessage()), false, null, 12);
            }
            if (uriB != null) {
                Toast.makeText(context, context.getString(R.string.share_hired_image_save_success_toast), 0).show();
            } else {
                Toast.makeText(context, context.getString(R.string.share_hired_image_save_failure_toast), 0).show();
            }
        }
        return j6g.a;
    }
}
