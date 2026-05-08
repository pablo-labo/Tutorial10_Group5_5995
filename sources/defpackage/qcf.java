package defpackage;

import android.text.TextUtils;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.common.mapbuffer.a;
import com.facebook.react.uimanager.b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qcf {
    public float a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public zjf m;
    public float n;
    public float o;
    public float p;
    public int q;
    public boolean r;
    public boolean s;
    public b.c t;
    public b.d u;
    public int v;
    public int w;
    public String x;
    public String y;
    public float z;

    public static qcf a(a aVar) {
        qcf qcfVar = new qcf();
        qcfVar.a = Float.NaN;
        qcfVar.b = false;
        qcfVar.c = true;
        qcfVar.d = Float.NaN;
        qcfVar.f = false;
        qcfVar.h = Float.NaN;
        qcfVar.i = -1;
        qcfVar.j = -1.0f;
        qcfVar.k = -1.0f;
        qcfVar.l = Float.NaN;
        zjf zjfVar = zjf.b;
        qcfVar.m = zjfVar;
        qcfVar.n = 0.0f;
        qcfVar.o = 0.0f;
        qcfVar.p = 0.0f;
        qcfVar.q = 1426063360;
        qcfVar.r = false;
        qcfVar.s = false;
        qcfVar.t = null;
        qcfVar.u = null;
        qcfVar.v = -1;
        qcfVar.w = -1;
        qcfVar.x = null;
        qcfVar.y = null;
        qcfVar.z = Float.NaN;
        for (a.c cVar : aVar) {
            switch (cVar.getKey()) {
                case 0:
                    int iE = cVar.e();
                    qcfVar.b = true;
                    qcfVar.e = iE;
                    break;
                case 1:
                    int iE2 = cVar.e();
                    qcfVar.f = true;
                    qcfVar.g = iE2;
                    break;
                case 2:
                    qcfVar.h = (float) cVar.c();
                    break;
                case 3:
                    qcfVar.x = cVar.b();
                    break;
                case 4:
                    qcfVar.f((float) cVar.c());
                    break;
                case 6:
                    qcfVar.w = qpc.d(cVar.b());
                    break;
                case 7:
                    qcfVar.v = qpc.b(cVar.b());
                    break;
                case 8:
                    a aVarD = cVar.d();
                    if (aVarD.getC() == 0) {
                        qcfVar.y = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<a.c> it = aVarD.iterator();
                        while (it.hasNext()) {
                            switch (it.next().b()) {
                                case "stylistic-thirteen":
                                    arrayList.add("'ss13'");
                                    break;
                                case "stylistic-fifteen":
                                    arrayList.add("'ss15'");
                                    break;
                                case "stylistic-eighteen":
                                    arrayList.add("'ss18'");
                                    break;
                                case "proportional-nums":
                                    arrayList.add("'pnum'");
                                    break;
                                case "lining-nums":
                                    arrayList.add("'lnum'");
                                    break;
                                case "tabular-nums":
                                    arrayList.add("'tnum'");
                                    break;
                                case "oldstyle-nums":
                                    arrayList.add("'onum'");
                                    break;
                                case "stylistic-eight":
                                    arrayList.add("'ss08'");
                                    break;
                                case "stylistic-seven":
                                    arrayList.add("'ss07'");
                                    break;
                                case "stylistic-three":
                                    arrayList.add("'ss03'");
                                    break;
                                case "stylistic-eleven":
                                    arrayList.add("'ss11'");
                                    break;
                                case "stylistic-five":
                                    arrayList.add("'ss05'");
                                    break;
                                case "stylistic-four":
                                    arrayList.add("'ss04'");
                                    break;
                                case "stylistic-nine":
                                    arrayList.add("'ss09'");
                                    break;
                                case "stylistic-one":
                                    arrayList.add("'ss01'");
                                    break;
                                case "stylistic-six":
                                    arrayList.add("'ss06'");
                                    break;
                                case "stylistic-ten":
                                    arrayList.add("'ss10'");
                                    break;
                                case "stylistic-two":
                                    arrayList.add("'ss02'");
                                    break;
                                case "stylistic-sixteen":
                                    arrayList.add("'ss16'");
                                    break;
                                case "stylistic-twelve":
                                    arrayList.add("'ss12'");
                                    break;
                                case "stylistic-twenty":
                                    arrayList.add("'ss20'");
                                    break;
                                case "small-caps":
                                    arrayList.add("'smcp'");
                                    break;
                                case "stylistic-nineteen":
                                    arrayList.add("'ss19'");
                                    break;
                                case "stylistic-fourteen":
                                    arrayList.add("'ss14'");
                                    break;
                                case "stylistic-seventeen":
                                    arrayList.add("'ss17'");
                                    break;
                            }
                        }
                        qcfVar.y = TextUtils.join(", ", arrayList);
                    }
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    boolean zF = cVar.f();
                    if (zF != qcfVar.c) {
                        qcfVar.c = zF;
                        qcfVar.f(qcfVar.j);
                        qcfVar.g(qcfVar.k);
                    }
                    break;
                case 10:
                    qcfVar.l = (float) cVar.c();
                    break;
                case 11:
                    qcfVar.g((float) cVar.c());
                    break;
                case 15:
                    String strB = cVar.b();
                    qcfVar.r = false;
                    qcfVar.s = false;
                    for (String str : strB.split("-")) {
                        if ("underline".equals(str)) {
                            qcfVar.r = true;
                        } else if ("strikethrough".equals(str)) {
                            qcfVar.s = true;
                        }
                    }
                    break;
                case 18:
                    float fC = (float) cVar.c();
                    if (fC != qcfVar.p) {
                        qcfVar.p = fC;
                    }
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    int iE3 = cVar.e();
                    if (iE3 != qcfVar.q) {
                        qcfVar.q = iE3;
                    }
                    break;
                case 20:
                    qcfVar.n = nn2.G((float) cVar.c());
                    break;
                case 21:
                    qcfVar.o = nn2.G((float) cVar.c());
                    break;
                case 23:
                    d(cVar.b());
                    break;
                case 24:
                    qcfVar.t = b.c.a(cVar.b());
                    break;
                case 26:
                    qcfVar.u = b.d.values()[cVar.e()];
                    break;
                case 27:
                    String strB2 = cVar.b();
                    if ("none".equals(strB2)) {
                        qcfVar.m = zjfVar;
                    } else if ("uppercase".equals(strB2)) {
                        qcfVar.m = zjf.c;
                    } else if ("lowercase".equals(strB2)) {
                        qcfVar.m = zjf.d;
                    } else if ("capitalize".equals(strB2)) {
                        qcfVar.m = zjf.e;
                    } else {
                        s55.n("ReactNative", "Invalid textTransform: ".concat(strB2));
                        qcfVar.m = zjfVar;
                    }
                    break;
                case 29:
                    float fC2 = (float) cVar.c();
                    if (fC2 != qcfVar.d) {
                        qcfVar.d = fC2;
                        qcfVar.f(qcfVar.j);
                        qcfVar.g(qcfVar.k);
                    }
                    break;
            }
        }
        return qcfVar;
    }

    public static int c(int i, noc nocVar) {
        nocVar.getClass();
        return !nocVar.a.hasKey("textAlign") ? i : "justify".equals(nocVar.a.getString("textAlign")) ? 1 : 0;
    }

    public static int d(String str) {
        if (str != null && !"undefined".equals(str)) {
            if ("rtl".equals(str)) {
                return 1;
            }
            if ("ltr".equals(str)) {
                return 0;
            }
            s55.n("ReactNative", "Invalid layoutDirection: ".concat(str));
        }
        return -1;
    }

    public final float b() {
        float f = this.z;
        return (Float.isNaN(this.a) || Float.isNaN(f) || f <= this.a) ? this.a : f;
    }

    public final float e() {
        boolean z = this.c;
        float f = this.l;
        float fH = z ? nn2.H(f, Float.NaN) : nn2.G(f);
        int i = this.i;
        if (i > 0) {
            return fH / i;
        }
        u40.i(this.i, "FontSize should be a positive value. Current value: ");
        return 0.0f;
    }

    public final void f(float f) {
        this.j = f;
        if (f != -1.0f) {
            f = (float) (this.c ? Math.ceil(nn2.H(f, this.d)) : Math.ceil(nn2.G(f)));
        }
        this.i = (int) f;
    }

    public final void g(float f) {
        this.k = f;
        if (f == -1.0f) {
            this.a = Float.NaN;
        } else {
            this.a = this.c ? nn2.H(f, Float.NaN) : nn2.G(f);
        }
    }
}
