package defpackage;

import android.net.Uri;
import android.os.Bundle;
import defpackage.t35;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class gad {
    public final yd8<?> a;
    public final t35<?> b;

    public gad(yd8<?> yd8Var) {
        yd8Var.getClass();
        this.a = yd8Var;
        iwc iwcVar = fwc.a;
        t35<?> qVar = yd8Var.equals(iwcVar.b(j6g.class)) ? new t35.q() : yd8Var.equals(iwcVar.b(Bundle.class)) ? new t35.e() : yd8Var.equals(iwcVar.b(int[].class)) ? new t35.m() : yd8Var.equals(iwcVar.b(float[].class)) ? new t35.l() : yd8Var.equals(iwcVar.b(double[].class)) ? new t35.h() : yd8Var.equals(iwcVar.b(boolean[].class)) ? new t35.d() : yd8Var.equals(iwcVar.b(byte[].class)) ? new t35.f() : yd8Var.equals(iwcVar.b(URI.class)) ? new t35.t() : yd8Var.equals(iwcVar.b(URL.class)) ? new t35.u() : yd8Var.equals(iwcVar.b(Uri.class)) ? new t35.a() : yd8Var.equals(iwcVar.b(File.class)) ? new t35.k() : yd8Var.equals(iwcVar.b(Pair.class)) ? new t35.p() : yd8Var.equals(iwcVar.b(Long.TYPE)) ? new t35.n() : yd8Var.equals(iwcVar.b(wd4.class)) ? new t35.i() : yd8Var.equals(iwcVar.b(Object.class)) ? new t35.b() : null;
        this.b = qVar == null ? Map.class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.o() : Enum.class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.j() : ftc.class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.s() : djc.class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.r() : Object[].class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.c() : Collection.class.isAssignableFrom(jh2.p(yd8Var)) ? new t35.g() : new t35.q() : qVar;
    }
}
