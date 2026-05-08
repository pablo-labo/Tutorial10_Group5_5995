package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class o34 {
    public final Context a;
    public a b = null;

    public class a {
        public final String a;
        public final String b;

        public a(o34 o34Var) {
            Context context = o34Var.a;
            int iD = wc2.d(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (iD != 0) {
                this.a = "Unity";
                String string = context.getResources().getString(iD);
                this.b = string;
                String strL = l5.l("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strL, null);
                    return;
                }
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.a = "Flutter";
                    this.b = null;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                        return;
                    }
                    return;
                } catch (IOException unused) {
                }
            }
            this.a = null;
            this.b = null;
        }
    }

    public o34(Context context) {
        this.a = context;
    }
}
