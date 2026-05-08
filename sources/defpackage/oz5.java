package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class oz5 {
    public final GestureDetector a;

    public oz5(Context context, GesturesListener gesturesListener) {
        this.a = new GestureDetector(context, gesturesListener, null);
    }
}
