package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfnf;", "Lbrg;", "<init>", "()V", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fnf extends brg {
    public final gse b;
    public final gse c;

    public fnf() {
        gse gseVarE = hh2.e(new dnf((cnf) null, (Integer) (0 == true ? 1 : 0), (rr) (0 == true ? 1 : 0), 15));
        this.b = gseVarE;
        this.c = gseVarE;
    }

    public static void h(fnf fnfVar, cnf cnfVar, Integer num, Function2 function2, int i) {
        Object value;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        fnfVar.getClass();
        gse gseVar = fnfVar.b;
        do {
            value = gseVar.getValue();
        } while (!gseVar.h(value, new dnf(cnfVar, num, new rr(13, fnfVar, function2), 8)));
    }

    public final void g() {
        gse gseVar;
        Object value;
        do {
            gseVar = this.b;
            value = gseVar.getValue();
        } while (!gseVar.h(value, new dnf((cnf) null, (Integer) (0 == true ? 1 : 0), (rr) (0 == true ? 1 : 0), 15)));
    }
}
