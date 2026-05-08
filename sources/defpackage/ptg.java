package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.js9;
import defpackage.oj9;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ptg implements js9.a {
    public final String a;
    public final String b;

    public ptg(String str, String str2) {
        this.a = jh2.L(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // js9.a
    public final void b(oj9.a aVar) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numQ1 = bm7.Q1(str2);
                if (numQ1 != null) {
                    aVar.o = numQ1;
                }
                break;
            case 1:
                Integer numQ12 = bm7.Q1(str2);
                if (numQ12 != null) {
                    aVar.C = numQ12;
                }
                break;
            case 2:
                Integer numQ13 = bm7.Q1(str2);
                if (numQ13 != null) {
                    aVar.n = numQ13;
                }
                break;
            case 3:
                aVar.c = str2;
                break;
            case 4:
                aVar.D = str2;
                break;
            case 5:
                aVar.a = str2;
                break;
            case 6:
                aVar.g = str2;
                break;
            case 7:
                Integer numQ14 = bm7.Q1(str2);
                if (numQ14 != null) {
                    aVar.B = numQ14;
                }
                break;
            case 8:
                aVar.d = str2;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                aVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ptg ptgVar = (ptg) obj;
            if (this.a.equals(ptgVar.a) && this.b.equals(ptgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + akb.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
