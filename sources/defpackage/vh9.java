package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.b;
import defpackage.gdb;
import defpackage.lz8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh9 implements lz8.a, k.c, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh9(k kVar, v8e v8eVar) {
        Bundle bundle = Bundle.EMPTY;
        this.a = kVar;
        this.b = v8eVar;
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.a;
        v8e v8eVar = (v8e) this.b;
        gVar.g1(kVar.c, i, v8eVar.b(), Bundle.EMPTY);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        z zVar = (z) this.a;
        Integer num = (Integer) this.b;
        ((gdb.c) obj).B(num.intValue(), zVar.d, zVar.e);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        b bVar = (b) this.a;
        Activity activity = (Activity) this.b;
        task.getClass();
        if (task.isSuccessful()) {
            bVar.a(activity, (ReviewInfo) task.getResult());
            bu8 bu8Var = bu8.a;
            bu8Var.j(0);
            bu8.i0.b(bu8.b[18], bu8Var, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ReviewException) {
            ArrayList arrayList = lz2.a;
            lz2.c("PlayRatingHelper", p6.c(((ReviewException) exception).getErrorCode(), "requestReviewFlow error, code="), false, exception, 4);
        } else {
            ArrayList arrayList2 = lz2.a;
            lz2.c("PlayRatingHelper", "requestReviewFlow was not successful", false, exception, 4);
        }
    }

    public /* synthetic */ vh9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
