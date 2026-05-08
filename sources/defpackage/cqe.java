package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class cqe extends pvf<Time> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            if (iyfVar.a == Time.class) {
                return new cqe();
            }
            return null;
        }
    }

    @Override // defpackage.pvf
    public final Time a(nb8 nb8Var) throws IOException {
        Time time;
        if (nb8Var.j0() == sb8.X) {
            nb8Var.l1();
            return null;
        }
        String strI0 = nb8Var.I0();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(strI0).getTime());
            }
            return time;
        } catch (ParseException e) {
            ja.n(akb.m("Failed parsing '", strI0, "' as SQL Time; at path "), nb8Var.Q(), e);
            return null;
        }
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Time time) throws IOException {
        String str;
        Time time2 = time;
        if (time2 == null) {
            gc8Var.Q();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time2);
        }
        gc8Var.j0(str);
    }
}
