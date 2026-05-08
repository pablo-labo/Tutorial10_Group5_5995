package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.da2;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cvb {

    @uh3(c = "com.indeed.android.profile.screens.ProfileScreenKt$AutoMergeAlertDialogs$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $noResumeUserAlertVisible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$noResumeUserAlertVisible = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$noResumeUserAlertVisible, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$noResumeUserAlertVisible) {
                String strC = x01.a.c();
                strC.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "richProfileAutoMergeIntroModal", sp7.c.a.a, null, new wq9(strC, 2), 8));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.ProfileScreenKt$AutoMergeAlertDialogs$3$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $indeedResumeUserAlertVisible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$indeedResumeUserAlertVisible = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$indeedResumeUserAlertVisible, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$indeedResumeUserAlertVisible) {
                String strC = x01.b.c();
                strC.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "richProfileAutoMergeIntroModal", sp7.c.a.a, null, new wq9(strC, 2), 8));
            }
            return j6g.a;
        }
    }

    public static final void a(final boolean z, final gu5<j6g> gu5Var, final boolean z2, final gu5<j6g> gu5Var2, final boolean z3, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        gu5<j6g> gu5Var3;
        i iVarW;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2;
        o97 o97Var;
        b.a.C0020a c0020a;
        boolean z4;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -1746230936);
        if ((i & 6) == 0) {
            i2 = (cVarC.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarC.a(z2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarC.a(z3) ? 16384 : 8192;
        }
        if (!cVarC.o(i2 & 1, (i2 & 9363) != 9362)) {
            gu5Var3 = gu5Var2;
            cVarC.D();
        } else {
            if (!z3) {
                iVarW = cVarC.W();
                if (iVarW != null) {
                    function2 = new Function2() { // from class: avb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cvb.a(z, gu5Var, z2, gu5Var2, z3, (b) obj, ka2.L(i | 1));
                            return j6g.a;
                        }
                    };
                    iVarW.d = function2;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z5 = (i2 & 14) == 4;
            Object objV = cVarC.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (z5 || objV == c0020a2) {
                objV = new a(z, null);
                cVarC.p(objV);
            }
            to4.d(cVarC, boolValueOf, (Function2) objV);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean z6 = (i2 & 896) == 256;
            Object objV2 = cVarC.v();
            if (z6 || objV2 == c0020a2) {
                objV2 = new b(z2, null);
                cVarC.p(objV2);
            }
            to4.d(cVarC, boolValueOf2, (Function2) objV2);
            o97 o97Var2 = (o97) cVarC.M(p97.a);
            if (z) {
                cVarC.L(-1321105644);
                String strI = ak2.I(R.string.share_profile_resume_migration_header, cVarC);
                String strI2 = ak2.I(R.string.share_profile_resume_migration_cta, cVarC);
                ah2 ah2Var = boa.c;
                boolean z7 = (i2 & 112) == 32;
                Object objV3 = cVarC.v();
                if (z7 || objV3 == c0020a2) {
                    objV3 = new zb(7, gu5Var);
                    cVarC.p(objV3);
                }
                gu5Var3 = gu5Var2;
                o97Var = o97Var2;
                c0020a = c0020a2;
                z4 = false;
                ku6.b(strI, null, ah2Var, strI2, null, null, (gu5) objV3, null, "ConfirmationIdlDialog", bh2.c(-1281301953, new ct(o97Var2, 10), cVarC), cVarC, 905970048, 178);
            } else {
                gu5Var3 = gu5Var2;
                o97Var = o97Var2;
                c0020a = c0020a2;
                z4 = false;
                cVarC.L(-1349465126);
            }
            cVarC.U(z4);
            if (z2) {
                cVarC.L(-1319821810);
                String strI3 = ak2.I(R.string.share_profile_ir_resume_migration_header, cVarC);
                String strI4 = ak2.I(R.string.share_profile_ir_resume_migration_cta, cVarC);
                ah2 ah2Var2 = boa.d;
                boolean z8 = (i2 & 7168) == 2048 ? true : z4;
                Object objV4 = cVarC.v();
                if (z8 || objV4 == c0020a) {
                    objV4 = new xa(6, gu5Var3);
                    cVarC.p(objV4);
                }
                ku6.b(strI3, null, ah2Var2, strI4, null, null, (gu5) objV4, null, "ConfirmationIdlDialog", bh2.c(-1246478016, new rq(o97Var, 7), cVarC), cVarC, 905970048, 178);
            } else {
                cVarC.L(-1349465126);
            }
            cVarC.U(z4);
        }
        iVarW = cVarC.W();
        if (iVarW != null) {
            final gu5<j6g> gu5Var4 = gu5Var3;
            function2 = new Function2() { // from class: bvb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvb.a(z, gu5Var, z2, gu5Var4, z3, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
            iVarW.d = function2;
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(1147691390);
        int i3 = (cVarH.d(i) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            f17.a(z2b.a(i == 1 ? R.drawable.profile_bg_portrait : R.drawable.profile_bg_landscape, 0, cVarH), null, g.f(e.a.b, 1.0f), null, ft2.a.d, 0.0f, null, cVarH, 25008, 104);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, i2) { // from class: zub
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    cvb.b(this.a, iL, (b) obj);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final x1c x1cVar, yvb yvbVar, final aub aubVar, final j7d j7dVar, final n9d n9dVar, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final boolean z, final gu5 gu5Var4, final gu5 gu5Var5, final gu5 gu5Var6, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, final gu5 gu5Var7, final gu5 gu5Var8, final gu5 gu5Var9, final gu5 gu5Var10, final Function1 function16, Function2 function2, final Function1 function17, final gu5 gu5Var11, final Function1 function18, final Function1 function19, final Function1 function110, final Function1 function111, final Function1 function112, final gu5 gu5Var12, final gu5 gu5Var13, final gu5 gu5Var14, final gu5 gu5Var15, final gu5 gu5Var16, final gu5 gu5Var17, final Function2 function22, gu5 gu5Var18, gu5 gu5Var19, gu5 gu5Var20, gu5 gu5Var21, final gu5 gu5Var22, final gu5 gu5Var23, final gu5 gu5Var24, final gu5 gu5Var25, final gu5 gu5Var26, final zrd zrdVar, final boolean z2, androidx.compose.runtime.b bVar, final int i) {
        gu5 gu5Var27;
        gu5 gu5Var28;
        gu5 gu5Var29;
        gu5 gu5Var30;
        c cVar;
        Function2 function23;
        yvb yvbVar2;
        String strB;
        zrd zrdVar2;
        af1 af1Var;
        String str;
        boolean z3;
        final ra9 ra9Var;
        int i2;
        String[] strArr;
        c cVar2;
        e.a aVar;
        e eVarJ;
        String str2;
        c cVar3;
        af1 af1Var2;
        af1.a aVar2;
        ra9 ra9Var2;
        Context context;
        String[] strArr2;
        o97 o97Var;
        af1 af1Var3;
        int i3;
        gu5 gu5Var31;
        String str3;
        b.a.C0020a c0020a;
        af1.a aVar3;
        vs0.k kVar;
        e.a aVar4;
        af1 af1Var4;
        int i4;
        c cVar4;
        af1 af1Var5;
        vs0.k kVar2;
        int i5;
        Object obj;
        int i6;
        af1 af1Var6;
        String strC;
        final x1c x1cVar2 = x1cVar;
        x1cVar2.getClass();
        yvbVar.getClass();
        aubVar.getClass();
        j7dVar.getClass();
        n9dVar.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        gu5Var7.getClass();
        gu5Var8.getClass();
        gu5Var9.getClass();
        gu5Var10.getClass();
        function16.getClass();
        function2.getClass();
        function17.getClass();
        gu5Var11.getClass();
        function18.getClass();
        function19.getClass();
        function110.getClass();
        function111.getClass();
        function112.getClass();
        gu5Var12.getClass();
        gu5Var13.getClass();
        gu5Var14.getClass();
        gu5Var15.getClass();
        gu5Var16.getClass();
        gu5Var17.getClass();
        function22.getClass();
        gu5Var18.getClass();
        gu5Var19.getClass();
        gu5Var20.getClass();
        gu5Var21.getClass();
        gu5Var22.getClass();
        gu5Var23.getClass();
        gu5Var24.getClass();
        zrdVar.getClass();
        c cVarH = bVar.h(1019869085);
        int i7 = i | (cVarH.x(x1cVar2) ? 4 : 2) | (cVarH.x(yvbVar) ? 32 : 16);
        boolean zX = cVarH.x(aubVar);
        int i8 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i9 = i7 | (zX ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128);
        boolean zX2 = cVarH.x(j7dVar);
        int i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        int i11 = i9 | (zX2 ? 2048 : 1024) | (cVarH.x(n9dVar) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536) | (cVarH.x(gu5Var) ? 1048576 : 524288) | (cVarH.x(gu5Var2) ? 8388608 : 4194304) | (cVarH.x(gu5Var3) ? 67108864 : 33554432) | (cVarH.a(z) ? 536870912 : 268435456);
        int i12 = (cVarH.x(gu5Var4) ? 4 : 2) | (cVarH.x(gu5Var5) ? 32 : 16) | (cVarH.x(gu5Var6) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128) | (cVarH.x(function12) ? 2048 : 1024) | (cVarH.x(function13) ? 16384 : 8192) | (cVarH.x(function14) ? 131072 : 65536) | (cVarH.x(function15) ? 1048576 : 524288) | (cVarH.x(gu5Var7) ? 8388608 : 4194304) | (cVarH.x(gu5Var8) ? 67108864 : 33554432) | (cVarH.x(gu5Var9) ? 536870912 : 268435456);
        int i13 = (cVarH.x(gu5Var10) ? 4 : 2) | (cVarH.x(function16) ? 32 : 16) | (cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128) | (cVarH.x(function17) ? 2048 : 1024) | (cVarH.x(gu5Var11) ? 16384 : 8192) | (cVarH.x(function18) ? 131072 : 65536) | (cVarH.x(function19) ? 1048576 : 524288) | (cVarH.x(function110) ? 8388608 : 4194304) | (cVarH.x(function111) ? 67108864 : 33554432) | (cVarH.x(function112) ? 536870912 : 268435456);
        int i14 = (cVarH.x(gu5Var12) ? 4 : 2) | (cVarH.x(gu5Var13) ? 32 : 16) | (cVarH.x(gu5Var14) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128) | (cVarH.x(gu5Var15) ? 2048 : 1024) | (cVarH.x(gu5Var16) ? 16384 : 8192) | (cVarH.x(gu5Var17) ? 131072 : 65536) | (cVarH.x(function22) ? 1048576 : 524288) | (cVarH.x(gu5Var18) ? 8388608 : 4194304) | (cVarH.x(gu5Var19) ? 67108864 : 33554432) | (cVarH.x(gu5Var20) ? 536870912 : 268435456);
        int i15 = (cVarH.x(gu5Var21) ? 4 : 2) | (cVarH.x(gu5Var22) ? 32 : 16);
        if (cVarH.x(gu5Var23)) {
            i8 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        int i16 = i15 | i8;
        if (cVarH.x(gu5Var24)) {
            i10 = 2048;
        }
        int i17 = i16 | i10 | (cVarH.x(gu5Var25) ? 16384 : 8192) | (cVarH.K(zrdVar) ? 1048576 : 524288) | (cVarH.a(z2) ? 8388608 : 4194304);
        if (cVarH.o(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (i17 & 4727955) == 4727954) ? false : true)) {
            int i18 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.c())).orientation;
            g4a g4aVarA = r.a(j7dVar.h(), cVarH);
            yz7 yz7VarB = x1cVar2.o().b();
            if (yz7VarB == null || (strB = yz7VarB.b()) == null) {
                strB = "";
            }
            yz7 yz7VarB2 = x1cVar2.o().b();
            String str4 = (yz7VarB2 == null || (strC = yz7VarB2.c()) == null) ? "" : strC;
            String string = zve.s0(strB + " " + str4).toString();
            Object objY0 = awe.y0(strB, 0);
            if (objY0 == null) {
                objY0 = "";
            }
            Object objY02 = awe.y0(str4, 0);
            if (objY02 == null) {
                objY02 = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(objY0);
            sb.append(objY02);
            String string2 = zve.s0(sb.toString()).toString();
            Context context2 = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            r8 r8Var = new r8();
            boolean zX3 = ((i14 & 3670016) == 1048576) | cVarH.x(context2);
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (zX3 || objV == c0020a2) {
                objV = new kb8(2, function22, context2);
                cVarH.p(objV);
            }
            ra9 ra9VarL = ypd.L(r8Var, (Function1) objV, cVarH);
            final String[] strArr3 = {"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "text/plain", "text/rtf"};
            boolean zG = ((h2g) cr8.p(h2g.class)).g();
            String strB2 = x1cVar2.n().b();
            boolean zX4 = cVarH.x(x1cVar2);
            Object objV2 = cVarH.v();
            if (zX4 || objV2 == c0020a2) {
                objV2 = new dvb(x1cVar2, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, strB2, (Function2) objV2);
            e.a aVar5 = e.a.b;
            e eVarD = g.d(aVar5, 1.0f);
            boolean z4 = (i11 & 458752) == 131072;
            Object objV3 = cVarH.v();
            if (z4 || objV3 == c0020a2) {
                objV3 = new se(function1, 12);
                cVarH.p(objV3);
            }
            e eVarA = s.a(eVarD, (Function1) objV3);
            af1 af1Var7 = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var7, false);
            int iHashCode = Long.hashCode(pg8.w(cVarH));
            t8b t8bVarM = cVarH.m();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVarA = gl2.a.a();
            cVarH.B();
            if (cVarH.f()) {
                cVarH.y(aVarA);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.c());
            ygg.y(cVarH, t8bVarM, gl2.a.e());
            gl2.a.C0251a c0251aB = gl2.a.b();
            if (cVarH.f() || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251aB);
            }
            ygg.y(cVarH, eVarC, gl2.a.d());
            Object objV4 = cVarH.v();
            if (objV4 == c0020a2) {
                objV4 = r.f(j94.a());
                cVarH.p(objV4);
            }
            final g4a g4aVar = (g4a) objV4;
            String strJ = ak2.J(R.string.resume_download_successful_toast, new Object[]{"File"}, cVarH);
            if (zG) {
                cVarH.L(-928850389);
                g4a g4aVarA2 = r.a(x1cVar.r(), cVarH);
                iy3 iy3Var = (iy3) cVarH.M(um2.h);
                boolean zF = f(g4aVarA2);
                ZIndexElement zIndexElement = new ZIndexElement(1.0f);
                boolean zK = cVarH.K(iy3Var);
                Object objV5 = cVarH.v();
                if (zK || objV5 == c0020a2) {
                    af1Var6 = af1Var7;
                    objV5 = new xw(3, iy3Var, g4aVar);
                    cVarH.p(objV5);
                } else {
                    af1Var6 = af1Var7;
                }
                e eVarA2 = s.a(zIndexElement, (Function1) objV5);
                str = strJ;
                z3 = zG;
                ra9Var = ra9VarL;
                i2 = i18;
                af1Var = af1Var6;
                cVar2 = cVarH;
                Function2 function24 = new Function2() { // from class: yub
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        b bVar2 = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                            cvb.d(ra9Var, strArr3, x1cVar, zrdVar, (int) ((((j94) g4aVar.getValue()).a * Resources.getSystem().getDisplayMetrics().density) + 0.5f), bVar2, 48, 8);
                        } else {
                            bVar2.D();
                        }
                        return j6g.a;
                    }
                };
                zrdVar2 = zrdVar;
                strArr = strArr3;
                nd0.a(zF, eVarA2, bh2.c(1042851132, function24, cVar2), cVar2, 384);
            } else {
                zrdVar2 = zrdVar;
                af1Var = af1Var7;
                str = strJ;
                z3 = zG;
                ra9Var = ra9VarL;
                i2 = i18;
                strArr = strArr3;
                cVar2 = cVarH;
                cVar2.L(-939903253);
            }
            cVar2.F();
            e eVarS = pnb.S(g.f(aVar5, 1.0f), zrdVar2);
            vs0.i iVar = new vs0.i(0.0f, true, new us0(0));
            af1.a aVar6 = c20.a.m;
            ra9 ra9Var3 = ra9Var;
            ob2 ob2VarA = mb2.a(iVar, aVar6, cVar2, 6);
            int iHashCode2 = Long.hashCode(pg8.w(cVar2));
            t8b t8bVarM2 = cVar2.m();
            e eVarC2 = androidx.compose.ui.c.c(cVar2, eVarS);
            pm8.a aVarA2 = gl2.a.a();
            cVar2.B();
            if (cVar2.f()) {
                cVar2.y(aVarA2);
            } else {
                cVar2.n();
            }
            ygg.y(cVar2, ob2VarA, gl2.a.c());
            ygg.y(cVar2, t8bVarM2, gl2.a.e());
            gl2.a.C0251a c0251aB2 = gl2.a.b();
            if (cVar2.f() || !wl7.b(cVar2.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVar2, iHashCode2, c0251aB2);
            }
            ygg.y(cVar2, eVarC2, gl2.a.d());
            af1 af1Var8 = af1Var;
            ag9 ag9VarD2 = hl1.d(af1Var8, false);
            int iHashCode3 = Long.hashCode(pg8.w(cVar2));
            t8b t8bVarM3 = cVar2.m();
            e eVarC3 = androidx.compose.ui.c.c(cVar2, aVar5);
            String[] strArr4 = strArr;
            pm8.a aVarA3 = gl2.a.a();
            cVar2.B();
            if (cVar2.f()) {
                cVar2.y(aVarA3);
            } else {
                cVar2.n();
            }
            ygg.y(cVar2, ag9VarD2, gl2.a.c());
            ygg.y(cVar2, t8bVarM3, gl2.a.e());
            gl2.a.C0251a c0251aB3 = gl2.a.b();
            if (cVar2.f() || !wl7.b(cVar2.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVar2, iHashCode3, c0251aB3);
            }
            ygg.y(cVar2, eVarC3, gl2.a.d());
            b(i2, 0, cVar2);
            if (z3) {
                aVar = aVar5;
                eVarJ = f.j(aVar, 0.0f, ((j94) g4aVar.getValue()).a, 0.0f, 0.0f, 13);
            } else {
                aVar = aVar5;
                eVarJ = aVar;
            }
            vs0.k kVar3 = vs0.c;
            ob2 ob2VarA2 = mb2.a(kVar3, aVar6, cVar2, 0);
            int iHashCode4 = Long.hashCode(pg8.w(cVar2));
            t8b t8bVarM4 = cVar2.m();
            e eVarC4 = androidx.compose.ui.c.c(cVar2, eVarJ);
            pm8.a aVarA4 = gl2.a.a();
            cVar2.B();
            if (cVar2.f()) {
                cVar2.y(aVarA4);
            } else {
                cVar2.n();
            }
            ygg.y(cVar2, ob2VarA2, gl2.a.c());
            ygg.y(cVar2, t8bVarM4, gl2.a.e());
            gl2.a.C0251a c0251aB4 = gl2.a.b();
            if (cVar2.f() || !wl7.b(cVar2.v(), Integer.valueOf(iHashCode4))) {
                ja.h(iHashCode4, cVar2, iHashCode4, c0251aB4);
            }
            ygg.y(cVar2, eVarC4, gl2.a.d());
            if (z3) {
                x1cVar2 = x1cVar;
                str2 = str;
                cVar3 = cVar2;
                af1Var2 = af1Var8;
                aVar2 = aVar6;
                ra9Var2 = ra9Var3;
                context = context2;
                strArr2 = strArr4;
                cVar3.L(-1274409059);
            } else {
                cVar2.L(-1262081506);
                str2 = str;
                af1Var2 = af1Var8;
                aVar2 = aVar6;
                cVar3 = cVar2;
                context = context2;
                d(ra9Var3, strArr4, x1cVar, null, 0, cVar3, 0, 15);
                ra9Var2 = ra9Var3;
                strArr2 = strArr4;
                x1cVar2 = x1cVar;
            }
            cVar3.F();
            e eVarF = g.f(aVar, 1.0f);
            ob2 ob2VarA3 = mb2.a(kVar3, c20.a.n, cVar3, 48);
            int iHashCode5 = Long.hashCode(pg8.w(cVar3));
            t8b t8bVarM5 = cVar3.m();
            e eVarC5 = androidx.compose.ui.c.c(cVar3, eVarF);
            pm8.a aVarA5 = gl2.a.a();
            cVar3.B();
            if (cVar3.f()) {
                cVar3.y(aVarA5);
            } else {
                cVar3.n();
            }
            ygg.y(cVar3, ob2VarA3, gl2.a.c());
            ygg.y(cVar3, t8bVarM5, gl2.a.e());
            gl2.a.C0251a c0251aB5 = gl2.a.b();
            if (cVar3.f() || !wl7.b(cVar3.v(), Integer.valueOf(iHashCode5))) {
                ja.h(iHashCode5, cVar3, iHashCode5, c0251aB5);
            }
            ygg.y(cVar3, eVarC5, gl2.a.d());
            exb exbVarO = x1cVar2.o();
            boolean zX5 = cVar3.x(x1cVar2) | cVar3.x(context) | cVar3.K(str2);
            Object objV6 = cVar3.v();
            if (zX5 || objV6 == c0020a2) {
                objV6 = new q6a(4, x1cVar2, context, str2);
                cVar3.p(objV6);
            }
            gu5 gu5Var32 = (gu5) objV6;
            boolean zX6 = cVar3.x(x1cVar2);
            Object objV7 = cVar3.v();
            if (zX6 || objV7 == c0020a2) {
                objV7 = new k30(x1cVar2, 20);
                cVar3.p(objV7);
            }
            gu5 gu5Var33 = (gu5) objV7;
            i7d i7dVarE = e(g4aVarA);
            boolean z5 = (i11 & 7168) == 2048 || cVar3.x(j7dVar);
            Object objV8 = cVar3.v();
            if (z5 || objV8 == c0020a2) {
                objV8 = new evb(j7dVar);
                cVar3.p(objV8);
            }
            int i19 = i11 >> 9;
            c cVar5 = cVar3;
            function23 = function2;
            dr2.a(string, string2, exbVarO, gu5Var, gu5Var4, gu5Var32, gu5Var33, i7dVarE, (gu5) ((ve8) objV8), cVar5, (i19 & 7168) | ((i12 << 12) & 57344));
            c cVar6 = cVar5;
            cVar6.q();
            cVar6.q();
            cVar6.q();
            if ((x1cVar2.p().b() || x1cVar2.o().n) && ((kr7) cr8.p(kr7.class)).e("prof_rdi_auto_merge_alert_tog").a == 1) {
                cVar6.L(-400958799);
                o97 o97Var2 = (o97) cVar6.M(p97.a());
                boolean z6 = x1cVar2.o().n;
                Boolean boolValueOf = Boolean.valueOf(z6);
                boolean zA = cVar6.a(z6) | cVar6.x(x1cVar2);
                Object objV9 = cVar6.v();
                if (zA || objV9 == c0020a2) {
                    o97Var = o97Var2;
                    objV9 = new fvb(z6, x1cVar2, null);
                    cVar6.p(objV9);
                } else {
                    o97Var = o97Var2;
                }
                to4.d(cVar6, boolValueOf, (Function2) objV9);
                e eVarF2 = g.f(aVar, 1.0f);
                o97Var.getClass();
                e eVarH = f.h(eVarF2, 16.0f, 0.0f, 2);
                af1Var3 = af1Var2;
                ag9 ag9VarD3 = hl1.d(af1Var3, false);
                int iHashCode6 = Long.hashCode(pg8.w(cVar6));
                i3 = i11;
                t8b t8bVarM6 = cVar6.m();
                e eVarC6 = androidx.compose.ui.c.c(cVar6, eVarH);
                pm8.a aVarA6 = gl2.a.a();
                cVar6.B();
                if (cVar6.f()) {
                    cVar6.y(aVarA6);
                } else {
                    cVar6.n();
                }
                ygg.y(cVar6, ag9VarD3, gl2.a.c());
                ygg.y(cVar6, t8bVarM6, gl2.a.e());
                gl2.a.C0251a c0251aB6 = gl2.a.b();
                if (cVar6.f() || !wl7.b(cVar6.v(), Integer.valueOf(iHashCode6))) {
                    ja.h(iHashCode6, cVar6, iHashCode6, c0251aB6);
                }
                ygg.y(cVar6, eVarC6, gl2.a.d());
                String strI = ak2.I(R.string.resume_file_successfully_saved_title_tog, cVar6);
                String strI2 = ak2.I(R.string.resume_file_successfully_saved_description_tog, cVar6);
                String strI3 = ak2.I(R.string.resume_file_successfully_saved_button_tog, cVar6);
                boolean zX7 = ((i17 & 57344) == 16384) | cVar6.x(x1cVar2);
                Object objV10 = cVar6.v();
                if (zX7 || objV10 == c0020a2) {
                    objV10 = new ro2(8, x1cVar2, gu5Var25);
                    cVar6.p(objV10);
                }
                gu5Var31 = gu5Var4;
                str3 = "prof_rdi_auto_merge_alert_tog";
                gjc.a(strI, strI2, strI3, (gu5) objV10, null, null, b20.INFO, cVar6, 12582912);
                cVar6 = cVar6;
                j6g j6gVar = j6g.a;
                Object objV11 = cVar6.v();
                if (objV11 == c0020a2) {
                    objV11 = new gvb();
                    cVar6.p(objV11);
                }
                to4.d(cVar6, j6gVar, (Function2) objV11);
                cVar6.q();
            } else {
                gu5Var31 = gu5Var4;
                i3 = i11;
                str3 = "prof_rdi_auto_merge_alert_tog";
                af1Var3 = af1Var2;
                cVar6.L(-415513919);
            }
            cVar6.F();
            rxb rxbVar = x1cVar2.o().a;
            boolean zX8 = cVar6.x(x1cVar2);
            Object objV12 = cVar6.v();
            if (zX8 || objV12 == c0020a2) {
                objV12 = new hr2(x1cVar2, 1);
                cVar6.p(objV12);
            }
            Function1 function113 = (Function1) objV12;
            boolean zX9 = cVar6.x(x1cVar2);
            Object objV13 = cVar6.v();
            if (zX9 || objV13 == c0020a2) {
                objV13 = new or(x1cVar2, 16);
                cVar6.p(objV13);
            }
            Function1 function114 = (Function1) objV13;
            boolean zX10 = cVar6.x(x1cVar2);
            Object objV14 = cVar6.v();
            if (zX10 || objV14 == c0020a2) {
                objV14 = new q2(x1cVar2, 20);
                cVar6.p(objV14);
            }
            c cVar7 = cVar6;
            zxb.a(rxbVar, function113, function114, (Function1) objV14, cVar7, 0);
            int iOrdinal = x1cVar2.o().a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    af1Var5 = af1Var3;
                    c0020a = c0020a2;
                    kVar2 = kVar3;
                    i5 = 1;
                    obj = null;
                    cVar7.L(-151283279);
                    int i20 = i14 << 9;
                    int i21 = ((i14 << 6) & 896) | ((i14 >> 6) & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
                    int i22 = i17 << 21;
                    klb.b(aubVar.l(), aubVar.m(), gu5Var12, gu5Var17, gu5Var13, gu5Var14, gu5Var15, gu5Var16, gu5Var22, gu5Var23, gu5Var24, false, false, z2, cVar7, i21 | (i22 & 234881024) | (i22 & 1879048192), ((i17 >> 9) & 14) | ((i17 >> 12) & 7168));
                    cVar4 = cVar7;
                    cVar4.F();
                    j6g j6gVar2 = j6g.a;
                } else {
                    if (iOrdinal != 2) {
                        cVar7.L(-151379702);
                        cVar7.F();
                        l.g();
                        return;
                    }
                    cVar7.L(-151250725);
                    af1Var5 = af1Var3;
                    s88 s88VarN = x1cVar2.n();
                    boolean zX11 = cVar7.x(ra9Var2) | cVar7.x(strArr2);
                    Object objV15 = cVar7.v();
                    if (zX11 || objV15 == c0020a2) {
                        objV15 = new qe(13, ra9Var2, strArr2);
                        cVar7.p(objV15);
                    }
                    gu5 gu5Var34 = (gu5) objV15;
                    boolean z7 = (i12 & 112) == 32;
                    Object objV16 = cVar7.v();
                    if (z7 || objV16 == c0020a2) {
                        objV16 = new vr(9, gu5Var5);
                        cVar7.p(objV16);
                    }
                    gu5 gu5Var35 = (gu5) objV16;
                    boolean zX12 = cVar7.x(x1cVar2);
                    Object objV17 = cVar7.v();
                    if (zX12 || objV17 == c0020a2) {
                        i6 = 1;
                        objV17 = new nr2(x1cVar2, 1);
                        cVar7.p(objV17);
                    } else {
                        i6 = 1;
                    }
                    i5 = i6;
                    kVar2 = kVar3;
                    obj = null;
                    c0020a = c0020a2;
                    aad.a(s88VarN, n9dVar, function1, gu5Var34, gu5Var35, (gu5) objV17, z2, cVar7, 64 | (i19 & 112) | (i19 & 896) | (i17 & 29360128));
                    cVar4 = cVar7;
                    cVar4.F();
                    j6g j6gVar3 = j6g.a;
                }
                yvbVar2 = yvbVar;
                kVar = kVar2;
                i4 = i5;
                aVar4 = aVar;
                aVar3 = aVar2;
                af1Var4 = af1Var5;
            } else {
                af1 af1Var9 = af1Var3;
                c0020a = c0020a2;
                cVar7.L(-397760901);
                e.a aVar7 = aVar;
                Locale localeQ = x1cVar2.q();
                af1.a aVar8 = aVar2;
                svb svbVarV = yvbVar.v();
                boolean zC = x1cVar2.o().c();
                boolean zX13 = cVar7.x(ra9Var2) | cVar7.x(strArr2);
                Object objV18 = cVar7.v();
                if (zX13 || objV18 == c0020a) {
                    objV18 = new zp0(4, ra9Var2, strArr2);
                    cVar7.p(objV18);
                }
                gu5 gu5Var36 = (gu5) objV18;
                boolean z8 = (i13 & 112) == 32;
                Object objV19 = cVar7.v();
                if (z8 || objV19 == c0020a) {
                    objV19 = new jw0(function16, 1);
                    cVar7.p(objV19);
                }
                Function1 function115 = (Function1) objV19;
                boolean z9 = (i13 & 896) == 256;
                Object objV20 = cVar7.v();
                if (z9 || objV20 == c0020a) {
                    objV20 = new b52(function23, 7);
                    cVar7.p(objV20);
                }
                Function2 function25 = (Function2) objV20;
                yvbVar2 = yvbVar;
                boolean zX14 = cVar7.x(yvbVar2);
                Object objV21 = cVar7.v();
                if (zX14 || objV21 == c0020a) {
                    objV21 = new ne(yvbVar2, 12);
                    cVar7.p(objV21);
                }
                Function1 function116 = (Function1) objV21;
                boolean zX15 = cVar7.x(yvbVar2) | cVar7.x(x1cVar2);
                Object objV22 = cVar7.v();
                if (zX15 || objV22 == c0020a) {
                    objV22 = new nu(4, yvbVar2, x1cVar2);
                    cVar7.p(objV22);
                }
                Function2 function26 = (Function2) objV22;
                boolean zX16 = cVar7.x(yvbVar2);
                Object objV23 = cVar7.v();
                if (zX16 || objV23 == c0020a) {
                    objV23 = new cu(yvbVar2, 12);
                    cVar7.p(objV23);
                }
                Function1 function117 = (Function1) objV23;
                int i23 = i12 << 6;
                int i24 = ((i3 >> 18) & 8176) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016);
                int i25 = i13 << 9;
                int i26 = i12 >> 6;
                aVar3 = aVar8;
                kVar = kVar3;
                aVar4 = aVar7;
                af1Var4 = af1Var9;
                i4 = 1;
                qxb.h(gu5Var36, gu5Var2, gu5Var3, z, gu5Var6, function12, function13, gu5Var11, function18, function19, function110, function111, function112, function14, function15, gu5Var7, gu5Var8, gu5Var9, gu5Var10, function115, function25, function17, function116, localeQ, svbVarV, zC, z2, function26, function117, cVar7, i24 | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), ((i13 >> 21) & 1022) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | ((i13 << 24) & 234881024), ((i13 >> 6) & 112) | ((i17 >> 3) & 3670016));
                cVar4 = cVar7;
                cVar4.F();
                j6g j6gVar4 = j6g.a;
            }
            String strI4 = ak2.I(R.string.share_profile_privacy_confirmation_header, cVar4);
            String strI5 = ak2.I(R.string.share_profile_privacy_confirmation_body, cVar4);
            int i27 = (cVar4.x(x1cVar2) ? 1 : 0) | ((i12 & 14) == 4 ? i4 : 0);
            Object objV24 = cVar4.v();
            if (i27 != 0 || objV24 == c0020a) {
                objV24 = new za(10, x1cVar2, gu5Var31);
                cVar4.p(objV24);
            }
            gu5 gu5Var37 = (gu5) objV24;
            boolean zX17 = cVar4.x(x1cVar2);
            Object objV25 = cVar4.v();
            if (zX17 || objV25 == c0020a) {
                objV25 = new or2(x1cVar2, i4);
                cVar4.p(objV25);
            }
            c cVar8 = cVar4;
            hh2.d(strI4, strI5, gu5Var37, (gu5) objV25, ak2.I(R.string.update, cVar4), ak2.I(R.string.confirmation_dialog_cancel_button, cVar4), true, x1cVar2.o().h(), 3, cVar8, 1572864, 0);
            cVar = cVar8;
            cVar.q();
            tz6.a(0, 888, null, x1cVar2.j().a(), x1cVar2.j().b(), cVar, null, x1cVar2.j().c(), null, null, null, x1cVar2.j().d());
            boolean zG2 = x1cVar2.o().g();
            af1 af1Var10 = c20.a.h;
            if (zG2) {
                cVar.L(-916072375);
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "resume-upload-success-toast", sp7.c.a.c, null, null, 24));
                e eVarH2 = androidx.compose.foundation.layout.b.a.h(aVar4, af1Var10);
                ag9 ag9VarD4 = hl1.d(af1Var4, false);
                int iHashCode7 = Long.hashCode(pg8.w(cVar));
                t8b t8bVarM7 = cVar.m();
                e eVarC7 = androidx.compose.ui.c.c(cVar, eVarH2);
                pm8.a aVarA7 = gl2.a.a();
                cVar.B();
                if (cVar.f()) {
                    cVar.y(aVarA7);
                } else {
                    cVar.n();
                }
                ygg.y(cVar, ag9VarD4, gl2.a.c());
                ygg.y(cVar, t8bVarM7, gl2.a.e());
                gl2.a.C0251a c0251aB7 = gl2.a.b();
                if (cVar.f() || !wl7.b(cVar.v(), Integer.valueOf(iHashCode7))) {
                    ja.h(iHashCode7, cVar, iHashCode7, c0251aB7);
                }
                ygg.y(cVar, eVarC7, gl2.a.d());
                if (((kr7) cr8.p(kr7.class)).e(str3).a == i4) {
                    cVar.L(623999527);
                    gu5Var28 = gu5Var19;
                    v9d.b(gu5Var28, cVar, (i14 >> 24) & 14);
                    cVar.F();
                } else {
                    gu5Var28 = gu5Var19;
                    cVar.L(624160138);
                    v9d.a(gu5Var28, cVar, (i14 >> 24) & 14);
                    cVar.F();
                }
                cVar.q();
            } else {
                gu5Var28 = gu5Var19;
                cVar.L(-939903253);
            }
            cVar.F();
            if (x1cVar2.o().f()) {
                cVar.L(-915297530);
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "resume-deleted-toast", sp7.c.a.c, null, null, 24));
                e eVarD2 = g.d(aVar4, 1.0f);
                ag9 ag9VarD5 = hl1.d(af1Var10, false);
                int iHashCode8 = Long.hashCode(pg8.w(cVar));
                t8b t8bVarM8 = cVar.m();
                e eVarC8 = androidx.compose.ui.c.c(cVar, eVarD2);
                pm8.a aVarA8 = gl2.a.a();
                cVar.B();
                if (cVar.f()) {
                    cVar.y(aVarA8);
                } else {
                    cVar.n();
                }
                ygg.y(cVar, ag9VarD5, gl2.a.c());
                ygg.y(cVar, t8bVarM8, gl2.a.e());
                gl2.a.C0251a c0251aB8 = gl2.a.b();
                if (cVar.f() || !wl7.b(cVar.v(), Integer.valueOf(iHashCode8))) {
                    ja.h(iHashCode8, cVar, iHashCode8, c0251aB8);
                }
                ygg.y(cVar, eVarC8, gl2.a.d());
                gu5Var27 = gu5Var18;
                w7d.a(gu5Var27, cVar, (i14 >> 21) & 14);
                cVar.q();
            } else {
                gu5Var27 = gu5Var18;
                cVar.L(-939903253);
            }
            cVar.F();
            if (((b5g) ((gme) x1cVar2.Y).getValue()) == b5g.b) {
                cVar.L(-914717675);
                e eVarD3 = g.d(aVar4, 1.0f);
                int i28 = da2.j;
                e eVarB = androidx.compose.foundation.a.b(eVarD3, da2.b(da2.a.a(), 0.2f), ytc.a);
                ag9 ag9VarD6 = hl1.d(c20.a.e, false);
                int iHashCode9 = Long.hashCode(pg8.w(cVar));
                t8b t8bVarM9 = cVar.m();
                e eVarC9 = androidx.compose.ui.c.c(cVar, eVarB);
                pm8.a aVarA9 = gl2.a.a();
                cVar.B();
                if (cVar.f()) {
                    cVar.y(aVarA9);
                } else {
                    cVar.n();
                }
                ygg.y(cVar, ag9VarD6, gl2.a.c());
                ygg.y(cVar, t8bVarM9, gl2.a.e());
                gl2.a.C0251a c0251aB9 = gl2.a.b();
                if (cVar.f() || !wl7.b(cVar.v(), Integer.valueOf(iHashCode9))) {
                    ja.h(iHashCode9, cVar, iHashCode9, c0251aB9);
                }
                ygg.y(cVar, eVarC9, gl2.a.d());
                tx6.a(androidx.compose.ui.platform.f.a(aVar4, "LoadingSpinner"), "", false, null, cVar, 54, 12);
                cVar = cVar;
                cVar.q();
            } else {
                cVar.L(-939903253);
            }
            cVar.F();
            if (((b5g) ((gme) x1cVar2.Y).getValue()) == b5g.c) {
                cVar.L(-914303174);
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("rich-profile-home-screen", "error-toast", sp7.c.a.c, null, null, 24));
                boolean zX18 = cVar.x(x1cVar2);
                Object objV26 = cVar.v();
                if (zX18 || objV26 == c0020a) {
                    objV26 = new vub(x1cVar2, 0);
                    cVar.p(objV26);
                }
                c cVar9 = cVar;
                rg0.b(null, null, (gu5) objV26, cVar9, 0, 3);
                cVar = cVar9;
            } else {
                cVar.L(-939903253);
            }
            cVar.F();
            cVar.q();
            b5g b5gVar = (b5g) ((gme) x1cVar2.Y).getValue();
            b5g b5gVar2 = b5g.d;
            if (b5gVar == b5gVar2 || aubVar.p() == b5gVar2) {
                cVar.L(342427249);
                q6.n("rich-profile-http-error-screen", null, null, 6, (tp7) cr8.p(tp7.class));
                ob2 ob2VarA4 = mb2.a(kVar, aVar3, cVar, 0);
                int iHashCode10 = Long.hashCode(pg8.w(cVar));
                t8b t8bVarM10 = cVar.m();
                e eVarC10 = androidx.compose.ui.c.c(cVar, aVar4);
                pm8.a aVarA10 = gl2.a.a();
                cVar.B();
                if (cVar.f()) {
                    cVar.y(aVarA10);
                } else {
                    cVar.n();
                }
                ygg.y(cVar, ob2VarA4, gl2.a.c());
                ygg.y(cVar, t8bVarM10, gl2.a.e());
                gl2.a.C0251a c0251aB10 = gl2.a.b();
                if (cVar.f() || !wl7.b(cVar.v(), Integer.valueOf(iHashCode10))) {
                    ja.h(iHashCode10, cVar, iHashCode10, c0251aB10);
                }
                ygg.y(cVar, eVarC10, gl2.a.d());
                Object objV27 = cVar.v();
                if (objV27 == c0020a) {
                    objV27 = new zr0(12);
                    cVar.p(objV27);
                }
                irb.b((gu5) objV27, cVar, 6);
                gu5Var29 = gu5Var20;
                gu5Var30 = gu5Var21;
                jl6.c(gu5Var29, gu5Var30, cVar, ((i14 >> 27) & 14) | ((i17 << 3) & 112));
                cVar.q();
                cVar.F();
            } else {
                cVar.L(316110853);
                cVar.F();
                gu5Var29 = gu5Var20;
                gu5Var30 = gu5Var21;
            }
            boolean zE = x1cVar2.o().e();
            boolean zX19 = cVar.x(x1cVar2);
            Object objV28 = cVar.v();
            if (zX19 || objV28 == c0020a) {
                objV28 = new xh(x1cVar2, 13);
                cVar.p(objV28);
            }
            gu5 gu5Var38 = (gu5) objV28;
            boolean zD = x1cVar2.o().d();
            boolean zX20 = cVar.x(x1cVar2);
            Object objV29 = cVar.v();
            if (zX20 || objV29 == c0020a) {
                objV29 = new wub(x1cVar2, 0);
                cVar.p(objV29);
            }
            a(zE, gu5Var38, zD, (gu5) objV29, z2, cVar, (i17 >> 9) & 57344);
        } else {
            gu5Var27 = gu5Var18;
            gu5Var28 = gu5Var19;
            gu5Var29 = gu5Var20;
            gu5Var30 = gu5Var21;
            cVar = cVarH;
            function23 = function2;
            yvbVar2 = yvbVar;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final gu5 gu5Var39 = gu5Var29;
            final yvb yvbVar3 = yvbVar2;
            final Function2 function27 = function23;
            final gu5 gu5Var40 = gu5Var27;
            final gu5 gu5Var41 = gu5Var28;
            final gu5 gu5Var42 = gu5Var30;
            iVarW.e(new Function2(yvbVar3, aubVar, j7dVar, n9dVar, function1, gu5Var, gu5Var2, gu5Var3, z, gu5Var4, gu5Var5, gu5Var6, function12, function13, function14, function15, gu5Var7, gu5Var8, gu5Var9, gu5Var10, function16, function27, function17, gu5Var11, function18, function19, function110, function111, function112, gu5Var12, gu5Var13, gu5Var14, gu5Var15, gu5Var16, gu5Var17, function22, gu5Var40, gu5Var41, gu5Var39, gu5Var42, gu5Var22, gu5Var23, gu5Var24, gu5Var25, gu5Var26, zrdVar, z2, i) { // from class: xub
                public final /* synthetic */ gu5 A0;
                public final /* synthetic */ gu5 B0;
                public final /* synthetic */ gu5 C0;
                public final /* synthetic */ gu5 D0;
                public final /* synthetic */ gu5 E0;
                public final /* synthetic */ gu5 F0;
                public final /* synthetic */ gu5 G0;
                public final /* synthetic */ gu5 H0;
                public final /* synthetic */ gu5 I0;
                public final /* synthetic */ zrd J0;
                public final /* synthetic */ boolean K0;
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ gu5 Z;
                public final /* synthetic */ gu5 a0;
                public final /* synthetic */ yvb b;
                public final /* synthetic */ gu5 b0;
                public final /* synthetic */ aub c;
                public final /* synthetic */ Function1 c0;
                public final /* synthetic */ j7d d;
                public final /* synthetic */ Function1 d0;
                public final /* synthetic */ n9d e;
                public final /* synthetic */ Function1 e0;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 f0;
                public final /* synthetic */ gu5 g0;
                public final /* synthetic */ gu5 h0;
                public final /* synthetic */ gu5 i0;
                public final /* synthetic */ gu5 j0;
                public final /* synthetic */ Function1 k0;
                public final /* synthetic */ Function2 l0;
                public final /* synthetic */ Function1 m0;
                public final /* synthetic */ gu5 n0;
                public final /* synthetic */ Function1 o0;
                public final /* synthetic */ Function1 p0;
                public final /* synthetic */ Function1 q0;
                public final /* synthetic */ Function1 r0;
                public final /* synthetic */ Function1 s0;
                public final /* synthetic */ gu5 t0;
                public final /* synthetic */ gu5 u0;
                public final /* synthetic */ gu5 v0;
                public final /* synthetic */ gu5 w0;
                public final /* synthetic */ gu5 x0;
                public final /* synthetic */ gu5 y0;
                public final /* synthetic */ Function2 z0;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(36865);
                    cvb.c(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, (b) obj2, iL);
                    return j6g.a;
                }
            });
        }
    }

    public static final void d(ra9 ra9Var, String[] strArr, x1c x1cVar, zrd zrdVar, int i, androidx.compose.runtime.b bVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            zrdVar = null;
        }
        boolean z = (i3 & 2) == 0;
        if ((i3 & 4) != 0) {
            i = 1;
        }
        boolean zC = ((h2g) cr8.p(h2g.class)).c();
        b.a.C0020a c0020a = b.a.a;
        if (zC) {
            bVar.L(1980697224);
            Object objV = bVar.v();
            if (objV == c0020a) {
                objV = new cp0(14);
                bVar.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX = bVar.x(ra9Var) | bVar.x(strArr);
            Object objV2 = bVar.v();
            if (zX || objV2 == c0020a) {
                objV2 = new sj4(3, ra9Var, strArr);
                bVar.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            boolean zX2 = bVar.x(x1cVar);
            Object objV3 = bVar.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new vv(x1cVar, 19);
                bVar.p(objV3);
            }
            erb.a(6, gu5Var, gu5Var2, (gu5) objV3, new jrb(z, zrdVar != null ? ((dme) zrdVar.a).e() : 0, i), bVar);
            bVar.F();
            return;
        }
        bVar.L(1981528365);
        jrb jrbVar = new jrb(z, zrdVar != null ? ((dme) zrdVar.a).e() : 0, i);
        Object objV4 = bVar.v();
        if (objV4 == c0020a) {
            objV4 = new ao0(15);
            bVar.p(objV4);
        }
        gu5 gu5Var3 = (gu5) objV4;
        boolean zX3 = bVar.x(ra9Var) | bVar.x(strArr);
        Object objV5 = bVar.v();
        if (zX3 || objV5 == c0020a) {
            objV5 = new aq0(5, ra9Var, strArr);
            bVar.p(objV5);
        }
        gu5 gu5Var4 = (gu5) objV5;
        boolean zX4 = bVar.x(x1cVar);
        Object objV6 = bVar.v();
        if (zX4 || objV6 == c0020a) {
            objV6 = new wm1(x1cVar, 15);
            bVar.p(objV6);
        }
        irb.a(6, gu5Var3, gu5Var4, (gu5) objV6, jrbVar, bVar);
        bVar.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i7d e(g4a g4aVar) {
        return (i7d) g4aVar.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(g4a g4aVar) {
        return ((Boolean) g4aVar.getValue()).booleanValue();
    }
}
