package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class i62 implements Continuation, n0d {
    public Object a;

    public /* synthetic */ i62(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0175, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(defpackage.i62 r42, java.lang.String r43) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i62.b(i62, java.lang.String):java.util.ArrayList");
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ea8 ea8Var = (ea8) this.a;
            fc8 fc8Var = new fc8(stringWriter, ea8Var.a, ea8Var.b, ea8Var.c, ea8Var.d);
            fc8Var.j(obj);
            fc8Var.l();
            fc8Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.a;
        jdh jdhVar = new jdh((TaskCompletionSource) obj2);
        adh adhVar = (adh) ((mdh) obj).i();
        Parcel parcelC = adhVar.c();
        int i = rdh.a;
        parcelC.writeStrongBinder(jdhVar);
        rdh.c(parcelC, beginSignInRequest);
        adhVar.e(parcelC, 1);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }
}
