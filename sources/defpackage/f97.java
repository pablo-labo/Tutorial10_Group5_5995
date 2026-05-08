package defpackage;

import android.content.Context;
import defpackage.v03;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class f97 implements xh8 {
    public final ksa a;
    public final g87 b;
    public final e13 c;
    public boolean d;
    public String e;
    public final Lazy f;

    public f97(ksa ksaVar, g87 g87Var) {
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
        g87Var.getClass();
        this.a = ksaVar;
        this.b = g87Var;
        this.c = eu2VarA;
        this.f = boa.E(qt8.a, new e97(this));
    }

    public static String a(Context context) {
        context.getClass();
        if (na6.d.c(context, oa6.a) != 0) {
            return "";
        }
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        return (String) bu8.d0.a(bu8.b[13], bu8Var);
    }

    public final void b(Context context, String str, boolean z) {
        context.getClass();
        str.getClass();
        if (!z && a(context).equals(str)) {
            ArrayList arrayList = lz2.a;
            lz2.d("IndeedFcmManager", "Already registered therefore returning", false, null);
            return;
        }
        g87 g87Var = this.b;
        if (g87Var.d()) {
            ArrayList arrayList2 = lz2.a;
            lz2.d("IndeedFcmManager", "DeviceId (" + g87Var + ") is null or needs reassignment therefore returning", false, null);
            return;
        }
        if (this.d) {
            this.e = str;
            ArrayList arrayList3 = lz2.a;
            lz2.d("IndeedFcmManager", "Another device token is being registered therefore returning", false, null);
        } else {
            this.d = true;
            u63.Y(this.c, null, null, new d97(this, context, str, null), 3);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
