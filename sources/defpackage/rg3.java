package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class rg3 extends pvf<Date> {
    public static final a b = new a();
    public final ArrayList a;

    public class a implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            if (iyfVar.a == Date.class) {
                return new rg3();
            }
            return null;
        }
    }

    public rg3() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (yw7.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // defpackage.pvf
    public final Date a(nb8 nb8Var) throws IOException {
        if (nb8Var.j0() == sb8.X) {
            nb8Var.l1();
            return null;
        }
        String strI0 = nb8Var.I0();
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strI0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return so6.b(strI0, new ParsePosition(0));
                } catch (ParseException e) {
                    ja.n(akb.m("Failed parsing '", strI0, "' as Date; at path "), nb8Var.Q(), e);
                    return null;
                }
            } finally {
            }
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
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date2);
        }
        gc8Var.j0(str);
    }
}
