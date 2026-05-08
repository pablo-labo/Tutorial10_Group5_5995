package defpackage;

import defpackage.yze;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qze implements zhd {
    public final sze a;

    public qze(sze szeVar) {
        szeVar.getClass();
        this.a = szeVar;
    }

    @Override // defpackage.zhd
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yze Q1(String str) {
        str.getClass();
        sze szeVar = this.a;
        szeVar.getClass();
        String string = zve.s0(str).toString();
        if (string.length() >= 3) {
            String upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                yze.a aVar = new yze.a(szeVar, str);
                aVar.d = new int[0];
                aVar.e = new long[0];
                aVar.f = new double[0];
                aVar.V = new String[0];
                aVar.W = new byte[0][];
                return aVar;
            }
        }
        return new yze.b(szeVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
