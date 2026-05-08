package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pk6 {

    public static class a implements c {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // pk6.c
        public final eoe a(sif sifVar) {
            Iterator it = this.a.iterator();
            eoe eoeVarA = null;
            while (it.hasNext() && ((eoeVarA = ((c) it.next()).a(sifVar)) == null || !(eoeVarA instanceof l55))) {
            }
            return eoeVarA;
        }
    }

    public static class b implements d {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // pk6.d
        public final void a(sc3 sc3Var, uif uifVar) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(sc3Var, uifVar);
            }
        }
    }

    public interface c {
        eoe a(sif sifVar);
    }

    public interface d {
        void a(sc3 sc3Var, uif uifVar);
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static bve b(int i, String str) {
        bve bveVar = new bve(str, i);
        if (bveVar.compareTo(uc3.TRACE_ID_MIN) >= 0 && bveVar.compareTo(uc3.TRACE_ID_128_BITS_MAX) <= 0) {
            return bveVar;
        }
        l5.q(l5.l("ID out of range, must be between 0 and 2^128-1, got: ", str));
        return null;
    }

    public static bve c(int i, String str) {
        bve bveVar = new bve(str, i);
        if (bveVar.compareTo(uc3.TRACE_ID_MIN) >= 0 && bveVar.compareTo(uc3.TRACE_ID_64_BITS_MAX) <= 0) {
            return bveVar;
        }
        l5.q(l5.l("ID out of range, must be between 0 and 2^64-1, got: ", str));
        return null;
    }
}
