package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends o8<Intent, ActivityResult> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        Intent intent = (Intent) obj;
        intent.getClass();
        return intent;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        return new ActivityResult(intent, i);
    }
}
