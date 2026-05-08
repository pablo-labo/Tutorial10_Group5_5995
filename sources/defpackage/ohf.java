package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.oj9;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ohf extends gr6 {
    public final String b;
    public final e47<String> c;

    public ohf(String str, String str2, qyc qycVar) {
        super(str);
        ka2.l(!qycVar.isEmpty());
        this.b = str2;
        e47<String> e47VarJ = e47.j(qycVar);
        this.c = e47VarJ;
        e47VarJ.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // js9.a
    public final void b(oj9.a aVar) {
        byte b;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                b = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569358:
                b = !str.equals("TCON") ? (byte) -1 : (byte) 12;
                break;
            case 2569891:
                b = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b = !str.equals("TDRC") ? (byte) -1 : (byte) 14;
                break;
            case 2570410:
                b = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b = !str.equals("TEXT") ? (byte) -1 : (byte) 16;
                break;
            case 2575251:
                b = !str.equals("TIT2") ? (byte) -1 : (byte) 17;
                break;
            case 2581512:
                b = !str.equals("TPE1") ? (byte) -1 : (byte) 18;
                break;
            case 2581513:
                b = !str.equals("TPE2") ? (byte) -1 : (byte) 19;
                break;
            case 2581514:
                b = !str.equals("TPE3") ? (byte) -1 : (byte) 20;
                break;
            case 2583398:
                b = !str.equals("TRCK") ? (byte) -1 : (byte) 21;
                break;
            case 2590194:
                b = !str.equals("TYER") ? (byte) -1 : (byte) 22;
                break;
            default:
                b = -1;
                break;
        }
        e47<String> e47Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    aVar.c = e47Var.get(0);
                    break;
                case 1:
                case 11:
                    aVar.z = e47Var.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = e47Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.t = Integer.valueOf(i);
                    aVar.u = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    aVar.b = e47Var.get(0);
                    break;
                case 4:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    aVar.d = e47Var.get(0);
                    break;
                case 5:
                case 20:
                    aVar.A = e47Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = e47Var.get(0);
                    String str4 = vjg.a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    aVar.n = Integer.valueOf(i3);
                    aVar.o = numValueOf;
                    break;
                case 7:
                case 17:
                    aVar.a = e47Var.get(0);
                    break;
                case 8:
                case 16:
                    aVar.y = e47Var.get(0);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                case 22:
                    aVar.s = Integer.valueOf(Integer.parseInt(e47Var.get(0)));
                    break;
                case 12:
                    Integer numQ1 = bm7.Q1(e47Var.get(0));
                    if (numQ1 != null) {
                        String strA = jr6.a(numQ1.intValue());
                        if (strA != null) {
                            aVar.D = strA;
                        }
                    } else {
                        aVar.D = e47Var.get(0);
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    ArrayList arrayListD = d(e47Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.u = (Integer) arrayListD.get(2);
                            }
                        }
                        aVar.t = (Integer) arrayListD.get(1);
                    }
                    aVar.s = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d(e47Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.x = (Integer) arrayListD2.get(2);
                            }
                        }
                        aVar.w = (Integer) arrayListD2.get(1);
                    }
                    aVar.v = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ohf.class != obj.getClass()) {
            return false;
        }
        ohf ohfVar = (ohf) obj;
        return this.a.equals(ohfVar.a) && Objects.equals(this.b, ohfVar.b) && this.c.equals(ohfVar.c);
    }

    public final int hashCode() {
        int iD = akb.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
