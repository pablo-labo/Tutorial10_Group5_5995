package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o8<I, O> {

    public static final class a<T> {
        public final Serializable a;

        public a(Serializable serializable) {
            this.a = serializable;
        }
    }

    public abstract Intent a(Object obj, Context context);

    public a b(Object obj, Context context) {
        return null;
    }

    public abstract Object c(Intent intent, int i);
}
