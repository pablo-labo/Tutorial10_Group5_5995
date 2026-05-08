package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cba implements nr0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Serializable c;
    public Object d;

    public cba(Intent intent) {
        this.a = 0;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.b = data;
        this.c = action;
        this.d = type;
    }

    @Override // defpackage.nr0
    public Object c() {
        return this.d;
    }

    @Override // defpackage.nr0
    public void clear() {
        ((ArrayList) this.c).clear();
        this.d = this.b;
        ((pm8) this.b).d0();
    }

    @Override // defpackage.nr0
    public void e(int i, int i2, int i3) {
        ((pm8) this.d).Y(i, i2, i3);
    }

    @Override // defpackage.nr0
    public void f(int i, int i2) {
        ((pm8) this.d).e0(i, i2);
    }

    @Override // defpackage.nr0
    public /* bridge */ /* synthetic */ void g(int i, Object obj) {
    }

    @Override // defpackage.nr0
    public void h() {
        rxa rxaVar = ((pm8) this.b).b0;
        if (rxaVar != null) {
            rxaVar.z();
        }
    }

    @Override // defpackage.nr0
    public void l(int i, Object obj) {
        ((pm8) this.d).P(i, (pm8) obj);
    }

    @Override // defpackage.nr0
    public void m(Object obj) {
        ((ArrayList) this.c).add(this.d);
        this.d = obj;
    }

    @Override // defpackage.nr0
    public void n() {
        ((pm8) this.d).f();
    }

    @Override // defpackage.nr0
    public void p() {
        this.d = ((ArrayList) this.c).remove(r0.size() - 1);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public cba(pm8 pm8Var) {
        this.a = 1;
        this.b = pm8Var;
        this.c = new ArrayList();
        this.d = pm8Var;
    }
}
