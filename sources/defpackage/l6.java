package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import defpackage.e75;
import defpackage.lz8;
import defpackage.zu8;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6 implements lz8.a, e75.b, zu8.a, ru5, m.a, x.c, Continuation {
    public static Bundle e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String g(File file, String str) {
        return str + file;
    }

    public static String h(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static KotlinNothingValueException k(String str) {
        ae7.c(str);
        return new KotlinNothingValueException();
    }

    public static /* synthetic */ void l(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void m(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Throwable th) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3, th);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static void q(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        bj6 bj6Var = (bj6) obj;
        bj6Var.w();
        return e47.j(nz8.b(new k6(), bj6Var.x0.b));
    }

    @Override // androidx.media3.session.x.c
    public void c(vdb vdbVar, r.d dVar, List list) {
        vdbVar.B0(list);
    }

    @Override // zu8.a
    public String d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        kVar.i.f(26, new r40(10));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return Double.valueOf(ka6Var.W0());
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            d43 d43Var = (d43) task.getResult();
            cr8 cr8Var = cr8.c;
            cr8Var.k("Crashlytics report successfully enqueued to DataTransport: " + d43Var.c());
            File fileB = d43Var.b();
            z = true;
            if (fileB.delete()) {
                cr8Var.k("Deleted report file: " + fileB.getPath());
            } else {
                cr8Var.K(null, "Crashlytics could not delete report file: " + fileB.getPath());
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
