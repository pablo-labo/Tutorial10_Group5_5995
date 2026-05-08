package defpackage;

import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import androidx.media3.session.z;
import com.google.android.gms.tasks.OnSuccessListener;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.v20;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk3 implements lz8.a, OnSuccessListener, n8, k.c, t.g, x.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk3(v20.a aVar, List list) {
        this.a = 0;
        this.b = list;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = LaunchActivity.e1;
                Function1<? super et7, j6g> function1 = launchActivity.V0;
                qv8 qv8VarA = hh1.A(launchActivity);
                if (zBooleanValue) {
                    ((e1g) cr8.p(e1g.class)).a(launchActivity);
                } else {
                    Integer numC = ((kq7) cr8.p(kq7.class)).c("PushPrimer", 0, "PushNotificationDenyCount");
                    ((kq7) cr8.p(kq7.class)).a((numC != null ? numC.intValue() : 0) + 1, "PushPrimer", "PushNotificationDenyCount");
                }
                if (function1 != null) {
                    u63.Y(qv8VarA, null, null, new bt7(zBooleanValue, function1, null), 3);
                }
                break;
            default:
                idc idcVar = (idc) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ir irVar = idcVar.b;
                if (irVar != null) {
                    irVar.invoke(bool);
                }
                idcVar.b = null;
                break;
        }
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.Q();
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return x.h((o) sVar, dVar, i, (x.e) this.b, new xl9(dVar, i));
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.b;
        gVar.x0(kVar.c, i, kVar.z);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((v20) obj).getClass();
                break;
            case 1:
                ((gdb.c) obj).o0(((adb) obj2).o);
                break;
            case 5:
                ((gdb.c) obj).r0(((z) obj2).C);
                break;
            default:
                ((gdb.c) obj).N(((l.c) obj2).a.q);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4((Function1) this.b, obj);
    }

    public /* synthetic */ sk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
