package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 {

    public static class a {
        public static Object a(String str, Bundle bundle) {
            return bundle.getParcelable(str, ActivityResult.class);
        }
    }

    public static Object a(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
