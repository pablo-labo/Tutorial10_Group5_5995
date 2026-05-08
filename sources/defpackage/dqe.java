package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class dqe extends pvf<Timestamp> {
    public static final a b = new a();
    public final pvf<Date> a;

    public class a implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            if (iyfVar.a == Timestamp.class) {
                return new dqe(ae6Var.c(new iyf<>(Date.class)));
            }
            return null;
        }
    }

    public dqe(pvf pvfVar) {
        this.a = pvfVar;
    }

    @Override // defpackage.pvf
    public final Timestamp a(nb8 nb8Var) {
        Date dateA = this.a.a(nb8Var);
        if (dateA != null) {
            return new Timestamp(dateA.getTime());
        }
        return null;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Timestamp timestamp) {
        this.a.b(gc8Var, timestamp);
    }
}
