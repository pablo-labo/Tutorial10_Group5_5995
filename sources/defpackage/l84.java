package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.k84;

/* JADX INFO: loaded from: classes.dex */
public final class l84 implements tlg<k84> {
    public static final l84 a = new l84();
    public static final a.C0108a b = a.C0108a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.tlg
    public final k84 a(a aVar, float f) {
        k84.a aVar2;
        PointF pointF;
        aVar.h();
        String strI0 = null;
        k84.a aVar3 = k84.a.a;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        k84.a aVar4 = aVar3;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zNextBoolean = true;
        String strI02 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        while (aVar.hasNext()) {
            switch (aVar.N(b)) {
                case 0:
                    strI0 = aVar.I0();
                    break;
                case 1:
                    strI02 = aVar.I0();
                    break;
                case 2:
                    aVar2 = aVar3;
                    pointF = pointF2;
                    fNextDouble = (float) aVar.nextDouble();
                    aVar3 = aVar2;
                    pointF2 = pointF;
                    break;
                case 3:
                    aVar2 = aVar3;
                    pointF = pointF2;
                    int iNextInt2 = aVar.nextInt();
                    if (iNextInt2 <= 2 && iNextInt2 >= 0) {
                        aVar4 = k84.a.values()[iNextInt2];
                        aVar3 = aVar2;
                        pointF2 = pointF;
                    } else {
                        aVar3 = aVar2;
                        aVar4 = aVar3;
                        pointF2 = pointF;
                    }
                    break;
                case 4:
                    iNextInt = aVar.nextInt();
                    break;
                case 5:
                    aVar2 = aVar3;
                    pointF = pointF2;
                    fNextDouble2 = (float) aVar.nextDouble();
                    aVar3 = aVar2;
                    pointF2 = pointF;
                    break;
                case 6:
                    aVar2 = aVar3;
                    pointF = pointF2;
                    fNextDouble3 = (float) aVar.nextDouble();
                    aVar3 = aVar2;
                    pointF2 = pointF;
                    break;
                case 7:
                    iA = ec8.a(aVar);
                    break;
                case 8:
                    iA2 = ec8.a(aVar);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    aVar2 = aVar3;
                    pointF = pointF2;
                    fNextDouble4 = (float) aVar.nextDouble();
                    aVar3 = aVar2;
                    pointF2 = pointF;
                    break;
                case 10:
                    zNextBoolean = aVar.nextBoolean();
                    break;
                case 11:
                    aVar.a();
                    pointF2 = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.p();
                    aVar3 = aVar3;
                    break;
                case 12:
                    aVar.a();
                    aVar2 = aVar3;
                    pointF = pointF2;
                    pointF3 = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.p();
                    aVar3 = aVar2;
                    pointF2 = pointF;
                    break;
                default:
                    aVar.P();
                    aVar.I();
                    break;
            }
        }
        aVar.s();
        k84 k84Var = new k84();
        k84Var.a = strI0;
        k84Var.b = strI02;
        k84Var.c = fNextDouble;
        k84Var.d = aVar4;
        k84Var.e = iNextInt;
        k84Var.f = fNextDouble2;
        k84Var.g = fNextDouble3;
        k84Var.h = iA;
        k84Var.i = iA2;
        k84Var.j = fNextDouble4;
        k84Var.k = zNextBoolean;
        k84Var.l = pointF2;
        k84Var.m = pointF3;
        return k84Var;
    }
}
