package defpackage;

import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.gs7;
import defpackage.sp7;
import defpackage.wgf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ej implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ej(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        long j;
        nif nifVarD;
        lu8 lu8Var;
        le0 le0Var;
        int i = this.a;
        boolean z = false;
        ps7 ps7Var = ps7.b;
        ps7 ps7Var2 = ps7.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iba) obj2).p("SCHOOL_COUNTRY");
                ((luc) obj).element = "";
                return j6g.a;
            case 1:
                ((iba) obj2).p("DATE_PUBLISHED");
                ((g4a) obj).setValue(null);
                return j6g.a;
            case 2:
                return new lh7(ak2.E(((zcf) obj2).L0((sl8) ((gu5) obj).invoke())));
            case 3:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                return j6g.a;
            case 4:
                nn4 nn4Var = (nn4) obj2;
                vs7 vs7VarK = jsb.k((g2h) obj);
                Function2<? super ps7, ? super vs7, j6g> function2 = nn4Var.l0;
                nn4Var.l0 = null;
                if (nn4Var.k0) {
                    ps7Var = ps7Var2;
                }
                if (function2 != null) {
                    function2.invoke(ps7Var, vs7VarK);
                }
                nn4Var.Q();
                return j6g.a;
            case 5:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingConversation", "sendFailedTapToRetry", null, null, 12));
                ((Function1) obj2).invoke(((EventRecord) obj).getId());
                return j6g.a;
            case 6:
                n76.h((g4a) obj2, (g4a) obj);
                return j6g.a;
            case 7:
                ((Function1) obj2).invoke(((vnd) obj).a);
                return j6g.a;
            case 8:
                e2b e2bVar = (e2b) obj2;
                e13 e13Var = (e13) obj;
                if (e2bVar.d()) {
                    u63.Y(e13Var, null, null, new m1b(e2bVar, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case DatadogLogGenerator.CRASH /* 9 */:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.a(lr5VarU, new gs7.h(null, new ok4((wu5) obj, 6)));
                return j6g.a;
            case 10:
                rgf rgfVar = (rgf) obj2;
                long j2 = ((th7) ((g4a) obj).getValue()).a;
                ooa ooaVarI = rgfVar.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (ooaVarI != null) {
                    long j3 = ooaVarI.a;
                    le0 le0VarL = rgfVar.l();
                    if (le0VarL != null && le0VarL.b.length() != 0) {
                        jf6 jf6Var = (jf6) ((gme) rgfVar.r).getValue();
                        int i2 = jf6Var == null ? -1 : wgf.c.a[jf6Var.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = rgfVar.m().b;
                                int i3 = kjf.c;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    l.g();
                                    return null;
                                }
                                long j5 = rgfVar.m().b;
                                int i4 = kjf.c;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            lu8 lu8Var2 = rgfVar.d;
                            if (lu8Var2 != null && (nifVarD = lu8Var2.d()) != null && (lu8Var = rgfVar.d) != null && (le0Var = lu8Var.a.a) != null) {
                                int iC = nic.C(rgfVar.b.c(i5), 0, le0Var.b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (nifVarD.d(j3) >> 32));
                                mif mifVar = nifVarD.a;
                                q1a q1aVar = mifVar.b;
                                int iD = q1aVar.d(iC);
                                float fE = mifVar.e(iD);
                                float f = mifVar.f(iD);
                                float fB = nic.B(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                if (th7.b(j2, 0L) || Math.abs(fIntBitsToFloat - fB) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = q1aVar.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(((q1aVar.b(iD) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new ooa(jFloatToRawIntBits);
            default:
                t7g t7gVar = (t7g) obj2;
                String str = (String) obj;
                t7gVar.close();
                Function2<? super ps7, ? super or7, j6g> function22 = t7gVar.j0;
                if (function22 != null) {
                    if (t7gVar.g0) {
                        ps7Var = ps7Var2;
                    }
                    function22.invoke(ps7Var, new or7(str));
                }
                return j6g.a;
        }
    }
}
