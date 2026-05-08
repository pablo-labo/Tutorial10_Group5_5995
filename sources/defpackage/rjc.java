package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.b;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.a;
import defpackage.zjf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rjc extends xm8 {
    public HashMap O0;
    public final ppc o0;
    public int r0;
    public int t0;
    public boolean q0 = false;
    public boolean s0 = false;
    public b.c u0 = null;
    public b.d v0 = null;
    public int w0 = -1;
    public int x0 = 0;
    public int y0 = 1;
    public int z0 = 0;
    public float A0 = 0.0f;
    public float B0 = 0.0f;
    public float C0 = 0.0f;
    public int D0 = 1426063360;
    public boolean E0 = false;
    public boolean F0 = false;
    public boolean G0 = true;
    public boolean H0 = false;
    public float I0 = 0.0f;
    public int J0 = -1;
    public int K0 = -1;
    public String L0 = null;
    public String M0 = null;
    public boolean N0 = false;
    public final rcf p0 = new rcf();

    public rjc(ppc ppcVar) {
        this.o0 = ppcVar;
    }

    public static void m0(rjc rjcVar, SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, rcf rcfVar, boolean z, Map map, int i) {
        rcf rcfVar2;
        rcf rcfVar3;
        int i2;
        int i3;
        float fH;
        float f;
        rcf rcfVar4 = rjcVar.p0;
        if (rcfVar != null) {
            rcfVar4.getClass();
            rcf rcfVar5 = new rcf();
            rcfVar5.a = rcfVar.a;
            rcfVar5.b = !Float.isNaN(rcfVar4.b) ? rcfVar4.b : rcfVar.b;
            rcfVar5.c = !Float.isNaN(rcfVar4.c) ? rcfVar4.c : rcfVar.c;
            rcfVar5.d = !Float.isNaN(rcfVar4.d) ? rcfVar4.d : rcfVar.d;
            rcfVar5.e(!Float.isNaN(rcfVar4.g) ? rcfVar4.g : rcfVar.g);
            rcfVar5.e = !Float.isNaN(rcfVar4.e) ? rcfVar4.e : rcfVar.e;
            zjf zjfVar = rcfVar4.f;
            if (zjfVar == zjf.f) {
                zjfVar = rcfVar.f;
            }
            rcfVar5.f = zjfVar;
            rcfVar2 = rcfVar5;
        } else {
            rcfVar2 = rcfVar4;
        }
        int iG = rjcVar.g();
        int i4 = 0;
        while (i4 < iG) {
            loc locVarA = rjcVar.a(i4);
            if (locVarA instanceof unc) {
                String str = ((unc) locVarA).n0;
                if (str != null) {
                    zjf zjfVar2 = rcfVar2.f;
                    zjf.a.getClass();
                    spannableStringBuilder.append((CharSequence) zjf.a.a(str, zjfVar2));
                }
            } else if (locVarA instanceof rjc) {
                m0((rjc) locVarA, spannableStringBuilder, arrayList, rcfVar2, z, map, spannableStringBuilder.length());
            } else {
                if (locVarA instanceof gt5) {
                    spannableStringBuilder.append("0");
                    int length = spannableStringBuilder.length() - 1;
                    int length2 = spannableStringBuilder.length();
                    gt5 gt5Var = (gt5) locVarA;
                    mkf mkfVar = gt5Var.d;
                    hh1.n(mkfVar);
                    Resources resources = mkfVar.getResources();
                    int iCeil = (int) Math.ceil(gt5Var.s0);
                    i2 = iG;
                    i3 = i4;
                    int iCeil2 = (int) Math.ceil(gt5Var.u0);
                    resources.getClass();
                    rcfVar3 = rcfVar2;
                    arrayList.add(new tae(length, length2, new ht5(resources, iCeil2, iCeil, gt5Var.v0, gt5Var.q0, gt5Var.r0, gt5Var.o0, gt5Var.p0, gt5Var.t0)));
                } else {
                    rcfVar3 = rcfVar2;
                    i2 = iG;
                    i3 = i4;
                    if (!z) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + locVarA.getClass());
                    }
                    int i5 = locVarA.a;
                    a aVar = locVarA.j0;
                    YogaValue yogaValueM = aVar.m();
                    YogaValue yogaValueF = aVar.f();
                    r6h r6hVar = yogaValueM.b;
                    r6h r6hVar2 = r6h.POINT;
                    if (r6hVar == r6hVar2 && yogaValueF.b == r6hVar2) {
                        f = yogaValueM.a;
                        fH = yogaValueF.a;
                    } else {
                        locVarA.D();
                        float fJ = aVar.j();
                        fH = aVar.h();
                        f = fJ;
                    }
                    spannableStringBuilder.append("0");
                    arrayList.add(new tae(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new qhf(i5, (int) f, (int) fH)));
                    hh1.n(map);
                    map.put(Integer.valueOf(i5), locVarA);
                }
                locVarA.b();
                i4 = i3 + 1;
                iG = i2;
                rcfVar2 = rcfVar3;
            }
            rcfVar3 = rcfVar2;
            i2 = iG;
            i3 = i4;
            locVarA.b();
            i4 = i3 + 1;
            iG = i2;
            rcfVar2 = rcfVar3;
        }
        rcf rcfVar6 = rcfVar2;
        int length3 = spannableStringBuilder.length();
        if (length3 >= i) {
            if (rjcVar.q0) {
                arrayList.add(new tae(i, length3, new ReactForegroundColorSpan(rjcVar.r0)));
            }
            if (rjcVar.s0) {
                arrayList.add(new tae(i, length3, new ReactBackgroundColorSpan(rjcVar.t0)));
            }
            b.d dVar = rjcVar.v0;
            if (dVar == null ? rjcVar.u0 == b.c.d : dVar == b.d.a) {
                arrayList.add(new tae(i, length3, new vjc(rjcVar.a)));
            }
            float fB = rcfVar6.b();
            if (!Float.isNaN(fB) && (rcfVar == null || rcfVar.b() != fB)) {
                arrayList.add(new tae(i, length3, new sa3(fB)));
            }
            int iA = rcfVar6.a();
            if (rcfVar == null || rcfVar.a() != iA) {
                arrayList.add(new tae(i, length3, new ReactAbsoluteSizeSpan(iA)));
            }
            if (rjcVar.J0 != -1 || rjcVar.K0 != -1 || rjcVar.L0 != null) {
                int i6 = rjcVar.J0;
                int i7 = rjcVar.K0;
                String str2 = rjcVar.M0;
                String str3 = rjcVar.L0;
                mkf mkfVar2 = rjcVar.d;
                hh1.n(mkfVar2);
                arrayList.add(new tae(i, length3, new sb3(i6, i7, str2, str3, mkfVar2.getAssets())));
            }
            if (rjcVar.E0) {
                arrayList.add(new tae(i, length3, new ReactUnderlineSpan()));
            }
            if (rjcVar.F0) {
                arrayList.add(new tae(i, length3, new ReactStrikethroughSpan()));
            }
            if ((rjcVar.A0 != 0.0f || rjcVar.B0 != 0.0f || rjcVar.C0 != 0.0f) && Color.alpha(rjcVar.D0) != 0) {
                arrayList.add(new tae(i, length3, new bce(rjcVar.A0, rjcVar.B0, rjcVar.C0, rjcVar.D0)));
            }
            float fC = rcfVar6.c();
            if (!Float.isNaN(fC) && (rcfVar == null || rcfVar.c() != fC)) {
                arrayList.add(new tae(i, length3, new ta3(fC)));
            }
            arrayList.add(new tae(i, length3, new xoc(rjcVar.a)));
        }
    }

    public final SpannableStringBuilder n0(rjc rjcVar, String str, boolean z, iaa iaaVar) {
        int iB;
        rcf rcfVar = rjcVar.p0;
        hh1.m((z && iaaVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z ? new HashMap() : null;
        if (str != null) {
            zjf zjfVar = rcfVar.f;
            zjf.a.getClass();
            spannableStringBuilder.append((CharSequence) zjf.a.a(str, zjfVar));
        }
        m0(rjcVar, spannableStringBuilder, arrayList, null, z, map, 0);
        rjcVar.N0 = false;
        rjcVar.O0 = map;
        float f = Float.NaN;
        for (int i = 0; i < arrayList.size(); i++) {
            tae taeVar = (tae) arrayList.get((arrayList.size() - i) - 1);
            moc mocVar = taeVar.c;
            boolean z2 = mocVar instanceof phf;
            if (z2 || (mocVar instanceof qhf)) {
                if (z2) {
                    iB = ((phf) mocVar).b();
                    rjcVar.N0 = true;
                } else {
                    qhf qhfVar = (qhf) mocVar;
                    int i2 = qhfVar.c;
                    hh1.n(map);
                    koc kocVar = (koc) map.get(Integer.valueOf(qhfVar.a));
                    hh1.n(kocVar);
                    hh1.n(iaaVar);
                    if (kocVar.U()) {
                        iaaVar.h(kocVar, null);
                    }
                    kocVar.F(rjcVar);
                    iB = i2;
                }
                if (Float.isNaN(f) || iB > f) {
                    f = iB;
                }
            }
            taeVar.a(spannableStringBuilder, i);
        }
        rcfVar.e = f;
        ppc ppcVar = this.o0;
        if (ppcVar != null) {
            ppcVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @snc(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (E()) {
            this.u0 = b.c.a(str);
            b0();
        }
    }

    @snc(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.H0) {
            this.H0 = z;
            b0();
        }
    }

    @snc(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        rcf rcfVar = this.p0;
        if (z != rcfVar.a) {
            rcfVar.a = z;
            b0();
        }
    }

    @snc(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (E()) {
            if (num != null) {
                this.s0 = true;
                this.t0 = num.intValue();
            }
            b0();
        }
    }

    @snc(customType = "Color", name = "color")
    public void setColor(Integer num) {
        if (num != null) {
            this.q0 = true;
            this.r0 = num.intValue();
        }
        b0();
    }

    @snc(name = "fontFamily")
    public void setFontFamily(String str) {
        this.L0 = str;
        b0();
    }

    @snc(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.p0.b = f;
        b0();
    }

    @snc(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = qpc.b(str);
        if (iB != this.J0) {
            this.J0 = iB;
            b0();
        }
    }

    @snc(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = qpc.c(readableArray);
        if (TextUtils.equals(strC, this.M0)) {
            return;
        }
        this.M0 = strC;
        b0();
    }

    @snc(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = qpc.d(str);
        if (iD != this.K0) {
            this.K0 = iD;
            b0();
        }
    }

    @snc(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.G0 = z;
    }

    @snc(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.p0.d = f;
        b0();
    }

    @snc(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.p0.c = f;
        b0();
    }

    @snc(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        rcf rcfVar = this.p0;
        if (f != rcfVar.g) {
            rcfVar.e(f);
            b0();
        }
    }

    @snc(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.I0) {
            this.I0 = f;
            b0();
        }
    }

    @snc(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.w0 = i;
        b0();
    }

    @snc(name = "role")
    public void setRole(String str) {
        b.d dVar;
        if (E()) {
            b.d[] dVarArrValues = b.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (dVar.name().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i++;
                }
            }
            this.v0 = dVar;
            b0();
        }
    }

    @snc(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            this.z0 = 1;
            this.x0 = 3;
        } else {
            this.z0 = 0;
            if (str == null || "auto".equals(str)) {
                this.x0 = 0;
            } else if (GesturesListener.SCROLL_DIRECTION_LEFT.equals(str)) {
                this.x0 = 3;
            } else if (GesturesListener.SCROLL_DIRECTION_RIGHT.equals(str)) {
                this.x0 = 5;
            } else if ("center".equals(str)) {
                this.x0 = 1;
            } else {
                s55.n("ReactNative", "Invalid textAlign: ".concat(str));
                this.x0 = 0;
            }
        }
        b0();
    }

    @snc(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.y0 = 1;
        } else if ("simple".equals(str)) {
            this.y0 = 0;
        } else if ("balanced".equals(str)) {
            this.y0 = 2;
        } else {
            s55.n("ReactNative", "Invalid textBreakStrategy: ".concat(str));
            this.y0 = 1;
        }
        b0();
    }

    @snc(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.E0 = false;
        this.F0 = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.E0 = true;
                } else if ("line-through".equals(str2)) {
                    this.F0 = true;
                }
            }
        }
        b0();
    }

    @snc(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.D0) {
            this.D0 = i;
            b0();
        }
    }

    @snc(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.A0 = 0.0f;
        this.B0 = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.A0 = nn2.G((float) readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.B0 = nn2.G((float) readableMap.getDouble("height"));
            }
        }
        b0();
    }

    @snc(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.C0) {
            this.C0 = f;
            b0();
        }
    }

    @snc(name = "textTransform")
    public void setTextTransform(String str) {
        zjf zjfVar = zjf.f;
        if (str != null) {
            if ("none".equals(str)) {
                zjfVar = zjf.b;
            } else if ("uppercase".equals(str)) {
                zjfVar = zjf.c;
            } else if ("lowercase".equals(str)) {
                zjfVar = zjf.d;
            } else if ("capitalize".equals(str)) {
                zjfVar = zjf.e;
            } else {
                s55.n("ReactNative", "Invalid textTransform: ".concat(str));
            }
        }
        this.p0.f = zjfVar;
        b0();
    }
}
