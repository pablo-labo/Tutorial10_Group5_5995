package defpackage;

import android.os.Build;
import defpackage.o7d;
import expo.modules.imagepicker.UserRejectedPermissionsException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f27 implements j8b {
    public final /* synthetic */ qw1 a;

    public f27(qw1 qw1Var) {
        this.a = qw1Var;
    }

    @Override // defpackage.j8b
    public final void a(HashMap map) {
        int i = Build.VERSION.SDK_INT;
        o8b o8bVar = o8b.GRANTED;
        qw1 qw1Var = this.a;
        if (i >= 29) {
            i8b i8bVar = (i8b) map.get("android.permission.CAMERA");
            if ((i8bVar != null ? i8bVar.a : null) == o8bVar) {
                qw1Var.resumeWith(j6g.a);
                return;
            } else {
                qw1Var.resumeWith(new o7d.a(new UserRejectedPermissionsException()));
                return;
            }
        }
        i8b i8bVar2 = (i8b) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if ((i8bVar2 != null ? i8bVar2.a : null) == o8bVar) {
            i8b i8bVar3 = (i8b) map.get("android.permission.CAMERA");
            if ((i8bVar3 != null ? i8bVar3.a : null) == o8bVar) {
                qw1Var.resumeWith(j6g.a);
                return;
            }
        }
        qw1Var.resumeWith(new o7d.a(new UserRejectedPermissionsException()));
    }
}
