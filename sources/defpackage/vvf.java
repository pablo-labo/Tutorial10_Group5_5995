package defpackage;

import defpackage.svf;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class vvf implements qvf {
    public final /* synthetic */ svf.r a;

    public vvf(svf.r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Class<? super T> cls = iyfVar.a;
        if (cls == Calendar.class || cls == GregorianCalendar.class) {
            return this.a;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + this.a + "]";
    }
}
