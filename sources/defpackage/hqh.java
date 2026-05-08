package defpackage;

import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.zzhg;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqh {
    public static final /* synthetic */ int a = 0;

    static {
        int i = kqh.a;
    }

    public static o6i a(s7i s7iVar, int i, a aVar, String str) {
        Object obj = l8i.BROADCAST_ACTION_UNSPECIFIED;
        try {
            o7i o7iVarQ = y7i.q();
            int i2 = aVar.a;
            o7iVarQ.e();
            y7i.p((y7i) o7iVarQ.b, i2);
            String str2 = aVar.b;
            o7iVarQ.e();
            y7i.n((y7i) o7iVarQ.b, str2);
            if (s7iVar != null) {
                o7iVarQ.e();
                y7i.o((y7i) o7iVarQ.b, s7iVar);
            }
            if (str != null) {
                o7iVarQ.e();
                y7i.m((y7i) o7iVarQ.b, str);
            }
            j6i j6iVarP = o6i.p();
            j6iVarP.e();
            o6i o6iVar = (o6i) j6iVarP.b;
            boolean zL = o7iVarQ.b.l();
            oyh oyhVar = o7iVarQ.b;
            if (zL) {
                oyhVar.h();
                oyhVar = o7iVarQ.b;
            }
            oyhVar.getClass();
            if (!oyh.b(oyhVar, true)) {
                throw new zzhg("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
            }
            o6i.n(o6iVar, (y7i) oyhVar);
            j6iVarP.e();
            o6i.o((o6i) j6iVarP.b, i);
            if (!obj.equals(obj)) {
                j6iVarP.e();
                o6i.m((o6i) j6iVarP.b);
            }
            boolean zL2 = j6iVarP.b.l();
            oyh oyhVar2 = j6iVarP.b;
            if (zL2) {
                oyhVar2.h();
                oyhVar2 = j6iVarP.b;
            }
            oyhVar2.getClass();
            if (oyh.b(oyhVar2, true)) {
                return (o6i) oyhVar2;
            }
            throw new zzhg("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        } catch (Throwable th) {
            ooh.e("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }
}
