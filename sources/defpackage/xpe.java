package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class xpe extends pvf<Date> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            if (iyfVar.a == Date.class) {
                return new xpe();
            }
            return null;
        }
    }

    @Override // defpackage.pvf
    public final Date a(nb8 nb8Var) throws IOException {
        java.util.Date date;
        if (nb8Var.j0() == sb8.X) {
            nb8Var.l1();
            return null;
        }
        String strI0 = nb8Var.I0();
        try {
            synchronized (this) {
                date = this.a.parse(strI0);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            ja.n(akb.m("Failed parsing '", strI0, "' as SQL Date; at path "), nb8Var.Q(), e);
            return null;
        }
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            gc8Var.Q();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date2);
        }
        gc8Var.j0(str);
    }
}
